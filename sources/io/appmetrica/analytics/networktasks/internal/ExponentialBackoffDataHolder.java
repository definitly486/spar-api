package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* JADX INFO: loaded from: classes3.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f48823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f48824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f48825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f48828f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f48827e = 1;
        this.f48826d = 0L;
        this.f48825c.saveNextSendAttemptNumber(1);
        this.f48825c.saveLastAttemptTimeSeconds(this.f48826d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f48824b.currentTimeSeconds();
        this.f48826d = jCurrentTimeSeconds;
        this.f48827e++;
        this.f48825c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f48825c.saveNextSendAttemptNumber(this.f48827e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j13 = this.f48826d;
            if (j13 != 0) {
                TimePassedChecker timePassedChecker = this.f48823a;
                int i13 = ((1 << (this.f48827e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i14 = retryPolicyConfig.maxIntervalSeconds;
                if (i13 > i14) {
                    i13 = i14;
                }
                return timePassedChecker.didTimePassSeconds(j13, i13, this.f48828f);
            }
        }
        return true;
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f48825c = hostRetryInfoProvider;
        this.f48824b = systemTimeProvider;
        this.f48823a = timePassedChecker;
        this.f48826d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f48827e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f48828f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }
}
