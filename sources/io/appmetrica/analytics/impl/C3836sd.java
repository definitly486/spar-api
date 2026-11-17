package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3836sd extends P2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48061b;

    public C3836sd(String str, InterfaceC3894ul interfaceC3894ul) {
        super(interfaceC3894ul);
        this.f48061b = str;
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final String a(String str) {
        return str + '-' + this.f48061b;
    }
}
