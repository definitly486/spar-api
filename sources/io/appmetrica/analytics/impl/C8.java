package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class C8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C8[] f45563c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3981y8 f45565b;

    public C8() {
        a();
    }

    public static C8[] b() {
        if (f45563c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45563c == null) {
                        f45563c = new C8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45563c;
    }

    public final C8 a() {
        this.f45564a = 0;
        this.f45565b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f45564a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i13);
        }
        C3981y8 c3981y8 = this.f45565b;
        return c3981y8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c3981y8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f45564a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i13);
        }
        C3981y8 c3981y8 = this.f45565b;
        if (c3981y8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3981y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f45564a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f45565b == null) {
                    this.f45565b = new C3981y8();
                }
                codedInputByteBufferNano.readMessage(this.f45565b);
            }
        }
    }

    public static C8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8().mergeFrom(codedInputByteBufferNano);
    }

    public static C8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8) MessageNano.mergeFrom(new C8(), bArr);
    }
}
