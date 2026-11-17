package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "window", "", "limitPerWindow", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "storage", "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "", "key", "", "detect", "(Ljava/lang/String;)Z", "Lgg/wwaezpbzkn;", "updateParameters", "(JI)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class EventFrequencyOverWindowLimitDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f45348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f45349d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j13, int i13, EventFrequencyStorage eventFrequencyStorage) {
        this.f45346a = j13;
        this.f45347b = i13;
        this.f45348c = eventFrequencyStorage;
    }

    public final boolean detect(String key) {
        long jLongValue;
        long jUptimeMillis = this.f45349d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f45348c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j13 = jUptimeMillis - jLongValue;
        if (j13 < 0 || j13 > this.f45346a) {
            this.f45348c.putWindowStart(key, jUptimeMillis);
            this.f45348c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f45348c.getWindowOccurrencesCount(key);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f45348c.putWindowOccurrencesCount(key, iIntValue);
        return iIntValue > this.f45347b;
    }

    public final synchronized void updateParameters(long window, int limitPerWindow) {
        this.f45346a = window;
        this.f45347b = limitPerWindow;
    }
}
