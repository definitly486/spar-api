package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3828s5 implements InterfaceC3635kb, Za, InterfaceC3940wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3654l5 f48031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3639kf f48032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3714nf f48033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3532g7 f48034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gi f48035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3832s9 f48036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3550h0 f48037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3575i0 f48038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Sk f48039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3465dh f48040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3508f9 f48041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublicLogger f48042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F9 f48043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3704n5 f48044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final L9 f48045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I3 f48046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f48047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Hf f48048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uo f48049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Kk f48050u;

    public C3828s5(Context context, C3521fm c3521fm, C3654l5 c3654l5, J4 j13, InterfaceC3890uh interfaceC3890uh, AbstractC3779q5 abstractC3779q5) {
        this(context, c3654l5, new C3575i0(), new TimePassedChecker(), new C3953x5(context, c3654l5, j13, abstractC3779q5, c3521fm, interfaceC3890uh, Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), new C3629k5()), j13);
    }

    public final boolean A() {
        C3521fm c3521fm;
        Hf hf2 = this.f48048s;
        hf2.f47435h.a(hf2.f47428a);
        boolean z13 = ((Ef) hf2.c()).f45730d;
        C3465dh c3465dh = this.f48040k;
        synchronized (c3465dh) {
            c3521fm = c3465dh.f46070c.f47372a;
        }
        return !(z13 && c3521fm.f47244q);
    }

    public void B() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl2, C3521fm c3521fm) {
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final C3654l5 b() {
        return this.f48031b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C3550h0 c3550h0 = this.f48037h;
        synchronized (c3550h0) {
            c3550h0.f47360a = new C3383ad();
        }
        this.f48038i.a(this.f48037h.a(), this.f48032c);
    }

    public final synchronized void e() {
        ((F5) this.f48045p).d();
    }

    public final I3 f() {
        return this.f48046q;
    }

    public final C3639kf g() {
        return this.f48032c;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final Context getContext() {
        return this.f48030a;
    }

    public final C3532g7 h() {
        return this.f48034e;
    }

    public final C3508f9 i() {
        return this.f48041l;
    }

    public final C3832s9 j() {
        return this.f48036g;
    }

    public final F9 k() {
        return this.f48043n;
    }

    public final L9 l() {
        return this.f48045p;
    }

    public final C3965xh m() {
        return (C3965xh) this.f48040k.a();
    }

    public final String n() {
        return this.f48032c.i();
    }

    public final PublicLogger o() {
        return this.f48042m;
    }

    public final C3714nf p() {
        return this.f48033d;
    }

    public final Kk q() {
        return this.f48050u;
    }

    public final Sk r() {
        return this.f48039j;
    }

    public final C3521fm s() {
        C3521fm c3521fm;
        C3465dh c3465dh = this.f48040k;
        synchronized (c3465dh) {
            c3521fm = c3465dh.f46070c.f47372a;
        }
        return c3521fm;
    }

    public final uo t() {
        return this.f48049t;
    }

    public final void u() {
        F9 f13 = this.f48043n;
        int i13 = f13.f45808k;
        f13.f45810m = i13;
        f13.f45798a.a(i13).b();
    }

    public final void v() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        uo uoVar = this.f48049t;
        synchronized (uoVar) {
            iOptInt = uoVar.f48216a.a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f48044o.getClass();
            Iterator it = hg.jyumaefscl.eablkybsjg(new C3754p5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC3729o5) it.next()).a(iOptInt);
            }
            this.f48049t.b(libraryApiLevel);
        }
    }

    public final boolean w() {
        C3965xh c3965xh = (C3965xh) this.f48040k.a();
        return c3965xh.f48442n && c3965xh.isIdentifiersValid() && this.f48047r.didTimePassSeconds(this.f48043n.f45809l, c3965xh.f48447s, "need to check permissions");
    }

    public final boolean x() {
        F9 f13 = this.f48043n;
        return f13.f45810m < f13.f45808k && ((C3965xh) this.f48040k.a()).f48443o && ((C3965xh) this.f48040k.a()).isIdentifiersValid();
    }

    public final void y() {
        C3465dh c3465dh = this.f48040k;
        synchronized (c3465dh) {
            c3465dh.f46068a = null;
        }
    }

    public final boolean z() {
        C3965xh c3965xh = (C3965xh) this.f48040k.a();
        return c3965xh.f48442n && this.f48047r.didTimePassSeconds(this.f48043n.f45809l, c3965xh.f48448t, "should force send permissions");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3635kb
    public final void a(C3655l6 c3655l6) {
        String strA = AbstractC3464dg.a("Event received on service", EnumC3934wb.a(c3655l6.f47634d), c3655l6.getName(), c3655l6.getValue());
        if (strA != null) {
            this.f48042m.info(strA, new Object[0]);
        }
        String str = this.f48031b.f47630b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f48035f.a(c3655l6, new Fi());
    }

    public final void b(C3655l6 c3655l6) {
        this.f48037h.a(c3655l6.f47636f);
        C3525g0 c3525g0A = this.f48037h.a();
        C3575i0 c3575i0 = this.f48038i;
        C3639kf c3639kf = this.f48032c;
        synchronized (c3575i0) {
            if (c3525g0A.f47269b > c3639kf.d().f47269b) {
                c3639kf.a(c3525g0A).b();
                this.f48042m.info("Save new app environment for %s. Value: %s", this.f48031b, c3525g0A.f47268a);
            }
        }
    }

    public C3828s5(Context context, C3654l5 c3654l5, C3575i0 c3575i0, TimePassedChecker timePassedChecker, C3953x5 c3953x5, J4 j13) {
        this.f48030a = context.getApplicationContext();
        this.f48031b = c3654l5;
        this.f48038i = c3575i0;
        this.f48047r = timePassedChecker;
        uo uoVarF = c3953x5.f();
        this.f48049t = uoVarF;
        this.f48048s = Ia.j().s();
        C3465dh c3465dhA = c3953x5.a(this);
        this.f48040k = c3465dhA;
        PublicLogger publicLoggerA = c3953x5.d().a();
        this.f48042m = publicLoggerA;
        C3639kf c3639kfA = c3953x5.e().a();
        this.f48032c = c3639kfA;
        this.f48033d = Ia.j().x();
        C3550h0 c3550h0A = c3575i0.a(c3654l5, publicLoggerA, c3639kfA);
        this.f48037h = c3550h0A;
        this.f48041l = c3953x5.a();
        C3532g7 c3532g7B = c3953x5.b(this);
        this.f48034e = c3532g7B;
        Ii iiD = c3953x5.d(this);
        this.f48044o = C3953x5.b();
        v();
        Sk skA = C3953x5.a(this, uoVarF, new C3803r5(this));
        this.f48039j = skA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", c3654l5.toString(), c3550h0A.a().f47268a);
        Kk kkC = c3953x5.c();
        this.f48050u = kkC;
        this.f48043n = c3953x5.a(c3639kfA, uoVarF, skA, c3532g7B, c3550h0A, kkC, iiD);
        C3832s9 c3832s9C = C3953x5.c(this);
        this.f48036g = c3832s9C;
        this.f48035f = C3953x5.a(this, c3832s9C);
        this.f48046q = c3953x5.a(c3639kfA);
        this.f48045p = c3953x5.a(iiD, c3532g7B, c3465dhA, j13, c3654l5, c3639kfA);
        c3532g7B.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Za
    public synchronized void a(J4 j13) {
        try {
            this.f48040k.a(j13);
            if (Boolean.TRUE.equals(j13.f46061h)) {
                this.f48042m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(j13.f46061h)) {
                    this.f48042m.setEnabled(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Ql
    public synchronized void a(C3521fm c3521fm) {
        this.f48040k.a(c3521fm);
        ((F5) this.f48045p).e();
    }

    public final void a(String str) {
        this.f48032c.j(str).b();
    }
}
