package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* JADX INFO: loaded from: classes3.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f45482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0 f45487f;

    public B0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j13, C0 c13) {
        this.f45482a = nativeCrashSource;
        this.f45483b = str;
        this.f45484c = str2;
        this.f45485d = str3;
        this.f45486e = j13;
        this.f45487f = c13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b13 = (B0) obj;
        return this.f45482a == b13.f45482a && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45483b, b13.f45483b) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45484c, b13.f45484c) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45485d, b13.f45485d) && this.f45486e == b13.f45486e && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f45487f, b13.f45487f);
    }

    public final int hashCode() {
        return this.f45487f.hashCode() + ((Long.hashCode(this.f45486e) + ((this.f45485d.hashCode() + ((this.f45484c.hashCode() + ((this.f45483b.hashCode() + (this.f45482a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f45482a + ", handlerVersion=" + this.f45483b + ", uuid=" + this.f45484c + ", dumpFile=" + this.f45485d + ", creationTime=" + this.f45486e + ", metadata=" + this.f45487f + ')';
    }
}
