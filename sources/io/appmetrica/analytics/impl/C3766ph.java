package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3766ph extends AbstractC3490eh {
    public C3766ph(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        Ek ekB;
        Uk uk2;
        F9 f13 = this.f47182a.f48043n;
        Sk sk2 = f13.f45800c;
        if (sk2.f46522g == 0) {
            ekB = sk2.f46519d.b();
            Ek ekB2 = sk2.f46520e.b();
            if ((ekB == null ? -1L : ekB.f45759d) <= (ekB2 != null ? ekB2.f45759d : -1L)) {
                ekB = ekB2;
            }
        } else {
            ekB = sk2.f46521f;
        }
        if (ekB != null) {
            uk2 = new Uk();
            uk2.f46630a = ekB.f45759d;
            long andIncrement = ekB.f45761f.getAndIncrement();
            Vk vk2 = ekB.f45757b;
            vk2.a(Vk.f46690g, Long.valueOf(ekB.f45761f.get()));
            vk2.b();
            uk2.f46631b = andIncrement;
            uk2.f46632c = TimeUnit.MILLISECONDS.toSeconds(ekB.f45765j);
            uk2.f46633d = ekB.f45758c.f45937a;
        } else {
            long j13 = c3655l6.f47640j;
            long jA = sk2.f46517b.a();
            C3532g7 c3532g7 = sk2.f46516a.f48034e;
            Wk wk2 = Wk.BACKGROUND;
            c3532g7.a(jA, wk2, j13);
            Uk uk3 = new Uk();
            uk3.f46630a = jA;
            uk3.f46633d = wk2;
            uk3.f46631b = 0L;
            uk3.f46632c = 0L;
            uk2 = uk3;
        }
        f13.a(c3655l6, uk2);
        return false;
    }
}
