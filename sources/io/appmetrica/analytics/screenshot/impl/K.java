package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile K[] f48933b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48934a;

    public K() {
        a();
    }

    public static K[] b() {
        if (f48933b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48933b == null) {
                        f48933b = new K[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48933b;
    }

    public final K a() {
        this.f48934a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f48934a;
        return !z13 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f48934a;
        if (!z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f48934a = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static K a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K) MessageNano.mergeFrom(new K(), bArr);
    }

    public static K b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K().mergeFrom(codedInputByteBufferNano);
    }
}
