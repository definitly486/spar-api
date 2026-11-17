package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3895um extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3895um[] f48212c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48214b;

    public C3895um() {
        a();
    }

    public static C3895um[] b() {
        if (f48212c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48212c == null) {
                        f48212c = new C3895um[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48212c;
    }

    public final C3895um a() {
        this.f48213a = 86400L;
        this.f48214b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f48214b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f48213a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f48213a);
        codedOutputByteBufferNano.writeInt64(2, this.f48214b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3895um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f48213a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48214b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C3895um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3895um().mergeFrom(codedInputByteBufferNano);
    }

    public static C3895um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3895um) MessageNano.mergeFrom(new C3895um(), bArr);
    }
}
