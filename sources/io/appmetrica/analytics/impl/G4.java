package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f45842f;

    public G4(E4 e13) {
        this.f45837a = e13.f45682a;
        this.f45838b = e13.f45683b;
        this.f45839c = e13.f45684c;
        this.f45840d = e13.f45685d;
        this.f45841e = e13.f45686e;
        this.f45842f = e13.f45687f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G4.class != obj.getClass()) {
            return false;
        }
        G4 g13 = (G4) obj;
        if (this.f45837a != g13.f45837a || this.f45838b != g13.f45838b || this.f45839c != g13.f45839c || this.f45840d != g13.f45840d || this.f45841e != g13.f45841e) {
            return false;
        }
        Boolean bool = this.f45842f;
        Boolean bool2 = g13.f45842f;
        if (bool != null) {
            return bool.equals(bool2);
        }
        return bool2 == null;
    }

    public final int hashCode() {
        int i13 = (((((((((this.f45837a ? 1 : 0) * 31) + (this.f45838b ? 1 : 0)) * 31) + (this.f45839c ? 1 : 0)) * 31) + (this.f45840d ? 1 : 0)) * 31) + (this.f45841e ? 1 : 0)) * 31;
        Boolean bool = this.f45842f;
        return i13 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f45837a + ", featuresCollectingEnabled=" + this.f45838b + ", googleAid=" + this.f45839c + ", simInfo=" + this.f45840d + ", huaweiOaid=" + this.f45841e + ", sslPinning=" + this.f45842f + '}';
    }
}
