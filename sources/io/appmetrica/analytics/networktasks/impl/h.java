package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f48808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f48809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f48810c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f48808a = networkTask;
        this.f48809b = interruptionSafeThread;
        this.f48810c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOnRequestComplete;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f48808a.getExponentialBackoffPolicy();
        boolean zCanBeExecuted = this.f48808a.getConnectionExecutionPolicy().canBeExecuted();
        boolean zCanBeExecuted2 = this.f48808a.getExponentialBackoffPolicy().canBeExecuted(this.f48808a.getRetryPolicyConfig());
        if (!this.f48809b.isRunning() || !zCanBeExecuted || !zCanBeExecuted2) {
            this.f48808a.onShouldNotExecute();
            return;
        }
        boolean zOnCreateNetworkTask = this.f48808a.onCreateNetworkTask();
        Boolean boolValueOf = null;
        while (this.f48809b.isRunning() && zOnCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f48808a.getRetryPolicyConfig())) {
            f fVar = this.f48810c;
            NetworkTask networkTask = this.f48808a;
            fVar.getClass();
            boolean z13 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(kcexrzcfyt.p(url).toString())) {
                    StringBuilder sb3 = new StringBuilder("Task ");
                    sb3.append(networkTask.description());
                    sb3.append(" url is `");
                    sb3.append(url);
                    sb3.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb3.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb3.toString()));
                } else {
                    Request.Builder builderAddHeader = new Request.Builder(url).addHeader("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE).addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        builderAddHeader.addHeader((String) entry.getKey(), jyumaefscl.iwxlajgraz((Iterable) entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            builderAddHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                builderAddHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                builderAddHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i13 = b.f48804a;
                    Response responseExecute = builder.withConnectTimeout(i13).withReadTimeout(i13).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(builderAddHeader.build()).execute();
                    int code = responseExecute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(responseExecute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(responseExecute.getResponseData());
                    }
                    if (responseExecute.isCompleted()) {
                        zOnRequestComplete = networkTask.onRequestComplete();
                    } else {
                        networkTask.onRequestError(responseExecute.getException());
                    }
                    boolValueOf = Boolean.valueOf(zOnRequestComplete);
                    if (zOnRequestComplete && this.f48808a.shouldTryNextHost()) {
                        z13 = true;
                    }
                    exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
                    zOnCreateNetworkTask = z13;
                }
            } else {
                networkTask.onRequestError(null);
            }
            zOnRequestComplete = false;
            boolValueOf = Boolean.valueOf(zOnRequestComplete);
            if (zOnRequestComplete) {
            }
            exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
            zOnCreateNetworkTask = z13;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(zdlpuopuiu.eablkybsjg(boolValueOf, Boolean.TRUE));
    }
}
