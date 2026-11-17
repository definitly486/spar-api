package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3671lm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3671lm[] f47667b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47668a;

    public C3671lm() {
        a();
    }

    public static C3671lm[] b() {
        if (f47667b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47667b == null) {
                        f47667b = new C3671lm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47667b;
    }

    public final C3671lm a() {
        this.f47668a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f47668a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f47668a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f47668a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f47668a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3671lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47668a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3671lm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3671lm) MessageNano.mergeFrom(new C3671lm(), bArr);
    }

    public static C3671lm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3671lm().mergeFrom(codedInputByteBufferNano);
    }
}
