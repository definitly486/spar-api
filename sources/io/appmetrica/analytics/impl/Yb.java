package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Yb implements InterfaceC3421c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3473e0 f46800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final An f46801b = new An();

    public Yb(InterfaceC3473e0 interfaceC3473e0) {
        this.f46800a = interfaceC3473e0;
    }

    public static final void a(Yb yb3, U u13) {
        yb3.f46800a.a(u13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3421c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        An an2 = this.f46801b;
        Thread threadA = an2.f45477a.a();
        try {
            stackTraceElementArrB = an2.f45477a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        final U u13 = new U((C3871tn) an2.f45478b.apply(threadA, stackTraceElementArrB), an2.a(threadA, null), an2.f45479c.b());
        ((U9) C3952x4.l().f48373c.a()).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                Yb.a(this.f47497zdlpuopuiu, u13);
            }
        });
    }
}
