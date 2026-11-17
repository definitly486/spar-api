package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3854t6 extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48094l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48095m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C3854t6[] f48096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static byte[] f48097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f48098p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3954x6 f48099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3705n6 f48100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3904v6[] f48103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3829s6 f48106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f48107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f48108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C3755p6[] f48109k;

    public C3854t6() {
        if (!f48098p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f48098p) {
                        f48097o = InternalNano.bytesDefaultValue("JVM");
                        f48098p = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a();
    }

    public static C3854t6[] b() {
        if (f48096n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48096n == null) {
                        f48096n = new C3854t6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48096n;
    }

    public final C3854t6 a() {
        this.f48099a = null;
        this.f48100b = null;
        this.f48101c = "";
        this.f48102d = -1;
        this.f48103e = C3904v6.b();
        this.f48104f = "";
        this.f48105g = 0;
        this.f48106h = null;
        this.f48107i = (byte[]) f48097o.clone();
        this.f48108j = WireFormatNano.EMPTY_BYTES;
        this.f48109k = C3755p6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3954x6 c3954x6 = this.f48099a;
        if (c3954x6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3954x6);
        }
        C3705n6 c3705n6 = this.f48100b;
        if (c3705n6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3705n6);
        }
        if (!this.f48101c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f48101c);
        }
        int i13 = this.f48102d;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
        }
        C3904v6[] c3904v6Arr = this.f48103e;
        int i14 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48103e;
                if (i15 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i15];
                if (c3904v6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c3904v6) + iComputeSerializedSize;
                }
                i15++;
            }
        }
        if (!this.f48104f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f48104f);
        }
        int i16 = this.f48105g;
        if (i16 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i16);
        }
        C3829s6 c3829s6 = this.f48106h;
        if (c3829s6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c3829s6);
        }
        if (!Arrays.equals(this.f48107i, f48097o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f48107i);
        }
        if (!Arrays.equals(this.f48108j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f48108j);
        }
        C3755p6[] c3755p6Arr = this.f48109k;
        if (c3755p6Arr != null && c3755p6Arr.length > 0) {
            while (true) {
                C3755p6[] c3755p6Arr2 = this.f48109k;
                if (i14 >= c3755p6Arr2.length) {
                    break;
                }
                C3755p6 c3755p6 = c3755p6Arr2[i14];
                if (c3755p6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c3755p6) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3954x6 c3954x6 = this.f48099a;
        if (c3954x6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3954x6);
        }
        C3705n6 c3705n6 = this.f48100b;
        if (c3705n6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3705n6);
        }
        if (!this.f48101c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f48101c);
        }
        int i13 = this.f48102d;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i13);
        }
        C3904v6[] c3904v6Arr = this.f48103e;
        int i14 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48103e;
                if (i15 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i15];
                if (c3904v6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c3904v6);
                }
                i15++;
            }
        }
        if (!this.f48104f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f48104f);
        }
        int i16 = this.f48105g;
        if (i16 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i16);
        }
        C3829s6 c3829s6 = this.f48106h;
        if (c3829s6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c3829s6);
        }
        if (!Arrays.equals(this.f48107i, f48097o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f48107i);
        }
        if (!Arrays.equals(this.f48108j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f48108j);
        }
        C3755p6[] c3755p6Arr = this.f48109k;
        if (c3755p6Arr != null && c3755p6Arr.length > 0) {
            while (true) {
                C3755p6[] c3755p6Arr2 = this.f48109k;
                if (i14 >= c3755p6Arr2.length) {
                    break;
                }
                C3755p6 c3755p6 = c3755p6Arr2[i14];
                if (c3755p6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c3755p6);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3854t6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3854t6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3854t6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f48099a == null) {
                        this.f48099a = new C3954x6();
                    }
                    codedInputByteBufferNano.readMessage(this.f48099a);
                    break;
                case 18:
                    if (this.f48100b == null) {
                        this.f48100b = new C3705n6();
                    }
                    codedInputByteBufferNano.readMessage(this.f48100b);
                    break;
                case C4007z9.G /* 26 */:
                    this.f48101c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f48102d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3904v6[] c3904v6Arr = this.f48103e;
                    int length = c3904v6Arr == null ? 0 : c3904v6Arr.length;
                    int i13 = repeatedFieldArrayLength + length;
                    C3904v6[] c3904v6Arr2 = new C3904v6[i13];
                    if (length != 0) {
                        System.arraycopy(c3904v6Arr, 0, c3904v6Arr2, 0, length);
                    }
                    while (length < i13 - 1) {
                        C3904v6 c3904v6 = new C3904v6();
                        c3904v6Arr2[length] = c3904v6;
                        codedInputByteBufferNano.readMessage(c3904v6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3904v6 c3904v7 = new C3904v6();
                    c3904v6Arr2[length] = c3904v7;
                    codedInputByteBufferNano.readMessage(c3904v7);
                    this.f48103e = c3904v6Arr2;
                    break;
                case 50:
                    this.f48104f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 0 || int33 == 1) {
                        this.f48105g = int33;
                    }
                    break;
                case 66:
                    if (this.f48106h == null) {
                        this.f48106h = new C3829s6();
                    }
                    codedInputByteBufferNano.readMessage(this.f48106h);
                    break;
                case 74:
                    this.f48107i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f48108j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C3755p6[] c3755p6Arr = this.f48109k;
                    int length2 = c3755p6Arr == null ? 0 : c3755p6Arr.length;
                    int i14 = repeatedFieldArrayLength2 + length2;
                    C3755p6[] c3755p6Arr2 = new C3755p6[i14];
                    if (length2 != 0) {
                        System.arraycopy(c3755p6Arr, 0, c3755p6Arr2, 0, length2);
                    }
                    while (length2 < i14 - 1) {
                        C3755p6 c3755p6 = new C3755p6();
                        c3755p6Arr2[length2] = c3755p6;
                        codedInputByteBufferNano.readMessage(c3755p6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C3755p6 c3755p7 = new C3755p6();
                    c3755p6Arr2[length2] = c3755p7;
                    codedInputByteBufferNano.readMessage(c3755p7);
                    this.f48109k = c3755p6Arr2;
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

    public static C3854t6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3854t6) MessageNano.mergeFrom(new C3854t6(), bArr);
    }
}
