package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3882u9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48182j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48183k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48184l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C3882u9[] f48185m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f48186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f48187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48194i;

    public C3882u9() {
        a();
    }

    public static C3882u9[] b() {
        if (f48185m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48185m == null) {
                        f48185m = new C3882u9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48185m;
    }

    public final C3882u9 a() {
        this.f48186a = 0.0d;
        this.f48187b = 0.0d;
        this.f48188c = 0L;
        this.f48189d = 0;
        this.f48190e = 0;
        this.f48191f = 0;
        this.f48192g = 0;
        this.f48193h = 0;
        this.f48194i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f48187b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f48186a) + super.computeSerializedSize();
        long j13 = this.f48188c;
        if (j13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j13);
        }
        int i13 = this.f48189d;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i13);
        }
        int i14 = this.f48190e;
        if (i14 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i14);
        }
        int i15 = this.f48191f;
        if (i15 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i15);
        }
        int i16 = this.f48192g;
        if (i16 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i16);
        }
        int i17 = this.f48193h;
        if (i17 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i17);
        }
        return !this.f48194i.equals("") ? iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f48194i) : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f48186a);
        codedOutputByteBufferNano.writeDouble(2, this.f48187b);
        long j13 = this.f48188c;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j13);
        }
        int i13 = this.f48189d;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i13);
        }
        int i14 = this.f48190e;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i14);
        }
        int i15 = this.f48191f;
        if (i15 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i15);
        }
        int i16 = this.f48192g;
        if (i16 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i16);
        }
        int i17 = this.f48193h;
        if (i17 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i17);
        }
        if (!this.f48194i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f48194i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3882u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3882u9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3882u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 9) {
                this.f48186a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f48187b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f48188c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f48189d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f48190e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f48191f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f48192g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f48193h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48194i = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C3882u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3882u9) MessageNano.mergeFrom(new C3882u9(), bArr);
    }
}
