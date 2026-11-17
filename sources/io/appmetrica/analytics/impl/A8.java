package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class A8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile A8[] f45449c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45451b;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (f45449c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45449c == null) {
                        f45449c = new A8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45449c;
    }

    public final A8 a() {
        this.f45450a = 0L;
        this.f45451b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f45450a;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j13);
        }
        int i13 = this.f45451b;
        return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f45450a;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        int i13 = this.f45451b;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f45450a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f45451b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    public static A8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}
