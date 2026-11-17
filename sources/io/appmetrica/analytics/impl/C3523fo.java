package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3523fo extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3523fo[] f47260b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3446co[] f47261a;

    public C3523fo() {
        a();
    }

    public static C3523fo[] b() {
        if (f47260b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47260b == null) {
                        f47260b = new C3523fo[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47260b;
    }

    public final C3523fo a() {
        this.f47261a = C3446co.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3446co[] c3446coArr = this.f47261a;
        if (c3446coArr != null && c3446coArr.length > 0) {
            int i13 = 0;
            while (true) {
                C3446co[] c3446coArr2 = this.f47261a;
                if (i13 >= c3446coArr2.length) {
                    break;
                }
                C3446co c3446co = c3446coArr2[i13];
                if (c3446co != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3446co) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3446co[] c3446coArr = this.f47261a;
        if (c3446coArr != null && c3446coArr.length > 0) {
            int i13 = 0;
            while (true) {
                C3446co[] c3446coArr2 = this.f47261a;
                if (i13 >= c3446coArr2.length) {
                    break;
                }
                C3446co c3446co = c3446coArr2[i13];
                if (c3446co != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3446co);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3523fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3446co[] c3446coArr = this.f47261a;
                int length = c3446coArr == null ? 0 : c3446coArr.length;
                int i13 = repeatedFieldArrayLength + length;
                C3446co[] c3446coArr2 = new C3446co[i13];
                if (length != 0) {
                    System.arraycopy(c3446coArr, 0, c3446coArr2, 0, length);
                }
                while (length < i13 - 1) {
                    C3446co c3446co = new C3446co();
                    c3446coArr2[length] = c3446co;
                    codedInputByteBufferNano.readMessage(c3446co);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3446co c3446co2 = new C3446co();
                c3446coArr2[length] = c3446co2;
                codedInputByteBufferNano.readMessage(c3446co2);
                this.f47261a = c3446coArr2;
            }
        }
    }

    public static C3523fo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3523fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C3523fo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3523fo) MessageNano.mergeFrom(new C3523fo(), bArr);
    }
}
