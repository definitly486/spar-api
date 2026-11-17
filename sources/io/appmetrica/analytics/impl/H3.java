package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class H3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ma f45877a;

    public H3() {
        this(new Ma(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(List<String> list) {
        Jn jnA = this.f45877a.a((List<Object>) list);
        C4006z8 c4006z8 = new C4006z8();
        c4006z8.f48570a = StringUtils.getUTF8Bytes((List<String>) jnA.f46116a);
        InterfaceC3951x3 interfaceC3951x3 = jnA.f46117b;
        int i13 = ((I4) interfaceC3951x3).f48263a;
        return new Qi(c4006z8, interfaceC3951x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public H3(Ma ma3) {
        this.f45877a = ma3;
    }

    public final List<String> a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
