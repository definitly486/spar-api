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
public final class Ui extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Ui[] f46626c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f46627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f46628b;

    public Ui() {
        a();
    }

    public static Ui[] b() {
        if (f46626c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46626c == null) {
                        f46626c = new Ui[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46626c;
    }

    public final Ui a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f46627a = bArr;
        this.f46628b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f46627a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f46627a);
        }
        return !Arrays.equals(this.f46628b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f46628b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f46627a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f46627a);
        }
        if (!Arrays.equals(this.f46628b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f46628b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ui mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46627a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46628b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Ui b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ui().mergeFrom(codedInputByteBufferNano);
    }

    public static Ui a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ui) MessageNano.mergeFrom(new Ui(), bArr);
    }
}
