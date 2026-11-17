package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3857t9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3857t9[] f48113c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48115b;

    public C3857t9() {
        a();
    }

    public static C3857t9[] b() {
        if (f48113c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48113c == null) {
                        f48113c = new C3857t9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48113c;
    }

    public final C3857t9 a() {
        this.f48114a = "";
        this.f48115b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f48115b) + CodedOutputByteBufferNano.computeStringSize(1, this.f48114a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f48114a);
        codedOutputByteBufferNano.writeString(2, this.f48115b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3857t9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48114a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48115b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3857t9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3857t9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3857t9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3857t9) MessageNano.mergeFrom(new C3857t9(), bArr);
    }
}
