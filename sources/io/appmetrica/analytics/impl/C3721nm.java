package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3721nm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3721nm[] f47782b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3696mm[] f47783a;

    public C3721nm() {
        a();
    }

    public static C3721nm[] b() {
        if (f47782b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47782b == null) {
                        f47782b = new C3721nm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47782b;
    }

    public final C3721nm a() {
        this.f47783a = C3696mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3696mm[] c3696mmArr = this.f47783a;
        if (c3696mmArr != null && c3696mmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C3696mm[] c3696mmArr2 = this.f47783a;
                if (i13 >= c3696mmArr2.length) {
                    break;
                }
                C3696mm c3696mm = c3696mmArr2[i13];
                if (c3696mm != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3696mm) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3696mm[] c3696mmArr = this.f47783a;
        if (c3696mmArr != null && c3696mmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C3696mm[] c3696mmArr2 = this.f47783a;
                if (i13 >= c3696mmArr2.length) {
                    break;
                }
                C3696mm c3696mm = c3696mmArr2[i13];
                if (c3696mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3696mm);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3721nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C3696mm[] c3696mmArr = this.f47783a;
                int length = c3696mmArr == null ? 0 : c3696mmArr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3696mm[] c3696mmArr2 = new C3696mm[i13];
                if (length != 0) {
                    System.arraycopy(c3696mmArr, 0, c3696mmArr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3696mm c3696mm = new C3696mm();
                    c3696mmArr2[length] = c3696mm;
                    codedInputByteBufferNano.readMessage(c3696mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3696mm c3696mm2 = new C3696mm();
                c3696mmArr2[length] = c3696mm2;
                codedInputByteBufferNano.readMessage(c3696mm2);
                this.f47783a = c3696mmArr2;
            }
        }
    }

    public static C3721nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3721nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C3721nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3721nm) MessageNano.mergeFrom(new C3721nm(), bArr);
    }
}
