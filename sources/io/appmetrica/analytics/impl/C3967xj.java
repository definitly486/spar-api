package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3967xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f48453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f48454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Aj f48455d;

    public C3967xj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Aj aj2) {
        this.f48452a = str;
        this.f48453b = context;
        int i13 = AbstractC3942wj.f48349a[counterConfigurationReporterType.ordinal()];
        if (i13 == 1) {
            this.f48454c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i13 != 2) {
            this.f48454c = null;
        } else {
            this.f48454c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f48455d = aj2;
    }
}
