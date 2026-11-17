package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3982y9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3982y9[] f48514c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48516b;

    public C3982y9() {
        a();
    }

    public static C3982y9[] b() {
        if (f48514c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48514c == null) {
                        f48514c = new C3982y9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48514c;
    }

    public final C3982y9 a() {
        this.f48515a = 2;
        this.f48516b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f48515a;
        if (i13 != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i13);
        }
        return !this.f48516b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f48516b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f48515a;
        if (i13 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i13);
        }
        if (!this.f48516b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48516b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3982y9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f48515a = int32;
                        break;
                }
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48516b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3982y9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3982y9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3982y9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3982y9) MessageNano.mergeFrom(new C3982y9(), bArr);
    }
}
