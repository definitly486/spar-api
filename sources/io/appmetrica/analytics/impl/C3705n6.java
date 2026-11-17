package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3705n6 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C3705n6[] f47746d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3929w6 f47747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3929w6[] f47748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47749c;

    public C3705n6() {
        a();
    }

    public static C3705n6[] b() {
        if (f47746d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47746d == null) {
                        f47746d = new C3705n6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47746d;
    }

    public final C3705n6 a() {
        this.f47747a = null;
        this.f47748b = C3929w6.b();
        this.f47749c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3929w6 c3929w6 = this.f47747a;
        if (c3929w6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3929w6);
        }
        C3929w6[] c3929w6Arr = this.f47748b;
        if (c3929w6Arr != null && c3929w6Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3929w6[] c3929w6Arr2 = this.f47748b;
                if (i13 >= c3929w6Arr2.length) {
                    break;
                }
                C3929w6 c3929w7 = c3929w6Arr2[i13];
                if (c3929w7 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3929w7) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return !this.f47749c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f47749c) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3929w6 c3929w6 = this.f47747a;
        if (c3929w6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3929w6);
        }
        C3929w6[] c3929w6Arr = this.f47748b;
        if (c3929w6Arr != null && c3929w6Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3929w6[] c3929w6Arr2 = this.f47748b;
                if (i13 >= c3929w6Arr2.length) {
                    break;
                }
                C3929w6 c3929w7 = c3929w6Arr2[i13];
                if (c3929w7 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3929w7);
                }
                i13++;
            }
        }
        if (!this.f47749c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f47749c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3705n6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f47747a == null) {
                    this.f47747a = new C3929w6();
                }
                codedInputByteBufferNano.readMessage(this.f47747a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3929w6[] c3929w6Arr = this.f47748b;
                int length = c3929w6Arr == null ? 0 : c3929w6Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3929w6[] c3929w6Arr2 = new C3929w6[i13];
                if (length != 0) {
                    System.arraycopy(c3929w6Arr, 0, c3929w6Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3929w6 c3929w6 = new C3929w6();
                    c3929w6Arr2[length] = c3929w6;
                    codedInputByteBufferNano.readMessage(c3929w6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3929w6 c3929w7 = new C3929w6();
                c3929w6Arr2[length] = c3929w7;
                codedInputByteBufferNano.readMessage(c3929w7);
                this.f47748b = c3929w6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47749c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3705n6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3705n6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3705n6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3705n6) MessageNano.mergeFrom(new C3705n6(), bArr);
    }
}
