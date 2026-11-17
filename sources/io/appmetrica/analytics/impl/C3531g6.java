package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3531g6 implements InterfaceC3505f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D5 f47287a;

    public C3531g6(D5 d13) {
        this.f47287a = d13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3505f6, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final D5 getAdRevenueProcessorsHolder() {
        return this.f47287a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f47287a;
    }
}
