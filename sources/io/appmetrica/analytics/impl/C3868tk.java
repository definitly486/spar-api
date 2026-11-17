package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3868tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f48138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48139b;

    public C3868tk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f48138a = systemTimeProvider;
        this.f48139b = systemTimeProvider.currentTimeMillis();
    }
}
