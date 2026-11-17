package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Ej implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f45755a;

    public Ej(Throwable th2) {
        this.f45755a = th2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportUnhandledException(this.f45755a);
    }
}
