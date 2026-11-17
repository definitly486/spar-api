package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3829s6 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3829s6[] f48051b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48052a;

    public C3829s6() {
        a();
    }

    public static C3829s6[] b() {
        if (f48051b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48051b == null) {
                        f48051b = new C3829s6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48051b;
    }

    public final C3829s6 a() {
        this.f48052a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f48052a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f48052a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3829s6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f48052a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3829s6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3829s6) MessageNano.mergeFrom(new C3829s6(), bArr);
    }

    public static C3829s6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3829s6().mergeFrom(codedInputByteBufferNano);
    }
}
