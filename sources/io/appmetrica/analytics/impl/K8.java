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
public final class K8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile K8[] f46135e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4006z8 f46137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f46138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F8 f46139d;

    public K8() {
        a();
    }

    public static K8[] b() {
        if (f46135e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46135e == null) {
                        f46135e = new K8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46135e;
    }

    public final K8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f46136a = bArr;
        this.f46137b = null;
        this.f46138c = bArr;
        this.f46139d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f46136a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f46136a);
        }
        C4006z8 c4006z8 = this.f46137b;
        if (c4006z8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4006z8);
        }
        if (!Arrays.equals(this.f46138c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f46138c);
        }
        F8 f13 = this.f46139d;
        return f13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, f13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f46136a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46136a);
        }
        C4006z8 c4006z8 = this.f46137b;
        if (c4006z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4006z8);
        }
        if (!Arrays.equals(this.f46138c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f46138c);
        }
        F8 f13 = this.f46139d;
        if (f13 != null) {
            codedOutputByteBufferNano.writeMessage(4, f13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46136a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f46137b == null) {
                    this.f46137b = new C4006z8();
                }
                codedInputByteBufferNano.readMessage(this.f46137b);
            } else if (tag == 26) {
                this.f46138c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46139d == null) {
                    this.f46139d = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f46139d);
            }
        }
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K8().mergeFrom(codedInputByteBufferNano);
    }

    public static K8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K8) MessageNano.mergeFrom(new K8(), bArr);
    }
}
