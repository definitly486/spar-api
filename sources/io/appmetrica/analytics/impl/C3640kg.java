package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3640kg implements Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3814rg f47606a;

    public C3640kg(C3814rg c3814rg) {
        this.f47606a = c3814rg;
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(Ag ag2) {
        C3814rg c3814rg = this.f47606a;
        C3814rg.a(c3814rg, ag2, (InterfaceC3615jg) c3814rg.f47994d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(Throwable th2) {
        C3814rg c3814rg = this.f47606a;
        C3814rg.a(c3814rg, null, (InterfaceC3615jg) c3814rg.f47994d.getValue());
    }
}
