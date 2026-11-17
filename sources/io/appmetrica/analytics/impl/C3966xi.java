package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3966xi implements InterfaceC3710nb {
    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb, io.appmetrica.analytics.impl.InterfaceC3735ob
    public final InterfaceC3710nb a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final InterfaceC3459db b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final InterfaceC3685mb b(ReporterConfig reporterConfig) {
        return new C3891ui();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final InterfaceC3459db a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final InterfaceC3760pb a(AppMetricaConfig appMetricaConfig) {
        return new C3891ui();
    }
}
