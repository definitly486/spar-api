package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3920vm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3920vm[] f48250b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48251a;

    public C3920vm() {
        a();
    }

    public static C3920vm[] b() {
        if (f48250b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48250b == null) {
                        f48250b = new C3920vm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48250b;
    }

    public final C3920vm a() {
        this.f48251a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f48251a;
        return i13 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f48251a;
        if (i13 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3920vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f48251a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C3920vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3920vm) MessageNano.mergeFrom(new C3920vm(), bArr);
    }

    public static C3920vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3920vm().mergeFrom(codedInputByteBufferNano);
    }
}
