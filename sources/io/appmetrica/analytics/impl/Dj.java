package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Dj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f45654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f45656c;

    public Dj(String str, String str2, Throwable th2) {
        this.f45654a = str;
        this.f45655b = str2;
        this.f45656c = th2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.reportError(this.f45654a, this.f45655b, this.f45656c);
    }
}
