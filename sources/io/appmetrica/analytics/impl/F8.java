package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class F8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile F8[] f45795c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E8[] f45796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45797b;

    public F8() {
        a();
    }

    public static F8[] b() {
        if (f45795c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45795c == null) {
                        f45795c = new F8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45795c;
    }

    public final F8 a() {
        this.f45796a = E8.b();
        this.f45797b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        E8[] e8Arr = this.f45796a;
        if (e8Arr != null && e8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                E8[] e8Arr2 = this.f45796a;
                if (i13 >= e8Arr2.length) {
                    break;
                }
                E8 e13 = e8Arr2[i13];
                if (e13 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, e13) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        int i14 = this.f45797b;
        return i14 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E8[] e8Arr = this.f45796a;
        if (e8Arr != null && e8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                E8[] e8Arr2 = this.f45796a;
                if (i13 >= e8Arr2.length) {
                    break;
                }
                E8 e13 = e8Arr2[i13];
                if (e13 != null) {
                    codedOutputByteBufferNano.writeMessage(1, e13);
                }
                i13++;
            }
        }
        int i14 = this.f45797b;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                E8[] e8Arr = this.f45796a;
                int length = e8Arr == null ? 0 : e8Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                E8[] e8Arr2 = new E8[i13];
                if (length != 0) {
                    System.arraycopy(e8Arr, 0, e8Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    E8 e13 = new E8();
                    e8Arr2[length] = e13;
                    codedInputByteBufferNano.readMessage(e13);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                E8 e14 = new E8();
                e8Arr2[length] = e14;
                codedInputByteBufferNano.readMessage(e14);
                this.f45796a = e8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f45797b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static F8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F8().mergeFrom(codedInputByteBufferNano);
    }

    public static F8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F8) MessageNano.mergeFrom(new F8(), bArr);
    }
}
