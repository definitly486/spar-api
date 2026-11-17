package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile f[] f48909b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f48910a;

    public f() {
        a();
    }

    public static f[] b() {
        if (f48909b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48909b == null) {
                        f48909b = new f[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48909b;
    }

    public final f a() {
        this.f48910a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f48910a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i13 = 0;
        int iComputeBytesSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            byte[][] bArr2 = this.f48910a;
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
        byte[][] bArr = this.f48910a;
        if (bArr != null && bArr.length > 0) {
            int i13 = 0;
            while (true) {
                byte[][] bArr2 = this.f48910a;
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
    public final f mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                byte[][] bArr = this.f48910a;
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
                this.f48910a = bArr2;
            }
        }
    }

    public static f b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new f().mergeFrom(codedInputByteBufferNano);
    }

    public static f a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (f) MessageNano.mergeFrom(new f(), bArr);
    }
}
