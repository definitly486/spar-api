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
public final class I8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile I8[] f46000b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46001a;

    public I8() {
        a();
    }

    public static I8[] b() {
        if (f46000b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46000b == null) {
                        f46000b = new I8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46000b;
    }

    public final I8 a() {
        this.f46001a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f46001a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f46001a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f46001a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46001a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f46001a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static I8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (I8) MessageNano.mergeFrom(new I8(), bArr);
    }

    public static I8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I8().mergeFrom(codedInputByteBufferNano);
    }
}
