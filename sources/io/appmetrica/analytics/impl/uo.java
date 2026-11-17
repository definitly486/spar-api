package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo f48216a;

    public uo(C3639kf c3639kf, yo yoVar, String str) {
        this.f48216a = new vo(c3639kf, yoVar, new wo() { // from class: io.appmetrica.analytics.impl.ntlheqmsrt
            @Override // io.appmetrica.analytics.impl.wo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return uo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", Bb.a(jSONObject2, "report_request_id", Bb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", Bb.a(jSONObject2, "open_id", Bb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", Bb.a(jSONObject2, "attribution_id", Bb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", Bb.a(jSONObject2, "last_migration_api_level", Bb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("global_number", j13));
    }

    public final synchronized boolean c() {
        return this.f48216a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f48216a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f48216a.a().optInt("open_id", 1);
    }

    public final synchronized void c(long j13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("session_id", j13));
    }

    public final synchronized void b(int i13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("last_migration_api_level", i13));
    }

    public final synchronized void c(int i13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("open_id", i13));
    }

    public final synchronized void a(JSONObject jSONObject) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.f48216a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("attribution_id", i13));
    }

    public final synchronized void a(long j13) {
        vo voVar = this.f48216a;
        voVar.a(voVar.a().put("external_attribution_window_start", j13));
    }
}
