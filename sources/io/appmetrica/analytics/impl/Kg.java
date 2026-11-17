package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: loaded from: classes3.dex */
public final class Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3768pj f46156c;

    public Kg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C3768pj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f46154a + "', identifier='" + this.f46155b + "', screen=" + this.f46156c + '}';
    }

    public Kg(String str, String str2, C3768pj c3768pj) {
        this.f46154a = str;
        this.f46155b = str2;
        this.f46156c = c3768pj;
    }
}
