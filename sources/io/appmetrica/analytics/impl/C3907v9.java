package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3907v9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3907v9[] f48235c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48237b;

    public C3907v9() {
        a();
    }

    public static C3907v9[] b() {
        if (f48235c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48235c == null) {
                        f48235c = new C3907v9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48235c;
    }

    public final C3907v9 a() {
        this.f48236a = "";
        this.f48237b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f48237b) + CodedOutputByteBufferNano.computeStringSize(1, this.f48236a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f48236a);
        codedOutputByteBufferNano.writeUInt64(2, this.f48237b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3907v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48236a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48237b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C3907v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3907v9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3907v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3907v9) MessageNano.mergeFrom(new C3907v9(), bArr);
    }
}
