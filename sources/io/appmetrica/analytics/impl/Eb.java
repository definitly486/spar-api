package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f45714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f45716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f45719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45720j;

    public Eb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f45711a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f45712b = jSONObject2.getString(ExternalMetricsManagerImpl.NAME);
        this.f45713c = jSONObject2.getInt("bytes_truncated");
        this.f45720j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f45714d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = Bb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f45714d.put(EnumC3554h4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f45715e = jSONObject3.getString("package_name");
        this.f45716f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f45717g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f45718h = jSONObject4.getString("api_key");
        this.f45719i = a(jSONObject4);
    }

    public final String a() {
        return this.f45718h;
    }

    public final int b() {
        return this.f45713c;
    }

    public final byte[] c() {
        return this.f45711a;
    }

    public final String d() {
        return this.f45720j;
    }

    public final String e() {
        return this.f45712b;
    }

    public final String f() {
        return this.f45715e;
    }

    public final Integer g() {
        return this.f45716f;
    }

    public final String h() {
        return this.f45717g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f45719i;
    }

    public final HashMap<EnumC3554h4, Integer> j() {
        return this.f45714d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f45714d.entrySet()) {
            map.put(((EnumC3554h4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f45716f).put("psid", this.f45717g).put("package_name", this.f45715e)).put("reporter_configuration", new JSONObject().put("api_key", this.f45718h).put("reporter_type", this.f45719i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f45711a, 0)).put(ExternalMetricsManagerImpl.NAME, this.f45712b).put("bytes_truncated", this.f45713c).put("trimmed_fields", Bb.b(map)).putOpt("environment", this.f45720j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public Eb(C3655l6 c3655l6, C3452d4 c3452d4, HashMap<EnumC3554h4, Integer> map) {
        this.f45711a = c3655l6.getValueBytes();
        this.f45712b = c3655l6.getName();
        this.f45713c = c3655l6.getBytesTruncated();
        if (map != null) {
            this.f45714d = map;
        } else {
            this.f45714d = new HashMap();
        }
        Pf pfA = c3452d4.a();
        this.f45715e = pfA.e();
        this.f45716f = pfA.f();
        this.f45717g = pfA.g();
        CounterConfiguration counterConfigurationB = c3452d4.b();
        this.f45718h = counterConfigurationB.getApiKey();
        this.f45719i = counterConfigurationB.getReporterType();
        this.f45720j = c3655l6.f();
    }
}
