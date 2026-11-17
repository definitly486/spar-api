package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730o6 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C3730o6[] f47814d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3705n6 f47815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47817c;

    public C3730o6() {
        a();
    }

    public static C3730o6[] b() {
        if (f47814d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47814d == null) {
                        f47814d = new C3730o6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47814d;
    }

    public final C3730o6 a() {
        this.f47815a = null;
        this.f47816b = "";
        this.f47817c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3705n6 c3705n6 = this.f47815a;
        if (c3705n6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3705n6);
        }
        if (!this.f47816b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f47816b);
        }
        int i13 = this.f47817c;
        return i13 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3705n6 c3705n6 = this.f47815a;
        if (c3705n6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3705n6);
        }
        if (!this.f47816b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f47816b);
        }
        int i13 = this.f47817c;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3730o6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f47815a == null) {
                    this.f47815a = new C3705n6();
                }
                codedInputByteBufferNano.readMessage(this.f47815a);
            } else if (tag == 18) {
                this.f47816b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f47817c = int32;
                }
            }
        }
    }

    public static C3730o6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3730o6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3730o6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3730o6) MessageNano.mergeFrom(new C3730o6(), bArr);
    }
}
