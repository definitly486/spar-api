package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Xi extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Xi[] f46775d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Wi f46777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vi f46778c;

    public Xi() {
        a();
    }

    public static Xi[] b() {
        if (f46775d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46775d == null) {
                        f46775d = new Xi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46775d;
    }

    public final Xi a() {
        this.f46776a = false;
        this.f46777b = null;
        this.f46778c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f46776a;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z13);
        }
        Wi wi2 = this.f46777b;
        if (wi2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wi2);
        }
        Vi vi2 = this.f46778c;
        return vi2 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, vi2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f46776a;
        if (z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        Wi wi2 = this.f46777b;
        if (wi2 != null) {
            codedOutputByteBufferNano.writeMessage(2, wi2);
        }
        Vi vi2 = this.f46778c;
        if (vi2 != null) {
            codedOutputByteBufferNano.writeMessage(3, vi2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f46776a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f46777b == null) {
                    this.f46777b = new Wi();
                }
                codedInputByteBufferNano.readMessage(this.f46777b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46778c == null) {
                    this.f46778c = new Vi();
                }
                codedInputByteBufferNano.readMessage(this.f46778c);
            }
        }
    }

    public static Xi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Xi().mergeFrom(codedInputByteBufferNano);
    }

    public static Xi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Xi) MessageNano.mergeFrom(new Xi(), bArr);
    }
}
