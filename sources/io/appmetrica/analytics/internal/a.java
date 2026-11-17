package io.appmetrica.analytics.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        AppMetricaService.f48641c.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i13, Bundle bundle) {
        AppMetricaService.f48641c.reportData(i13, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        AppMetricaService.f48641c.resumeUserSession(bundle);
    }
}
