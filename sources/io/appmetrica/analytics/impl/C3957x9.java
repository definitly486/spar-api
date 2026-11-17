package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3957x9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3957x9[] f48414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f48415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f48416b;

    public C3957x9() {
        a();
    }

    public static C3957x9[] b() {
        if (f48414c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48414c == null) {
                        f48414c = new C3957x9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48414c;
    }

    public final C3957x9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f48415a = bArr;
        this.f48416b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f48415a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f48415a);
        }
        return !Arrays.equals(this.f48416b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f48416b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f48415a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f48415a);
        }
        if (!Arrays.equals(this.f48416b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f48416b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3957x9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48415a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48416b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C3957x9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3957x9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3957x9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3957x9) MessageNano.mergeFrom(new C3957x9(), bArr);
    }
}
