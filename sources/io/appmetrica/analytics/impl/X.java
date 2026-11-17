package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R7 f46751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Na f46752b;

    public X() {
        this(new R7(), new Na(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(Y y13) {
        C3931w8 c3931w8 = new C3931w8();
        c3931w8.f48283b = this.f46751a.fromModel(y13.f46790a);
        Jn jnA = this.f46752b.a(y13.f46791b);
        c3931w8.f48282a = StringUtils.getUTF8Bytes((String) jnA.f46116a);
        return new Qi(c3931w8, new C3926w3(C3926w3.b(jnA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public X(R7 r13, Na na3) {
        this.f46751a = r13;
        this.f46752b = na3;
    }

    public final Y a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
