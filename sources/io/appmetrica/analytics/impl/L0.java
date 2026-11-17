package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f46169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46170b;

    public L0(C3750p1 c3750p1, Location location) {
        this.f46170b = c3750p1;
        this.f46169a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f46170b.f47852a;
        Location location = this.f46169a;
        c3873u0.getClass();
        C3848t0.c().a(location);
    }
}
