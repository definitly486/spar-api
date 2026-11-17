package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3956x8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3956x8[] f48412b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3981y8 f48413a;

    public C3956x8() {
        a();
    }

    public static C3956x8[] b() {
        if (f48412b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48412b == null) {
                        f48412b = new C3956x8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48412b;
    }

    public final C3956x8 a() {
        this.f48413a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3981y8 c3981y8 = this.f48413a;
        return c3981y8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c3981y8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3981y8 c3981y8 = this.f48413a;
        if (c3981y8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3981y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3956x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f48413a == null) {
                    this.f48413a = new C3981y8();
                }
                codedInputByteBufferNano.readMessage(this.f48413a);
            }
        }
    }

    public static C3956x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3956x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3956x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3956x8) MessageNano.mergeFrom(new C3956x8(), bArr);
    }
}
