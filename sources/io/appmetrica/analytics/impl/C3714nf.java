package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3714nf extends Nd implements yo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3689mf f47757d = new C3689mf("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3689mf f47758e = new C3689mf("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3689mf f47759f = new C3689mf("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3689mf f47760g = new C3689mf("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3689mf f47761h = new C3689mf("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3689mf f47762i = new C3689mf("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3689mf f47763j = new C3689mf("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3689mf f47764k = new C3689mf("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3689mf f47765l = new C3689mf("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C3689mf f47766m = new C3689mf("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3689mf f47767n = new C3689mf("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3689mf f47768o = new C3689mf("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3689mf f47769p = new C3689mf("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3689mf f47770q = new C3689mf("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3689mf f47771r = new C3689mf("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C3689mf f47772s = new C3689mf("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C3714nf(InterfaceC3433cb interfaceC3433cb) {
        super(interfaceC3433cb);
    }

    public final long a(int i13) {
        return this.f47658a.getLong(f47758e.f47705b, i13);
    }

    public final boolean b(boolean z13) {
        return this.f47658a.getBoolean(f47759f.f47705b, z13);
    }

    public final C3714nf c(boolean z13) {
        return (C3714nf) b(f47760g.f47705b, z13);
    }

    public final C3714nf d(long j13) {
        return (C3714nf) b(f47758e.f47705b, j13);
    }

    public final boolean e() {
        return this.f47658a.getBoolean(f47757d.f47705b, false);
    }

    public final void f(boolean z13) {
        b(f47757d.f47705b, z13).b();
    }

    public final C3714nf g() {
        return (C3714nf) b(f47769p.f47705b, true);
    }

    public final C3714nf h() {
        return (C3714nf) b(f47768o.f47705b, true);
    }

    public final boolean i() {
        return this.f47658a.getBoolean(f47768o.f47705b, false);
    }

    public final boolean j() {
        return this.f47658a.getBoolean(f47769p.f47705b, false);
    }

    public final long a(long j13) {
        return this.f47658a.getLong(f47761h.f47705b, j13);
    }

    public final C3714nf b(long j13) {
        return (C3714nf) b(f47761h.f47705b, j13);
    }

    public final C3714nf c(long j13) {
        return (C3714nf) b(f47771r.f47705b, j13);
    }

    public final C3714nf d(boolean z13) {
        return (C3714nf) b(f47759f.f47705b, z13);
    }

    public final void e(boolean z13) {
        b(f47772s.f47705b, z13).b();
    }

    public final long f() {
        return this.f47658a.getLong(f47771r.f47705b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final String a() {
        return this.f47658a.getString(f47770q.f47705b, null);
    }

    public final C3714nf b(EnumC3589ie enumC3589ie, int i13) {
        C3689mf c3689mf;
        int iOrdinal = enumC3589ie.ordinal();
        if (iOrdinal == 0) {
            c3689mf = f47762i;
        } else if (iOrdinal != 1) {
            c3689mf = iOrdinal != 2 ? null : f47764k;
        } else {
            c3689mf = f47763j;
        }
        return c3689mf != null ? (C3714nf) b(c3689mf.f47705b, i13) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3664lf
    public final Set<String> c() {
        return this.f47658a.a();
    }

    public final Boolean d() {
        C3689mf c3689mf = f47760g;
        if (!this.f47658a.a(c3689mf.f47705b)) {
            return null;
        }
        return Boolean.valueOf(this.f47658a.getBoolean(c3689mf.f47705b, true));
    }

    @Override // io.appmetrica.analytics.impl.Nd
    public final String f(String str) {
        return new C3689mf(str, null).f47705b;
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final void a(String str) {
        b(f47770q.f47705b, str).b();
    }

    public final boolean a(boolean z13) {
        return this.f47658a.getBoolean(f47772s.f47705b, z13);
    }

    public final C3714nf b(EnumC3589ie enumC3589ie, long j13) {
        C3689mf c3689mf;
        int iOrdinal = enumC3589ie.ordinal();
        if (iOrdinal == 0) {
            c3689mf = f47765l;
        } else if (iOrdinal != 1) {
            c3689mf = iOrdinal != 2 ? null : f47767n;
        } else {
            c3689mf = f47766m;
        }
        return c3689mf != null ? (C3714nf) b(c3689mf.f47705b, j13) : this;
    }

    public final int a(EnumC3589ie enumC3589ie, int i13) {
        C3689mf c3689mf;
        int iOrdinal = enumC3589ie.ordinal();
        if (iOrdinal == 0) {
            c3689mf = f47762i;
        } else if (iOrdinal != 1) {
            c3689mf = iOrdinal != 2 ? null : f47764k;
        } else {
            c3689mf = f47763j;
        }
        if (c3689mf == null) {
            return i13;
        }
        return this.f47658a.getInt(c3689mf.f47705b, i13);
    }

    public final long a(EnumC3589ie enumC3589ie, long j13) {
        C3689mf c3689mf;
        int iOrdinal = enumC3589ie.ordinal();
        if (iOrdinal == 0) {
            c3689mf = f47765l;
        } else if (iOrdinal != 1) {
            c3689mf = iOrdinal != 2 ? null : f47767n;
        } else {
            c3689mf = f47766m;
        }
        if (c3689mf == null) {
            return j13;
        }
        return this.f47658a.getLong(c3689mf.f47705b, j13);
    }
}
