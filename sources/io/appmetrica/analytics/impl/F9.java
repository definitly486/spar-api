package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3639kf f45798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo f45799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sk f45800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3532g7 f45801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3379a9 f45802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Kk f45803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3550h0 f45804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3683m9 f45805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3878u5 f45806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeProvider f45807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45810m;

    public F9(C3639kf c3639kf, uo uoVar, Sk sk2, C3532g7 c3532g7, C3550h0 c3550h0, C3379a9 c3379a9, Kk kk2, int i13, C3878u5 c3878u5, C3683m9 c3683m9, SystemTimeProvider systemTimeProvider) {
        this.f45798a = c3639kf;
        this.f45799b = uoVar;
        this.f45800c = sk2;
        this.f45801d = c3532g7;
        this.f45804g = c3550h0;
        this.f45802e = c3379a9;
        this.f45803f = kk2;
        this.f45808k = i13;
        this.f45805h = c3683m9;
        this.f45807j = systemTimeProvider;
        this.f45806i = c3878u5;
        this.f45809l = c3639kf.h();
        this.f45810m = c3639kf.g();
    }

    public final void a(C3655l6 c3655l6, Uk uk2) {
        Map map = c3655l6.f47646p;
        Kk kk2 = this.f45803f;
        kk2.getClass();
        map.putAll(new HashMap(kk2.f46163b));
        c3655l6.c(this.f45798a.i());
        c3655l6.f47645o = Integer.valueOf(this.f45799b.b());
        C3525g0 c3525g0A = this.f45804g.a();
        C3379a9 c3379a9 = this.f45802e;
        c3379a9.getClass();
        Z8 z13 = (Z8) c3379a9.f46912b.a(EnumC3934wb.a(c3655l6.f47634d));
        C3532g7 c3532g7 = this.f45801d;
        S8 s8A = z13.a(c3655l6);
        int i13 = c3655l6.f47634d;
        C3683m9 c3683m9 = this.f45805h;
        D7 d13 = new D7(c3532g7.f47294g, uk2, i13, c3683m9, s8A, (C3965xh) c3532g7.f47295h.f48040k.a(), c3525g0A);
        Long lValueOf = Long.valueOf(uk2.f46630a);
        Wk wk2 = uk2.f46633d;
        Long lValueOf2 = Long.valueOf(uk2.f46631b);
        EnumC3934wb enumC3934wbA = EnumC3934wb.a(d13.f45632h.f47634d);
        long jOptLong = 0;
        if (!R9.f46447g.contains(EnumC3934wb.a(i13))) {
            uo uoVar = c3683m9.f47697b;
            synchronized (uoVar) {
                jOptLong = uoVar.f48216a.a().optLong("global_number", 0L);
            }
            c3683m9.f47697b.b(1 + jOptLong);
        }
        c3532g7.a(c3532g7.f47299l.fromModel(new A7(lValueOf, wk2, lValueOf2, enumC3934wbA, Long.valueOf(jOptLong), Long.valueOf(uk2.f46632c), d13.a())));
        this.f45806i.f48158a.h();
    }
}
