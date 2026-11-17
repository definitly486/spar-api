package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class C9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C9[] f45566e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45570d;

    public C9() {
        a();
    }

    public static C9[] b() {
        if (f45566e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45566e == null) {
                        f45566e = new C9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45566e;
    }

    public final C9 a() {
        this.f45567a = 0;
        this.f45568b = 0;
        this.f45569c = "";
        this.f45570d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f45567a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i13);
        }
        int i14 = this.f45568b;
        if (i14 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i14);
        }
        if (!this.f45569c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f45569c);
        }
        boolean z13 = this.f45570d;
        return z13 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f45567a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i13);
        }
        int i14 = this.f45568b;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i14);
        }
        if (!this.f45569c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f45569c);
        }
        boolean z13 = this.f45570d;
        if (z13) {
            codedOutputByteBufferNano.writeBool(4, z13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f45567a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f45568b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f45569c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f45570d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9().mergeFrom(codedInputByteBufferNano);
    }

    public static C9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9) MessageNano.mergeFrom(new C9(), bArr);
    }
}
