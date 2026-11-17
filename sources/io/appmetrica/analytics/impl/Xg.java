package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class Xg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46773b;

    public Xg(long j13, long j14) {
        this.f46772a = j13;
        this.f46773b = j14;
    }

    public final Xg a(long j13, long j14) {
        return new Xg(j13, j14);
    }

    public final long b() {
        return this.f46773b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xg)) {
            return false;
        }
        Xg xg2 = (Xg) obj;
        return this.f46772a == xg2.f46772a && this.f46773b == xg2.f46773b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f46772a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f46773b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46773b) + (Long.hashCode(this.f46772a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f46772a + ", lastUpdateTime=" + this.f46773b + ')';
    }

    public final long a() {
        return this.f46772a;
    }

    public static Xg a(Xg xg2, long j13, long j14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j13 = xg2.f46772a;
        }
        if ((i13 & 2) != 0) {
            j14 = xg2.f46773b;
        }
        xg2.getClass();
        return new Xg(j13, j14);
    }
}
