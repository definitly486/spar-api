package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Bf extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45525c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45526d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45527e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45528f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Bf[] f45529g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4013zf f45530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Af[] f45531b;

    public Bf() {
        a();
    }

    public static Bf[] b() {
        if (f45529g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f45529g == null) {
                        f45529g = new Bf[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45529g;
    }

    public final Bf a() {
        this.f45530a = null;
        this.f45531b = Af.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4013zf c4013zf = this.f45530a;
        if (c4013zf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4013zf);
        }
        Af[] afArr = this.f45531b;
        if (afArr != null && afArr.length > 0) {
            int i13 = 0;
            while (true) {
                Af[] afArr2 = this.f45531b;
                if (i13 >= afArr2.length) {
                    break;
                }
                Af af2 = afArr2[i13];
                if (af2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, af2) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4013zf c4013zf = this.f45530a;
        if (c4013zf != null) {
            codedOutputByteBufferNano.writeMessage(1, c4013zf);
        }
        Af[] afArr = this.f45531b;
        if (afArr != null && afArr.length > 0) {
            int i13 = 0;
            while (true) {
                Af[] afArr2 = this.f45531b;
                if (i13 >= afArr2.length) {
                    break;
                }
                Af af2 = afArr2[i13];
                if (af2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, af2);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f45530a == null) {
                    this.f45530a = new C4013zf();
                }
                codedInputByteBufferNano.readMessage(this.f45530a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Af[] afArr = this.f45531b;
                int length = afArr == null ? 0 : afArr.length;
                int i13 = repeatedFieldArrayLength + length;
                Af[] afArr2 = new Af[i13];
                if (length != 0) {
                    System.arraycopy(afArr, 0, afArr2, 0, length);
                }
                while (length < i13 - 1) {
                    Af af2 = new Af();
                    afArr2[length] = af2;
                    codedInputByteBufferNano.readMessage(af2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Af af3 = new Af();
                afArr2[length] = af3;
                codedInputByteBufferNano.readMessage(af3);
                this.f45531b = afArr2;
            }
        }
    }

    public static Bf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bf().mergeFrom(codedInputByteBufferNano);
    }

    public static Bf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Bf) MessageNano.mergeFrom(new Bf(), bArr);
    }
}
