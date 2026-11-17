package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3929w6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3929w6[] f48272g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3904v6[] f48278f;

    public C3929w6() {
        a();
    }

    public static C3929w6[] b() {
        if (f48272g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48272g == null) {
                        f48272g = new C3929w6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48272g;
    }

    public final C3929w6 a() {
        this.f48273a = "";
        this.f48274b = 0;
        this.f48275c = 0L;
        this.f48276d = "";
        this.f48277e = 0;
        this.f48278f = C3904v6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f48275c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f48274b) + CodedOutputByteBufferNano.computeStringSize(1, this.f48273a) + super.computeSerializedSize();
        if (!this.f48276d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f48276d);
        }
        int i13 = this.f48277e;
        if (i13 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i13);
        }
        C3904v6[] c3904v6Arr = this.f48278f;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48278f;
                if (i14 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i14];
                if (c3904v6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c3904v6) + iComputeSInt64Size;
                }
                i14++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f48273a);
        codedOutputByteBufferNano.writeSInt32(2, this.f48274b);
        codedOutputByteBufferNano.writeSInt64(3, this.f48275c);
        if (!this.f48276d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48276d);
        }
        int i13 = this.f48277e;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i13);
        }
        C3904v6[] c3904v6Arr = this.f48278f;
        if (c3904v6Arr != null && c3904v6Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C3904v6[] c3904v6Arr2 = this.f48278f;
                if (i14 >= c3904v6Arr2.length) {
                    break;
                }
                C3904v6 c3904v6 = c3904v6Arr2[i14];
                if (c3904v6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c3904v6);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3929w6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3929w6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3929w6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48273a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f48274b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f48275c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f48276d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f48277e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C3904v6[] c3904v6Arr = this.f48278f;
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
                this.f48278f = c3904v6Arr2;
            }
        }
    }

    public static C3929w6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3929w6) MessageNano.mergeFrom(new C3929w6(), bArr);
    }
}
