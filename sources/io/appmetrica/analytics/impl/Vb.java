package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Vb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Vb[] f46667f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46672e;

    public Vb() {
        a();
    }

    public static Vb[] b() {
        if (f46667f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46667f == null) {
                        f46667f = new Vb[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46667f;
    }

    public final Vb a() {
        this.f46668a = "";
        this.f46669b = "";
        this.f46670c = false;
        this.f46671d = "";
        this.f46672e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f46668a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f46668a);
        }
        if (!this.f46669b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f46669b);
        }
        boolean z13 = this.f46670c;
        if (z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z13);
        }
        if (!this.f46671d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f46671d);
        }
        return !this.f46672e.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f46672e) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f46668a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f46668a);
        }
        if (!this.f46669b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f46669b);
        }
        boolean z13 = this.f46670c;
        if (z13) {
            codedOutputByteBufferNano.writeBool(22, z13);
        }
        if (!this.f46671d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f46671d);
        }
        if (!this.f46672e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f46672e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Vb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f46668a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f46669b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f46670c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f46671d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f46672e = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Vb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vb) MessageNano.mergeFrom(new Vb(), bArr);
    }
}
