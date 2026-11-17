package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/locationapi/internal/CacheArguments;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "a", "J", "getRefreshPeriod", "()J", "refreshPeriod", "b", "getOutdatedTimeInterval", "outdatedTimeInterval", "<init>", "(JJ)V", "location-api_release"}, k = 1, mv = {1, 6, 0})
public final class CacheArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long refreshPeriod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long outdatedTimeInterval;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(CacheArguments.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) other;
        return this.refreshPeriod == cacheArguments.refreshPeriod && this.outdatedTimeInterval == cacheArguments.outdatedTimeInterval;
    }

    public final long getOutdatedTimeInterval() {
        return this.outdatedTimeInterval;
    }

    public final long getRefreshPeriod() {
        return this.refreshPeriod;
    }

    public int hashCode() {
        return Long.hashCode(this.outdatedTimeInterval) + (Long.hashCode(this.refreshPeriod) * 31);
    }

    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.refreshPeriod + ", outdatedTimeInterval=" + this.outdatedTimeInterval + ')';
    }

    public CacheArguments(long j13, long j14) {
        this.refreshPeriod = j13;
        this.outdatedTimeInterval = j14;
    }

    public /* synthetic */ CacheArguments(long j13, long j14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j13, (i13 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j14);
    }
}
