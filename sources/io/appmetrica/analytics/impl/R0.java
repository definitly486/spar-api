package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46435a;

    public R0(C3750p1 c3750p1) {
        this.f46435a = c3750p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46435a).sendEventsBuffer();
    }
}
