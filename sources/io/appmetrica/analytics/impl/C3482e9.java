package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3482e9 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3482e9[] f47165b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3457d9[] f47166a;

    public C3482e9() {
        a();
    }

    public static C3482e9[] b() {
        if (f47165b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47165b == null) {
                        f47165b = new C3482e9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47165b;
    }

    public final C3482e9 a() {
        this.f47166a = C3457d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3457d9[] c3457d9Arr = this.f47166a;
        if (c3457d9Arr != null && c3457d9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3457d9[] c3457d9Arr2 = this.f47166a;
                if (i13 >= c3457d9Arr2.length) {
                    break;
                }
                C3457d9 c3457d9 = c3457d9Arr2[i13];
                if (c3457d9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3457d9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3457d9[] c3457d9Arr = this.f47166a;
        if (c3457d9Arr != null && c3457d9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3457d9[] c3457d9Arr2 = this.f47166a;
                if (i13 >= c3457d9Arr2.length) {
                    break;
                }
                C3457d9 c3457d9 = c3457d9Arr2[i13];
                if (c3457d9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3457d9);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3482e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3457d9[] c3457d9Arr = this.f47166a;
                int length = c3457d9Arr == null ? 0 : c3457d9Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3457d9[] c3457d9Arr2 = new C3457d9[i13];
                if (length != 0) {
                    System.arraycopy(c3457d9Arr, 0, c3457d9Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3457d9 c3457d9 = new C3457d9();
                    c3457d9Arr2[length] = c3457d9;
                    codedInputByteBufferNano.readMessage(c3457d9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3457d9 c3457d10 = new C3457d9();
                c3457d9Arr2[length] = c3457d10;
                codedInputByteBufferNano.readMessage(c3457d10);
                this.f47166a = c3457d9Arr2;
            }
        }
    }

    public static C3482e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3482e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3482e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3482e9) MessageNano.mergeFrom(new C3482e9(), bArr);
    }
}
