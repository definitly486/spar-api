package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3880u7 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C3880u7 f48162t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f48167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3855t7 f48168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3855t7 f48169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3727o3 f48170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3752p3 f48171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3727o3 f48172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C3752p3 f48173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Nb f48174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ob f48175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3772pn f48176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3797qn f48177o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Nb f48178p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ob f48179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C3885uc f48180r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48163a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48164b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48165c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3557h7 f48166d = S5.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3930w7 f48181s = new C3930w7();

    public C3880u7(Context context) {
        this.f48167e = context;
    }

    public static C3880u7 a(Context context) {
        if (f48162t == null) {
            synchronized (C3880u7.class) {
                try {
                    if (f48162t == null) {
                        f48162t = new C3880u7(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48162t;
    }

    public final synchronized InterfaceC3433cb b(C3654l5 c3654l5) {
        InterfaceC3433cb nb3;
        String str = new C3427c5(c3654l5).f47008a;
        nb3 = (InterfaceC3433cb) this.f48164b.get(str);
        if (nb3 == null) {
            nb3 = new Nb(new C3795ql(c(c3654l5)));
            this.f48164b.put(str, nb3);
        }
        return nb3;
    }

    public final synchronized C3855t7 c(C3654l5 c3654l5) {
        C3855t7 c3855t7;
        try {
            C3427c5 c3427c5 = new C3427c5(c3654l5);
            c3855t7 = (C3855t7) this.f48163a.get(c3427c5.f47008a);
            if (c3855t7 == null) {
                Context context = this.f48167e;
                C3930w7 c3930w7 = this.f48181s;
                String strA = new C3905v7(c3930w7.f48279a, c3930w7.f48280b, false).a(context, c3427c5);
                C3557h7 c3557h7 = this.f48166d;
                c3557h7.getClass();
                String str = c3654l5.f47630b;
                if (str == null) {
                    str = "main";
                }
                String str2 = String.format("component-%s", str);
                C3548gn c3548gn = c3557h7.f47376c;
                C3805r7 c3805r7 = c3557h7.f47374a;
                C3606j7 c3606j7 = c3805r7.f47977a;
                C3631k7 c3631k7 = c3805r7.f47978b;
                Ka ka3 = new Ka(false);
                ka3.a(112, new C3504f5());
                C3597in c3597in = new C3597in(str2, c3557h7.f47375b.f46415a);
                c3548gn.getClass();
                c3855t7 = new C3855t7(context, strA, new C3573hn(c3606j7, c3631k7, ka3, c3597in), PublicLogger.getAnonymousInstance());
                this.f48163a.put(c3427c5.f47008a, c3855t7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c3855t7;
    }

    public final synchronized InterfaceC3433cb d() {
        try {
            if (this.f48174l == null) {
                this.f48174l = new Nb(new C3795ql(h()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48174l;
    }

    public final IBinaryDataHelper e() {
        if (this.f48172j == null) {
            if (this.f48169g == null) {
                Context context = this.f48167e;
                C3930w7 c3930w7 = this.f48181s;
                String strA = new C3905v7(c3930w7.f48279a, c3930w7.f48280b, false).a(context, new B2());
                C3557h7 c3557h7 = this.f48166d;
                c3557h7.getClass();
                HashMap map = new HashMap();
                map.put("binary_data", N5.f46251a);
                C3548gn c3548gn = c3557h7.f47376c;
                C3805r7 c3805r7 = c3557h7.f47374a;
                C3656l7 c3656l7 = c3805r7.f47983g;
                C3681m7 c3681m7 = c3805r7.f47984h;
                Ka ka3 = new Ka(false);
                C3597in c3597in = new C3597in("auto_inapp", map);
                c3548gn.getClass();
                this.f48169g = new C3855t7(context, strA, new C3573hn(c3656l7, c3681m7, ka3, c3597in), PublicLogger.getAnonymousInstance());
            }
            this.f48172j = new C3727o3(new C3795ql(this.f48169g));
        }
        return this.f48172j;
    }

    public final InterfaceC3433cb f() {
        C3885uc c3885uc;
        if (this.f48178p == null) {
            synchronized (this) {
                try {
                    if (this.f48180r == null) {
                        C3930w7 c3930w7 = this.f48181s;
                        String strA = new C3905v7(c3930w7.f48279a, c3930w7.f48280b, true).a(this.f48167e, new C3603j4());
                        Context context = this.f48167e;
                        C3557h7 c3557h7 = this.f48166d;
                        c3557h7.getClass();
                        HashMap map = new HashMap();
                        map.put("preferences", P5.f46373a);
                        C3548gn c3548gn = c3557h7.f47376c;
                        C3805r7 c3805r7 = c3557h7.f47374a;
                        C3706n7 c3706n7 = c3805r7.f47979c;
                        C3731o7 c3731o7 = c3805r7.f47980d;
                        Ka ka3 = new Ka(false);
                        ka3.a(112, new C3628k4());
                        C3597in c3597in = new C3597in("service database", map);
                        c3548gn.getClass();
                        this.f48180r = new C3885uc(context, strA, new C3858ta(strA), new C3573hn(c3706n7, c3731o7, ka3, c3597in));
                    }
                    c3885uc = this.f48180r;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f48178p = new Nb(c3885uc);
        }
        return this.f48178p;
    }

    public final IBinaryDataHelper g() {
        if (this.f48170h == null) {
            this.f48170h = new C3727o3(new C3795ql(h()));
        }
        return this.f48170h;
    }

    public final synchronized C3855t7 h() {
        try {
            if (this.f48168f == null) {
                Context context = this.f48167e;
                C3930w7 c3930w7 = this.f48181s;
                String strA = new C3905v7(c3930w7.f48279a, c3930w7.f48280b, true).a(context, new C3719nk());
                C3557h7 c3557h7 = this.f48166d;
                c3557h7.getClass();
                HashMap map = new HashMap();
                map.put("preferences", P5.f46373a);
                map.put("binary_data", N5.f46251a);
                map.put("temp_cache", AbstractC3846sn.f48083a);
                Iterator<ModuleServicesDatabase> it = Ia.F.o().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C3548gn c3548gn = c3557h7.f47376c;
                C3805r7 c3805r7 = c3557h7.f47374a;
                C3756p7 c3756p7 = c3805r7.f47981e;
                C3781q7 c3781q7 = c3805r7.f47982f;
                Ka ka3 = new Ka(false);
                ka3.a(114, new C3744ok());
                Iterator<ModuleServicesDatabase> it2 = Ia.F.o().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ka3.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C3597in c3597in = new C3597in("service database", map);
                c3548gn.getClass();
                this.f48168f = new C3855t7(context, strA, new C3573hn(c3756p7, c3781q7, ka3, c3597in), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48168f;
    }

    public final synchronized IBinaryDataHelper a(C3654l5 c3654l5) {
        IBinaryDataHelper c3727o3;
        String str = new C3427c5(c3654l5).f47008a;
        c3727o3 = (IBinaryDataHelper) this.f48165c.get(str);
        if (c3727o3 == null) {
            c3727o3 = new C3727o3(new C3795ql(c(c3654l5)));
            this.f48165c.put(str, c3727o3);
        }
        return c3727o3;
    }

    public final synchronized InterfaceC3433cb b() {
        return f();
    }

    public final synchronized InterfaceC3433cb a() {
        try {
            if (this.f48179q == null) {
                this.f48179q = new Ob(f());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48179q;
    }

    public final synchronized InterfaceC3433cb c() {
        try {
            if (this.f48175m == null) {
                if (this.f48174l == null) {
                    this.f48174l = new Nb(new C3795ql(h()));
                }
                this.f48175m = new Ob(this.f48174l);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48175m;
    }
}
