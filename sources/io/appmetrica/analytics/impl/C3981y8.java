package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3981y8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C3981y8[] f48509e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H8 f48510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J8 f48511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A8 f48512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G8 f48513d;

    public C3981y8() {
        a();
    }

    public static C3981y8[] b() {
        if (f48509e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48509e == null) {
                        f48509e = new C3981y8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48509e;
    }

    public final C3981y8 a() {
        this.f48510a = null;
        this.f48511b = null;
        this.f48512c = null;
        this.f48513d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        H8 h13 = this.f48510a;
        if (h13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h13);
        }
        J8 j13 = this.f48511b;
        if (j13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, j13);
        }
        A8 a13 = this.f48512c;
        if (a13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, a13);
        }
        G8 g13 = this.f48513d;
        return g13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, g13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        H8 h13 = this.f48510a;
        if (h13 != null) {
            codedOutputByteBufferNano.writeMessage(1, h13);
        }
        J8 j13 = this.f48511b;
        if (j13 != null) {
            codedOutputByteBufferNano.writeMessage(2, j13);
        }
        A8 a13 = this.f48512c;
        if (a13 != null) {
            codedOutputByteBufferNano.writeMessage(3, a13);
        }
        G8 g13 = this.f48513d;
        if (g13 != null) {
            codedOutputByteBufferNano.writeMessage(4, g13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3981y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f48510a == null) {
                    this.f48510a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f48510a);
            } else if (tag == 18) {
                if (this.f48511b == null) {
                    this.f48511b = new J8();
                }
                codedInputByteBufferNano.readMessage(this.f48511b);
            } else if (tag == 26) {
                if (this.f48512c == null) {
                    this.f48512c = new A8();
                }
                codedInputByteBufferNano.readMessage(this.f48512c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f48513d == null) {
                    this.f48513d = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f48513d);
            }
        }
    }

    public static C3981y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3981y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3981y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3981y8) MessageNano.mergeFrom(new C3981y8(), bArr);
    }
}
