package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4000z2 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48542c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48543d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48544e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4000z2[] f48545f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3975y2[] f48546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48547b;

    public C4000z2() {
        a();
    }

    public static C4000z2[] b() {
        if (f48545f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48545f == null) {
                        f48545f = new C4000z2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48545f;
    }

    public final C4000z2 a() {
        this.f48546a = C3975y2.b();
        this.f48547b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3975y2[] c3975y2Arr = this.f48546a;
        if (c3975y2Arr != null && c3975y2Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3975y2[] c3975y2Arr2 = this.f48546a;
                if (i13 >= c3975y2Arr2.length) {
                    break;
                }
                C3975y2 c3975y2 = c3975y2Arr2[i13];
                if (c3975y2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3975y2) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f48547b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3975y2[] c3975y2Arr = this.f48546a;
        if (c3975y2Arr != null && c3975y2Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C3975y2[] c3975y2Arr2 = this.f48546a;
                if (i13 >= c3975y2Arr2.length) {
                    break;
                }
                C3975y2 c3975y2 = c3975y2Arr2[i13];
                if (c3975y2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3975y2);
                }
                i13++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f48547b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4000z2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3975y2[] c3975y2Arr = this.f48546a;
                int length = c3975y2Arr == null ? 0 : c3975y2Arr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3975y2[] c3975y2Arr2 = new C3975y2[i13];
                if (length != 0) {
                    System.arraycopy(c3975y2Arr, 0, c3975y2Arr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3975y2 c3975y2 = new C3975y2();
                    c3975y2Arr2[length] = c3975y2;
                    codedInputByteBufferNano.readMessage(c3975y2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3975y2 c3975y3 = new C3975y2();
                c3975y2Arr2[length] = c3975y3;
                codedInputByteBufferNano.readMessage(c3975y3);
                this.f48546a = c3975y2Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48547b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4000z2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4000z2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4000z2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4000z2) MessageNano.mergeFrom(new C4000z2(), bArr);
    }
}
