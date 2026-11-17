package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011zd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f48602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f48603b;

    public C4011zd(Dd dd2, ModuleEvent moduleEvent) {
        this.f48602a = dd2;
        this.f48603b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f48602a).reportEvent(this.f48603b);
    }
}
