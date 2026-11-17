package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4013zf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4013zf[] f48606f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48611e;

    public C4013zf() {
        a();
    }

    public static C4013zf[] b() {
        if (f48606f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48606f == null) {
                        f48606f = new C4013zf[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48606f;
    }

    public final C4013zf a() {
        this.f48607a = "";
        this.f48608b = "";
        this.f48609c = false;
        this.f48610d = false;
        this.f48611e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f48607a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f48607a);
        }
        if (!this.f48608b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f48608b);
        }
        boolean z13 = this.f48609c;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z13);
        }
        boolean z14 = this.f48610d;
        if (z14) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z14);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f48611e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f48607a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f48607a);
        }
        if (!this.f48608b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f48608b);
        }
        boolean z13 = this.f48609c;
        if (z13) {
            codedOutputByteBufferNano.writeBool(3, z13);
        }
        boolean z14 = this.f48610d;
        if (z14) {
            codedOutputByteBufferNano.writeBool(4, z14);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f48611e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4013zf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4013zf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4013zf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48607a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f48608b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f48609c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f48610d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f48611e = int32;
                }
            }
        }
    }

    public static C4013zf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4013zf) MessageNano.mergeFrom(new C4013zf(), bArr);
    }
}
