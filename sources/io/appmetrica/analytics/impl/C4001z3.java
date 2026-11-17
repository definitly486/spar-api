package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4001z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48548a;

    public C4001z3(long j13) {
        this.f48548a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4001z3.class == obj.getClass() && this.f48548a == ((C4001z3) obj).f48548a;
    }

    public final int hashCode() {
        long j13 = this.f48548a;
        return (int) (j13 ^ (j13 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f48548a + '}';
    }
}
