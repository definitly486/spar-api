package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f46403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46404b;

    public Q0(C3750p1 c3750p1, UserProfile userProfile) {
        this.f46404b = c3750p1;
        this.f46403a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46404b).reportUserProfile(this.f46403a);
    }
}
