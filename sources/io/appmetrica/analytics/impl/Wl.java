package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class Wl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f46735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tl f46737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f46739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3614jf f46743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O f46744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y3 f46745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S6 f46746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3734oa f46747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3709na f46748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mo f46749o;

    public Wl(Context context, C3614jf c3614jf) {
        this(c3614jf, new O(), new Y3(), C3952x4.l().a(context), new S6(), new C3734oa(), new C3709na(), new mo());
    }

    public final synchronized boolean a(List list) {
        boolean zA;
        boolean z13;
        try {
            zA = a(hg.jyumaefscl.tbqsvytpvh(list, AbstractC3444cm.f47037a));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z13 = false;
                    break;
                }
                if (this.f46735a.contains((String) it.next())) {
                    z13 = true;
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return !zA || z13 || ((AbstractC3444cm.f47038b.currentTimeSeconds() > this.f46742h ? 1 : (AbstractC3444cm.f47038b.currentTimeSeconds() == this.f46742h ? 0 : -1)) > 0) || this.f46741g;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f46736b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            mo moVar = this.f46749o;
            String str = identifiersResult.f48647id;
            moVar.getClass();
            if (mo.a(str)) {
                this.f46736b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C3784qa c3784qa;
        C3614jf c3614jfD = this.f46743i.i((IdentifiersResult) this.f46736b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f46736b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f46736b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f46736b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f46736b.get("appmetrica_report_ad_url")).e(this.f46740f).h((IdentifiersResult) this.f46736b.get("appmetrica_clids")).j(Gm.a((Map) this.f46739e)).f((IdentifiersResult) this.f46736b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f46736b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f46736b.get("appmetrica_yandex_adv_id")).b(this.f46741g).c(this.f46746l.f46499d).d(this.f46742h);
        C3734oa c3734oa = this.f46747m;
        synchronized (c3734oa) {
            c3784qa = c3734oa.f47826b;
        }
        c3614jfD.a(c3784qa).b();
    }

    public Wl(C3614jf c3614jf, O o13, Y3 y13, Kd kd2, S6 s13, C3734oa c3734oa, C3709na c3709na, mo moVar) {
        HashSet hashSet = new HashSet();
        this.f46735a = hashSet;
        this.f46736b = new HashMap();
        this.f46737c = new Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f46743i = c3614jf;
        this.f46744j = o13;
        this.f46745k = y13;
        this.f46746l = s13;
        this.f46747m = c3734oa;
        this.f46748n = c3709na;
        this.f46749o = moVar;
        c(kd2.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c3614jf.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c3614jf.i());
        a("appmetrica_get_ad_url", c3614jf.d());
        a("appmetrica_report_ad_url", c3614jf.e());
        b(c3614jf.o());
        a("appmetrica_google_adv_id", c3614jf.l());
        a("appmetrica_huawei_oaid", c3614jf.m());
        a("appmetrica_yandex_adv_id", c3614jf.r());
        s13.a(c3614jf.h());
        c3734oa.a(c3614jf.k());
        this.f46738d = c3614jf.g();
        String strI = c3614jf.i((String) null);
        this.f46739e = strI != null ? Gm.a(strI) : null;
        this.f46741g = c3614jf.a(true);
        this.f46740f = c3614jf.b(0L);
        this.f46742h = c3614jf.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f46736b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f48647id.isEmpty()) {
            return io.a((Map) this.f46739e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f48647id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f48647id)) {
            return;
        }
        this.f46736b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f46736b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f46746l.f46498c.get(str2);
                }
                if (identifiersResult == null) {
                    C3784qa c3784qa = this.f46747m.f47826b;
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str2, "appmetrica_lib_ssl_enabled") || (bool = c3784qa.f47915a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c3784qa.f47916b;
                        String str3 = c3784qa.f47917c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f46741g || a(identifiersResult) || (identifiersResult.f48647id.isEmpty() && !io.a((Map) this.f46739e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f48647id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
