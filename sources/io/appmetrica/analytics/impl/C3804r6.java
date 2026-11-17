package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3804r6 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47962k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47963l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C3804r6[] f47964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte[] f47965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f47966o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3954x6 f47967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3705n6 f47968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3904v6[] f47971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3780q6 f47973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f47974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f47975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3755p6[] f47976j;

    public C3804r6() {
        if (!f47966o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f47966o) {
                        f47965n = InternalNano.bytesDefaultValue("JVM");
                        f47966o = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a();
    }

    public static C3804r6[] b() {
        if (f47964m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47964m == null) {
                        f47964m = new C3804r6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47964m;
    }

    public final C3804r6 a() {
        this.f47967a = null;
        this.f47968b = null;
        this.f47969c = "";
        this.f47970d = -1;
        this.f47971e = C3904v6.b();
        this.f47972f = 0;
        this.f47973g = null;
        this.f47974h = (byte[]) f47965n.clone();
        this.f47975i = WireFormatNano.EMPTY_BYTES;
        this.f47976j = C3755p6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3954x6 c3954x6 = this.f47967a;
        if (c3954x6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3954x6);
        }
        C3705n6 c3705n6 = this.f47968b;
        if (c3705n6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3705n6);
        }
        if (!this.f47969c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f47969c);
        }
        int i13 = this.f47970d;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
        }
        C3904v6[] c3904v6Arr = this.f47971e;
        int i14 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f47971e;
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
        int i16 = this.f47972f;
        if (i16 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i16);
        }
        C3780q6 c3780q6 = this.f47973g;
        if (c3780q6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c3780q6);
        }
        if (!Arrays.equals(this.f47974h, f47965n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f47974h);
        }
        if (!Arrays.equals(this.f47975i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f47975i);
        }
        C3755p6[] c3755p6Arr = this.f47976j;
        if (c3755p6Arr != null && c3755p6Arr.length > 0) {
            while (true) {
                C3755p6[] c3755p6Arr2 = this.f47976j;
                if (i14 >= c3755p6Arr2.length) {
                    break;
                }
                C3755p6 c3755p6 = c3755p6Arr2[i14];
                if (c3755p6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c3755p6) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3954x6 c3954x6 = this.f47967a;
        if (c3954x6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3954x6);
        }
        C3705n6 c3705n6 = this.f47968b;
        if (c3705n6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3705n6);
        }
        if (!this.f47969c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f47969c);
        }
        int i13 = this.f47970d;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i13);
        }
        C3904v6[] c3904v6Arr = this.f47971e;
        int i14 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f47971e;
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
        int i16 = this.f47972f;
        if (i16 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i16);
        }
        C3780q6 c3780q6 = this.f47973g;
        if (c3780q6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c3780q6);
        }
        if (!Arrays.equals(this.f47974h, f47965n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f47974h);
        }
        if (!Arrays.equals(this.f47975i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f47975i);
        }
        C3755p6[] c3755p6Arr = this.f47976j;
        if (c3755p6Arr != null && c3755p6Arr.length > 0) {
            while (true) {
                C3755p6[] c3755p6Arr2 = this.f47976j;
                if (i14 >= c3755p6Arr2.length) {
                    break;
                }
                C3755p6 c3755p6 = c3755p6Arr2[i14];
                if (c3755p6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c3755p6);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3804r6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3804r6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3804r6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f47967a == null) {
                        this.f47967a = new C3954x6();
                    }
                    codedInputByteBufferNano.readMessage(this.f47967a);
                    break;
                case 18:
                    if (this.f47968b == null) {
                        this.f47968b = new C3705n6();
                    }
                    codedInputByteBufferNano.readMessage(this.f47968b);
                    break;
                case C4007z9.G /* 26 */:
                    this.f47969c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f47970d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3904v6[] c3904v6Arr = this.f47971e;
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
                    this.f47971e = c3904v6Arr2;
                    break;
                case 48:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 0 || int33 == 1) {
                        this.f47972f = int33;
                    }
                    break;
                case 58:
                    if (this.f47973g == null) {
                        this.f47973g = new C3780q6();
                    }
                    codedInputByteBufferNano.readMessage(this.f47973g);
                    break;
                case 66:
                    this.f47974h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f47975i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C3755p6[] c3755p6Arr = this.f47976j;
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
                    this.f47976j = c3755p6Arr2;
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

    public static C3804r6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3804r6) MessageNano.mergeFrom(new C3804r6(), bArr);
    }
}
