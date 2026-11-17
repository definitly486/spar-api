package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3590ig extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47444e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47445f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47446g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C3590ig[] f47447h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47451d;

    public C3590ig() {
        a();
    }

    public static C3590ig[] b() {
        if (f47447h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47447h == null) {
                        f47447h = new C3590ig[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47447h;
    }

    public final C3590ig a() {
        this.f47448a = WireFormatNano.EMPTY_BYTES;
        this.f47449b = 0L;
        this.f47450c = 0L;
        this.f47451d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f47448a) + super.computeSerializedSize();
        long j13 = this.f47449b;
        if (j13 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j13);
        }
        long j14 = this.f47450c;
        if (j14 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j14);
        }
        int i13 = this.f47451d;
        return i13 != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i13) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f47448a);
        long j13 = this.f47449b;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j13);
        }
        long j14 = this.f47450c;
        if (j14 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j14);
        }
        int i13 = this.f47451d;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3590ig mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47448a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f47449b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f47450c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f47451d = int32;
                }
            }
        }
    }

    public static C3590ig b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3590ig().mergeFrom(codedInputByteBufferNano);
    }

    public static C3590ig a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3590ig) MessageNano.mergeFrom(new C3590ig(), bArr);
    }
}
