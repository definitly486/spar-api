package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Dh extends AbstractC3490eh {
    public Dh(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        ((F5) this.f47182a.f48045p).e();
        Sk sk2 = this.f47182a.f48039j;
        synchronized (sk2) {
            try {
                Ek ekB = sk2.b(c3655l6);
                if (ekB.f45762g) {
                    ekB.f45762g = false;
                    Vk vk2 = ekB.f45757b;
                    vk2.a(Vk.f46692i, Boolean.FALSE);
                    vk2.b();
                }
                if (sk2.f46522g != 1) {
                    sk2.b(sk2.f46521f, c3655l6);
                }
                sk2.f46522g = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
