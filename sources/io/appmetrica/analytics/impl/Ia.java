package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* JADX INFO: loaded from: classes3.dex */
public final class Ia {
    public static volatile Ia F;
    public volatile C3560ha C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C3989yg f46005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Z6 f46006c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C3476e3 f46008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C4017zj f46009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile T f46010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C3527g2 f46011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f46012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Hf f46013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile V3 f46014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C3714nf f46015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile xo f46016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C3817rj f46017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C3382ac f46018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Al f46019p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile C3993yk f46021r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile InterfaceC3511fc f46026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C3672ln f46027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C3869tl f46028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Kd f46029z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Ha f46020q = new Ha();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3712nd f46022s = new C3712nd();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3762pd f46023t = new C3762pd();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C3572hm f46024u = new C3572hm();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C3694mk f46025v = new C3694mk();
    public final C3462de A = new C3462de();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C3868tk D = new C3868tk();
    public final ReferenceHolder E = new ReferenceHolder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3818rk f46007d = new C3818rk();

    public Ia(Context context) {
        this.f46004a = context;
    }

    public static void a(Context context) {
        if (F == null) {
            synchronized (Ia.class) {
                try {
                    if (F == null) {
                        F = new Ia(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Ia j() {
        return F;
    }

    public final C3672ln A() {
        C3672ln c3672ln = this.f46027x;
        if (c3672ln == null) {
            synchronized (this) {
                try {
                    c3672ln = this.f46027x;
                    if (c3672ln == null) {
                        c3672ln = new C3672ln(this.f46004a);
                        this.f46027x = c3672ln;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3672ln;
    }

    public final synchronized xo B() {
        try {
            if (this.f46016m == null) {
                this.f46016m = new xo(this.f46004a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46016m;
    }

    public final void C() {
        if (this.f46013j == null) {
            synchronized (this) {
                try {
                    if (this.f46013j == null) {
                        Rm rmA = Qm.a(C3813rf.class);
                        Context context = this.f46004a;
                        ProtobufStateStorage<Object> protobufStateStorageA = rmA.a(context, rmA.c(context));
                        C3813rf c3813rf = (C3813rf) protobufStateStorageA.read();
                        this.f46013j = new Hf(this.f46004a, protobufStateStorageA, new C3988yf(), new C3764pf(c3813rf), new Gf(), new C3963xf(this.f46004a), new Cf(j().x()), new C3838sf(), c3813rf, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final T b() {
        T t13 = this.f46010g;
        if (t13 == null) {
            synchronized (this) {
                try {
                    t13 = this.f46010g;
                    if (t13 == null) {
                        t13 = new T(this.f46004a, this.f46007d.a(), this.f46024u.b());
                        this.f46024u.a(t13);
                        this.f46010g = t13;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t13;
    }

    public final C3527g2 c() {
        C3527g2 c3527g2 = this.f46011h;
        if (c3527g2 == null) {
            synchronized (this) {
                try {
                    c3527g2 = this.f46011h;
                    if (c3527g2 == null) {
                        c3527g2 = new C3527g2(this.f46004a, AbstractC3552h2.a());
                        this.f46011h = c3527g2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3527g2;
    }

    public final C3676m2 d() {
        return k().f46914b;
    }

    public final V3 e() {
        if (this.f46014k == null) {
            synchronized (this) {
                try {
                    if (this.f46014k == null) {
                        Rm rmA = Qm.a(O3.class);
                        Context context = this.f46004a;
                        ProtobufStateStorage<Object> protobufStateStorageA = rmA.a(context, rmA.c(context));
                        this.f46014k = new V3(this.f46004a, protobufStateStorageA, new W3(), new J3(), new Z3(), new C3544gj(this.f46004a), new X3(x()), new K3(), (O3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46014k;
    }

    public final Context f() {
        return this.f46004a;
    }

    public final Z6 g() {
        if (this.f46006c == null) {
            synchronized (this) {
                try {
                    if (this.f46006c == null) {
                        this.f46006c = new Z6(new Y6(x()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46006c;
    }

    public final C3560ha h() {
        C3560ha c3560ha = this.C;
        if (c3560ha == null) {
            synchronized (this) {
                try {
                    c3560ha = this.C;
                    if (c3560ha == null) {
                        c3560ha = new C3560ha(this.f46004a);
                        this.C = c3560ha;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3560ha;
    }

    public final PermissionExtractor i() {
        C3869tl c3869tl = this.f46028y;
        if (c3869tl != null) {
            return c3869tl;
        }
        synchronized (this) {
            try {
                C3869tl c3869tl2 = this.f46028y;
                if (c3869tl2 != null) {
                    return c3869tl2;
                }
                C3869tl c3869tl3 = new C3869tl(o().f48539c.getAskForPermissionStrategy());
                this.f46028y = c3869tl3;
                return c3869tl3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C3382ac k() {
        C3382ac c3382ac = this.f46018o;
        if (c3382ac == null) {
            synchronized (this) {
                try {
                    c3382ac = this.f46018o;
                    if (c3382ac == null) {
                        c3382ac = new C3382ac(new C3399b3(this.f46004a, this.f46007d.a()), new C3676m2());
                        this.f46018o = c3382ac;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3382ac;
    }

    public final InterfaceC3511fc l() {
        InterfaceC3511fc c3562hc = this.f46026w;
        if (c3562hc == null) {
            synchronized (this) {
                try {
                    c3562hc = this.f46026w;
                    if (c3562hc == null) {
                        Context context = this.f46004a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        c3562hc = locationClient == null ? new C3562hc() : new C3537gc(context, new C3711nc(), locationClient);
                        this.f46026w = c3562hc;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3562hc;
    }

    public final InterfaceC3511fc m() {
        return l();
    }

    public final C3762pd n() {
        return this.f46023t;
    }

    public final C3993yk o() {
        C3993yk c3993yk = this.f46021r;
        if (c3993yk == null) {
            synchronized (this) {
                try {
                    c3993yk = this.f46021r;
                    if (c3993yk == null) {
                        c3993yk = new C3993yk();
                        this.f46021r = c3993yk;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3993yk;
    }

    public final Kd p() {
        Kd kd2 = this.f46029z;
        if (kd2 == null) {
            synchronized (this) {
                try {
                    kd2 = this.f46029z;
                    if (kd2 == null) {
                        kd2 = new Kd(this.f46004a, new ko());
                        this.f46029z = kd2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return kd2;
    }

    public final C3462de q() {
        return this.A;
    }

    public final PlatformIdentifiers r() {
        PlatformIdentifiers platformIdentifiers = this.f46012i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f46012i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(b(), c());
                        this.f46012i = platformIdentifiers;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return platformIdentifiers;
    }

    public final Hf s() {
        C();
        return this.f46013j;
    }

    public final C3989yg t() {
        if (this.f46005b == null) {
            synchronized (this) {
                try {
                    if (this.f46005b == null) {
                        this.f46005b = new C3989yg(this.f46004a, F.B().f48487c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46005b;
    }

    public final C3817rj u() {
        C3817rj c3817rj = this.f46017n;
        if (c3817rj == null) {
            synchronized (this) {
                try {
                    c3817rj = this.f46017n;
                    if (c3817rj == null) {
                        c3817rj = new C3817rj(this.f46004a);
                        this.f46017n = c3817rj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3817rj;
    }

    public final synchronized C4017zj v() {
        return this.f46009f;
    }

    public final C3818rk w() {
        return this.f46007d;
    }

    public final C3714nf x() {
        if (this.f46015l == null) {
            synchronized (this) {
                try {
                    if (this.f46015l == null) {
                        this.f46015l = new C3714nf(C3880u7.a(this.f46004a).c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46015l;
    }

    public final synchronized X2 y() {
        try {
            if (this.f46019p == null) {
                Al al2 = new Al(this.f46004a);
                this.f46019p = al2;
                this.f46024u.a(al2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46019p;
    }

    public final C3572hm z() {
        return this.f46024u;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
