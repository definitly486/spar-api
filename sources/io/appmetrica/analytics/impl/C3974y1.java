package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3974y1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f48490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f48491b;

    public C3974y1(I1 i13, Configuration configuration) {
        this.f48491b = i13;
        this.f48490a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f48491b.f45963b.onConfigurationChanged(this.f48490a);
    }
}
