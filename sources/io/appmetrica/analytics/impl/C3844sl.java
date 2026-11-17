package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3844sl implements SimpleNetworkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f48075a = new CacheControlHttpsConnectionPerformer(((Al) Ia.j().y()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f48075a.performConnection(str, new A3(networkClientWithCacheControl));
    }
}
