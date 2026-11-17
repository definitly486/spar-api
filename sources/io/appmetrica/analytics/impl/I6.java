package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes3.dex */
public final class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ji f45979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sh f45980b;

    public I6(Pf pf2, W8 w13, Ji ji2, AppMetricaConfig appMetricaConfig) {
        this.f45979a = ji2;
        this.f45980b = new Sh(pf2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), w13, appMetricaConfig.userProfileID);
    }

    public final Sh a() {
        return this.f45980b;
    }
}
