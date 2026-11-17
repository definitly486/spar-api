package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45949a;

    public Hm(long j13) {
        this.f45949a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f45949a == ((Hm) obj).f45949a;
    }

    public final int hashCode() {
        long j13 = this.f45949a;
        return (int) (j13 ^ (j13 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f45949a + '}';
    }
}
