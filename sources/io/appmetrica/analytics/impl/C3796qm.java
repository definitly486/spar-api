package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3796qm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3796qm[] f47928c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f47930b;

    public C3796qm() {
        a();
    }

    public static C3796qm[] b() {
        if (f47928c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f47928c == null) {
                        f47928c = new C3796qm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47928c;
    }

    public final C3796qm a() {
        this.f47929a = "";
        this.f47930b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f47929a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f47929a);
        }
        String[] strArr = this.f47930b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i13 = 0;
        int iComputeStringSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f47930b;
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
        if (!this.f47929a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f47929a);
        }
        String[] strArr = this.f47930b;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f47930b;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3796qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f47929a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f47930b;
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
                this.f47930b = strArr2;
            }
        }
    }

    public static C3796qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3796qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C3796qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3796qm) MessageNano.mergeFrom(new C3796qm(), bArr);
    }
}
