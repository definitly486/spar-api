package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile O[] f48946c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N f48948b;

    public O() {
        a();
    }

    public static O[] b() {
        if (f48946c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48946c == null) {
                        f48946c = new O[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48946c;
    }

    public final O a() {
        this.f48947a = true;
        this.f48948b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f48947a;
        if (!z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z13);
        }
        N n13 = this.f48948b;
        return n13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, n13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f48947a;
        if (!z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        N n13 = this.f48948b;
        if (n13 != null) {
            codedOutputByteBufferNano.writeMessage(2, n13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f48947a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f48948b == null) {
                    this.f48948b = new N();
                }
                codedInputByteBufferNano.readMessage(this.f48948b);
            }
        }
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
