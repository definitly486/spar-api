package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3780q6 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3780q6[] f47911c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3879u6 f47913b;

    public C3780q6() {
        a();
    }

    public static C3780q6[] b() {
        if (f47911c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47911c == null) {
                        f47911c = new C3780q6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47911c;
    }

    public final C3780q6 a() {
        this.f47912a = WireFormatNano.EMPTY_BYTES;
        this.f47913b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f47912a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f47912a);
        }
        C3879u6 c3879u6 = this.f47913b;
        return c3879u6 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c3879u6) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f47912a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f47912a);
        }
        C3879u6 c3879u6 = this.f47913b;
        if (c3879u6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3879u6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3780q6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47912a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f47913b == null) {
                    this.f47913b = new C3879u6();
                }
                codedInputByteBufferNano.readMessage(this.f47913b);
            }
        }
    }

    public static C3780q6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3780q6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3780q6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3780q6) MessageNano.mergeFrom(new C3780q6(), bArr);
    }
}
