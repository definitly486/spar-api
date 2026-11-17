package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f45306a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f45306a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f45306a.f45302c.shouldUpdate()) {
            this.f45306a.f45303d.f45305a.f45301b.updateLastKnown();
        }
    }
}
