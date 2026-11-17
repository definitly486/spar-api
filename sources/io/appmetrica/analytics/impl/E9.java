package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class E9 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45702f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45703g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45704h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile E9[] f45705i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B9[] f45706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3932w9 f45707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3857t9[] f45708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C9[] f45709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f45710e;

    public E9() {
        a();
    }

    public static E9[] b() {
        if (f45705i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45705i == null) {
                        f45705i = new E9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45705i;
    }

    public final E9 a() {
        this.f45706a = B9.b();
        this.f45707b = null;
        this.f45708c = C3857t9.b();
        this.f45709d = C9.b();
        this.f45710e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        B9[] b9Arr = this.f45706a;
        int i13 = 0;
        if (b9Arr != null && b9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                B9[] b9Arr2 = this.f45706a;
                if (i14 >= b9Arr2.length) {
                    break;
                }
                B9 b13 = b9Arr2[i14];
                if (b13 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, b13) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        C3932w9 c3932w9 = this.f45707b;
        if (c3932w9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c3932w9);
        }
        C3857t9[] c3857t9Arr = this.f45708c;
        if (c3857t9Arr != null && c3857t9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3857t9[] c3857t9Arr2 = this.f45708c;
                if (i15 >= c3857t9Arr2.length) {
                    break;
                }
                C3857t9 c3857t9 = c3857t9Arr2[i15];
                if (c3857t9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c3857t9) + iComputeSerializedSize;
                }
                i15++;
            }
        }
        C9[] c9Arr = this.f45709d;
        if (c9Arr != null && c9Arr.length > 0) {
            int i16 = 0;
            while (true) {
                C9[] c9Arr2 = this.f45709d;
                if (i16 >= c9Arr2.length) {
                    break;
                }
                C9 c13 = c9Arr2[i16];
                if (c13 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c13) + iComputeSerializedSize;
                }
                i16++;
            }
        }
        String[] strArr = this.f45710e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i17 = 0;
        while (true) {
            String[] strArr2 = this.f45710e;
            if (i13 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i17;
            }
            String str = strArr2[i13];
            if (str != null) {
                i17++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i13++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B9[] b9Arr = this.f45706a;
        int i13 = 0;
        if (b9Arr != null && b9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                B9[] b9Arr2 = this.f45706a;
                if (i14 >= b9Arr2.length) {
                    break;
                }
                B9 b13 = b9Arr2[i14];
                if (b13 != null) {
                    codedOutputByteBufferNano.writeMessage(3, b13);
                }
                i14++;
            }
        }
        C3932w9 c3932w9 = this.f45707b;
        if (c3932w9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3932w9);
        }
        C3857t9[] c3857t9Arr = this.f45708c;
        if (c3857t9Arr != null && c3857t9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C3857t9[] c3857t9Arr2 = this.f45708c;
                if (i15 >= c3857t9Arr2.length) {
                    break;
                }
                C3857t9 c3857t9 = c3857t9Arr2[i15];
                if (c3857t9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c3857t9);
                }
                i15++;
            }
        }
        C9[] c9Arr = this.f45709d;
        if (c9Arr != null && c9Arr.length > 0) {
            int i16 = 0;
            while (true) {
                C9[] c9Arr2 = this.f45709d;
                if (i16 >= c9Arr2.length) {
                    break;
                }
                C9 c13 = c9Arr2[i16];
                if (c13 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c13);
                }
                i16++;
            }
        }
        String[] strArr = this.f45710e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f45710e;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static E9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                B9[] b9Arr = this.f45706a;
                int length = b9Arr == null ? 0 : b9Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                B9[] b9Arr2 = new B9[i13];
                if (length != 0) {
                    System.arraycopy(b9Arr, 0, b9Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    B9 b13 = new B9();
                    b9Arr2[length] = b13;
                    codedInputByteBufferNano.readMessage(b13);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                B9 b14 = new B9();
                b9Arr2[length] = b14;
                codedInputByteBufferNano.readMessage(b14);
                this.f45706a = b9Arr2;
            } else if (tag == 34) {
                if (this.f45707b == null) {
                    this.f45707b = new C3932w9();
                }
                codedInputByteBufferNano.readMessage(this.f45707b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C3857t9[] c3857t9Arr = this.f45708c;
                int length2 = c3857t9Arr == null ? 0 : c3857t9Arr.length;
                int i14 = repeatedFieldArrayLength2 + length2;
                C3857t9[] c3857t9Arr2 = new C3857t9[i14];
                if (length2 != 0) {
                    System.arraycopy(c3857t9Arr, 0, c3857t9Arr2, 0, length2);
                }
                while (length2 < i14 - 1) {
                    C3857t9 c3857t9 = new C3857t9();
                    c3857t9Arr2[length2] = c3857t9;
                    codedInputByteBufferNano.readMessage(c3857t9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C3857t9 c3857t10 = new C3857t9();
                c3857t9Arr2[length2] = c3857t10;
                codedInputByteBufferNano.readMessage(c3857t10);
                this.f45708c = c3857t9Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C9[] c9Arr = this.f45709d;
                int length3 = c9Arr == null ? 0 : c9Arr.length;
                int i15 = repeatedFieldArrayLength3 + length3;
                C9[] c9Arr2 = new C9[i15];
                if (length3 != 0) {
                    System.arraycopy(c9Arr, 0, c9Arr2, 0, length3);
                }
                while (length3 < i15 - 1) {
                    C9 c13 = new C9();
                    c9Arr2[length3] = c13;
                    codedInputByteBufferNano.readMessage(c13);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C9 c14 = new C9();
                c9Arr2[length3] = c14;
                codedInputByteBufferNano.readMessage(c14);
                this.f45709d = c9Arr2;
            } else if (tag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f45710e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i16 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i16];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i16 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f45710e = strArr2;
            }
        }
    }

    public static E9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E9) MessageNano.mergeFrom(new E9(), bArr);
    }
}
