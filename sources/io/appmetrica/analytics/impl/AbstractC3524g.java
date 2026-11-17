package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3524g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f47262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f47263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vk f47264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qk f47265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3685mb f47266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f47267f;

    public AbstractC3524g(C3828s5 c3828s5, Rk rk2, Vk vk2, Qk qk2, InterfaceC3685mb interfaceC3685mb, SystemTimeProvider systemTimeProvider) {
        this.f47262a = c3828s5;
        this.f47263b = rk2;
        this.f47264c = vk2;
        this.f47265d = qk2;
        this.f47266e = interfaceC3685mb;
        this.f47267f = systemTimeProvider;
    }

    public final /* bridge */ Ek a(Object obj) {
        return a((Fk) obj);
    }

    public final Ek b() {
        if (this.f47264c.h()) {
            return new Ek(this.f47262a, this.f47264c, a(), this.f47267f);
        }
        return null;
    }

    public final Ek a(Fk fk2) {
        if (this.f47264c.h()) {
            this.f47266e.reportEvent("create session with non-empty storage");
        }
        C3828s5 c3828s5 = this.f47262a;
        Vk vk2 = this.f47264c;
        long jA = this.f47263b.a();
        Vk vk3 = this.f47264c;
        vk3.a(Vk.f46689f, Long.valueOf(jA));
        vk3.a(Vk.f46687d, Long.valueOf(fk2.f45822a));
        vk3.a(Vk.f46691h, Long.valueOf(fk2.f45822a));
        vk3.a(Vk.f46690g, 0L);
        vk3.a(Vk.f46692i, Boolean.TRUE);
        vk3.b();
        this.f47262a.f48034e.a(jA, this.f47265d.f46432a, TimeUnit.MILLISECONDS.toSeconds(fk2.f45823b));
        return new Ek(c3828s5, vk2, a(), new SystemTimeProvider());
    }

    public final Hk a() {
        Gk gk2 = new Gk(this.f47265d);
        gk2.f45866g = this.f47264c.i();
        gk2.f45865f = this.f47264c.f46695c.a(Vk.f46690g);
        gk2.f45863d = this.f47264c.f46695c.a(Vk.f46691h);
        gk2.f45862c = this.f47264c.f46695c.a(Vk.f46689f);
        gk2.f45867h = this.f47264c.f46695c.a(Vk.f46687d);
        gk2.f45860a = this.f47264c.f46695c.a(Vk.f46688e);
        return new Hk(gk2);
    }
}
