package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class G8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile G8[] f45847c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3931w8 f45848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3931w8[] f45849b;

    public G8() {
        a();
    }

    public static G8[] b() {
        if (f45847c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45847c == null) {
                        f45847c = new G8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45847c;
    }

    public final G8 a() {
        this.f45848a = null;
        this.f45849b = C3931w8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3931w8 c3931w8 = this.f45848a;
        if (c3931w8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3931w8);
        }
        C3931w8[] c3931w8Arr = this.f45849b;
        if (c3931w8Arr != null && c3931w8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3931w8[] c3931w8Arr2 = this.f45849b;
                if (i13 >= c3931w8Arr2.length) {
                    break;
                }
                C3931w8 c3931w9 = c3931w8Arr2[i13];
                if (c3931w9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3931w9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3931w8 c3931w8 = this.f45848a;
        if (c3931w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3931w8);
        }
        C3931w8[] c3931w8Arr = this.f45849b;
        if (c3931w8Arr != null && c3931w8Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3931w8[] c3931w8Arr2 = this.f45849b;
                if (i13 >= c3931w8Arr2.length) {
                    break;
                }
                C3931w8 c3931w9 = c3931w8Arr2[i13];
                if (c3931w9 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3931w9);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f45848a == null) {
                    this.f45848a = new C3931w8();
                }
                codedInputByteBufferNano.readMessage(this.f45848a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3931w8[] c3931w8Arr = this.f45849b;
                int length = c3931w8Arr == null ? 0 : c3931w8Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3931w8[] c3931w8Arr2 = new C3931w8[i13];
                if (length != 0) {
                    System.arraycopy(c3931w8Arr, 0, c3931w8Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3931w8 c3931w8 = new C3931w8();
                    c3931w8Arr2[length] = c3931w8;
                    codedInputByteBufferNano.readMessage(c3931w8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3931w8 c3931w9 = new C3931w8();
                c3931w8Arr2[length] = c3931w9;
                codedInputByteBufferNano.readMessage(c3931w9);
                this.f45849b = c3931w8Arr2;
            }
        }
    }

    public static G8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G8().mergeFrom(codedInputByteBufferNano);
    }

    public static G8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (G8) MessageNano.mergeFrom(new G8(), bArr);
    }
}
