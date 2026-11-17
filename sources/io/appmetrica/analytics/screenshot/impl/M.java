package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile M[] f48939c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48941b;

    public M() {
        a();
    }

    public static M[] b() {
        if (f48939c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48939c == null) {
                        f48939c = new M[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48939c;
    }

    public final M a() {
        this.f48940a = true;
        this.f48941b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f48940a;
        if (!z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z13);
        }
        long j13 = this.f48941b;
        return j13 != 1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f48940a;
        if (!z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        long j13 = this.f48941b;
        if (j13 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f48940a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48941b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static M b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M().mergeFrom(codedInputByteBufferNano);
    }

    public static M a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M) MessageNano.mergeFrom(new M(), bArr);
    }
}
