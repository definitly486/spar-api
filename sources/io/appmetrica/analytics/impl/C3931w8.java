package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3931w8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3931w8[] f48281c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f48282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A8 f48283b;

    public C3931w8() {
        a();
    }

    public static C3931w8[] b() {
        if (f48281c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48281c == null) {
                        f48281c = new C3931w8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48281c;
    }

    public final C3931w8 a() {
        this.f48282a = WireFormatNano.EMPTY_BYTES;
        this.f48283b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f48282a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f48282a);
        }
        A8 a13 = this.f48283b;
        return a13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, a13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f48282a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f48282a);
        }
        A8 a13 = this.f48283b;
        if (a13 != null) {
            codedOutputByteBufferNano.writeMessage(2, a13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3931w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48282a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f48283b == null) {
                    this.f48283b = new A8();
                }
                codedInputByteBufferNano.readMessage(this.f48283b);
            }
        }
    }

    public static C3931w8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3931w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3931w8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3931w8) MessageNano.mergeFrom(new C3931w8(), bArr);
    }
}
