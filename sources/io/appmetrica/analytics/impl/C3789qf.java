package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3789qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f47923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC3657l8 f47924c;

    public C3789qf(String str, JSONObject jSONObject, EnumC3657l8 enumC3657l8) {
        this.f47922a = str;
        this.f47923b = jSONObject;
        this.f47924c = enumC3657l8;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f47922a + "', additionalParams=" + this.f47923b + ", source=" + this.f47924c + '}';
    }
}
