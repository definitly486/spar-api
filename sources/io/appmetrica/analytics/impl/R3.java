package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class R3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile R3[] f46436c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46438b;

    public R3() {
        a();
    }

    public static R3[] b() {
        if (f46436c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46436c == null) {
                        f46436c = new R3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46436c;
    }

    public final R3 a() {
        this.f46437a = "";
        this.f46438b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f46437a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f46437a);
        }
        return !this.f46438b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f46438b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f46437a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f46437a);
        }
        if (!this.f46438b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f46438b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46437a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46438b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static R3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R3().mergeFrom(codedInputByteBufferNano);
    }

    public static R3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R3) MessageNano.mergeFrom(new R3(), bArr);
    }
}
