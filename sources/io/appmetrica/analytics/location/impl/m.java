package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends SynchronizedDataCache {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f48681d = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f48682e = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f48684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f48679b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f48680c = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f48683f = Arrays.asList("gps", "network");

    public m() {
        l lVar = new l(f48680c);
        long j13 = f48679b;
        this(lVar, j13, 2 * j13);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        return f48683f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f48684a.f48678a, 200L));
    }

    public m(l lVar, long j13, long j14) {
        super(j13, j14, "location");
        this.f48684a = lVar;
    }

    public static boolean a(Location location, Location location2, long j13, long j14) {
        boolean zEquals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z13 = time > j13;
        boolean z14 = time < (-j13);
        boolean z15 = time > 0;
        if (z13) {
            return true;
        }
        if (z14) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z16 = accuracy > 0;
        boolean z17 = accuracy < 0;
        boolean z18 = ((long) accuracy) > j14;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z17) {
            return true;
        }
        if (!z15 || z16) {
            return z15 && !z18 && zEquals;
        }
        return true;
    }
}
