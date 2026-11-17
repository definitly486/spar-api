package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4006z8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4006z8[] f48569b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f48570a;

    public C4006z8() {
        a();
    }

    public static C4006z8[] b() {
        if (f48569b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48569b == null) {
                        f48569b = new C4006z8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48569b;
    }

    public final C4006z8 a() {
        this.f48570a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f48570a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i13 = 0;
        int iComputeBytesSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            byte[][] bArr2 = this.f48570a;
            if (i13 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i14;
            }
            byte[] bArr3 = bArr2[i13];
            if (bArr3 != null) {
                i14++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i13++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f48570a;
        if (bArr != null && bArr.length > 0) {
            int i13 = 0;
            while (true) {
                byte[][] bArr2 = this.f48570a;
                if (i13 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i13];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4006z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f48570a;
                int length = bArr == null ? 0 : bArr.length;
                int i13 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i13][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i13 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f48570a = bArr2;
            }
        }
    }

    public static C4006z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4006z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4006z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4006z8) MessageNano.mergeFrom(new C4006z8(), bArr);
    }
}
