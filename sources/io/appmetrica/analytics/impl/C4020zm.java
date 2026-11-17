package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4020zm implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f48630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3470dm f48631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Jl f48632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f48633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigProvider f48634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f48635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f48636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rl f48637h;

    public C4020zm(Bm bm2, FullUrlFormer<C3418bm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C3418bm> configProvider) {
        this(bm2, new Rl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f48630a.f45544a.f45599f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f48636g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f48633d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f48635f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C3418bm) this.f48634e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) Ia.F.y()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f48633d.setHeader("Accept-Encoding", "encrypted");
        return this.f48630a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z13) {
        if (z13) {
            return;
        }
        this.f48632c = Jl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C3470dm c3470dmHandle = this.f48637h.handle(this.f48635f);
        this.f48631b = c3470dmHandle;
        return c3470dmHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th2) {
        this.f48632c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f48632c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f48631b == null || this.f48635f.getResponseHeaders() == null) {
            return;
        }
        this.f48630a.a(this.f48631b, (C3418bm) this.f48634e.getConfig(), this.f48635f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f48632c == null) {
            this.f48632c = Jl.UNKNOWN;
        }
        this.f48630a.a(this.f48632c);
    }

    public C4020zm(Bm bm2, Rl rl2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f48630a = bm2;
        this.f48637h = rl2;
        this.f48633d = requestDataHolder;
        this.f48635f = responseDataHolder;
        this.f48634e = configProvider;
        this.f48636g = fullUrlFormer;
        fullUrlFormer.setHosts(((C3418bm) configProvider.getConfig()).k());
    }
}
