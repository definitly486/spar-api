package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3424c2 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3424c2[] f47003c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47005b;

    public C3424c2() {
        a();
    }

    public static C3424c2[] b() {
        if (f47003c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47003c == null) {
                        f47003c = new C3424c2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47003c;
    }

    public final C3424c2 a() {
        this.f47004a = "";
        this.f47005b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f47005b) + CodedOutputByteBufferNano.computeStringSize(1, this.f47004a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f47004a);
        codedOutputByteBufferNano.writeBool(2, this.f47005b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3424c2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47004a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47005b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C3424c2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3424c2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3424c2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3424c2) MessageNano.mergeFrom(new C3424c2(), bArr);
    }
}
