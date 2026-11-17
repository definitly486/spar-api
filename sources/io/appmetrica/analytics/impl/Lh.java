package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Lh extends AbstractC3865th {
    public Lh(Z6 z13) {
        super(z13);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3865th, io.appmetrica.analytics.impl.InterfaceC3890uh
    public final boolean a(Boolean bool) {
        return !this.f48130a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
