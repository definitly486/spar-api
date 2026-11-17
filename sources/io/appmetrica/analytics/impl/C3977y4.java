package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3977y4 implements ClientStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3894ul f48499a;

    public C3977y4(InterfaceC3894ul interfaceC3894ul) {
        this.f48499a = interfaceC3894ul;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C3836sd(str, this.f48499a);
    }
}
