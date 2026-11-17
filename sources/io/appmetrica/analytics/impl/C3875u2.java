package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3875u2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3746om fromModel(BillingConfig billingConfig) {
        C3746om c3746om = new C3746om();
        c3746om.f47849a = billingConfig.sendFrequencySeconds;
        c3746om.f47850b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c3746om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C3746om c3746om = (C3746om) obj;
        return new BillingConfig(c3746om.f47849a, c3746om.f47850b);
    }

    public final BillingConfig a(C3746om c3746om) {
        return new BillingConfig(c3746om.f47849a, c3746om.f47850b);
    }
}
