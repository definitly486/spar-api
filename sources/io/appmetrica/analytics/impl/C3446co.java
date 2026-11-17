package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446co extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47042e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47043f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47044g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f47045h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C3446co[] f47046i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cdo f47049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3497eo f47050d;

    public C3446co() {
        a();
    }

    public static C3446co[] b() {
        if (f47046i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47046i == null) {
                        f47046i = new C3446co[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47046i;
    }

    public final C3446co a() {
        this.f47047a = WireFormatNano.EMPTY_BYTES;
        this.f47048b = 0;
        this.f47049c = null;
        this.f47050d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f47048b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f47047a) + super.computeSerializedSize();
        Cdo cdo = this.f47049c;
        if (cdo != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, cdo);
        }
        C3497eo c3497eo = this.f47050d;
        return c3497eo != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c3497eo) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f47047a);
        codedOutputByteBufferNano.writeInt32(2, this.f47048b);
        Cdo cdo = this.f47049c;
        if (cdo != null) {
            codedOutputByteBufferNano.writeMessage(3, cdo);
        }
        C3497eo c3497eo = this.f47050d;
        if (c3497eo != null) {
            codedOutputByteBufferNano.writeMessage(4, c3497eo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3446co mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47047a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f47048b = int32;
                }
            } else if (tag == 26) {
                if (this.f47049c == null) {
                    this.f47049c = new Cdo();
                }
                codedInputByteBufferNano.readMessage(this.f47049c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f47050d == null) {
                    this.f47050d = new C3497eo();
                }
                codedInputByteBufferNano.readMessage(this.f47050d);
            }
        }
    }

    public static C3446co b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3446co().mergeFrom(codedInputByteBufferNano);
    }

    public static C3446co a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3446co) MessageNano.mergeFrom(new C3446co(), bArr);
    }
}
