package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class B9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45502d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45503e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45504f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45505g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45506h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45507i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f45508j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f45509k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45510l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45511m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45512n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f45513o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f45514p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile B9[] f45515q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A9 f45517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4007z9[] f45518c;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f45515q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45515q == null) {
                        f45515q = new B9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45515q;
    }

    public final B9 a() {
        this.f45516a = 0L;
        this.f45517b = null;
        this.f45518c = C4007z9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f45516a) + super.computeSerializedSize();
        A9 a13 = this.f45517b;
        if (a13 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, a13);
        }
        C4007z9[] c4007z9Arr = this.f45518c;
        if (c4007z9Arr != null && c4007z9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4007z9[] c4007z9Arr2 = this.f45518c;
                if (i13 >= c4007z9Arr2.length) {
                    break;
                }
                C4007z9 c4007z9 = c4007z9Arr2[i13];
                if (c4007z9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c4007z9) + iComputeUInt64Size;
                }
                i13++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f45516a);
        A9 a13 = this.f45517b;
        if (a13 != null) {
            codedOutputByteBufferNano.writeMessage(2, a13);
        }
        C4007z9[] c4007z9Arr = this.f45518c;
        if (c4007z9Arr != null && c4007z9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4007z9[] c4007z9Arr2 = this.f45518c;
                if (i13 >= c4007z9Arr2.length) {
                    break;
                }
                C4007z9 c4007z9 = c4007z9Arr2[i13];
                if (c4007z9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4007z9);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f45516a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f45517b == null) {
                    this.f45517b = new A9();
                }
                codedInputByteBufferNano.readMessage(this.f45517b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4007z9[] c4007z9Arr = this.f45518c;
                int length = c4007z9Arr == null ? 0 : c4007z9Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C4007z9[] c4007z9Arr2 = new C4007z9[i13];
                if (length != 0) {
                    System.arraycopy(c4007z9Arr, 0, c4007z9Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C4007z9 c4007z9 = new C4007z9();
                    c4007z9Arr2[length] = c4007z9;
                    codedInputByteBufferNano.readMessage(c4007z9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4007z9 c4007z10 = new C4007z9();
                c4007z9Arr2[length] = c4007z10;
                codedInputByteBufferNano.readMessage(c4007z10);
                this.f45518c = c4007z9Arr2;
            }
        }
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
