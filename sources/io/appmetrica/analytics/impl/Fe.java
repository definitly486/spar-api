package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes3.dex */
public final class Fe extends Kh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pf f45817e;

    public Fe(C3674m0 c3674m0, Zk zk2, Pf pf2) {
        super(c3674m0, zk2);
        this.f45817e = pf2;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Pf pf2 = this.f45817e;
        synchronized (pf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", pf2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
