package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* JADX INFO: loaded from: classes3.dex */
public interface Va extends SimpleAdvertisingIdGetter, InterfaceC3646km {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Ti ti2);

    /* synthetic */ void a(C3521fm c3521fm);

    void b(boolean z13);

    void c(boolean z13);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
