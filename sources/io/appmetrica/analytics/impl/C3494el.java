package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3494el implements InterfaceC3906v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f47185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3864tg f47186b;

    public C3494el() {
        this(new Rf(), new C3864tg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(C3469dl c3469dl) {
        Qi qiFromModel;
        O8 o13 = new O8();
        o13.f46323a = 3;
        o13.f46326d = new M8();
        Qi qiFromModel2 = this.f47185a.fromModel(c3469dl.f47104a);
        o13.f46326d.f46230a = (H8) qiFromModel2.f46427a;
        Kg kg2 = c3469dl.f47105b;
        if (kg2 != null) {
            qiFromModel = this.f47186b.fromModel(kg2);
            o13.f46326d.f46231b = (J8) qiFromModel.f46427a;
        } else {
            qiFromModel = null;
        }
        return Collections.singletonList(new Qi(o13, new C3926w3(C3926w3.b(qiFromModel2, qiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3494el(Rf rf2, C3864tg c3864tg) {
        this.f47185a = rf2;
        this.f47186b = c3864tg;
    }

    public final C3469dl a(List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
