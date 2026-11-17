package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class Tc extends V2 {
    public Tc(Context context, Pf pf2, ReporterConfig reporterConfig, Ji ji2, C3560ha c3560ha) {
        this(context, ji2, new Sh(pf2, new CounterConfiguration(reporterConfig), new W8(new C3819rl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), c3560ha, C3952x4.l().n(), new On(), new Rg(), new Q6(), new C3396b0(), new Xe(c3560ha));
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[ManualReporter]";
    }

    public Tc(Context context, Ji ji2, Sh sh2, C3560ha c3560ha, M6 m13, On on2, Rg rg2, Q6 q13, C3396b0 c3396b0, Xe xe2) {
        super(context, ji2, sh2, c3560ha, m13, on2, rg2, q13, c3396b0, xe2);
        C3952x4.l().getClass();
    }
}
