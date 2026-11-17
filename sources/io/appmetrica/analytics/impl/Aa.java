package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class Aa implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Be f45459a;

    public Aa() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3845sm fromModel(G4 g13) {
        C3845sm c3845sm = new C3845sm();
        c3845sm.f48078b = g13.f45838b;
        c3845sm.f48077a = g13.f45837a;
        c3845sm.f48079c = g13.f45839c;
        c3845sm.f48080d = g13.f45840d;
        c3845sm.f48081e = g13.f45841e;
        c3845sm.f48082f = this.f45459a.a(g13.f45842f);
        return c3845sm;
    }

    public Aa(Sl sl2) {
        this.f45459a = sl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G4 toModel(C3845sm c3845sm) {
        E4 e13 = new E4();
        e13.f45685d = c3845sm.f48080d;
        e13.f45684c = c3845sm.f48079c;
        e13.f45683b = c3845sm.f48078b;
        e13.f45682a = c3845sm.f48077a;
        e13.f45686e = c3845sm.f48081e;
        e13.f45687f = this.f45459a.a(c3845sm.f48082f);
        return new G4(e13);
    }
}
