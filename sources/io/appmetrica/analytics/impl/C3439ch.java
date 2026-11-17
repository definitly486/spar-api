package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3439ch extends Kh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ih f47025e;

    public C3439ch(C3674m0 c3674m0, Zk zk2, Ih ih2) {
        super(c3674m0, zk2);
        this.f47025e = ih2;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(Throwable th2) {
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Ih ih2 = this.f47025e;
        iAppMetricaService.reportData(ih2.f46033c, ih2.f46031a.d(ih2.f46035e.c()));
    }
}
