package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3651l2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    public final InterfaceC3381ab a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC3735ob interfaceC3735ob) {
        return new Oh(new Ac(interfaceC3735ob, appMetricaConfig), new E6() { // from class: io.appmetrica.analytics.impl.wwaezpbzkn
            @Override // io.appmetrica.analytics.impl.E6
            public final boolean a(Throwable th2) {
                return C3651l2.a(th2);
            }
        }, appMetricaConfig.crashTransformer, new C3560ha(context));
    }
}
