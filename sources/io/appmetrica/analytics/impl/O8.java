package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class O8 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46314g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46315h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46316i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46317j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f46318k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46319l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46320m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46321n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile O8[] f46322o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N8 f46324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L8 f46325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M8 f46326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3956x8 f46327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D8 f46328f;

    public O8() {
        a();
    }

    public static O8[] b() {
        if (f46322o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46322o == null) {
                        f46322o = new O8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46322o;
    }

    public final O8 a() {
        this.f46323a = 0;
        this.f46324b = null;
        this.f46325c = null;
        this.f46326d = null;
        this.f46327e = null;
        this.f46328f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f46323a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i13);
        }
        N8 n13 = this.f46324b;
        if (n13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, n13);
        }
        L8 l13 = this.f46325c;
        if (l13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, l13);
        }
        M8 m13 = this.f46326d;
        if (m13 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, m13);
        }
        C3956x8 c3956x8 = this.f46327e;
        if (c3956x8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c3956x8);
        }
        D8 d13 = this.f46328f;
        return d13 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, d13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f46323a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i13);
        }
        N8 n13 = this.f46324b;
        if (n13 != null) {
            codedOutputByteBufferNano.writeMessage(2, n13);
        }
        L8 l13 = this.f46325c;
        if (l13 != null) {
            codedOutputByteBufferNano.writeMessage(3, l13);
        }
        M8 m13 = this.f46326d;
        if (m13 != null) {
            codedOutputByteBufferNano.writeMessage(4, m13);
        }
        C3956x8 c3956x8 = this.f46327e;
        if (c3956x8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c3956x8);
        }
        D8 d13 = this.f46328f;
        if (d13 != null) {
            codedOutputByteBufferNano.writeMessage(6, d13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static O8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f46323a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.f46324b == null) {
                    this.f46324b = new N8();
                }
                codedInputByteBufferNano.readMessage(this.f46324b);
            } else if (tag == 26) {
                if (this.f46325c == null) {
                    this.f46325c = new L8();
                }
                codedInputByteBufferNano.readMessage(this.f46325c);
            } else if (tag == 34) {
                if (this.f46326d == null) {
                    this.f46326d = new M8();
                }
                codedInputByteBufferNano.readMessage(this.f46326d);
            } else if (tag == 42) {
                if (this.f46327e == null) {
                    this.f46327e = new C3956x8();
                }
                codedInputByteBufferNano.readMessage(this.f46327e);
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f46328f == null) {
                    this.f46328f = new D8();
                }
                codedInputByteBufferNano.readMessage(this.f46328f);
            }
        }
    }

    public static O8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O8) MessageNano.mergeFrom(new O8(), bArr);
    }
}
