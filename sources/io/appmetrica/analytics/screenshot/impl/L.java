package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile L[] f48935d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f48938c;

    public L() {
        a();
    }

    public static L[] b() {
        if (f48935d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f48935d == null) {
                        f48935d = new L[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48935d;
    }

    public final L a() {
        this.f48936a = true;
        this.f48937b = 5L;
        this.f48938c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z13 = this.f48936a;
        if (!z13) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z13);
        }
        long j13 = this.f48937b;
        if (j13 != 5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j13);
        }
        String[] strArr = this.f48938c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i13 = 0;
        int iComputeStringSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f48938c;
            if (i13 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i14;
            }
            String str = strArr2[i13];
            if (str != null) {
                i14++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i13++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z13 = this.f48936a;
        if (!z13) {
            codedOutputByteBufferNano.writeBool(1, z13);
        }
        long j13 = this.f48937b;
        if (j13 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j13);
        }
        String[] strArr = this.f48938c;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f48938c;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f48936a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f48937b = codedInputByteBufferNano.readInt64();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f48938c;
                int length = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i13];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i13 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f48938c = strArr2;
            }
        }
    }

    public static L b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L().mergeFrom(codedInputByteBufferNano);
    }

    public static L a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L) MessageNano.mergeFrom(new L(), bArr);
    }
}
