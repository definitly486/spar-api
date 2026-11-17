package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f48975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f48976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f48977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f48978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C4034m f48979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f48980f = new a0(this);

    public d0(ClientContext clientContext, Q q13) {
        this.f48975a = clientContext;
        this.f48976b = q13;
        this.f48977c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C4033l c4033l) {
        this.f48979e = c4033l != null ? c4033l.f49000b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f48975a.getActivityLifecycleRegistry().registerListener(new c0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
