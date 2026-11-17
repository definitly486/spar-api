package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3952x4 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile C3952x4 f48370u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f48371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z7 f48372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3703n4 f48373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N1 f48374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3698n f48375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Xk f48376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3376a6 f48377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3648l f48378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3647kn f48379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Kd f48380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3724o0 f48381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C3877u4 f48382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3712nd f48383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C3614jf f48384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3743oj f48385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C3873u0 f48386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final R1 f48387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C3958xa f48388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Z f48389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile C3560ha f48390t;

    public C3952x4(M6 m13, C3698n c3698n, C3703n4 c3703n4) {
        this(m13, c3698n, c3703n4, new C3648l(c3698n));
    }

    public static C3952x4 l() {
        if (f48370u == null) {
            synchronized (C3952x4.class) {
                try {
                    if (f48370u == null) {
                        f48370u = new C3952x4(new M6(), new C3698n(), new C3703n4());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48370u;
    }

    public final C3698n a() {
        return this.f48375e;
    }

    public final C3614jf b(Context context) {
        C3614jf c3614jf = this.f48384n;
        if (c3614jf == null) {
            synchronized (this) {
                try {
                    c3614jf = this.f48384n;
                    if (c3614jf == null) {
                        c3614jf = new C3614jf(C3880u7.a(context).a());
                        this.f48384n = c3614jf;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3614jf;
    }

    public final C3724o0 c() {
        return this.f48381k;
    }

    public final C3873u0 d() {
        return this.f48386p;
    }

    public final N1 e() {
        return this.f48374d;
    }

    public final R1 f() {
        return this.f48387q;
    }

    public final C3703n4 g() {
        return this.f48373c;
    }

    public final C3376a6 h() {
        return this.f48377g;
    }

    public final M6 i() {
        return this.f48371a;
    }

    public final Z7 j() {
        return this.f48372b;
    }

    public final C3958xa k() {
        return this.f48388r;
    }

    public final C3877u4 m() {
        C3877u4 c3877u4 = this.f48382l;
        if (c3877u4 == null) {
            synchronized (this) {
                try {
                    c3877u4 = this.f48382l;
                    if (c3877u4 == null) {
                        c3877u4 = new C3877u4();
                        this.f48382l = c3877u4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3877u4;
    }

    public final M6 n() {
        return this.f48371a;
    }

    public final Xk o() {
        return this.f48376f;
    }

    public C3952x4(M6 m13, C3698n c3698n, C3703n4 c3703n4, C3648l c3648l) {
        this(m13, new Z7(), c3703n4, c3648l, new N1(), c3698n, new Xk(c3698n, c3648l), new C3376a6(c3698n), new C3647kn(), new C3724o0());
    }

    public final synchronized Kd a(Context context) {
        try {
            if (this.f48380j == null) {
                this.f48380j = new Kd(context, new jo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48380j;
    }

    public C3952x4(M6 m13, Z7 z13, C3703n4 c3703n4, C3648l c3648l, N1 n13, C3698n c3698n, Xk xk2, C3376a6 c3376a6, C3647kn c3647kn, C3724o0 c3724o0) {
        this.f48383m = new C3712nd();
        this.f48386p = new C3873u0();
        this.f48387q = new R1();
        this.f48388r = new C3958xa();
        new Y7();
        this.f48371a = m13;
        this.f48372b = z13;
        this.f48373c = c3703n4;
        this.f48378h = c3648l;
        this.f48374d = n13;
        this.f48375e = c3698n;
        this.f48376f = xk2;
        this.f48377g = c3376a6;
        this.f48379i = c3647kn;
        this.f48381k = c3724o0;
    }

    public final Z b() {
        Z z13 = this.f48389s;
        if (z13 == null) {
            synchronized (this) {
                try {
                    z13 = this.f48389s;
                    if (z13 == null) {
                        z13 = new Z(this.f48386p, this.f48376f, this.f48373c);
                        this.f48389s = z13;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return z13;
    }
}
