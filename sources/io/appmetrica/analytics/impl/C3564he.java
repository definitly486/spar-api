package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3564he implements ServiceNetworkContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5 f47391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47392b = new Zn().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3844sl f47393c = new C3844sl();

    public C3564he(Context context) {
        this.f47391a = new A5(new K5(context), new Ci(Ia.j().g()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f47391a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f47393c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return Ia.F.y();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f47392b;
    }
}
