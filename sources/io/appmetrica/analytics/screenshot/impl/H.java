package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f48929a;

    /* JADX WARN: Multi-variable type inference failed */
    public H() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(G g13) {
        return MessageNano.toByteArray(this.f48929a.fromModel(g13));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f48929a.fromModel((G) obj));
    }

    public H(J j13) {
        this.f48929a = j13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(byte[] bArr) {
        O o13;
        try {
            o13 = (O) MessageNano.mergeFrom(new O(), bArr);
        } catch (Throwable unused) {
            o13 = new O();
        }
        return this.f48929a.toModel(o13);
    }

    public /* synthetic */ H(J j13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new J(null, 1, null) : j13);
    }
}
