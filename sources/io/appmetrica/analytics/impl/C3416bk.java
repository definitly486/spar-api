package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3416bk implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f46982b;

    public C3416bk(String str, Map map) {
        this.f46981a = str;
        this.f46982b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportEvent(this.f46981a, this.f46982b);
    }
}
