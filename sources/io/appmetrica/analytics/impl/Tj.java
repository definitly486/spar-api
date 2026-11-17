package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes3.dex */
public final class Tj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f46578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f46579b;

    public Tj(AdRevenue adRevenue, boolean z13) {
        this.f46578a = adRevenue;
        this.f46579b = z13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportAdRevenue(this.f46578a, this.f46579b);
    }
}
