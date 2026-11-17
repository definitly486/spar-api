package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class H8 extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile H8[] f45897h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f45898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f45899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4006z8 f45900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F8 f45901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G8 f45902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G8 f45903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public I8[] f45904g;

    public H8() {
        a();
    }

    public static H8[] b() {
        if (f45897h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45897h == null) {
                        f45897h = new H8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45897h;
    }

    public final H8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f45898a = bArr;
        this.f45899b = bArr;
        this.f45900c = null;
        this.f45901d = null;
        this.f45902e = null;
        this.f45903f = null;
        this.f45904g = I8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f45898a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f45898a);
        }
        if (!Arrays.equals(this.f45899b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f45899b);
        }
        C4006z8 c4006z8 = this.f45900c;
        if (c4006z8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4006z8);
        }
        F8 f13 = this.f45901d;
        if (f13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, f13);
        }
        G8 g13 = this.f45902e;
        if (g13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, g13);
        }
        G8 g14 = this.f45903f;
        if (g14 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, g14);
        }
        I8[] i8Arr = this.f45904g;
        if (i8Arr != null && i8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                I8[] i8Arr2 = this.f45904g;
                if (i13 >= i8Arr2.length) {
                    break;
                }
                I8 i14 = i8Arr2[i13];
                if (i14 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, i14) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f45898a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f45898a);
        }
        if (!Arrays.equals(this.f45899b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f45899b);
        }
        C4006z8 c4006z8 = this.f45900c;
        if (c4006z8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4006z8);
        }
        F8 f13 = this.f45901d;
        if (f13 != null) {
            codedOutputByteBufferNano.writeMessage(4, f13);
        }
        G8 g13 = this.f45902e;
        if (g13 != null) {
            codedOutputByteBufferNano.writeMessage(5, g13);
        }
        G8 g14 = this.f45903f;
        if (g14 != null) {
            codedOutputByteBufferNano.writeMessage(6, g14);
        }
        I8[] i8Arr = this.f45904g;
        if (i8Arr != null && i8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                I8[] i8Arr2 = this.f45904g;
                if (i13 >= i8Arr2.length) {
                    break;
                }
                I8 i14 = i8Arr2[i13];
                if (i14 != null) {
                    codedOutputByteBufferNano.writeMessage(7, i14);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static H8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f45898a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f45899b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f45900c == null) {
                    this.f45900c = new C4006z8();
                }
                codedInputByteBufferNano.readMessage(this.f45900c);
            } else if (tag == 34) {
                if (this.f45901d == null) {
                    this.f45901d = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f45901d);
            } else if (tag == 42) {
                if (this.f45902e == null) {
                    this.f45902e = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f45902e);
            } else if (tag == 50) {
                if (this.f45903f == null) {
                    this.f45903f = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f45903f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                I8[] i8Arr = this.f45904g;
                int length = i8Arr == null ? 0 : i8Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                I8[] i8Arr2 = new I8[i13];
                if (length != 0) {
                    System.arraycopy(i8Arr, 0, i8Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    I8 i14 = new I8();
                    i8Arr2[length] = i14;
                    codedInputByteBufferNano.readMessage(i14);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                I8 i15 = new I8();
                i8Arr2[length] = i15;
                codedInputByteBufferNano.readMessage(i15);
                this.f45904g = i8Arr2;
            }
        }
    }

    public static H8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H8) MessageNano.mergeFrom(new H8(), bArr);
    }
}
