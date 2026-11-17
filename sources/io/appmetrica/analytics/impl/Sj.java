package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Sj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f46515b;

    public Sj(String str, byte[] bArr) {
        this.f46514a = str;
        this.f46515b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.setSessionExtra(this.f46514a, this.f46515b);
    }
}
