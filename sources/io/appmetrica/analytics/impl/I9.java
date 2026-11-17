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
public final class I9 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile I9[] f46002b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46003a;

    public I9() {
        a();
    }

    public static I9[] b() {
        if (f46002b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46002b == null) {
                        f46002b = new I9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46002b;
    }

    public final I9 a() {
        this.f46003a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f46003a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f46003a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f46003a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46003a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f46003a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static I9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (I9) MessageNano.mergeFrom(new I9(), bArr);
    }

    public static I9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I9().mergeFrom(codedInputByteBufferNano);
    }
}
