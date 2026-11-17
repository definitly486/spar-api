package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Bg extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45532e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45533f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45534g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Bg[] f45535h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45539d;

    public Bg() {
        a();
    }

    public static Bg[] b() {
        if (f45535h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45535h == null) {
                        f45535h = new Bg[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45535h;
    }

    public final Bg a() {
        this.f45536a = "";
        this.f45537b = 0L;
        this.f45538c = 0L;
        this.f45539d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f45536a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f45536a);
        }
        long j13 = this.f45537b;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j13);
        }
        long j14 = this.f45538c;
        if (j14 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j14);
        }
        int i13 = this.f45539d;
        return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f45536a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f45536a);
        }
        long j13 = this.f45537b;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j13);
        }
        long j14 = this.f45538c;
        if (j14 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j14);
        }
        int i13 = this.f45539d;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f45536a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f45537b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f45538c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f45539d = int32;
                }
            }
        }
    }

    public static Bg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bg().mergeFrom(codedInputByteBufferNano);
    }

    public static Bg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Bg) MessageNano.mergeFrom(new Bg(), bArr);
    }
}
