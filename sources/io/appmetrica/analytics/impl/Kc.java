package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes3.dex */
public final class Kc extends C3828s5 implements InterfaceC3561hb, InterfaceC3536gb {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C3989yg f46144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Cg f46145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Z6 f46146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C3702n3 f46147y;

    public Kc(Context context, C3521fm c3521fm, C3654l5 c3654l5, J4 j13, C3989yg c3989yg, Z6 z13, AbstractC3779q5 abstractC3779q5) {
        this(context, c3654l5, c3521fm, j13, new C3575i0(), new TimePassedChecker(), new Mc(context, c3654l5, j13, abstractC3779q5, c3521fm, new Fc(z13), Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().w(), Ia.j().k(), new C4010zc()), c3989yg, z13);
    }

    @Override // io.appmetrica.analytics.impl.C3828s5
    public final void B() {
        this.f46144v.a(this.f46145w);
    }

    public final boolean C() {
        boolean zOptBoolean;
        uo uoVar = this.f48049t;
        synchronized (uoVar) {
            zOptBoolean = uoVar.f48216a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C3828s5, io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Za
    public final synchronized void a(J4 j13) {
        super.a(j13);
        this.f46146x.a(j13.f46062i);
    }

    @Override // io.appmetrica.analytics.impl.C3828s5, io.appmetrica.analytics.impl.Za
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C3828s5, io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Ql
    public final void a(C3521fm c3521fm) {
        super.a(c3521fm);
        this.f46147y.a(c3521fm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3536gb
    public final void a() {
        uo uoVar = this.f48049t;
        synchronized (uoVar) {
            vo voVar = uoVar.f48216a;
            voVar.a(voVar.a().put("referrer_handled", true));
        }
    }

    public Kc(Context context, C3654l5 c3654l5, C3521fm c3521fm, J4 j13, C3575i0 c3575i0, TimePassedChecker timePassedChecker, Mc mc3, C3989yg c3989yg, Z6 z13) {
        super(context, c3654l5, c3575i0, timePassedChecker, mc3, j13);
        this.f46144v = c3989yg;
        C3832s9 c3832s9J = j();
        c3832s9J.a(EnumC3934wb.EVENT_TYPE_REGULAR, new Ug(c3832s9J.b()));
        this.f46145w = mc3.b(this);
        this.f46146x = z13;
        C3702n3 c3702n3A = mc3.a(this);
        this.f46147y = c3702n3A;
        c3702n3A.a(c3521fm, j13.f46066m);
    }
}
