package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Q3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Q3[] f46408c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S3 f46409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46410b;

    public Q3() {
        a();
    }

    public static Q3[] b() {
        if (f46408c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46408c == null) {
                        f46408c = new Q3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46408c;
    }

    public final Q3 a() {
        this.f46409a = null;
        this.f46410b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S3 s13 = this.f46409a;
        if (s13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s13);
        }
        int i13 = this.f46410b;
        return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S3 s13 = this.f46409a;
        if (s13 != null) {
            codedOutputByteBufferNano.writeMessage(1, s13);
        }
        int i13 = this.f46410b;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f46409a == null) {
                    this.f46409a = new S3();
                }
                codedInputByteBufferNano.readMessage(this.f46409a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f46410b = int32;
                }
            }
        }
    }

    public static Q3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q3().mergeFrom(codedInputByteBufferNano);
    }

    public static Q3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q3) MessageNano.mergeFrom(new Q3(), bArr);
    }
}
