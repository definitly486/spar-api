package io.appmetrica.analytics.impl;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3932w9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C3932w9[] f48284n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3907v9[] f48296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f48297m;

    public C3932w9() {
        a();
    }

    public static C3932w9[] b() {
        if (f48284n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48284n == null) {
                        f48284n = new C3932w9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48284n;
    }

    public final C3932w9 a() {
        this.f48285a = "";
        this.f48286b = "";
        this.f48287c = "";
        this.f48288d = 0;
        this.f48289e = "";
        this.f48290f = "";
        this.f48291g = false;
        this.f48292h = 0;
        this.f48293i = "";
        this.f48294j = "";
        this.f48295k = 0;
        this.f48296l = C3907v9.b();
        this.f48297m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f48285a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f48285a);
        }
        if (!this.f48286b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f48286b);
        }
        if (!this.f48287c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f48287c);
        }
        int i13 = this.f48288d;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i13);
        }
        if (!this.f48289e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f48289e);
        }
        if (!this.f48290f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f48290f);
        }
        boolean z13 = this.f48291g;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z13);
        }
        int i14 = this.f48292h;
        if (i14 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i14);
        }
        if (!this.f48293i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f48293i);
        }
        if (!this.f48294j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f48294j);
        }
        int i15 = this.f48295k;
        if (i15 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i15);
        }
        C3907v9[] c3907v9Arr = this.f48296l;
        if (c3907v9Arr != null && c3907v9Arr.length > 0) {
            int i16 = 0;
            while (true) {
                C3907v9[] c3907v9Arr2 = this.f48296l;
                if (i16 >= c3907v9Arr2.length) {
                    break;
                }
                C3907v9 c3907v9 = c3907v9Arr2[i16];
                if (c3907v9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c3907v9) + iComputeSerializedSize;
                }
                i16++;
            }
        }
        return !this.f48297m.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f48297m) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f48285a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f48285a);
        }
        if (!this.f48286b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f48286b);
        }
        if (!this.f48287c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48287c);
        }
        int i13 = this.f48288d;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i13);
        }
        if (!this.f48289e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f48289e);
        }
        if (!this.f48290f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f48290f);
        }
        boolean z13 = this.f48291g;
        if (z13) {
            codedOutputByteBufferNano.writeBool(17, z13);
        }
        int i14 = this.f48292h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i14);
        }
        if (!this.f48293i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f48293i);
        }
        if (!this.f48294j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f48294j);
        }
        int i15 = this.f48295k;
        if (i15 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i15);
        }
        C3907v9[] c3907v9Arr = this.f48296l;
        if (c3907v9Arr != null && c3907v9Arr.length > 0) {
            int i16 = 0;
            while (true) {
                C3907v9[] c3907v9Arr2 = this.f48296l;
                if (i16 >= c3907v9Arr2.length) {
                    break;
                }
                C3907v9 c3907v9 = c3907v9Arr2[i16];
                if (c3907v9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c3907v9);
                }
                i16++;
            }
        }
        if (!this.f48297m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f48297m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3932w9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3932w9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3932w9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f48285a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f48286b = codedInputByteBufferNano.readString();
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.f48287c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f48288d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f48289e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f48290f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f48291g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f48292h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f48293i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f48294j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f48295k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C3907v9[] c3907v9Arr = this.f48296l;
                    int length = c3907v9Arr == null ? 0 : c3907v9Arr.length;
                    int i13 = repeatedFieldArrayLength + length;
                    C3907v9[] c3907v9Arr2 = new C3907v9[i13];
                    if (length != 0) {
                        System.arraycopy(c3907v9Arr, 0, c3907v9Arr2, 0, length);
                    }
                    while (length < i13 - 1) {
                        C3907v9 c3907v9 = new C3907v9();
                        c3907v9Arr2[length] = c3907v9;
                        codedInputByteBufferNano.readMessage(c3907v9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3907v9 c3907v10 = new C3907v9();
                    c3907v9Arr2[length] = c3907v10;
                    codedInputByteBufferNano.readMessage(c3907v10);
                    this.f48296l = c3907v9Arr2;
                    break;
                case 194:
                    this.f48297m = codedInputByteBufferNano.readString();
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

    public static C3932w9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3932w9) MessageNano.mergeFrom(new C3932w9(), bArr);
    }
}
