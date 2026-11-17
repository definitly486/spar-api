package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3477e4 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C3952x4.l().b().a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
