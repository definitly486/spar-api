package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3904v6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3904v6[] f48225g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48231f;

    public C3904v6() {
        a();
    }

    public static C3904v6[] b() {
        if (f48225g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48225g == null) {
                        f48225g = new C3904v6[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48225g;
    }

    public final C3904v6 a() {
        this.f48226a = "";
        this.f48227b = "";
        this.f48228c = -1;
        this.f48229d = "";
        this.f48230e = false;
        this.f48231f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f48226a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f48226a);
        }
        if (!this.f48227b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f48227b);
        }
        int i13 = this.f48228c;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i13);
        }
        if (!this.f48229d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f48229d);
        }
        boolean z13 = this.f48230e;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z13);
        }
        int i14 = this.f48231f;
        return i14 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f48226a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f48226a);
        }
        if (!this.f48227b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f48227b);
        }
        int i13 = this.f48228c;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i13);
        }
        if (!this.f48229d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48229d);
        }
        boolean z13 = this.f48230e;
        if (z13) {
            codedOutputByteBufferNano.writeBool(5, z13);
        }
        int i14 = this.f48231f;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3904v6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3904v6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3904v6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48226a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f48227b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f48228c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f48229d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f48230e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48231f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    public static C3904v6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3904v6) MessageNano.mergeFrom(new C3904v6(), bArr);
    }
}
