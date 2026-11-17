package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3388ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f46923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46924b;

    public RunnableC3388ai(C3866ti c3866ti, UserProfile userProfile) {
        this.f46924b = c3866ti;
        this.f46923a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46924b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportUserProfile(this.f46923a);
    }
}
