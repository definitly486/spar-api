package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile N[] f48942d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f48943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f48944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L f48945c;

    public N() {
        a();
    }

    public static N[] b() {
        if (f48942d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48942d == null) {
                        f48942d = new N[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48942d;
    }

    public final N a() {
        this.f48943a = null;
        this.f48944b = null;
        this.f48945c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        K k13 = this.f48943a;
        if (k13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, k13);
        }
        M m13 = this.f48944b;
        if (m13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, m13);
        }
        L l13 = this.f48945c;
        return l13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, l13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        K k13 = this.f48943a;
        if (k13 != null) {
            codedOutputByteBufferNano.writeMessage(1, k13);
        }
        M m13 = this.f48944b;
        if (m13 != null) {
            codedOutputByteBufferNano.writeMessage(2, m13);
        }
        L l13 = this.f48945c;
        if (l13 != null) {
            codedOutputByteBufferNano.writeMessage(3, l13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f48943a == null) {
                    this.f48943a = new K();
                }
                codedInputByteBufferNano.readMessage(this.f48943a);
            } else if (tag == 18) {
                if (this.f48944b == null) {
                    this.f48944b = new M();
                }
                codedInputByteBufferNano.readMessage(this.f48944b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f48945c == null) {
                    this.f48945c = new L();
                }
                codedInputByteBufferNano.readMessage(this.f48945c);
            }
        }
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N().mergeFrom(codedInputByteBufferNano);
    }

    public static N a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }
}
