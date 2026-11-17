package ic;

import ac.cdpycssgdh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class wflxmlrfwp implements dxjokdxxww {
    wflxmlrfwp() {
    }

    private static wkgbmnqykc.zoijcleaow ppxfxbqfkf(JSONObject jSONObject) {
        return new wkgbmnqykc.zoijcleaow(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long wkgbmnqykc(cdpycssgdh cdpycssgdhVar, long j13, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : cdpycssgdhVar.iobyxmoadg() + (j13 * 1000);
    }

    private static wkgbmnqykc.iobyxmoadg zoijcleaow(JSONObject jSONObject) {
        return new wkgbmnqykc.iobyxmoadg(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    @Override // ic.dxjokdxxww
    public wkgbmnqykc iobyxmoadg(cdpycssgdh cdpycssgdhVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new wkgbmnqykc(wkgbmnqykc(cdpycssgdhVar, iOptInt2, jSONObject), jSONObject.has("session") ? ppxfxbqfkf(jSONObject.getJSONObject("session")) : ppxfxbqfkf(new JSONObject()), zoijcleaow(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
