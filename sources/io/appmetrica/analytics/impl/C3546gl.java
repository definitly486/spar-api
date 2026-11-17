package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3546gl implements InterfaceC3906v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3668lj f47347a;

    public C3546gl() {
        this(new C3668lj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(C3520fl c3520fl) {
        O8 o13 = new O8();
        o13.f46323a = 1;
        o13.f46324b = new N8();
        Qi qiFromModel = this.f47347a.fromModel(c3520fl.f47226a);
        o13.f46324b.f46256a = (K8) qiFromModel.f46427a;
        C3926w3 c3926w3 = new C3926w3(C3926w3.b(qiFromModel));
        qiFromModel.f46428b.getBytesTruncated();
        return Collections.singletonList(new Qi(o13, c3926w3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3546gl(C3668lj c3668lj) {
        this.f47347a = c3668lj;
    }

    public final C3520fl a(List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
