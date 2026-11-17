package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3375a5 extends Sh {
    public C3375a5(Pf pf2) {
        super(pf2, new CounterConfiguration(), new W8(new C3819rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.Sh
    public final boolean f() {
        return true;
    }
}
