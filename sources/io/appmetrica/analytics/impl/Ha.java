package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: loaded from: classes3.dex */
public final class Ha implements InterfaceC3843sk {
    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
