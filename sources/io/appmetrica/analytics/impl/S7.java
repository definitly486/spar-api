package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46501b;

    public S7(int i13, long j13) {
        this.f46500a = j13;
        this.f46501b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S7)) {
            return false;
        }
        S7 s13 = (S7) obj;
        return this.f46500a == s13.f46500a && this.f46501b == s13.f46501b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46501b) + (Long.hashCode(this.f46500a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f46500a + ", exponent=" + this.f46501b + ')';
    }
}
