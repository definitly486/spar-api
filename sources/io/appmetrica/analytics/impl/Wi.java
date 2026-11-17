package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Wi extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46721c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46722d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46723e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46724f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46725g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Wi[] f46726h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46728b;

    public Wi() {
        a();
    }

    public static Wi[] b() {
        if (f46726h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46726h == null) {
                        f46726h = new Wi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46726h;
    }

    public final Wi a() {
        this.f46727a = 0;
        this.f46728b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i13 = this.f46727a;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i13);
        }
        int i14 = this.f46728b;
        return i14 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i14) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i13 = this.f46727a;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i13);
        }
        int i14 = this.f46728b;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f46727a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f46728b = int32;
                }
            }
        }
    }

    public static Wi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Wi().mergeFrom(codedInputByteBufferNano);
    }

    public static Wi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Wi) MessageNano.mergeFrom(new Wi(), bArr);
    }
}
