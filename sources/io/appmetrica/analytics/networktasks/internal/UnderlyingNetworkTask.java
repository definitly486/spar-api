package io.appmetrica.analytics.networktasks.internal;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public interface UnderlyingNetworkTask {
    String description();

    FullUrlFormer<?> getFullUrlFormer();

    RequestDataHolder getRequestDataHolder();

    ResponseDataHolder getResponseDataHolder();

    RetryPolicyConfig getRetryPolicyConfig();

    SSLSocketFactory getSslSocketFactory();

    boolean onCreateTask();

    void onPerformRequest();

    void onPostRequestComplete(boolean z13);

    boolean onRequestComplete();

    void onRequestError(Throwable th2);

    void onShouldNotExecute();

    void onSuccessfulTaskFinished();

    void onTaskAdded();

    void onTaskFinished();

    void onTaskRemoved();

    void onUnsuccessfulTaskFinished();
}
