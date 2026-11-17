package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class D8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile D8[] f45633b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B8 f45634a;

    public D8() {
        a();
    }

    public static D8[] b() {
        if (f45633b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45633b == null) {
                        f45633b = new D8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45633b;
    }

    public final D8 a() {
        this.f45634a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        B8 b13 = this.f45634a;
        return b13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, b13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B8 b13 = this.f45634a;
        if (b13 != null) {
            codedOutputByteBufferNano.writeMessage(1, b13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f45634a == null) {
                    this.f45634a = new B8();
                }
                codedInputByteBufferNano.readMessage(this.f45634a);
            }
        }
    }

    public static D8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D8().mergeFrom(codedInputByteBufferNano);
    }

    public static D8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D8) MessageNano.mergeFrom(new D8(), bArr);
    }
}
