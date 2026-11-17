package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivationBarrierCallback f45292a;

    public m(ActivationBarrierCallback activationBarrierCallback) {
        this.f45292a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45292a.onWaitFinished();
    }
}
