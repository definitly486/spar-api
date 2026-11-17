package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public class Cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3586ib f45585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3964xg f45586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3536gb f45587c;

    public Cg(InterfaceC3586ib interfaceC3586ib, InterfaceC3964xg interfaceC3964xg, InterfaceC3536gb interfaceC3536gb) {
        this.f45585a = interfaceC3586ib;
        this.f45586b = interfaceC3964xg;
        this.f45587c = interfaceC3536gb;
    }

    public final void a(Ag ag2) {
        if (this.f45585a.a(ag2)) {
            this.f45586b.a(ag2);
            this.f45587c.a();
        }
    }

    public final InterfaceC3964xg b() {
        return this.f45586b;
    }

    public final InterfaceC3536gb c() {
        return this.f45587c;
    }

    public final InterfaceC3586ib a() {
        return this.f45585a;
    }
}
