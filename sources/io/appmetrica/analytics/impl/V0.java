package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* JADX INFO: loaded from: classes3.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f46636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46637b;

    public V0(C3750p1 c3750p1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f46637b = c3750p1;
        this.f46636a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46637b.f47852a.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        c3848t0.f().a(this.f46636a);
    }
}
