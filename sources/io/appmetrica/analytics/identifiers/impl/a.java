package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f45407c;

    public a(String str, String str2, Boolean bool) {
        this.f45405a = str;
        this.f45406b = str2;
        this.f45407c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return zdlpuopuiu.eablkybsjg(this.f45405a, aVar.f45405a) && zdlpuopuiu.eablkybsjg(this.f45406b, aVar.f45406b) && zdlpuopuiu.eablkybsjg(this.f45407c, aVar.f45407c);
    }

    public final int hashCode() {
        int iHashCode = this.f45405a.hashCode() * 31;
        String str = this.f45406b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f45407c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f45405a + ", advId=" + this.f45406b + ", limitedAdTracking=" + this.f45407c + ')';
    }
}
