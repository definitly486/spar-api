package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4002z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f48549a;

    public C4002z4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f48549a.elapsedRealtime();
    }

    public C4002z4(SystemTimeProvider systemTimeProvider) {
        this.f48549a = systemTimeProvider;
    }
}
