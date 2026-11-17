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
public final class B8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile B8[] f45496f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f45497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f45498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F8 f45499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C8[] f45500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45501e;

    public B8() {
        a();
    }

    public static B8[] b() {
        if (f45496f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45496f == null) {
                        f45496f = new B8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45496f;
    }

    public final B8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f45497a = bArr;
        this.f45498b = bArr;
        this.f45499c = null;
        this.f45500d = C8.b();
        this.f45501e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f45497a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f45497a);
        }
        if (!Arrays.equals(this.f45498b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f45498b);
        }
        F8 f13 = this.f45499c;
        if (f13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, f13);
        }
        C8[] c8Arr = this.f45500d;
        if (c8Arr != null && c8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C8[] c8Arr2 = this.f45500d;
                if (i13 >= c8Arr2.length) {
                    break;
                }
                C8 c13 = c8Arr2[i13];
                if (c13 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c13) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        int i14 = this.f45501e;
        return i14 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f45497a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f45497a);
        }
        if (!Arrays.equals(this.f45498b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f45498b);
        }
        F8 f13 = this.f45499c;
        if (f13 != null) {
            codedOutputByteBufferNano.writeMessage(3, f13);
        }
        C8[] c8Arr = this.f45500d;
        if (c8Arr != null && c8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C8[] c8Arr2 = this.f45500d;
                if (i13 >= c8Arr2.length) {
                    break;
                }
                C8 c13 = c8Arr2[i13];
                if (c13 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c13);
                }
                i13++;
            }
        }
        int i14 = this.f45501e;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static B8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f45497a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f45498b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f45499c == null) {
                    this.f45499c = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f45499c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C8[] c8Arr = this.f45500d;
                int length = c8Arr == null ? 0 : c8Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C8[] c8Arr2 = new C8[i13];
                if (length != 0) {
                    System.arraycopy(c8Arr, 0, c8Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C8 c13 = new C8();
                    c8Arr2[length] = c13;
                    codedInputByteBufferNano.readMessage(c13);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C8 c14 = new C8();
                c8Arr2[length] = c14;
                codedInputByteBufferNano.readMessage(c14);
                this.f45500d = c8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f45501e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static B8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B8) MessageNano.mergeFrom(new B8(), bArr);
    }
}
