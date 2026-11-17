package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945wm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3945wm[] f48352b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48353a;

    public C3945wm() {
        a();
    }

    public static C3945wm[] b() {
        if (f48352b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48352b == null) {
                        f48352b = new C3945wm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48352b;
    }

    public final C3945wm a() {
        this.f48353a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f48353a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f48353a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3945wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48353a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C3945wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3945wm) MessageNano.mergeFrom(new C3945wm(), bArr);
    }

    public static C3945wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3945wm().mergeFrom(codedInputByteBufferNano);
    }
}
