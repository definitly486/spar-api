package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3902v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f48222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48223c;

    public C3902v4(String str, Integer num, String str2) {
        this.f48221a = str;
        this.f48222b = num;
        this.f48223c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3902v4.class != obj.getClass()) {
            return false;
        }
        C3902v4 c3902v4 = (C3902v4) obj;
        if (!this.f48221a.equals(c3902v4.f48221a)) {
            return false;
        }
        Integer num = this.f48222b;
        if (num == null ? c3902v4.f48222b != null : !num.equals(c3902v4.f48222b)) {
            return false;
        }
        String str = this.f48223c;
        String str2 = c3902v4.f48223c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f48221a.hashCode() * 31;
        Integer num = this.f48222b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f48223c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
