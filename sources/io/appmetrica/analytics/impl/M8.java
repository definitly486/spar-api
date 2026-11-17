package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class M8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile M8[] f46229c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H8 f46230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J8 f46231b;

    public M8() {
        a();
    }

    public static M8[] b() {
        if (f46229c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46229c == null) {
                        f46229c = new M8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46229c;
    }

    public final M8 a() {
        this.f46230a = null;
        this.f46231b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        H8 h13 = this.f46230a;
        if (h13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h13);
        }
        J8 j13 = this.f46231b;
        return j13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, j13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        H8 h13 = this.f46230a;
        if (h13 != null) {
            codedOutputByteBufferNano.writeMessage(1, h13);
        }
        J8 j13 = this.f46231b;
        if (j13 != null) {
            codedOutputByteBufferNano.writeMessage(2, j13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f46230a == null) {
                    this.f46230a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f46230a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46231b == null) {
                    this.f46231b = new J8();
                }
                codedInputByteBufferNano.readMessage(this.f46231b);
            }
        }
    }

    public static M8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M8().mergeFrom(codedInputByteBufferNano);
    }

    public static M8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M8) MessageNano.mergeFrom(new M8(), bArr);
    }
}
