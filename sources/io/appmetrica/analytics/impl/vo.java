package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f48253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f48254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wo f48255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f48256d;

    public vo(yo yoVar, yo yoVar2, wo woVar) {
        this.f48253a = yoVar;
        this.f48254b = yoVar2;
        this.f48255c = woVar;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f48256d == null) {
                JSONObject jSONObjectA = this.f48255c.a(a(this.f48253a), a(this.f48254b));
                this.f48256d = jSONObjectA;
                a(jSONObjectA);
            }
            jSONObject = this.f48256d;
            if (jSONObject == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public static JSONObject a(yo yoVar) {
        try {
            String strA = yoVar.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f48253a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f48254b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
