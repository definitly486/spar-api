package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3653l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f47626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f47628e;

    public C3653l4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f47624a = str;
        this.f47625b = str2;
        this.f47626c = num;
        this.f47627d = str3;
        this.f47628e = counterConfigurationReporterType;
    }

    public static C3653l4 a(C3452d4 c3452d4) {
        return new C3653l4(c3452d4.f47066b.getApiKey(), c3452d4.f47065a.f46389a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c3452d4.f47065a.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c3452d4.f47065a.f46389a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c3452d4.f47066b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3653l4.class != obj.getClass()) {
            return false;
        }
        C3653l4 c3653l4 = (C3653l4) obj;
        String str = this.f47624a;
        if (str == null ? c3653l4.f47624a != null : !str.equals(c3653l4.f47624a)) {
            return false;
        }
        if (!this.f47625b.equals(c3653l4.f47625b)) {
            return false;
        }
        Integer num = this.f47626c;
        if (num == null ? c3653l4.f47626c != null : !num.equals(c3653l4.f47626c)) {
            return false;
        }
        String str2 = this.f47627d;
        if (str2 == null ? c3653l4.f47627d == null : str2.equals(c3653l4.f47627d)) {
            return this.f47628e == c3653l4.f47628e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f47624a;
        int iHashCode = (this.f47625b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f47626c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f47627d;
        return this.f47628e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f47624a + "', mPackageName='" + this.f47625b + "', mProcessID=" + this.f47626c + ", mProcessSessionID='" + this.f47627d + "', mReporterType=" + this.f47628e + '}';
    }
}
