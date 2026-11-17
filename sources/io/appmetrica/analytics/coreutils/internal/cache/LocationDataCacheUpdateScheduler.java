package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f45300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f45301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f45302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f45303d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f45304e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f45300a = iCommonExecutor;
        this.f45301b = iLastKnownUpdater;
        this.f45302c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f45300a.remove(this.f45303d);
        this.f45300a.executeDelayed(this.f45303d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f45300a.execute(this.f45304e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f45300a.remove(this.f45303d);
        this.f45300a.remove(this.f45304e);
    }
}
