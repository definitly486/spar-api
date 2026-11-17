package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3746om extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3746om[] f47848c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47850b;

    public C3746om() {
        a();
    }

    public static C3746om[] b() {
        if (f47848c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47848c == null) {
                        f47848c = new C3746om[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47848c;
    }

    public final C3746om a() {
        this.f47849a = 86400;
        this.f47850b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f47849a;
        if (i13 != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        int i14 = this.f47850b;
        return i14 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f47849a;
        if (i13 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        int i14 = this.f47850b;
        if (i14 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3746om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f47849a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47850b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C3746om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3746om().mergeFrom(codedInputByteBufferNano);
    }

    public static C3746om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3746om) MessageNano.mergeFrom(new C3746om(), bArr);
    }
}
