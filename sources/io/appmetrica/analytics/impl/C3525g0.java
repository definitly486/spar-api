package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3525g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47269b;

    public C3525g0(String str, long j13) {
        this.f47268a = str;
        this.f47269b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3525g0.class != obj.getClass()) {
            return false;
        }
        C3525g0 c3525g0 = (C3525g0) obj;
        if (this.f47269b != c3525g0.f47269b) {
            return false;
        }
        String str = this.f47268a;
        String str2 = c3525g0.f47268a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f47268a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j13 = this.f47269b;
        return (iHashCode * 31) + ((int) (j13 ^ (j13 >>> 32)));
    }
}
