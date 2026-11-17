package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3754p5 extends AbstractC3729o5 {
    public C3754p5(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3729o5
    public final boolean b(int i13) {
        return i13 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3729o5
    public final void c() {
        C3639kf c3639kf = this.f47812a.f48032c;
        try {
            Vk vk2 = new Vk(c3639kf, L2.f46171g);
            Long lA = vk2.f46695c.a(Vk.f46687d);
            if (lA != null) {
                vk2.a(Vk.f46687d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = vk2.f46695c.a(Vk.f46688e);
            if (lA2 != null) {
                vk2.a(Vk.f46688e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Vk vk3 = new Vk(c3639kf, Ca.f45571g);
            Long lA3 = vk3.f46695c.a(Vk.f46687d);
            if (lA3 != null) {
                vk3.a(Vk.f46687d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = vk3.f46695c.a(Vk.f46688e);
            if (lA4 != null) {
                vk3.a(Vk.f46688e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
