package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class A9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45452d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45453e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45454f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile A9[] f45455g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D9 f45456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45458c;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (f45455g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45455g == null) {
                        f45455g = new A9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45455g;
    }

    public final A9 a() {
        this.f45456a = null;
        this.f45457b = "";
        this.f45458c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        D9 d13 = this.f45456a;
        if (d13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, d13);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f45457b) + iComputeSerializedSize;
        int i13 = this.f45458c;
        return i13 != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i13) : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D9 d13 = this.f45456a;
        if (d13 != null) {
            codedOutputByteBufferNano.writeMessage(1, d13);
        }
        codedOutputByteBufferNano.writeString(2, this.f45457b);
        int i13 = this.f45458c;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f45456a == null) {
                    this.f45456a = new D9();
                }
                codedInputByteBufferNano.readMessage(this.f45456a);
            } else if (tag == 18) {
                this.f45457b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f45458c = int32;
                }
            }
        }
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
