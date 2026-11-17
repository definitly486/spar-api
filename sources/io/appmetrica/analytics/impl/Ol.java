package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Ol implements Pl {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f46349k = Collections.unmodifiableMap(new Ll());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ji f46351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wl f46352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f46353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f46354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ml f46355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f46356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f46357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f46358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46359j;

    public Ol(Context context, Ji ji2, C3614jf c3614jf, Handler handler) {
        this(ji2, new Wl(context, c3614jf), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f46356g) {
            try {
                Wl wl2 = this.f46352c;
                wl2.getClass();
                if (!io.a((Map) map) && !io.a(map, wl2.f46739e)) {
                    wl2.f46739e = new HashMap(map);
                    wl2.f46741g = true;
                    wl2.c();
                }
                a(startupParamsCallback, list);
                if (this.f46352c.a((List) list)) {
                    a(list, new Nl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResultA = C3728o4.a(bundle, "Uuid");
        IdentifiersResult identifiersResultA2 = C3728o4.a(bundle, "DeviceId");
        IdentifiersResult identifiersResultA3 = C3728o4.a(bundle, "DeviceIdHash");
        IdentifiersResult identifiersResultA4 = C3728o4.a(bundle, "AdUrlReport");
        IdentifiersResult identifiersResultA5 = C3728o4.a(bundle, "AdUrlGet");
        IdentifiersResult identifiersResultA6 = C3728o4.a(bundle, "Clids");
        IdentifiersResult identifiersResultA7 = C3728o4.a(bundle, "RequestClids");
        IdentifiersResult identifiersResultA8 = C3728o4.a(bundle, "GAID");
        IdentifiersResult identifiersResultA9 = C3728o4.a(bundle, "HOAID");
        IdentifiersResult identifiersResultA10 = C3728o4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult identifiersResultA11 = C3728o4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j13 = bundle.getLong("ServerTimeOffset");
        long j14 = bundle.getLong("NextStartupTime");
        C3784qa c3784qaA = C3728o4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Wl wl2 = this.f46352c;
        synchronized (wl2) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) wl2.f46736b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    mo moVar = wl2.f46749o;
                    String str = identifiersResult.f48647id;
                    moVar.getClass();
                    if (!mo.a(str)) {
                        wl2.c(identifiersResultA);
                    }
                } else {
                    wl2.c(identifiersResultA);
                }
                wl2.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, identifiersResultA2);
                wl2.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, identifiersResultA3);
                wl2.f46736b.put("appmetrica_google_adv_id", identifiersResultA8);
                wl2.f46736b.put("appmetrica_huawei_oaid", identifiersResultA9);
                wl2.f46736b.put("appmetrica_yandex_adv_id", identifiersResultA10);
                wl2.f46746l.a(identifiersResultA11);
                wl2.f46747m.a(c3784qaA);
                if (!Wl.a(identifiersResultA5)) {
                    wl2.f46736b.put("appmetrica_get_ad_url", identifiersResultA5);
                }
                if (!Wl.a(identifiersResultA4)) {
                    wl2.f46736b.put("appmetrica_report_ad_url", identifiersResultA4);
                }
                wl2.f46740f = j13;
                Y3 y13 = wl2.f46745k;
                HashMap map = wl2.f46739e;
                HashMap mapA = Bb.a(identifiersResultA7.f48647id);
                y13.getClass();
                if (io.a((Map) map) ? io.a((Map) mapA) : map.equals(mapA)) {
                    wl2.f46736b.put("appmetrica_clids", identifiersResultA6);
                    wl2.f46741g = false;
                }
                wl2.f46742h = j14;
                wl2.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C3952x4.l().m().a(bundle2, new SdkIdentifiers(identifiersResultA.f48647id, identifiersResultA2.f48647id, identifiersResultA3.f48647id));
        h();
    }

    public final V6 c() {
        return this.f46355f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f46352c.f46736b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f48647id;
    }

    public final C3833sa e() {
        C3784qa c3784qa;
        Wl wl2 = this.f46352c;
        C3709na c3709na = wl2.f46748n;
        C3734oa c3734oa = wl2.f46747m;
        synchronized (c3734oa) {
            c3784qa = c3734oa.f47826b;
        }
        c3709na.getClass();
        Boolean bool = c3784qa.f47915a;
        return new C3833sa();
    }

    public final long f() {
        return this.f46352c.f46740f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f46352c.f46736b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f48647id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f46357h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f46352c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f46356g) {
            try {
                if (!this.f46359j || this.f46352c.b()) {
                    this.f46359j = true;
                    a(this.f46350a, this.f46355f, this.f46358i, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Ol(Ji ji2, Wl wl2, Handler handler) {
        this.f46350a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f46356g = new Object();
        this.f46357h = new WeakHashMap();
        this.f46359j = false;
        this.f46351b = ji2;
        this.f46352c = wl2;
        this.f46353d = handler;
        this.f46355f = new Ml(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f46354e = publicLogger;
    }

    public final void a(List list, V6 v13, Map map, boolean z13) {
        W6 w13 = new W6(this.f46353d, v13);
        Ji ji2 = this.f46351b;
        ji2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C3834sb(w13, list, map, z13));
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = R9.f46441a;
        C3579i4 c3579i4 = new C3579i4("", "", 1536, 0, anonymousInstance);
        c3579i4.f47643m = bundle;
        C3375a5 c3375a5 = ji2.f46104a;
        ji2.a(Ji.a(c3579i4, c3375a5), c3375a5, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (io.a((Map) map)) {
            return;
        }
        synchronized (this.f46356g) {
            try {
                HashMap mapB = Gm.b(map);
                this.f46358i = mapB;
                this.f46351b.a(mapB);
                Wl wl2 = this.f46352c;
                wl2.getClass();
                if (!io.a((Map) mapB) && !io.a(mapB, wl2.f46739e)) {
                    wl2.f46739e = new HashMap(mapB);
                    wl2.f46741g = true;
                    wl2.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f46356g) {
            this.f46351b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Jl jl2;
        if (this.f46357h.containsKey(startupParamsCallback)) {
            List list = (List) this.f46357h.get(startupParamsCallback);
            if (this.f46352c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i13 = bundle.getInt("startup_error_key_code");
                    jl2 = Jl.UNKNOWN;
                    if (i13 == 1) {
                        jl2 = Jl.NETWORK;
                    } else if (i13 == 2) {
                        jl2 = Jl.PARSE;
                    }
                } else {
                    jl2 = null;
                }
                if (jl2 == null) {
                    if (!this.f46352c.a()) {
                        PublicLogger publicLogger = this.f46354e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f46358i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl2 = Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f46349k, jl2, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f46357h.remove(startupParamsCallback);
            if (this.f46357h.isEmpty()) {
                C3674m0 c3674m0 = this.f46351b.f46107d;
                synchronized (c3674m0.f47683f) {
                    c3674m0.f47680c = false;
                    c3674m0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f46356g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f46356g) {
            try {
                List list2 = this.f46352c.f46738d;
                if (io.a((Collection) list)) {
                    if (!io.a((Collection) list2)) {
                        Wl wl2 = this.f46352c;
                        wl2.f46738d = null;
                        wl2.f46743i.a((List<String>) null);
                        this.f46351b.a((List) null);
                    }
                } else if (!io.a(list, list2)) {
                    Wl wl3 = this.f46352c;
                    wl3.f46738d = list;
                    wl3.f46743i.a(list);
                    this.f46351b.a(list);
                } else {
                    this.f46351b.a(list2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Wl wl2 = this.f46352c;
        synchronized (wl2) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) wl2.f46736b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, wl2.f46737c.a(identifiersResult));
                    }
                }
                wl2.f46746l.a(list, map);
                wl2.f46747m.a(list, map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(String str) {
        synchronized (this.f46356g) {
            this.f46351b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f46352c.f46736b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f48647id;
        if (!TextUtils.isEmpty(str)) {
            return Bb.a(str);
        }
        return this.f46358i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f46357h.isEmpty()) {
            C3674m0 c3674m0 = this.f46351b.f46107d;
            synchronized (c3674m0.f47683f) {
                c3674m0.f47680c = true;
                c3674m0.b();
            }
        }
        this.f46357h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        Wl wl2 = this.f46352c;
        O o13 = wl2.f46744j;
        IdentifiersResult identifiersResult = (IdentifiersResult) wl2.f46736b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) wl2.f46736b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) wl2.f46736b.get("appmetrica_yandex_adv_id");
        o13.getClass();
        return new AdvIdentifiersResult(O.a(identifiersResult), O.a(identifiersResult2), O.a(identifiersResult3));
    }
}
