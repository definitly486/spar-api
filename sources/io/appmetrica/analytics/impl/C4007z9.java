package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4007z9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C4007z9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48571t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48572u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48573v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f48574w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f48575x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f48576y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f48577z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f48582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3882u9 f48583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3982y9 f48584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f48589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f48594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f48595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C3957x9[] f48596s;

    public C4007z9() {
        a();
    }

    public static C4007z9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (T == null) {
                        T = new C4007z9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return T;
    }

    public final C4007z9 a() {
        this.f48578a = 0L;
        this.f48579b = 0L;
        this.f48580c = 0;
        this.f48581d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f48582e = bArr;
        this.f48583f = null;
        this.f48584g = null;
        this.f48585h = "";
        this.f48586i = 0;
        this.f48587j = 0;
        this.f48588k = -1;
        this.f48589l = bArr;
        this.f48590m = -1;
        this.f48591n = 0L;
        this.f48592o = 0L;
        this.f48593p = 0;
        this.f48594q = false;
        this.f48595r = 1L;
        this.f48596s = C3957x9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f48580c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f48579b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f48578a) + super.computeSerializedSize();
        if (!this.f48581d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f48581d);
        }
        byte[] bArr = this.f48582e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f48582e);
        }
        C3882u9 c3882u9 = this.f48583f;
        if (c3882u9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c3882u9);
        }
        C3982y9 c3982y9 = this.f48584g;
        if (c3982y9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c3982y9);
        }
        if (!this.f48585h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f48585h);
        }
        int i13 = this.f48586i;
        if (i13 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i13);
        }
        int i14 = this.f48587j;
        if (i14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i14);
        }
        int i15 = this.f48588k;
        if (i15 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i15);
        }
        if (!Arrays.equals(this.f48589l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f48589l);
        }
        int i16 = this.f48590m;
        if (i16 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i16);
        }
        long j13 = this.f48591n;
        if (j13 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j13);
        }
        long j14 = this.f48592o;
        if (j14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j14);
        }
        int i17 = this.f48593p;
        if (i17 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i17);
        }
        boolean z13 = this.f48594q;
        if (z13) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z13);
        }
        long j15 = this.f48595r;
        if (j15 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j15);
        }
        C3957x9[] c3957x9Arr = this.f48596s;
        if (c3957x9Arr != null && c3957x9Arr.length > 0) {
            int i18 = 0;
            while (true) {
                C3957x9[] c3957x9Arr2 = this.f48596s;
                if (i18 >= c3957x9Arr2.length) {
                    break;
                }
                C3957x9 c3957x9 = c3957x9Arr2[i18];
                if (c3957x9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c3957x9) + iComputeUInt32Size;
                }
                i18++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f48578a);
        codedOutputByteBufferNano.writeUInt64(2, this.f48579b);
        codedOutputByteBufferNano.writeUInt32(3, this.f48580c);
        if (!this.f48581d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48581d);
        }
        byte[] bArr = this.f48582e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f48582e);
        }
        C3882u9 c3882u9 = this.f48583f;
        if (c3882u9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c3882u9);
        }
        C3982y9 c3982y9 = this.f48584g;
        if (c3982y9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c3982y9);
        }
        if (!this.f48585h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f48585h);
        }
        int i13 = this.f48586i;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i13);
        }
        int i14 = this.f48587j;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i14);
        }
        int i15 = this.f48588k;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i15);
        }
        if (!Arrays.equals(this.f48589l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f48589l);
        }
        int i16 = this.f48590m;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i16);
        }
        long j13 = this.f48591n;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j13);
        }
        long j14 = this.f48592o;
        if (j14 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j14);
        }
        int i17 = this.f48593p;
        if (i17 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i17);
        }
        boolean z13 = this.f48594q;
        if (z13) {
            codedOutputByteBufferNano.writeBool(23, z13);
        }
        long j15 = this.f48595r;
        if (j15 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j15);
        }
        C3957x9[] c3957x9Arr = this.f48596s;
        if (c3957x9Arr != null && c3957x9Arr.length > 0) {
            int i18 = 0;
            while (true) {
                C3957x9[] c3957x9Arr2 = this.f48596s;
                if (i18 >= c3957x9Arr2.length) {
                    break;
                }
                C3957x9 c3957x9 = c3957x9Arr2[i18];
                if (c3957x9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c3957x9);
                }
                i18++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4007z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4007z9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4007z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f48578a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f48579b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f48580c = codedInputByteBufferNano.readUInt32();
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.f48581d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f48582e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f48583f == null) {
                        this.f48583f = new C3882u9();
                    }
                    codedInputByteBufferNano.readMessage(this.f48583f);
                    break;
                case 58:
                    if (this.f48584g == null) {
                        this.f48584g = new C3982y9();
                    }
                    codedInputByteBufferNano.readMessage(this.f48584g);
                    break;
                case 66:
                    this.f48585h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f48586i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f48587j = int32;
                    }
                    break;
                case 104:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == -1 || int33 == 0 || int33 == 1) {
                        this.f48588k = int33;
                    }
                    break;
                case 114:
                    this.f48589l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int34 = codedInputByteBufferNano.readInt32();
                    if (int34 == -1 || int34 == 0 || int34 == 1) {
                        this.f48590m = int34;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                    this.f48591n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f48592o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int35 = codedInputByteBufferNano.readInt32();
                    if (int35 == 0 || int35 == 1 || int35 == 2) {
                        this.f48593p = int35;
                    }
                    break;
                case 184:
                    this.f48594q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f48595r = codedInputByteBufferNano.readUInt64();
                    break;
                case OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION /* 202 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION);
                    C3957x9[] c3957x9Arr = this.f48596s;
                    int length = c3957x9Arr == null ? 0 : c3957x9Arr.length;
                    int i13 = repeatedFieldArrayLength + length;
                    C3957x9[] c3957x9Arr2 = new C3957x9[i13];
                    if (length != 0) {
                        System.arraycopy(c3957x9Arr, 0, c3957x9Arr2, 0, length);
                    }
                    while (length < i13 - 1) {
                        C3957x9 c3957x9 = new C3957x9();
                        c3957x9Arr2[length] = c3957x9;
                        codedInputByteBufferNano.readMessage(c3957x9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3957x9 c3957x10 = new C3957x9();
                    c3957x9Arr2[length] = c3957x10;
                    codedInputByteBufferNano.readMessage(c3957x10);
                    this.f48596s = c3957x9Arr2;
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

    public static C4007z9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4007z9) MessageNano.mergeFrom(new C4007z9(), bArr);
    }
}
