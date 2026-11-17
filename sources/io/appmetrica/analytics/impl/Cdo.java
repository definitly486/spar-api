package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cdo extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Cdo[] f47131c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47133b;

    public Cdo() {
        a();
    }

    public static Cdo[] b() {
        if (f47131c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47131c == null) {
                        f47131c = new Cdo[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47131c;
    }

    public final Cdo a() {
        this.f47132a = false;
        this.f47133b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f47132a;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z13);
        }
        boolean z14 = this.f47133b;
        return z14 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f47132a;
        if (z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        boolean z14 = this.f47133b;
        if (z14) {
            codedOutputByteBufferNano.writeBool(2, z14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cdo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f47132a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47133b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static Cdo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Cdo().mergeFrom(codedInputByteBufferNano);
    }

    public static Cdo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Cdo) MessageNano.mergeFrom(new Cdo(), bArr);
    }
}
