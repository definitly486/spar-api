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
public final class V9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46657c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46658d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46659e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46660f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46661g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46662h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46663i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile V9[] f46664j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f46666b;

    public V9() {
        a();
    }

    public static V9[] b() {
        if (f46664j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46664j == null) {
                        f46664j = new V9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46664j;
    }

    public final V9 a() {
        this.f46665a = 0;
        this.f46666b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f46665a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        return !Arrays.equals(this.f46666b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f46666b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f46665a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        if (!Arrays.equals(this.f46666b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f46666b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f46665a = int32;
                        break;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46666b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static V9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V9().mergeFrom(codedInputByteBufferNano);
    }

    public static V9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V9) MessageNano.mergeFrom(new V9(), bArr);
    }
}
