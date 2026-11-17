package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3382ac f46600a;

    public U4() {
        this(Ia.j().k());
    }

    public static Z4 a(S4 s13) {
        return new Z4(new X4(s13), s13);
    }

    public U4(C3382ac c3382ac) {
        this.f46600a = c3382ac;
    }

    public final C3622jn a(S4 s13, Bm bm2) {
        C3622jn c3622jn = new C3622jn(s13, new Vg(bm2));
        C3382ac c3382ac = this.f46600a;
        synchronized (c3382ac) {
            c3382ac.f46915c.add(c3622jn);
        }
        return c3622jn;
    }
}
