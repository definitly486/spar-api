package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3870tm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3870tm[] f48142c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f48144b;

    public C3870tm() {
        a();
    }

    public static C3870tm[] b() {
        if (f48142c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48142c == null) {
                        f48142c = new C3870tm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48142c;
    }

    public final C3870tm a() {
        this.f48143a = "";
        this.f48144b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f48143a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f48143a);
        }
        return !Arrays.equals(this.f48144b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f48144b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f48143a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f48143a);
        }
        if (!Arrays.equals(this.f48144b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f48144b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3870tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f48143a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f48144b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C3870tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3870tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C3870tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3870tm) MessageNano.mergeFrom(new C3870tm(), bArr);
    }
}
