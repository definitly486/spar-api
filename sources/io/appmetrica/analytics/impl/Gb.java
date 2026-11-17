package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class Gb implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3563hd f45853a;

    public Gb() {
        this(new C3563hd(new On()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Nn nn2) {
        return MessageNano.toByteArray((MessageNano) this.f45853a.f47390a.fromModel(nn2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gb(C3563hd c3563hd) {
        this.f45853a = c3563hd;
    }

    public final Nn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
