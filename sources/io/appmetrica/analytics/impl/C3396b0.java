package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396b0 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f46933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D6 f46934b;

    public C3396b0() {
        this(new V(new C3896un()), new D6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3730o6 fromModel(C3370a0 c3370a0) {
        C3730o6 c3730o6 = new C3730o6();
        c3730o6.f47815a = this.f46933a.fromModel(c3370a0.f46896a);
        String str = c3370a0.f46897b;
        if (str != null) {
            c3730o6.f47816b = str;
        }
        c3730o6.f47817c = this.f46934b.a(c3370a0.f46898c);
        return c3730o6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3396b0(V v13, D6 d13) {
        this.f46933a = v13;
        this.f46934b = d13;
    }

    public final C3370a0 a(C3730o6 c3730o6) {
        throw new UnsupportedOperationException();
    }
}
