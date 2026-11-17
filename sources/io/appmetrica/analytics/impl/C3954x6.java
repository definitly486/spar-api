package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3954x6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C3954x6[] f48404f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3904v6[] f48407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3954x6 f48408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3954x6[] f48409e;

    public C3954x6() {
        a();
    }

    public static C3954x6[] b() {
        if (f48404f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48404f == null) {
                        f48404f = new C3954x6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48404f;
    }

    public final C3954x6 a() {
        this.f48405a = "";
        this.f48406b = "";
        this.f48407c = C3904v6.b();
        this.f48408d = null;
        this.f48409e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f48405a) + super.computeSerializedSize();
        if (!this.f48406b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f48406b);
        }
        C3904v6[] c3904v6Arr = this.f48407c;
        int i13 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48407c;
                if (i14 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i14];
                if (c3904v6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c3904v6) + iComputeStringSize;
                }
                i14++;
            }
        }
        C3954x6 c3954x6 = this.f48408d;
        if (c3954x6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c3954x6);
        }
        C3954x6[] c3954x6Arr = this.f48409e;
        if (c3954x6Arr != null && c3954x6Arr.length > 0) {
            while (true) {
                C3954x6[] c3954x6Arr2 = this.f48409e;
                if (i13 >= c3954x6Arr2.length) {
                    break;
                }
                C3954x6 c3954x7 = c3954x6Arr2[i13];
                if (c3954x7 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c3954x7) + iComputeStringSize;
                }
                i13++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f48405a);
        if (!this.f48406b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f48406b);
        }
        C3904v6[] c3904v6Arr = this.f48407c;
        int i13 = 0;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48407c;
                if (i14 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i14];
                if (c3904v6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3904v6);
                }
                i14++;
            }
        }
        C3954x6 c3954x6 = this.f48408d;
        if (c3954x6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3954x6);
        }
        C3954x6[] c3954x6Arr = this.f48409e;
        if (c3954x6Arr != null && c3954x6Arr.length > 0) {
            while (true) {
                C3954x6[] c3954x6Arr2 = this.f48409e;
                if (i13 >= c3954x6Arr2.length) {
                    break;
                }
                C3954x6 c3954x7 = c3954x6Arr2[i13];
                if (c3954x7 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c3954x7);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3954x6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3954x6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3954x6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48405a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f48406b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3904v6[] c3904v6Arr = this.f48407c;
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
                this.f48407c = c3904v6Arr2;
            } else if (tag == 34) {
                if (this.f48408d == null) {
                    this.f48408d = new C3954x6();
                }
                codedInputByteBufferNano.readMessage(this.f48408d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C3954x6[] c3954x6Arr = this.f48409e;
                int length2 = c3954x6Arr == null ? 0 : c3954x6Arr.length;
                int i14 = repeatedFieldArrayLength2 + length2;
                C3954x6[] c3954x6Arr2 = new C3954x6[i14];
                if (length2 != 0) {
                    System.arraycopy(c3954x6Arr, 0, c3954x6Arr2, 0, length2);
                }
                while (length2 < i14 - 1) {
                    C3954x6 c3954x6 = new C3954x6();
                    c3954x6Arr2[length2] = c3954x6;
                    codedInputByteBufferNano.readMessage(c3954x6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C3954x6 c3954x7 = new C3954x6();
                c3954x6Arr2[length2] = c3954x7;
                codedInputByteBufferNano.readMessage(c3954x7);
                this.f48409e = c3954x6Arr2;
            }
        }
    }

    public static C3954x6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3954x6) MessageNano.mergeFrom(new C3954x6(), bArr);
    }
}
