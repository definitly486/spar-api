package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class L8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile L8[] f46174c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H8 f46175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K8 f46176b;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (f46174c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46174c == null) {
                        f46174c = new L8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46174c;
    }

    public final L8 a() {
        this.f46175a = null;
        this.f46176b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        H8 h13 = this.f46175a;
        if (h13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h13);
        }
        K8 k13 = this.f46176b;
        return k13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, k13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        H8 h13 = this.f46175a;
        if (h13 != null) {
            codedOutputByteBufferNano.writeMessage(1, h13);
        }
        K8 k13 = this.f46176b;
        if (k13 != null) {
            codedOutputByteBufferNano.writeMessage(2, k13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f46175a == null) {
                    this.f46175a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f46175a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46176b == null) {
                    this.f46176b = new K8();
                }
                codedInputByteBufferNano.readMessage(this.f46176b);
            }
        }
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    public static L8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
