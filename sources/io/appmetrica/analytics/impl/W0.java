package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* JADX INFO: loaded from: classes3.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f46696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46697b;

    public W0(C3750p1 c3750p1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f46697b = c3750p1;
        this.f46696a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46697b.f47852a.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        c3848t0.f().a(this.f46696a);
    }
}
