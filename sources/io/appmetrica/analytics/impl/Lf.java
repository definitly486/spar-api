package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Lf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f46181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mf f46182b;

    public Lf() {
        this(new X(), new Mf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(Nf nf2) {
        int bytesTruncated;
        G8 g13 = new G8();
        Qi qiFromModel = this.f46181a.fromModel(nf2.f46277a);
        g13.f45848a = (C3931w8) qiFromModel.f46427a;
        Jn jnA = this.f46182b.a(nf2.f46278b);
        if (io.a((Collection) jnA.f46116a)) {
            bytesTruncated = 0;
        } else {
            g13.f45849b = new C3931w8[((List) jnA.f46116a).size()];
            bytesTruncated = 0;
            for (int i13 = 0; i13 < ((List) jnA.f46116a).size(); i13++) {
                Qi qiFromModel2 = this.f46181a.fromModel((Y) ((List) jnA.f46116a).get(i13));
                g13.f45849b[i13] = (C3931w8) qiFromModel2.f46427a;
                bytesTruncated += qiFromModel2.f46428b.getBytesTruncated();
            }
        }
        return new Qi(g13, new C3926w3(C3926w3.b(qiFromModel, jnA, new C3926w3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(X x13, Mf mf2) {
        this.f46181a = x13;
        this.f46182b = mf2;
    }

    public final Nf a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
