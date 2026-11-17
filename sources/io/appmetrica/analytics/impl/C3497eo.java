package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3497eo extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C3497eo[] f47192e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f47194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f47195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47196d;

    public C3497eo() {
        a();
    }

    public static C3497eo[] b() {
        if (f47192e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47192e == null) {
                        f47192e = new C3497eo[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47192e;
    }

    public final C3497eo a() {
        this.f47193a = WireFormatNano.EMPTY_BYTES;
        this.f47194b = 0.0d;
        this.f47195c = 0.0d;
        this.f47196d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f47193a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f47193a);
        }
        if (Double.doubleToLongBits(this.f47194b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f47194b);
        }
        if (Double.doubleToLongBits(this.f47195c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f47195c);
        }
        boolean z13 = this.f47196d;
        return z13 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f47193a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f47193a);
        }
        if (Double.doubleToLongBits(this.f47194b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f47194b);
        }
        if (Double.doubleToLongBits(this.f47195c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f47195c);
        }
        boolean z13 = this.f47196d;
        if (z13) {
            codedOutputByteBufferNano.writeBool(4, z13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3497eo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47193a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f47194b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f47195c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47196d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C3497eo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3497eo().mergeFrom(codedInputByteBufferNano);
    }

    public static C3497eo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3497eo) MessageNano.mergeFrom(new C3497eo(), bArr);
    }
}
