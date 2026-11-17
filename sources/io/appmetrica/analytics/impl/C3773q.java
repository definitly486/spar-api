package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3773q extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3773q[] f47902c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47904b;

    public C3773q() {
        a();
    }

    public static C3773q[] b() {
        if (f47902c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47902c == null) {
                        f47902c = new C3773q[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47902c;
    }

    public final C3773q a() {
        this.f47903a = 0L;
        this.f47904b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f47903a;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j13);
        }
        int i13 = this.f47904b;
        return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f47903a;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        int i13 = this.f47904b;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3773q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f47903a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47904b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C3773q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3773q().mergeFrom(codedInputByteBufferNano);
    }

    public static C3773q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3773q) MessageNano.mergeFrom(new C3773q(), bArr);
    }
}
