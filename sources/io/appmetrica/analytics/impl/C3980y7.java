package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3980y7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3955x7 f48508a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3980y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C4005z7 c4005z7) {
        return MessageNano.toByteArray(this.f48508a.fromModel(c4005z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f48508a.fromModel((C4005z7) obj));
    }

    public C3980y7(C3955x7 c3955x7) {
        this.f48508a = c3955x7;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4005z7 toModel(byte[] bArr) {
        I7 i13;
        if (bArr != null) {
            try {
                i13 = (I7) MessageNano.mergeFrom(new I7(), bArr);
                if (i13 == null) {
                    i13 = new I7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                i13 = new I7();
            }
        } else {
            i13 = new I7();
        }
        return this.f48508a.toModel(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3980y7(C3955x7 c3955x7, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            c3955x7 = new C3955x7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(c3955x7);
    }
}
