package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f45551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45554f;

    public C0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i13, String str3, String str4) {
        this.f45549a = str;
        this.f45550b = str2;
        this.f45551c = counterConfigurationReporterType;
        this.f45552d = i13;
        this.f45553e = str3;
        this.f45554f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c13 = (C0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45549a, c13.f45549a) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45550b, c13.f45550b) && this.f45551c == c13.f45551c && this.f45552d == c13.f45552d && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45553e, c13.f45553e) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45554f, c13.f45554f);
    }

    public final int hashCode() {
        int iHashCode = (this.f45553e.hashCode() + ((Integer.hashCode(this.f45552d) + ((this.f45551c.hashCode() + ((this.f45550b.hashCode() + (this.f45549a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f45554f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f45549a + ", packageName=" + this.f45550b + ", reporterType=" + this.f45551c + ", processID=" + this.f45552d + ", processSessionID=" + this.f45553e + ", errorEnvironment=" + this.f45554f + ')';
    }
}
