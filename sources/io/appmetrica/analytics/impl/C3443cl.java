package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3443cl implements InterfaceC3906v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3668lj f47032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rf f47033b;

    public C3443cl() {
        this(new C3668lj(), new Rf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(C3417bl c3417bl) {
        O8 o13 = new O8();
        o13.f46323a = 2;
        o13.f46325c = new L8();
        Qi qiFromModel = this.f47032a.fromModel(c3417bl.f46984b);
        o13.f46325c.f46176b = (K8) qiFromModel.f46427a;
        Qi qiFromModel2 = this.f47033b.fromModel(c3417bl.f46983a);
        o13.f46325c.f46175a = (H8) qiFromModel2.f46427a;
        return Collections.singletonList(new Qi(o13, new C3926w3(C3926w3.b(qiFromModel, qiFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3443cl(C3668lj c3668lj, Rf rf2) {
        this.f47032a = c3668lj;
        this.f47033b = rf2;
    }

    public final C3417bl a(List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
