package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3642ki implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f47608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f47609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47610c;

    public RunnableC3642ki(C3866ti c3866ti, AdRevenue adRevenue, boolean z13) {
        this.f47610c = c3866ti;
        this.f47608a = adRevenue;
        this.f47609b = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47610c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportAdRevenue(this.f47608a, this.f47609b);
    }
}
