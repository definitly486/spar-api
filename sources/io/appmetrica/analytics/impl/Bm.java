package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cm f45544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f45545b;

    public Bm(Cm cm2) {
        this.f45544a = cm2;
    }

    public final Context b() {
        return this.f45544a.f45594a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            if (g()) {
                networkTask = this.f45545b;
                if (networkTask == null || networkTask.isRemoved()) {
                    C3418bm c3418bmD = d();
                    C3638ke c3638ke = C3638ke.f47587a;
                    Xl xl2 = new Xl(new C3912ve(), Ia.F.o());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c3418bmD);
                    networkTask = new NetworkTask(new SynchronizedBlockingExecutor(), new K5(this.f45544a.f45594a), new AllHostsExponentialBackoffPolicy(C3638ke.f47587a.a(EnumC3589ie.STARTUP)), new C4020zm(this, new Rl(), new FullUrlFormer(xl2, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), hg.jyumaefscl.wflxmlrfwp(), C3638ke.f47589c);
                    this.f45545b = networkTask;
                }
            } else {
                networkTask = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return networkTask;
    }

    public final C3418bm d() {
        return (C3418bm) this.f45544a.f45605l.a();
    }

    public final C3521fm e() {
        C3521fm c3521fm;
        Il il2 = this.f45544a.f45605l;
        synchronized (il2) {
            c3521fm = il2.f46070c.f47372a;
        }
        return c3521fm;
    }

    public final void f() {
        C3521fm c3521fm;
        Il il2 = this.f45544a.f45605l;
        synchronized (il2) {
            c3521fm = il2.f46070c.f47372a;
        }
        C3621jm c3621jm = c3521fm.f47230c;
        C3596im c3596imA = c3621jm.a(c3621jm.f47556m);
        String strA = c3521fm.f47228a;
        String str = c3521fm.f47229b;
        mo moVar = this.f45544a.f45607n;
        String str2 = c3521fm.f47231d;
        moVar.getClass();
        if (!mo.a(str2)) {
            c3596imA.f47462a = this.f45544a.f45606m.a().f48647id;
        }
        String str3 = c3521fm.f47228a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f45544a.f45601h.a();
            str = "";
        }
        List<String> list = this.f45544a.f45596c.f46893e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c3596imA.f47468g = list;
        C3521fm c3521fm2 = new C3521fm(strA, str, new C3621jm(c3596imA));
        b(c3521fm2);
        a(c3521fm2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a A[PHI: r3
      0x006a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v7 boolean), (r3v7 boolean) binds: [B:18:0x0033, B:27:0x0065, B:28:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public final synchronized boolean g() {
        boolean z13;
        boolean z14;
        synchronized (this) {
            try {
                boolean z15 = false;
                if (Ia.F.g().isRestrictedForSdk()) {
                    return false;
                }
                C3521fm c3521fmE = e();
                Set set = AbstractC3444cm.f47037a;
                if (!c3521fmE.f47250w) {
                    z13 = AbstractC3444cm.f47038b.currentTimeSeconds() > c3521fmE.f47242o + ((long) c3521fmE.A.f45666a);
                }
                if (!z13) {
                    if (AbstractC3444cm.a(c3521fmE.f47231d) && AbstractC3444cm.a(c3521fmE.f47228a) && AbstractC3444cm.a(c3521fmE.f47229b)) {
                        z15 = true;
                    }
                    z13 = !z15;
                    Y3 y13 = this.f45544a.f45604k;
                    Map map = d().f46990h;
                    V3 v13 = this.f45544a.f45603j;
                    y13.getClass();
                    z14 = (!z15 || Y3.a(map, c3521fmE, v13)) ? z13 : true;
                }
                return z14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void h() {
        this.f45545b = null;
    }

    public final C3654l5 a() {
        return this.f45544a.f45599f;
    }

    public final synchronized void b(C3521fm c3521fm) {
        this.f45544a.f45605l.a(c3521fm);
        C3495em c3495em = this.f45544a.f45600g;
        c3495em.f47188b.a(c3521fm.f47228a);
        c3495em.f47188b.b(c3521fm.f47229b);
        c3495em.f47187a.save(c3521fm.f47230c);
        this.f45544a.f45598e.a(c3521fm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC3444cm.a(e(), list, map, new Am(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    public final C3521fm a(C3470dm c3470dm, C3418bm c3418bm, long j13) {
        String str;
        boolean zEquals;
        String strA = Gm.a(c3418bm.f46990h);
        Map map = c3418bm.f46991i.f46249a;
        String str2 = c3470dm.f47116j;
        String str3 = e().f47238k;
        if (!Gm.a(Gm.a(str2))) {
            str2 = Gm.a(Gm.a(str3)) ? str3 : null;
        }
        String str4 = e().f47228a;
        if (str4 != null) {
            str = mj.kcexrzcfyt.zfvoamnweg(str4) ? null : str4;
            if (str == null) {
                str = c3470dm.f47114h;
            }
        } else {
            str = c3470dm.f47114h;
        }
        C3596im c3596im = new C3596im(c3470dm.f47108b);
        String str5 = c3470dm.f47115i;
        c3596im.f47476o = this.f45544a.f45602i.currentTimeSeconds();
        c3596im.f47462a = e().f47231d;
        c3596im.f47464c = c3470dm.f47110d;
        c3596im.f47467f = c3470dm.f47109c;
        c3596im.f47468g = c3418bm.f46987e;
        c3596im.f47463b = c3470dm.f47111e;
        c3596im.f47465d = c3470dm.f47112f;
        c3596im.f47466e = c3470dm.f47113g;
        c3596im.f47469h = c3470dm.f47120n;
        c3596im.f47470i = c3470dm.f47121o;
        c3596im.f47471j = str2;
        c3596im.f47472k = strA;
        this.f45544a.f45604k.getClass();
        HashMap mapA = Gm.a(str2);
        if (io.a(map)) {
            zEquals = io.a((Map) mapA);
        } else {
            zEquals = mapA.equals(map);
        }
        c3596im.f47478q = zEquals;
        c3596im.f47473l = Gm.a(map);
        c3596im.f47479r = c3470dm.f47119m;
        c3596im.f47475n = c3470dm.f47117k;
        c3596im.f47480s = c3470dm.f47122p;
        c3596im.f47477p = true;
        c3596im.f47481t = j13;
        C3418bm c3418bmD = d();
        if (c3418bmD.f46996n == 0) {
            c3418bmD.f46996n = j13;
        }
        c3596im.f47482u = c3418bmD.f46996n;
        c3596im.f47483v = false;
        c3596im.f47484w = c3470dm.f47123q;
        c3596im.f47486y = c3470dm.f47125s;
        c3596im.f47485x = c3470dm.f47124r;
        c3596im.f47487z = c3470dm.f47126t;
        c3596im.A = c3470dm.f47127u;
        c3596im.B = c3470dm.f47128v;
        c3596im.C = c3470dm.f47129w;
        return new C3521fm(str, str5, new C3621jm(c3596im));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public final void a(C3470dm c3470dm, C3418bm c3418bm, Map<String, ? extends List<String>> map) {
        Long lValueOf;
        C3521fm c3521fmA;
        synchronized (this) {
            if (io.a((Map) map)) {
                lValueOf = null;
            } else {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (io.a((Collection) list)) {
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                        lValueOf = null;
                    }
                }
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            AbstractC3545gk.f47346a.a(jLongValue, c3470dm.f47118l);
            c3521fmA = a(c3470dm, c3418bm, jLongValue);
            h();
            b(c3521fmA);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        a(c3521fmA);
    }

    public final void a(C3521fm c3521fm) {
        ArrayList arrayList;
        Cm cm2 = this.f45544a;
        Fl fl2 = cm2.f45597d;
        String str = cm2.f45595b;
        synchronized (fl2.f45824a.f45946b) {
            try {
                Hl hl2 = fl2.f45824a;
                hl2.f45947c = c3521fm;
                Collection collection = (Collection) hl2.f45945a.f46140a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ql) it.next()).a(c3521fm);
        }
    }

    public final void a(Jl jl2) {
        synchronized (this) {
            this.f45545b = null;
        }
        Cm cm2 = this.f45544a;
        cm2.f45597d.a(cm2.f45599f.f47629a, jl2, e());
    }

    public final synchronized void a(Zl zl2) {
        try {
            this.f45544a.f45605l.a(zl2);
            C3418bm c3418bmD = d();
            if (c3418bmD.f46993k) {
                List list = c3418bmD.f46992j;
                if (list != null && !list.isEmpty()) {
                    if (!io.a(list, c3418bmD.f46987e)) {
                        C3521fm c3521fmE = e();
                        C3621jm c3621jm = c3521fmE.f47230c;
                        C3596im c3596imA = c3621jm.a(c3621jm.f47556m);
                        String str = c3521fmE.f47228a;
                        String str2 = c3521fmE.f47229b;
                        c3596imA.f47468g = list;
                        C3521fm c3521fm = new C3521fm(str, str2, new C3621jm(c3596imA));
                        b(c3521fm);
                        a(c3521fm);
                    }
                } else {
                    List list2 = c3418bmD.f46987e;
                    if (list2 != null && (!list2.isEmpty())) {
                        C3521fm c3521fmE2 = e();
                        C3621jm c3621jm2 = c3521fmE2.f47230c;
                        C3596im c3596imA2 = c3621jm2.a(c3621jm2.f47556m);
                        String str3 = c3521fmE2.f47228a;
                        String str4 = c3521fmE2.f47229b;
                        c3596imA2.f47468g = null;
                        C3521fm c3521fm2 = new C3521fm(str3, str4, new C3621jm(c3596imA2));
                        b(c3521fm2);
                        a(c3521fm2);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
