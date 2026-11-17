package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3398b2 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46938c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46939d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46940e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46941f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46942g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46943h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46944i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46945j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f46946k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile C3398b2[] f46947l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46949b;

    public C3398b2() {
        a();
    }

    public static C3398b2[] b() {
        if (f46947l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46947l == null) {
                        f46947l = new C3398b2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46947l;
    }

    public final C3398b2 a() {
        this.f46948a = 0;
        this.f46949b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f46949b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f46948a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f46948a);
        codedOutputByteBufferNano.writeInt32(3, this.f46949b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3398b2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                    this.f46948a = int32;
                }
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int33 = codedInputByteBufferNano.readInt32();
                if (int33 == -1 || int33 == 0 || int33 == 1) {
                    this.f46949b = int33;
                }
            }
        }
    }

    public static C3398b2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3398b2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3398b2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3398b2) MessageNano.mergeFrom(new C3398b2(), bArr);
    }
}
