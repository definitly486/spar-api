package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo f48151a;

    public to(C3714nf c3714nf, C3933wa c3933wa) {
        this.f48151a = new vo(c3714nf, c3933wa, new wo() { // from class: io.appmetrica.analytics.impl.tzroggbefp
            @Override // io.appmetrica.analytics.impl.wo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return to.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", Bb.a(jSONObject2, "last_migration_api_level", Bb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        vo voVar = this.f48151a;
        voVar.a(voVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f48151a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        vo voVar = this.f48151a;
        voVar.a(voVar.a().put("referrer_checked", true));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public final synchronized Ag b() {
        Ag ag2;
        String strOptStringOrNull = JsonUtils.optStringOrNull(this.f48151a.a(), "referrer");
        if (strOptStringOrNull != null) {
            try {
                byte[] bArrDecode = Base64.decode(strOptStringOrNull.getBytes(mj.wkgbmnqykc.f67326zoijcleaow), 0);
                if (bArrDecode == null || bArrDecode.length == 0) {
                    ag2 = null;
                } else {
                    ag2 = new Ag(bArrDecode);
                }
            } catch (Throwable unused) {
            }
        } else {
            ag2 = null;
        }
        return ag2;
    }

    public final synchronized void a(String str) {
        vo voVar = this.f48151a;
        voVar.a(voVar.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f48151a.a(), "device_id_hash");
    }

    public final synchronized void a(Ag ag2) {
        try {
            vo voVar = this.f48151a;
            voVar.a(voVar.a().put("referrer", ag2 != null ? new String(Base64.encode(ag2.a(), 0), mj.wkgbmnqykc.f67326zoijcleaow) : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
