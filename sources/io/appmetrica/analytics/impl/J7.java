package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class J7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile J7[] f46075k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f46077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f46078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f46084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f46085j;

    public J7() {
        a();
    }

    public static J7[] b() {
        if (f46075k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46075k == null) {
                        f46075k = new J7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46075k;
    }

    public final J7 a() {
        this.f46076a = -1;
        this.f46077b = -1.0d;
        this.f46078c = -1.0d;
        this.f46079d = -1;
        this.f46080e = -1;
        this.f46081f = -1;
        this.f46082g = -1;
        this.f46083h = -1L;
        this.f46084i = "";
        this.f46085j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f46076a;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        if (Double.doubleToLongBits(this.f46077b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f46077b);
        }
        if (Double.doubleToLongBits(this.f46078c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f46078c);
        }
        int i14 = this.f46079d;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i14);
        }
        int i15 = this.f46080e;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i15);
        }
        int i16 = this.f46081f;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i16);
        }
        int i17 = this.f46082g;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i17);
        }
        long j13 = this.f46083h;
        if (j13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j13);
        }
        if (!this.f46084i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f46084i);
        }
        return !this.f46085j.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f46085j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f46076a;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        if (Double.doubleToLongBits(this.f46077b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f46077b);
        }
        if (Double.doubleToLongBits(this.f46078c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f46078c);
        }
        int i14 = this.f46079d;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i14);
        }
        int i15 = this.f46080e;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i15);
        }
        int i16 = this.f46081f;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i16);
        }
        int i17 = this.f46082g;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i17);
        }
        long j13 = this.f46083h;
        if (j13 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j13);
        }
        if (!this.f46084i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f46084i);
        }
        if (!this.f46085j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f46085j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static J7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f46076a = int32;
                    }
                    break;
                case 17:
                    this.f46077b = codedInputByteBufferNano.readDouble();
                    break;
                case C4007z9.F /* 25 */:
                    this.f46078c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f46079d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f46080e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f46081f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f46082g = codedInputByteBufferNano.readInt32();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f46083h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f46084i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f46085j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public static J7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (J7) MessageNano.mergeFrom(new J7(), bArr);
    }
}
