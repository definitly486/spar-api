package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3813rf implements InterfaceC3607j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ef f47989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C3789qf> f47990b;

    public C3813rf(Ef ef2, List<C3789qf> list) {
        this.f47989a = ef2;
        this.f47990b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3607j8
    public final List<C3789qf> a() {
        return this.f47990b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3607j8
    public final Object b() {
        return this.f47989a;
    }

    public final Ef c() {
        return this.f47989a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f47989a + ", candidates=" + this.f47990b + '}';
    }
}
