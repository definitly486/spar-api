package io.appmetrica.analytics.impl;

import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3684ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47700c;

    public C3684ma(JSONObject jSONObject) {
        this.f47698a = jSONObject.getString(ExternalMetricsManagerImpl.NAME);
        this.f47700c = jSONObject.getBoolean("required");
        this.f47699b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3684ma.class != obj.getClass()) {
            return false;
        }
        C3684ma c3684ma = (C3684ma) obj;
        if (this.f47699b != c3684ma.f47699b || this.f47700c != c3684ma.f47700c) {
            return false;
        }
        String str = this.f47698a;
        String str2 = c3684ma.f47698a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        String str = this.f47698a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f47699b) * 31) + (this.f47700c ? 1 : 0);
    }

    public C3684ma(String str, int i13, boolean z13) {
        this.f47698a = str;
        this.f47699b = i13;
        this.f47700c = z13;
    }
}
