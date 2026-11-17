package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Wj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46730b;

    public Wj(String str, String str2) {
        this.f46729a = str;
        this.f46730b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.putAppEnvironmentValue(this.f46729a, this.f46730b);
    }
}
