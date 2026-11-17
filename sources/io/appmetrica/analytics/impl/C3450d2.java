package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3450d2 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C3450d2[] f47060d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3424c2[] f47061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3398b2 f47062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f47063c;

    public C3450d2() {
        a();
    }

    public static C3450d2[] b() {
        if (f47060d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47060d == null) {
                        f47060d = new C3450d2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47060d;
    }

    public final C3450d2 a() {
        this.f47061a = C3424c2.b();
        this.f47062b = null;
        this.f47063c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3424c2[] c3424c2Arr = this.f47061a;
        int i13 = 0;
        if (c3424c2Arr != null && c3424c2Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3424c2[] c3424c2Arr2 = this.f47061a;
                if (i14 >= c3424c2Arr2.length) {
                    break;
                }
                C3424c2 c3424c2 = c3424c2Arr2[i14];
                if (c3424c2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3424c2) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        C3398b2 c3398b2 = this.f47062b;
        if (c3398b2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3398b2);
        }
        String[] strArr = this.f47063c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i15 = 0;
        while (true) {
            String[] strArr2 = this.f47063c;
            if (i13 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i15;
            }
            String str = strArr2[i13];
            if (str != null) {
                i15++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i13++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3424c2[] c3424c2Arr = this.f47061a;
        int i13 = 0;
        if (c3424c2Arr != null && c3424c2Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3424c2[] c3424c2Arr2 = this.f47061a;
                if (i14 >= c3424c2Arr2.length) {
                    break;
                }
                C3424c2 c3424c2 = c3424c2Arr2[i14];
                if (c3424c2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3424c2);
                }
                i14++;
            }
        }
        C3398b2 c3398b2 = this.f47062b;
        if (c3398b2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3398b2);
        }
        String[] strArr = this.f47063c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f47063c;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3450d2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3424c2[] c3424c2Arr = this.f47061a;
                int length = c3424c2Arr == null ? 0 : c3424c2Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3424c2[] c3424c2Arr2 = new C3424c2[i13];
                if (length != 0) {
                    System.arraycopy(c3424c2Arr, 0, c3424c2Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3424c2 c3424c2 = new C3424c2();
                    c3424c2Arr2[length] = c3424c2;
                    codedInputByteBufferNano.readMessage(c3424c2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3424c2 c3424c3 = new C3424c2();
                c3424c2Arr2[length] = c3424c3;
                codedInputByteBufferNano.readMessage(c3424c3);
                this.f47061a = c3424c2Arr2;
            } else if (tag == 18) {
                if (this.f47062b == null) {
                    this.f47062b = new C3398b2();
                }
                codedInputByteBufferNano.readMessage(this.f47062b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f47063c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i14 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i14];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i14 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f47063c = strArr2;
            }
        }
    }

    public static C3450d2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3450d2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3450d2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3450d2) MessageNano.mergeFrom(new C3450d2(), bArr);
    }
}
