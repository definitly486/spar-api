package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2 f46052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f46053b;

    public J2(I2 i13, Boolean bool) {
        this.f46052a = i13;
        this.f46053b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J2.class != obj.getClass()) {
            return false;
        }
        J2 j13 = (J2) obj;
        if (this.f46052a != j13.f46052a) {
            return false;
        }
        Boolean bool = this.f46053b;
        if (bool != null) {
            return bool.equals(j13.f46053b);
        }
        return j13.f46053b == null;
    }

    public final int hashCode() {
        I2 i13 = this.f46052a;
        int iHashCode = (i13 != null ? i13.hashCode() : 0) * 31;
        Boolean bool = this.f46053b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f46052a + ", mBackgroundRestricted=" + this.f46053b + '}';
    }
}
