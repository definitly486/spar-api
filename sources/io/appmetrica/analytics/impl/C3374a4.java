package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3374a4 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3714nf f46903a;

    public C3374a4(C3714nf c3714nf) {
        super(c3714nf.e(), "[ClientApiTrackingStatusToggle]");
        this.f46903a = c3714nf;
    }

    public final void a(boolean z13) {
        updateState(z13);
        this.f46903a.f(z13);
    }
}
