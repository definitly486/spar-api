package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C3862te;
import io.appmetrica.analytics.impl.C3962xe;
import io.appmetrica.analytics.impl.C4009zb;
import io.appmetrica.analytics.impl.EnumC3483ea;
import io.appmetrica.analytics.impl.Vc;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C3862te(EnumC3483ea.ADJUST) : new C3962xe(EnumC3483ea.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C3862te(EnumC3483ea.AIRBRIDGE) : new Vc(EnumC3483ea.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C3862te(EnumC3483ea.APPSFLYER) : new Vc(EnumC3483ea.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C3862te(EnumC3483ea.KOCHAVA) : new C4009zb(EnumC3483ea.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C3862te(EnumC3483ea.SINGULAR) : new Vc(EnumC3483ea.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C3862te(EnumC3483ea.TENJIN) : new Vc(EnumC3483ea.TENJIN, map);
    }
}
