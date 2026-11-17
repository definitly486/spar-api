package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3986yd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f48523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f48524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f48525c;

    public C3986yd(Dd dd2, AdRevenue adRevenue, boolean z13) {
        this.f48523a = dd2;
        this.f48524b = adRevenue;
        this.f48525c = z13;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f48523a).reportAdRevenue(this.f48524b, this.f48525c);
    }
}
