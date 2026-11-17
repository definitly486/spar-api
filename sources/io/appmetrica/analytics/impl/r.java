package io.appmetrica.analytics.impl;

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
public final class r extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47932l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47933m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f47934n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f47935o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f47936p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f47937q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47938r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f47939s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile r[] f47940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f47941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f47942v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f47943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3773q f47944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f47945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f47947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f47948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f47949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f47950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f47951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f47952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f47953k;

    public r() {
        if (!f47942v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f47942v) {
                        f47941u = InternalNano.bytesDefaultValue("manual");
                        f47942v = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a();
    }

    public static r[] b() {
        if (f47940t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47940t == null) {
                        f47940t = new r[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47940t;
    }

    public final r a() {
        this.f47943a = (byte[]) f47941u.clone();
        this.f47944b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f47945c = bArr;
        this.f47946d = 0;
        this.f47947e = bArr;
        this.f47948f = bArr;
        this.f47949g = bArr;
        this.f47950h = bArr;
        this.f47951i = bArr;
        this.f47952j = bArr;
        this.f47953k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f47943a, f47941u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f47943a);
        }
        C3773q c3773q = this.f47944b;
        if (c3773q != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3773q);
        }
        byte[] bArr = this.f47945c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f47945c);
        }
        int i13 = this.f47946d;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
        }
        if (!Arrays.equals(this.f47947e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f47947e);
        }
        if (!Arrays.equals(this.f47948f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f47948f);
        }
        if (!Arrays.equals(this.f47949g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f47949g);
        }
        if (!Arrays.equals(this.f47950h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f47950h);
        }
        if (!Arrays.equals(this.f47951i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f47951i);
        }
        if (!Arrays.equals(this.f47952j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f47952j);
        }
        return !Arrays.equals(this.f47953k, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f47953k) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f47943a, f47941u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f47943a);
        }
        C3773q c3773q = this.f47944b;
        if (c3773q != null) {
            codedOutputByteBufferNano.writeMessage(2, c3773q);
        }
        byte[] bArr = this.f47945c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f47945c);
        }
        int i13 = this.f47946d;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i13);
        }
        if (!Arrays.equals(this.f47947e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f47947e);
        }
        if (!Arrays.equals(this.f47948f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f47948f);
        }
        if (!Arrays.equals(this.f47949g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f47949g);
        }
        if (!Arrays.equals(this.f47950h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f47950h);
        }
        if (!Arrays.equals(this.f47951i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f47951i);
        }
        if (!Arrays.equals(this.f47952j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f47952j);
        }
        if (!Arrays.equals(this.f47953k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f47953k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f47943a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f47944b == null) {
                        this.f47944b = new C3773q();
                    }
                    codedInputByteBufferNano.readMessage(this.f47944b);
                    break;
                case C4007z9.G /* 26 */:
                    this.f47945c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
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
                            this.f47946d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f47947e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f47948f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f47949g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f47950h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f47951i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f47952j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f47953k = codedInputByteBufferNano.readBytes();
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

    public static r a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
