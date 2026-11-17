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
public final class Vi extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Vi[] f46681e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Wi f46683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f46685d;

    public Vi() {
        a();
    }

    public static Vi[] b() {
        if (f46681e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46681e == null) {
                        f46681e = new Vi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46681e;
    }

    public final Vi a() {
        this.f46682a = 0L;
        this.f46683b = null;
        this.f46684c = 0;
        this.f46685d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f46682a;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j13);
        }
        Wi wi2 = this.f46683b;
        if (wi2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wi2);
        }
        int i13 = this.f46684c;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i13);
        }
        return !Arrays.equals(this.f46685d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f46685d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f46682a;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        Wi wi2 = this.f46683b;
        if (wi2 != null) {
            codedOutputByteBufferNano.writeMessage(2, wi2);
        }
        int i13 = this.f46684c;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i13);
        }
        if (!Arrays.equals(this.f46685d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f46685d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f46682a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f46683b == null) {
                    this.f46683b = new Wi();
                }
                codedInputByteBufferNano.readMessage(this.f46683b);
            } else if (tag == 24) {
                this.f46684c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46685d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Vi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vi().mergeFrom(codedInputByteBufferNano);
    }

    public static Vi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vi) MessageNano.mergeFrom(new Vi(), bArr);
    }
}
