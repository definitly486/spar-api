package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicLogger f45978a;

    public I5(String str) {
        this.f45978a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i13) {
        if (i13 < 100) {
            this.f45978a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i13 + ". Default value (100) will be used", new Object[0]);
            return 100;
        }
        if (i13 <= 10000) {
            return i13;
        }
        this.f45978a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i13 + ". Default value (10000) will be used", new Object[0]);
        return AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
