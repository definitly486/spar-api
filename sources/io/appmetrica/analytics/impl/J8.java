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
public final class J8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile J8[] f46086d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f46088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K8 f46089c;

    public J8() {
        a();
    }

    public static J8[] b() {
        if (f46086d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46086d == null) {
                        f46086d = new J8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46086d;
    }

    public final J8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f46087a = bArr;
        this.f46088b = bArr;
        this.f46089c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f46087a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f46087a);
        }
        if (!Arrays.equals(this.f46088b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f46088b);
        }
        K8 k13 = this.f46089c;
        return k13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, k13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f46087a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46087a);
        }
        if (!Arrays.equals(this.f46088b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f46088b);
        }
        K8 k13 = this.f46089c;
        if (k13 != null) {
            codedOutputByteBufferNano.writeMessage(3, k13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46087a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f46088b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46089c == null) {
                    this.f46089c = new K8();
                }
                codedInputByteBufferNano.readMessage(this.f46089c);
            }
        }
    }

    public static J8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J8().mergeFrom(codedInputByteBufferNano);
    }

    public static J8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (J8) MessageNano.mergeFrom(new J8(), bArr);
    }
}
