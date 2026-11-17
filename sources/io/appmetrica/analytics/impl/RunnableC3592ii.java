package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3592ii implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f47453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47454b;

    public RunnableC3592ii(C3866ti c3866ti, ModuleEvent moduleEvent) {
        this.f47454b = c3866ti;
        this.f47453a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47454b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportEvent(this.f47453a);
    }
}
