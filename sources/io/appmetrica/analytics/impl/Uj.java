package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Uj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f46629a;

    public Uj(Map map) {
        this.f46629a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportAnr(this.f46629a);
    }
}
