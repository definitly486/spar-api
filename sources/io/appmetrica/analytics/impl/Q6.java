package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Q6 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f46414a;

    public Q6() {
        this(new Rg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3854t6 fromModel(P6 p13) {
        C3854t6 c3854t6FromModel = this.f46414a.fromModel(p13.f46374a);
        c3854t6FromModel.f48105g = 1;
        C3829s6 c3829s6 = new C3829s6();
        c3854t6FromModel.f48106h = c3829s6;
        c3829s6.f48052a = StringUtils.correctIllFormedString(p13.f46375b);
        return c3854t6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Q6(Rg rg2) {
        this.f46414a = rg2;
    }

    public final P6 a(C3854t6 c3854t6) {
        throw new UnsupportedOperationException();
    }
}
