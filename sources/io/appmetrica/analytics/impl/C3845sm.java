package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3845sm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3845sm[] f48076g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48082f;

    public C3845sm() {
        a();
    }

    public static C3845sm[] b() {
        if (f48076g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48076g == null) {
                        f48076g = new C3845sm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48076g;
    }

    public final C3845sm a() {
        this.f48077a = false;
        this.f48078b = false;
        this.f48079c = false;
        this.f48080d = false;
        this.f48081e = false;
        this.f48082f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f48080d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f48079c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f48078b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f48077a) + super.computeSerializedSize();
        boolean z13 = this.f48081e;
        if (z13) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z13);
        }
        int i13 = this.f48082f;
        return i13 != -1 ? iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i13) : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f48077a);
        codedOutputByteBufferNano.writeBool(2, this.f48078b);
        codedOutputByteBufferNano.writeBool(3, this.f48079c);
        codedOutputByteBufferNano.writeBool(4, this.f48080d);
        boolean z13 = this.f48081e;
        if (z13) {
            codedOutputByteBufferNano.writeBool(5, z13);
        }
        int i13 = this.f48082f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3845sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3845sm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3845sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f48077a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f48078b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f48079c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f48080d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f48081e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f48082f = int32;
                }
            }
        }
    }

    public static C3845sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3845sm) MessageNano.mergeFrom(new C3845sm(), bArr);
    }
}
