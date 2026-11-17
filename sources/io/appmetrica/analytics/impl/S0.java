package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes3.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f46475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46476b;

    public S0(C3750p1 c3750p1, Revenue revenue) {
        this.f46476b = c3750p1;
        this.f46475a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46476b).reportRevenue(this.f46475a);
    }
}
