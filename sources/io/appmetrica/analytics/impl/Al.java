package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class Al implements X2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45475a;

    public Al(Context context) {
        this.f45475a = context;
    }

    @Override // io.appmetrica.analytics.impl.X2, io.appmetrica.analytics.impl.InterfaceC3646km
    public final void a(C3521fm c3521fm) {
    }

    public final Context b() {
        return this.f45475a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
