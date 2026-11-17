package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class M7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L7 f46228a;

    /* JADX WARN: Multi-variable type inference failed */
    public M7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(N7 n13) {
        return MessageNano.toByteArray(this.f46228a.fromModel(n13));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f46228a.fromModel((N7) obj));
    }

    public M7(L7 l13) {
        this.f46228a = l13;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N7 toModel(byte[] bArr) {
        K7 k13;
        if (bArr != null) {
            try {
                k13 = (K7) MessageNano.mergeFrom(new K7(), bArr);
                if (k13 == null) {
                    k13 = new K7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                k13 = new K7();
            }
        } else {
            k13 = new K7();
        }
        return this.f46228a.toModel(k13);
    }

    public /* synthetic */ M7(L7 l13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new L7(null, 1, null) : l13);
    }
}
