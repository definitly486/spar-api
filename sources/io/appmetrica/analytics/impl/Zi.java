package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Zi extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46871l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46872m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46873n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46874o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f46875p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Zi[] f46876q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f46878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f46879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f46880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ui f46881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Yi f46886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Xi f46887k;

    public Zi() {
        a();
    }

    public static Zi[] b() {
        if (f46876q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46876q == null) {
                        f46876q = new Zi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46876q;
    }

    public final Zi a() {
        this.f46877a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f46878b = bArr;
        this.f46879c = bArr;
        this.f46880d = bArr;
        this.f46881e = null;
        this.f46882f = 0L;
        this.f46883g = false;
        this.f46884h = 0;
        this.f46885i = 1;
        this.f46886j = null;
        this.f46887k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f46877a;
        if (i13 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i13);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f46878b) + iComputeSerializedSize;
        byte[] bArr = this.f46879c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f46879c);
        }
        if (!Arrays.equals(this.f46880d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f46880d);
        }
        Ui ui2 = this.f46881e;
        if (ui2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, ui2);
        }
        long j13 = this.f46882f;
        if (j13 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j13);
        }
        boolean z13 = this.f46883g;
        if (z13) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z13);
        }
        int i14 = this.f46884h;
        if (i14 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i14);
        }
        int i15 = this.f46885i;
        if (i15 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i15);
        }
        Yi yi2 = this.f46886j;
        if (yi2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yi2);
        }
        Xi xi2 = this.f46887k;
        return xi2 != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, xi2) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f46877a;
        if (i13 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i13);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f46878b);
        byte[] bArr = this.f46879c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f46879c);
        }
        if (!Arrays.equals(this.f46880d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f46880d);
        }
        Ui ui2 = this.f46881e;
        if (ui2 != null) {
            codedOutputByteBufferNano.writeMessage(6, ui2);
        }
        long j13 = this.f46882f;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j13);
        }
        boolean z13 = this.f46883g;
        if (z13) {
            codedOutputByteBufferNano.writeBool(8, z13);
        }
        int i14 = this.f46884h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i14);
        }
        int i15 = this.f46885i;
        if (i15 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i15);
        }
        Yi yi2 = this.f46886j;
        if (yi2 != null) {
            codedOutputByteBufferNano.writeMessage(11, yi2);
        }
        Xi xi2 = this.f46887k;
        if (xi2 != null) {
            codedOutputByteBufferNano.writeMessage(12, xi2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Zi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Zi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Zi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f46877a = codedInputByteBufferNano.readUInt32();
                    break;
                case C4007z9.G /* 26 */:
                    this.f46878b = codedInputByteBufferNano.readBytes();
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.f46879c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f46880d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f46881e == null) {
                        this.f46881e = new Ui();
                    }
                    codedInputByteBufferNano.readMessage(this.f46881e);
                    break;
                case 56:
                    this.f46882f = codedInputByteBufferNano.readInt64();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f46883g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f46884h = int32;
                    }
                    break;
                case 80:
                    int int33 = codedInputByteBufferNano.readInt32();
                    if (int33 == 1 || int33 == 2) {
                        this.f46885i = int33;
                    }
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f46886j == null) {
                        this.f46886j = new Yi();
                    }
                    codedInputByteBufferNano.readMessage(this.f46886j);
                    break;
                case 98:
                    if (this.f46887k == null) {
                        this.f46887k = new Xi();
                    }
                    codedInputByteBufferNano.readMessage(this.f46887k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public static Zi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Zi) MessageNano.mergeFrom(new Zi(), bArr);
    }
}
