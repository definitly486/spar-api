package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Wn extends V4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z6 f46750b;

    public Wn(S4 s13, Z6 z13) {
        super(s13);
        this.f46750b = z13;
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C3655l6 c3655l6, P4 p13) {
        J4 j13 = p13.f46371b.f46484d.f46236a;
        this.f46750b.a(j13.f46062i);
        InterfaceC3511fc interfaceC3511fcL = Ia.F.l();
        if (Boolean.TRUE.equals(j13.f46055b)) {
            interfaceC3511fcL.a(true);
        } else {
            if (Boolean.FALSE.equals(j13.f46055b)) {
                interfaceC3511fcL.a(false);
            }
        }
        interfaceC3511fcL.a(j13.f46056c);
        Boolean bool = j13.f46067n;
        Ia.F.b().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
