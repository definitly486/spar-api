package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3999z1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f48541a;

    public C3999z1(I1 i13) {
        this.f48541a = i13;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f48541a) {
            try {
                I1 i13 = this.f48541a;
                if (i13.f45964c) {
                    i13.f45963b.onCreate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
