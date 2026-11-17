package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class F3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f45778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R7 f45779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lf f45780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3864tg f45781d;

    public F3() {
        this(new Rf(), new R7(), new Lf(), new C3864tg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(G3 g13) {
        Qi qiA;
        C3981y8 c3981y8 = new C3981y8();
        Qi qiA2 = this.f45778a.fromModel(g13.f45833a);
        c3981y8.f48510a = (H8) qiA2.f46427a;
        c3981y8.f48512c = this.f45779b.fromModel(g13.f45834b);
        Qi qiA3 = this.f45780c.fromModel(g13.f45835c);
        c3981y8.f48513d = (G8) qiA3.f46427a;
        Kg kg2 = g13.f45836d;
        if (kg2 != null) {
            qiA = this.f45781d.fromModel(kg2);
            c3981y8.f48511b = (J8) qiA.f46427a;
        } else {
            qiA = null;
        }
        return new Qi(c3981y8, new C3926w3(C3926w3.b(qiA2, qiA3, qiA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public F3(Rf rf2, R7 r13, Lf lf2, C3864tg c3864tg) {
        this.f45778a = rf2;
        this.f45779b = r13;
        this.f45780c = lf2;
        this.f45781d = c3864tg;
    }

    public final G3 a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
