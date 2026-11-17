package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class I7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile I7[] f45981s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J7 f45986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f45992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f45999r;

    public I7() {
        a();
    }

    public static I7[] b() {
        if (f45981s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45981s == null) {
                        f45981s = new I7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45981s;
    }

    public final I7 a() {
        this.f45982a = -1;
        this.f45983b = "";
        this.f45984c = "";
        this.f45985d = -1L;
        this.f45986e = null;
        this.f45987f = "";
        this.f45988g = "";
        this.f45989h = -1L;
        this.f45990i = -1;
        this.f45991j = -1;
        this.f45992k = "";
        this.f45993l = -1;
        this.f45994m = "";
        this.f45995n = -1;
        this.f45996o = -1;
        this.f45997p = -1;
        this.f45998q = -1;
        this.f45999r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f45982a;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        if (!this.f45983b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f45983b);
        }
        if (!this.f45984c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f45984c);
        }
        long j13 = this.f45985d;
        if (j13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j13);
        }
        J7 j14 = this.f45986e;
        if (j14 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, j14);
        }
        if (!this.f45987f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f45987f);
        }
        if (!this.f45988g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f45988g);
        }
        long j15 = this.f45989h;
        if (j15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j15);
        }
        int i14 = this.f45990i;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i14);
        }
        int i15 = this.f45991j;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i15);
        }
        if (!this.f45992k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f45992k);
        }
        int i16 = this.f45993l;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i16);
        }
        if (!this.f45994m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f45994m);
        }
        int i17 = this.f45995n;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i17);
        }
        int i18 = this.f45996o;
        if (i18 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i18);
        }
        int i19 = this.f45997p;
        if (i19 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i19);
        }
        int i23 = this.f45998q;
        if (i23 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i23);
        }
        return !Arrays.equals(this.f45999r, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f45999r) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f45982a;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        if (!this.f45983b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f45983b);
        }
        if (!this.f45984c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f45984c);
        }
        long j13 = this.f45985d;
        if (j13 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j13);
        }
        J7 j14 = this.f45986e;
        if (j14 != null) {
            codedOutputByteBufferNano.writeMessage(5, j14);
        }
        if (!this.f45987f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f45987f);
        }
        if (!this.f45988g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f45988g);
        }
        long j15 = this.f45989h;
        if (j15 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j15);
        }
        int i14 = this.f45990i;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i14);
        }
        int i15 = this.f45991j;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i15);
        }
        if (!this.f45992k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f45992k);
        }
        int i16 = this.f45993l;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i16);
        }
        if (!this.f45994m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f45994m);
        }
        int i17 = this.f45995n;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i17);
        }
        int i18 = this.f45996o;
        if (i18 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i18);
        }
        int i19 = this.f45997p;
        if (i19 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i19);
        }
        int i23 = this.f45998q;
        if (i23 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i23);
        }
        if (!Arrays.equals(this.f45999r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f45999r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static I7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f45982a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f45983b = codedInputByteBufferNano.readString();
                    break;
                case C4007z9.G /* 26 */:
                    this.f45984c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f45985d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f45986e == null) {
                        this.f45986e = new J7();
                    }
                    codedInputByteBufferNano.readMessage(this.f45986e);
                    break;
                case 50:
                    this.f45987f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f45988g = codedInputByteBufferNano.readString();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f45989h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f45990i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f45991j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f45992k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f45993l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f45994m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f45995n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f45996o = codedInputByteBufferNano.readInt32();
                    break;
                case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f45997p = int32;
                    }
                    break;
                case 136:
                    this.f45998q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f45999r = codedInputByteBufferNano.readBytes();
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

    public static I7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (I7) MessageNano.mergeFrom(new I7(), bArr);
    }
}
