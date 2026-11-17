package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3457d9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3457d9[] f47094c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f47096b;

    public C3457d9() {
        a();
    }

    public static C3457d9[] b() {
        if (f47094c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47094c == null) {
                        f47094c = new C3457d9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47094c;
    }

    public final C3457d9 a() {
        this.f47095a = "";
        this.f47096b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f47095a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f47095a);
        }
        return !Arrays.equals(this.f47096b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f47096b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f47095a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f47095a);
        }
        if (!Arrays.equals(this.f47096b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f47096b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3457d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47095a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47096b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C3457d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3457d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3457d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3457d9) MessageNano.mergeFrom(new C3457d9(), bArr);
    }
}
