package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48904a = "permissions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48905b = ExternalMetricsManagerImpl.NAME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48906c = "list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48907d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f48904a);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f48906c)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean(this.f48907d)) {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f48905b);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    public final a b(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
