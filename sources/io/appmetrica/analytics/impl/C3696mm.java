package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696mm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3696mm[] f47716c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3671lm f47718b;

    public C3696mm() {
        a();
    }

    public static C3696mm[] b() {
        if (f47716c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47716c == null) {
                        f47716c = new C3696mm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47716c;
    }

    public final C3696mm a() {
        this.f47717a = "";
        this.f47718b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f47717a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f47717a);
        }
        C3671lm c3671lm = this.f47718b;
        return c3671lm != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c3671lm) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f47717a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f47717a);
        }
        C3671lm c3671lm = this.f47718b;
        if (c3671lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c3671lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3696mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47717a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f47718b == null) {
                    this.f47718b = new C3671lm();
                }
                codedInputByteBufferNano.readMessage(this.f47718b);
            }
        }
    }

    public static C3696mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3696mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C3696mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3696mm) MessageNano.mergeFrom(new C3696mm(), bArr);
    }
}
