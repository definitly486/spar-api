package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class S3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile S3[] f46479b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R3[] f46480a;

    public S3() {
        a();
    }

    public static S3[] b() {
        if (f46479b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46479b == null) {
                        f46479b = new S3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46479b;
    }

    public final S3 a() {
        this.f46480a = R3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        R3[] r3Arr = this.f46480a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i13 = 0;
            while (true) {
                R3[] r3Arr2 = this.f46480a;
                if (i13 >= r3Arr2.length) {
                    break;
                }
                R3 r13 = r3Arr2[i13];
                if (r13 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, r13) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        R3[] r3Arr = this.f46480a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i13 = 0;
            while (true) {
                R3[] r3Arr2 = this.f46480a;
                if (i13 >= r3Arr2.length) {
                    break;
                }
                R3 r13 = r3Arr2[i13];
                if (r13 != null) {
                    codedOutputByteBufferNano.writeMessage(1, r13);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                R3[] r3Arr = this.f46480a;
                int length = r3Arr == null ? 0 : r3Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                R3[] r3Arr2 = new R3[i13];
                if (length != 0) {
                    System.arraycopy(r3Arr, 0, r3Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    R3 r13 = new R3();
                    r3Arr2[length] = r13;
                    codedInputByteBufferNano.readMessage(r13);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                R3 r14 = new R3();
                r3Arr2[length] = r14;
                codedInputByteBufferNano.readMessage(r14);
                this.f46480a = r3Arr2;
            }
        }
    }

    public static S3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S3().mergeFrom(codedInputByteBufferNano);
    }

    public static S3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S3) MessageNano.mergeFrom(new S3(), bArr);
    }
}
