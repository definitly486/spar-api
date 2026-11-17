package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f45299a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j13, long j14, String str) {
        String.format("[DataCache-%s]", str);
        this.mCachedData = new CachedDataProvider.CachedData<>(j13, j14, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f45299a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f45299a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    protected abstract boolean shouldUpdate(T t13);

    public void updateCacheControl(long j13, long j14) {
        this.mCachedData.setExpirationPolicy(j13, j14);
    }

    public void updateData(T t13) {
        if (shouldUpdate(t13)) {
            this.mCachedData.setData(t13);
            CacheUpdateScheduler cacheUpdateScheduler = this.f45299a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
