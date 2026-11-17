package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes3.dex */
public final class H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f45894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f45895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f45896n;

    public H7(Ab ab3) {
        this.f45883a = ab3.b("dId");
        this.f45884b = ab3.b("uId");
        this.f45885c = ab3.b("analyticsSdkVersionName");
        this.f45886d = ab3.b("kitBuildNumber");
        this.f45887e = ab3.b("kitBuildType");
        this.f45888f = ab3.b("appVer");
        this.f45889g = ab3.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f45890h = ab3.b("appBuild");
        this.f45891i = ab3.b("osVer");
        this.f45893k = ab3.b("lang");
        this.f45894l = ab3.b("root");
        this.f45895m = ab3.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = ab3.optInt("osApiLev", -1);
        this.f45892j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = ab3.optInt("attribution_id", 0);
        this.f45896n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f45883a + "', uuid='" + this.f45884b + "', analyticsSdkVersionName='" + this.f45885c + "', kitBuildNumber='" + this.f45886d + "', kitBuildType='" + this.f45887e + "', appVersion='" + this.f45888f + "', appDebuggable='" + this.f45889g + "', appBuildNumber='" + this.f45890h + "', osVersion='" + this.f45891i + "', osApiLevel='" + this.f45892j + "', locale='" + this.f45893k + "', deviceRootStatus='" + this.f45894l + "', appFramework='" + this.f45895m + "', attributionId='" + this.f45896n + "'}";
    }

    public H7() {
        this.f45883a = null;
        this.f45884b = null;
        this.f45885c = null;
        this.f45886d = null;
        this.f45887e = null;
        this.f45888f = null;
        this.f45889g = null;
        this.f45890h = null;
        this.f45891i = null;
        this.f45892j = null;
        this.f45893k = null;
        this.f45894l = null;
        this.f45895m = null;
        this.f45896n = null;
    }
}
