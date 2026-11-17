package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class K7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile K7[] f46131d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46134c;

    public K7() {
        a();
    }

    public static K7[] b() {
        if (f46131d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46131d == null) {
                        f46131d = new K7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46131d;
    }

    public final K7 a() {
        this.f46132a = -1L;
        this.f46133b = -1L;
        this.f46134c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f46132a;
        if (j13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j13);
        }
        long j14 = this.f46133b;
        if (j14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j14);
        }
        int i13 = this.f46134c;
        return i13 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f46132a;
        if (j13 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        long j14 = this.f46133b;
        if (j14 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j14);
        }
        int i13 = this.f46134c;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f46132a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f46133b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f46134c = int32;
                }
            }
        }
    }

    public static K7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K7().mergeFrom(codedInputByteBufferNano);
    }

    public static K7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K7) MessageNano.mergeFrom(new K7(), bArr);
    }
}
