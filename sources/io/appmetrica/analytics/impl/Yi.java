package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Yi extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46810f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46811g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46812h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Yi[] f46813i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f46817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f46818e;

    public Yi() {
        a();
    }

    public static Yi[] b() {
        if (f46813i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46813i == null) {
                        f46813i = new Yi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46813i;
    }

    public final Yi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f46814a = bArr;
        this.f46815b = 0L;
        this.f46816c = 0;
        this.f46817d = bArr;
        this.f46818e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f46814a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f46814a);
        }
        long j13 = this.f46815b;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j13);
        }
        int i13 = this.f46816c;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i13);
        }
        if (!Arrays.equals(this.f46817d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f46817d);
        }
        long j14 = this.f46818e;
        return j14 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f46814a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46814a);
        }
        long j13 = this.f46815b;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j13);
        }
        int i13 = this.f46816c;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i13);
        }
        if (!Arrays.equals(this.f46817d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f46817d);
        }
        long j14 = this.f46818e;
        if (j14 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Yi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Yi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46814a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f46815b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f46816c = int32;
                }
            } else if (tag == 34) {
                this.f46817d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46818e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static Yi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Yi) MessageNano.mergeFrom(new Yi(), bArr);
    }
}
