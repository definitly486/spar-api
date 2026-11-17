package io.appmetrica.analytics.networktasks.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z13);

    void onHostAttemptFinished(boolean z13);
}
