package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3710nb extends InterfaceC3735ob {
    InterfaceC3459db a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13);

    @Override // io.appmetrica.analytics.impl.InterfaceC3735ob
    /* synthetic */ InterfaceC3710nb a();

    InterfaceC3760pb a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    InterfaceC3459db b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13);

    InterfaceC3685mb b(ReporterConfig reporterConfig);
}
