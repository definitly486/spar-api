package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f48666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f48667b;

    public j(k kVar, i iVar) {
        this.f48667b = kVar;
        this.f48666a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f48667b.f48670c;
        i iVar = this.f48666a;
        pVar.f48687a = iVar;
        CacheArguments cacheArguments = iVar.f48665b;
        pVar.f48688b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
