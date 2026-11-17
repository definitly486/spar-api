package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Cj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f45591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f45592b;

    public Cj(String str, Throwable th2) {
        this.f45591a = str;
        this.f45592b = th2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportError(this.f45591a, this.f45592b);
    }
}
