package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46586g;

    public Tk(JSONObject jSONObject) {
        this.f46580a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f46581b = jSONObject.optString("kitBuildNumber", "");
        this.f46582c = jSONObject.optString("appVer", "");
        this.f46583d = jSONObject.optString("appBuild", "");
        this.f46584e = jSONObject.optString("osVer", "");
        this.f46585f = jSONObject.optInt("osApiLev", -1);
        this.f46586g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f46580a + "', kitBuildNumber='" + this.f46581b + "', appVersion='" + this.f46582c + "', appBuild='" + this.f46583d + "', osVersion='" + this.f46584e + "', apiLevel=" + this.f46585f + ", attributionId=" + this.f46586g + ')';
    }
}
