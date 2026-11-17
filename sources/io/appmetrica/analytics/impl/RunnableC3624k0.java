package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3624k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3674m0 f47575a;

    public RunnableC3624k0(C3674m0 c3674m0) {
        this.f47575a = c3674m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3674m0 c3674m0 = this.f47575a;
        synchronized (c3674m0) {
            if (c3674m0.f47678a != null && c3674m0.a()) {
                try {
                    c3674m0.f47681d = null;
                    c3674m0.f47678a.unbindService(c3674m0.f47686i);
                } catch (Throwable unused) {
                }
            }
            c3674m0.f47681d = null;
        }
    }
}
