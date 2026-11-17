package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3423c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f47001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47002b;

    public RunnableC3423c1(C3750p1 c3750p1, Activity activity) {
        this.f47002b = c3750p1;
        this.f47001a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1 c3750p1 = this.f47002b;
        Xk xk2 = c3750p1.f47859h;
        Activity activity = this.f47001a;
        InterfaceC3459db interfaceC3459db = c3750p1.d().f45721a;
        if (activity != null) {
            xk2.f46784f.a(activity);
        }
        if (xk2.f46783e.a(activity, EnumC3723o.RESUMED)) {
            interfaceC3459db.a(activity);
        }
    }
}
