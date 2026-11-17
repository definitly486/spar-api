package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes3.dex */
public final class Kn extends Kh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f46165f;

    public Kn(C3674m0 c3674m0, Zk zk2, int i13, Bundle bundle) {
        super(c3674m0, zk2);
        this.f46164e = i13;
        this.f46165f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f46164e, this.f46165f);
    }
}
