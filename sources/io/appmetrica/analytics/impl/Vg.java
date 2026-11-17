package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes3.dex */
public final class Vg implements Kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f46676a;

    public Vg(Bm bm2) {
        this.f46676a = bm2;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        NetworkTask networkTaskC = this.f46676a.c();
        if (networkTaskC != null) {
            Ia.F.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
