package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3820rm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3820rm[] f48019b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48020a;

    public C3820rm() {
        a();
    }

    public static C3820rm[] b() {
        if (f48019b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48019b == null) {
                        f48019b = new C3820rm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48019b;
    }

    public final C3820rm a() {
        this.f48020a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f48020a;
        return j13 != 864000000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f48020a;
        if (j13 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3820rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48020a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C3820rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3820rm) MessageNano.mergeFrom(new C3820rm(), bArr);
    }

    public static C3820rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3820rm().mergeFrom(codedInputByteBufferNano);
    }
}
