package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class D0 {
    public static String a(C0 c13) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c13.f45549a).put("packageName", c13.f45550b).put("reporterType", c13.f45551c.getStringValue()).put("processID", c13.f45552d).put("processSessionID", c13.f45553e).put("errorEnvironment", c13.f45554f).toString().getBytes(mj.wkgbmnqykc.f67326zoijcleaow), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), mj.wkgbmnqykc.f67326zoijcleaow));
            return new C0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
