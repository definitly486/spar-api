package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Af extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Af[] f45464d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45467c;

    public Af() {
        a();
    }

    public static Af[] b() {
        if (f45464d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45464d == null) {
                        f45464d = new Af[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45464d;
    }

    public final Af a() {
        this.f45465a = "";
        this.f45466b = "";
        this.f45467c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f45465a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f45465a);
        }
        if (!this.f45466b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f45466b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f45467c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f45465a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f45465a);
        }
        if (!this.f45466b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f45466b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f45467c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Af mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f45465a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f45466b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f45467c = int32;
                }
            }
        }
    }

    public static Af b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Af().mergeFrom(codedInputByteBufferNano);
    }

    public static Af a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Af) MessageNano.mergeFrom(new Af(), bArr);
    }
}
