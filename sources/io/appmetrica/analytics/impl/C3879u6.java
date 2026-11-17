package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3879u6 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3879u6[] f48159c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48161b;

    public C3879u6() {
        a();
    }

    public static C3879u6[] b() {
        if (f48159c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48159c == null) {
                        f48159c = new C3879u6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48159c;
    }

    public final C3879u6 a() {
        this.f48160a = 0;
        this.f48161b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f48160a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        return !this.f48161b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f48161b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f48160a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        if (!this.f48161b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f48161b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3879u6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f48160a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48161b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3879u6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3879u6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3879u6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3879u6) MessageNano.mergeFrom(new C3879u6(), bArr);
    }
}
