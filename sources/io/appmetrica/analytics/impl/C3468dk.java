package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3468dk extends AbstractC3865th {
    public C3468dk(Z6 z13) {
        super(z13);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3865th, io.appmetrica.analytics.impl.InterfaceC3890uh
    public final boolean a(Boolean bool) {
        return !this.f48130a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
