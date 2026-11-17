package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f46538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46539b;

    public T0(C3750p1 c3750p1, AdRevenue adRevenue) {
        this.f46539b = c3750p1;
        this.f46538a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46539b).reportAdRevenue(this.f46538a);
    }
}
