package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3614jf extends Nd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3689mf f47518d = new C3689mf("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3689mf f47519e = new C3689mf("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3689mf f47520f = new C3689mf("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3689mf f47521g = new C3689mf("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3689mf f47522h = new C3689mf("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3689mf f47523i = new C3689mf("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3689mf f47524j = new C3689mf("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3689mf f47525k = new C3689mf("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3689mf f47526l = new C3689mf("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C3689mf f47527m = new C3689mf("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3689mf f47528n = new C3689mf("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3689mf f47529o = new C3689mf("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3689mf f47530p = new C3689mf("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3689mf f47531q = new C3689mf("GAID", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3689mf f47532r = new C3689mf("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C3689mf f47533s = new C3689mf("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C3689mf f47534t = new C3689mf("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C3689mf f47535u = new C3689mf("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C3689mf f47536v = new C3689mf("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C3689mf f47537w = new C3689mf("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C3689mf f47538x = new C3689mf("APPMETRICA_CLIENT_CONFIG", null);

    public C3614jf(InterfaceC3433cb interfaceC3433cb) {
        super(interfaceC3433cb);
    }

    public final boolean a(boolean z13) {
        return this.f47658a.getBoolean(f47534t.f47705b, z13);
    }

    public final long b(long j13) {
        return this.f47658a.getLong(f47524j.f47704a, j13);
    }

    public final C3614jf c(IdentifiersResult identifiersResult) {
        return a(f47526l.f47705b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f47521g.f47705b);
    }

    public final IdentifiersResult e() {
        return h(f47522h.f47705b);
    }

    public final C3614jf f(IdentifiersResult identifiersResult) {
        return a(f47531q.f47705b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f47526l.f47705b);
    }

    public final IdentifiersResult i() {
        return h(f47520f.f47705b);
    }

    public final IdentifiersResult j() {
        return h(f47519e.f47705b);
    }

    public final C3784qa k() {
        String string = this.f47658a.getString(f47537w.f47705b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C3784qa(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C3784qa(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f47531q.f47705b);
    }

    public final IdentifiersResult m() {
        return h(f47532r.f47705b);
    }

    public final long n() {
        return this.f47658a.getLong(f47530p.f47705b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f47525k.f47705b);
    }

    public final ScreenInfo p() {
        return Bb.e(this.f47658a.getString(f47535u.f47705b, null));
    }

    public final IdentifiersResult q() {
        return h(f47518d.f47705b);
    }

    public final IdentifiersResult r() {
        return h(f47533s.f47705b);
    }

    public final boolean s() {
        return this.f47658a.getBoolean(f47528n.f47705b, false);
    }

    public final boolean t() {
        return this.f47658a.getBoolean(f47536v.f47705b, false);
    }

    public final C3614jf u() {
        return (C3614jf) b(f47528n.f47705b, true);
    }

    public final void v() {
        b(f47536v.f47705b, true);
    }

    public final List<String> g() {
        String string = this.f47658a.getString(f47523i.f47705b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Bb.b(string);
    }

    public final long a(long j13) {
        return this.f47658a.getLong(f47529o.f47705b, j13);
    }

    public final C3614jf b(IdentifiersResult identifiersResult) {
        return a(f47522h.f47705b, identifiersResult);
    }

    public final C3614jf c(long j13) {
        return (C3614jf) b(f47529o.f47705b, j13);
    }

    public final C3614jf d(IdentifiersResult identifiersResult) {
        return a(f47520f.f47705b, identifiersResult);
    }

    public final C3614jf e(IdentifiersResult identifiersResult) {
        return a(f47519e.f47705b, identifiersResult);
    }

    public final AppMetricaConfig f() {
        String string = this.f47658a.getString(f47538x.f47705b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        try {
            String string = this.f47658a.getString(str, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            } else {
                identifiersResult = null;
            }
        } catch (Throwable unused) {
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    public final C3614jf i(IdentifiersResult identifiersResult) {
        return a(f47518d.f47705b, identifiersResult);
    }

    public final C3614jf j(IdentifiersResult identifiersResult) {
        return a(f47533s.f47705b, identifiersResult);
    }

    public final C3614jf g(IdentifiersResult identifiersResult) {
        return a(f47532r.f47705b, identifiersResult);
    }

    public final C3614jf a(IdentifiersResult identifiersResult) {
        return a(f47521g.f47705b, identifiersResult);
    }

    public final C3614jf b(boolean z13) {
        return (C3614jf) b(f47534t.f47705b, z13);
    }

    public final C3614jf d(long j13) {
        return (C3614jf) b(f47530p.f47705b, j13);
    }

    public final C3614jf e(long j13) {
        return (C3614jf) b(f47524j.f47705b, j13);
    }

    public final String i(String str) {
        return this.f47658a.getString(f47527m.f47705b, str);
    }

    public final C3614jf j(String str) {
        return (C3614jf) b(f47527m.f47705b, str);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    public final String f(String str) {
        return new C3689mf(str, null).f47705b;
    }

    public final C3614jf a(List<String> list) {
        return (C3614jf) b(f47523i.f47705b, io.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C3614jf h(IdentifiersResult identifiersResult) {
        return a(f47525k.f47705b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C3614jf g(String str) {
        return (C3614jf) d(new C3689mf(str, null).f47705b);
    }

    public final C3614jf a(C3784qa c3784qa) {
        String str = f47537w.f47705b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c3784qa.f47915a).put("STATUS", c3784qa.f47916b.getValue()).putOpt("ERROR_EXPLANATION", c3784qa.f47917c);
        } catch (Throwable unused) {
        }
        return (C3614jf) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f47535u.f47705b, Bb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f47538x.f47705b, appMetricaConfig.toJson());
    }

    public final C3614jf a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f48647id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
