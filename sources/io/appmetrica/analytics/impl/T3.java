package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class T3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46540c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46541d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46542e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46543f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile T3[] f46544g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q3 f46545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q3[] f46546b;

    public T3() {
        a();
    }

    public static T3[] b() {
        if (f46544g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46544g == null) {
                        f46544g = new T3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46544g;
    }

    public final T3 a() {
        this.f46545a = null;
        this.f46546b = Q3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Q3 q13 = this.f46545a;
        if (q13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, q13);
        }
        Q3[] q3Arr = this.f46546b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i13 = 0;
            while (true) {
                Q3[] q3Arr2 = this.f46546b;
                if (i13 >= q3Arr2.length) {
                    break;
                }
                Q3 q14 = q3Arr2[i13];
                if (q14 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, q14) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Q3 q13 = this.f46545a;
        if (q13 != null) {
            codedOutputByteBufferNano.writeMessage(1, q13);
        }
        Q3[] q3Arr = this.f46546b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i13 = 0;
            while (true) {
                Q3[] q3Arr2 = this.f46546b;
                if (i13 >= q3Arr2.length) {
                    break;
                }
                Q3 q14 = q3Arr2[i13];
                if (q14 != null) {
                    codedOutputByteBufferNano.writeMessage(2, q14);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f46545a == null) {
                    this.f46545a = new Q3();
                }
                codedInputByteBufferNano.readMessage(this.f46545a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Q3[] q3Arr = this.f46546b;
                int length = q3Arr == null ? 0 : q3Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                Q3[] q3Arr2 = new Q3[i13];
                if (length != 0) {
                    System.arraycopy(q3Arr, 0, q3Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    Q3 q13 = new Q3();
                    q3Arr2[length] = q13;
                    codedInputByteBufferNano.readMessage(q13);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Q3 q14 = new Q3();
                q3Arr2[length] = q14;
                codedInputByteBufferNano.readMessage(q14);
                this.f46546b = q3Arr2;
            }
        }
    }

    public static T3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T3().mergeFrom(codedInputByteBufferNano);
    }

    public static T3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T3) MessageNano.mergeFrom(new T3(), bArr);
    }
}
