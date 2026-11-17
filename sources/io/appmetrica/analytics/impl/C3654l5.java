package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3654l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47630b;

    public C3654l5(String str, String str2) {
        this.f47629a = str;
        this.f47630b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f47630b);
    }

    public final String b() {
        return this.f47630b;
    }

    public final String c() {
        return this.f47629a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f47629a + "_" + ApiKeyUtils.createPartialApiKey(this.f47630b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3654l5 c3654l5 = (C3654l5) obj;
        String str = this.f47629a;
        if (str == null ? c3654l5.f47629a != null : !str.equals(c3654l5.f47629a)) {
            return false;
        }
        String str2 = this.f47630b;
        String str3 = c3654l5.f47630b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public final int hashCode() {
        String str = this.f47629a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47630b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f47629a + "_" + this.f47630b;
    }
}
