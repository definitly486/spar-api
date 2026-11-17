package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class D9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile D9[] f45635e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45639d;

    public D9() {
        a();
    }

    public static D9[] b() {
        if (f45635e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45635e == null) {
                        f45635e = new D9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45635e;
    }

    public final D9 a() {
        this.f45636a = 0L;
        this.f45637b = 0;
        this.f45638c = 0L;
        this.f45639d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f45637b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f45636a) + super.computeSerializedSize();
        long j13 = this.f45638c;
        if (j13 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j13);
        }
        boolean z13 = this.f45639d;
        return z13 ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z13) : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f45636a);
        codedOutputByteBufferNano.writeSInt32(2, this.f45637b);
        long j13 = this.f45638c;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j13);
        }
        boolean z13 = this.f45639d;
        if (z13) {
            codedOutputByteBufferNano.writeBool(4, z13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f45636a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f45637b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f45638c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f45639d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static D9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D9().mergeFrom(codedInputByteBufferNano);
    }

    public static D9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D9) MessageNano.mergeFrom(new D9(), bArr);
    }
}
