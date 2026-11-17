package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Ef implements InterfaceC3682m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f45728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC3657l8 f45731e;

    public Ef(String str, JSONObject jSONObject, boolean z13, boolean z14, EnumC3657l8 enumC3657l8) {
        this.f45727a = str;
        this.f45728b = jSONObject;
        this.f45729c = z13;
        this.f45730d = z14;
        this.f45731e = enumC3657l8;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3682m8
    public final EnumC3657l8 a() {
        return this.f45731e;
    }

    public final JSONObject b() {
        if (!this.f45729c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f45727a);
            if (this.f45728b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f45728b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f45727a);
            jSONObject.put("additionalParams", this.f45728b);
            jSONObject.put("wasSet", this.f45729c);
            jSONObject.put("autoTracking", this.f45730d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f45731e.f47652a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f45727a + "', additionalParameters=" + this.f45728b + ", wasSet=" + this.f45729c + ", autoTrackingEnabled=" + this.f45730d + ", source=" + this.f45731e + '}';
    }

    public static Ef a(JSONObject jSONObject) {
        EnumC3657l8 enumC3657l8;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i13 = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        EnumC3657l8[] enumC3657l8ArrValues = EnumC3657l8.values();
        int length = enumC3657l8ArrValues.length;
        while (true) {
            if (i13 >= length) {
                enumC3657l8 = null;
                break;
            }
            enumC3657l8 = enumC3657l8ArrValues[i13];
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(enumC3657l8.f47652a, strOptStringOrNull2)) {
                break;
            }
            i13++;
        }
        return new Ef(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, enumC3657l8 == null ? EnumC3657l8.f47647b : enumC3657l8);
    }
}
