package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac extends Tn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f45460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(InterfaceC3735ob interfaceC3735ob, AppMetricaConfig appMetricaConfig) {
        super(interfaceC3735ob);
        String str = appMetricaConfig.apiKey;
        this.f45460b = appMetricaConfig;
    }

    public final InterfaceC3760pb a() {
        return this.f46588a.a().a(this.f45460b);
    }
}
