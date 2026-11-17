package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3639kf extends Nd implements yo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f47591d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47592e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f47593f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f47594g = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f47604q = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3689mf f47595h = new C3689mf("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3689mf f47596i = new C3689mf("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3689mf f47597j = new C3689mf("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3689mf f47598k = new C3689mf("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3689mf f47599l = new C3689mf("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C3689mf f47600m = new C3689mf("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3689mf f47601n = new C3689mf("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3689mf f47602o = new C3689mf("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3689mf f47603p = new C3689mf("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3689mf f47605r = new C3689mf("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C3639kf(InterfaceC3433cb interfaceC3433cb) {
        super(interfaceC3433cb);
    }

    public final C3639kf a(C3525g0 c3525g0) {
        synchronized (this) {
            b(f47597j.f47705b, c3525g0.f47268a);
            b(f47598k.f47705b, c3525g0.f47269b);
        }
        return this;
    }

    public final void b(boolean z13) {
        b(f47605r.f47705b, z13);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3664lf
    public final Set<String> c() {
        return this.f47658a.a();
    }

    public final C3525g0 d() {
        C3525g0 c3525g0;
        synchronized (this) {
            c3525g0 = new C3525g0(this.f47658a.getString(f47597j.f47705b, "{}"), this.f47658a.getLong(f47598k.f47705b, 0L));
        }
        return c3525g0;
    }

    public final String e() {
        return this.f47658a.getString(f47600m.f47705b, "");
    }

    public final List<String> f() {
        String str = f47601n.f47705b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.f47658a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                    strArr[i13] = jSONArray.optString(i13);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int g() {
        return this.f47658a.getInt(f47599l.f47705b, -1);
    }

    public final long h() {
        return this.f47658a.getLong(f47595h.f47705b, 0L);
    }

    public final C3639kf i(String str) {
        return (C3639kf) b(f47600m.f47705b, str);
    }

    public final C3639kf j(String str) {
        return (C3639kf) b(f47596i.f47705b, str);
    }

    public final String h(String str) {
        return this.f47658a.getString(new C3689mf(f47604q, str).f47705b, "");
    }

    public final String i() {
        return this.f47658a.getString(f47596i.f47705b, null);
    }

    public final Map<Integer, String> j() {
        HashMap map = new HashMap();
        try {
            String string = this.f47658a.getString(f47603p.f47705b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final C3639kf e(String str, String str2) {
        return (C3639kf) b(new C3689mf(f47604q, str).f47705b, str2);
    }

    public final C3639kf a(long j13) {
        return (C3639kf) b(f47595h.f47705b, j13);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    public final String f(String str) {
        return new C3689mf(str, null).f47705b;
    }

    public final C3639kf a(int i13) {
        return (C3639kf) b(f47599l.f47705b, i13);
    }

    public final C3639kf a(List<String> list) {
        return (C3639kf) a(f47601n.f47705b, list);
    }

    public final boolean a(boolean z13) {
        return this.f47658a.getBoolean(f47605r.f47705b, z13);
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final String a() {
        return this.f47658a.getString(f47602o.f47705b, null);
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final void a(String str) {
        b(f47602o.f47705b, str);
    }

    public final void a(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f47603p.f47705b, jSONObject.toString());
    }
}
