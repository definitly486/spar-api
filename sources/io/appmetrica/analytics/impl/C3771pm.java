package io.appmetrica.analytics.impl;

import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3771pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3771pm[] f47893b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47894a;

    public C3771pm() {
        a();
    }

    public static C3771pm[] b() {
        if (f47893b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47893b == null) {
                        f47893b = new C3771pm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47893b;
    }

    public final C3771pm a() {
        this.f47894a = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j13 = this.f47894a;
        return j13 != DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j13) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j13 = this.f47894a;
        if (j13 != DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            codedOutputByteBufferNano.writeInt64(1, j13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3771pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f47894a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C3771pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3771pm) MessageNano.mergeFrom(new C3771pm(), bArr);
    }

    public static C3771pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3771pm().mergeFrom(codedInputByteBufferNano);
    }
}
