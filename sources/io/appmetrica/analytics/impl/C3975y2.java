package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3975y2 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C3975y2[] f48492f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f48497e;

    public C3975y2() {
        a();
    }

    public static C3975y2[] b() {
        if (f48492f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48492f == null) {
                        f48492f = new C3975y2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48492f;
    }

    public final C3975y2 a() {
        this.f48493a = 1;
        this.f48494b = "";
        this.f48495c = "";
        this.f48496d = 0L;
        this.f48497e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f48497e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f48496d) + CodedOutputByteBufferNano.computeStringSize(3, this.f48495c) + CodedOutputByteBufferNano.computeStringSize(2, this.f48494b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f48493a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f48493a);
        codedOutputByteBufferNano.writeString(2, this.f48494b);
        codedOutputByteBufferNano.writeString(3, this.f48495c);
        codedOutputByteBufferNano.writeUInt64(4, this.f48496d);
        codedOutputByteBufferNano.writeUInt64(5, this.f48497e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3975y2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3975y2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3975y2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f48493a = int32;
                }
            } else if (tag == 18) {
                this.f48494b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f48495c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f48496d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48497e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C3975y2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3975y2) MessageNano.mergeFrom(new C3975y2(), bArr);
    }
}
