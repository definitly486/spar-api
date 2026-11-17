package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class P9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile P9[] f46377e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f46381d;

    public P9() {
        a();
    }

    public static P9[] b() {
        if (f46377e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f46377e == null) {
                        f46377e = new P9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f46377e;
    }

    public final P9 a() {
        this.f46378a = false;
        this.f46379b = 0;
        this.f46380c = 0;
        this.f46381d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f46380c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f46379b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f46378a) + super.computeSerializedSize();
        int[] iArr = this.f46381d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i13 = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f46381d;
            if (i13 >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i13]);
            i13++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f46378a);
        codedOutputByteBufferNano.writeUInt32(2, this.f46379b);
        codedOutputByteBufferNano.writeUInt32(3, this.f46380c);
        int[] iArr = this.f46381d;
        if (iArr != null && iArr.length > 0) {
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f46381d;
                if (i13 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i13]);
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f46378a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f46379b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f46380c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f46381d;
                int length = iArr == null ? 0 : iArr.length;
                int i13 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i13];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i13 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f46381d = iArr2;
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i14 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i14++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f46381d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i15 = i14 + length2;
                int[] iArr4 = new int[i15];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i15) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f46381d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            }
        }
    }

    public static P9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P9().mergeFrom(codedInputByteBufferNano);
    }

    public static P9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P9) MessageNano.mergeFrom(new P9(), bArr);
    }
}
