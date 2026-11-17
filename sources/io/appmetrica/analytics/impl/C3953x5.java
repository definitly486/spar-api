package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3953x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3903v5 f48391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3928w5 f48392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f48393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3654l5 f48394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J4 f48395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC3779q5 f48396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final C3521fm f48397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3890uh f48398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3379a9 f48399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f48400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3382ac f48401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N9 f48402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48403m;

    public C3953x5(Context context, C3654l5 c3654l5, J4 j13, AbstractC3779q5 abstractC3779q5, C3521fm c3521fm, InterfaceC3890uh interfaceC3890uh, ICommonExecutor iCommonExecutor, int i13, C3382ac c3382ac, N9 n13) {
        this(context, c3654l5, j13, abstractC3779q5, c3521fm, interfaceC3890uh, iCommonExecutor, new C3379a9(), i13, new C3903v5(j13.f46054a), new C3928w5(context, c3654l5), c3382ac, n13);
    }

    public static C3832s9 c(C3828s5 c3828s5) {
        return new C3832s9(c3828s5);
    }

    public final C3508f9 a() {
        Context context = this.f48393c;
        C3654l5 c3654l5 = this.f48394d;
        return new C3508f9(new C3633k9(context, c3654l5), this.f48403m);
    }

    public final C3532g7 b(C3828s5 c3828s5) {
        return new C3532g7(c3828s5, C3880u7.a(this.f48393c).c(this.f48394d), new C3429c7(c3828s5.c()), new B7());
    }

    public final C3903v5 d() {
        return this.f48391a;
    }

    public final C3928w5 e() {
        return this.f48392b;
    }

    public final uo f() {
        uo uoVar;
        yo c3933wa;
        xo xoVarB = Ia.F.B();
        C3654l5 c3654l5 = this.f48394d;
        synchronized (xoVarB) {
            try {
                String strValueOf = String.valueOf(c3654l5);
                LinkedHashMap linkedHashMap = xoVarB.f48486b;
                Object uoVar2 = linkedHashMap.get(strValueOf);
                if (uoVar2 == null) {
                    C3639kf c3639kf = new C3639kf(C3880u7.a(xoVarB.f48485a).b(c3654l5));
                    if (c3654l5.d()) {
                        String str = "appmetrica_vital_" + c3654l5.f47630b + ".dat";
                        c3933wa = new B5(hg.jyumaefscl.rgvfuqvkyq(gg.cqumvgiudr.iobyxmoadg(str, new C3933wa(xoVarB.f48485a, str)), gg.cqumvgiudr.iobyxmoadg("appmetrica_vital_main.dat", new C3933wa(xoVarB.f48485a, "appmetrica_vital_main.dat"))));
                    } else {
                        c3933wa = new C3933wa(xoVarB.f48485a, "appmetrica_vital_" + c3654l5.f47630b + ".dat");
                    }
                    uoVar2 = new uo(c3639kf, c3933wa, strValueOf);
                    linkedHashMap.put(strValueOf, uoVar2);
                }
                uoVar = (uo) uoVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uoVar;
    }

    public C3953x5(Context context, C3654l5 c3654l5, J4 j13, AbstractC3779q5 abstractC3779q5, C3521fm c3521fm, InterfaceC3890uh interfaceC3890uh, ICommonExecutor iCommonExecutor, C3379a9 c3379a9, int i13, C3903v5 c3903v5, C3928w5 c3928w5, C3382ac c3382ac, N9 n13) {
        this.f48393c = context;
        this.f48394d = c3654l5;
        this.f48395e = j13;
        this.f48396f = abstractC3779q5;
        this.f48397g = c3521fm;
        this.f48398h = interfaceC3890uh;
        this.f48400j = iCommonExecutor;
        this.f48399i = c3379a9;
        this.f48403m = i13;
        this.f48391a = c3903v5;
        this.f48392b = c3928w5;
        this.f48401k = c3382ac;
        this.f48402l = n13;
    }

    public final Kk c() {
        return new Kk(this.f48393c, this.f48394d);
    }

    public final Ii d(C3828s5 c3828s5) {
        Ii ii2 = new Ii(c3828s5, this.f48396f.a(), this.f48400j);
        C3382ac c3382ac = this.f48401k;
        synchronized (c3382ac) {
            c3382ac.f46915c.add(ii2);
        }
        return ii2;
    }

    public final C3465dh a(C3828s5 c3828s5) {
        return new C3465dh(new C3915vh(c3828s5, this.f48398h, new Y3()), this.f48397g, new C3840sh(this.f48395e));
    }

    public static Sk a(C3828s5 c3828s5, uo uoVar, C3803r5 c3803r5) {
        Rk rk2 = new Rk(uoVar);
        return new Sk(c3828s5, rk2, c3803r5, new Ca(c3828s5, rk2, new Vk(c3828s5.g(), Ca.f45571g), AbstractC3849t1.a(), new SystemTimeProvider()), new L2(c3828s5, rk2, new Vk(c3828s5.g(), L2.f46171g), AbstractC3849t1.a(), new SystemTimeProvider()));
    }

    public static C3704n5 b() {
        return new C3704n5();
    }

    public final F9 a(C3639kf c3639kf, uo uoVar, Sk sk2, C3532g7 c3532g7, C3550h0 c3550h0, Kk kk2, Ii ii2) {
        return new F9(c3639kf, uoVar, sk2, c3532g7, c3550h0, this.f48399i, kk2, this.f48403m, new C3878u5(ii2), new C3683m9(uoVar, new C3708n9(uoVar)), new SystemTimeProvider());
    }

    public static Gi a(C3828s5 c3828s5, C3832s9 c3832s9) {
        return new Gi(c3832s9, c3828s5);
    }

    public L9 a(Q9 q13, C3532g7 c3532g7, C3465dh c3465dh, J4 j13, C3654l5 c3654l5, C3639kf c3639kf) {
        return this.f48402l.a(q13, c3532g7, c3465dh, j13, c3654l5, c3639kf).a();
    }

    public final I3 a(C3639kf c3639kf) {
        Context context = this.f48393c;
        return new I3(context, c3639kf, context.getPackageName(), new SafePackageManager());
    }
}
