package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i13) {
        int[] iArr = this.tags;
        if (i13 > iArr.length) {
            int i14 = this.count;
            int i15 = i14 + (i14 / 2);
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i13);
            this.objects = Arrays.copyOf(this.objects, i13);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i13) {
        int i14 = 17;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        return i14;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) throws IOException {
        int tag;
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, codedInputStream));
        return this;
    }

    static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i13 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.tags, i13);
        System.arraycopy(unknownFieldSetLite2.tags, 0, iArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.objects, i13);
        System.arraycopy(unknownFieldSetLite2.objects, 0, objArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i13, iArrCopyOf, objArrCopyOf, true);
    }

    static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (!objArr[i14].equals(objArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (iArr[i14] != iArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i13, Object obj, Writer writer) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i13);
        int tagWireType = WireFormat.getTagWireType(i13);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i13 = this.count;
        return i13 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i13) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i13 = this.memoizedSerializedSize;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.count; i15++) {
            int i16 = this.tags[i15];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i16);
            int tagWireType = WireFormat.getTagWireType(i16);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i15]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i15]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i15]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i15]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i15]).intValue());
            }
            i14 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i14;
        return i14;
    }

    public int getSerializedSizeAsMessageSet() {
        int i13 = this.memoizedSerializedSize;
        if (i13 != -1) {
            return i13;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i14 = 0; i14 < this.count; i14++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i14]), (ByteString) this.objects[i14]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    boolean mergeFieldFrom(int i13, CodedInputStream codedInputStream) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i13);
        int tagWireType = WireFormat.getTagWireType(i13);
        if (tagWireType == 0) {
            storeField(i13, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i13, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i13, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(codedInputStream);
            codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(i13, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(i13, Integer.valueOf(codedInputStream.readFixed32()));
        return true;
    }

    UnknownFieldSetLite mergeLengthDelimitedField(int i13, ByteString byteString) {
        checkMutable();
        if (i13 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i13, 2), byteString);
        return this;
    }

    UnknownFieldSetLite mergeVarintField(int i13, int i14) {
        checkMutable();
        if (i13 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i13, 0), Long.valueOf(i14));
        return this;
    }

    final void printWithIndent(StringBuilder sb3, int i13) {
        for (int i14 = 0; i14 < this.count; i14++) {
            MessageLiteToString.printField(sb3, i13, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i14])), this.objects[i14]);
        }
    }

    void storeField(int i13, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i14 = this.count;
        iArr[i14] = i13;
        this.objects[i14] = obj;
        this.count = i14 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i13 = 0; i13 < this.count; i13++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i13]), (ByteString) this.objects[i13]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i13 = 0; i13 < this.count; i13++) {
            int i14 = this.tags[i13];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i14);
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i13]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i13]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i13]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i13]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i13]).intValue());
            }
        }
    }

    private UnknownFieldSetLite(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.memoizedSerializedSize = -1;
        this.count = i13;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z13;
    }

    private static int hashCode(Object[] objArr, int i13) {
        int iHashCode = 17;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i13 = this.count;
        return ((((527 + i13) * 31) + hashCode(this.tags, i13)) * 31) + hashCode(this.objects, this.count);
    }

    @CanIgnoreReturnValue
    UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i13 = this.count + unknownFieldSetLite.count;
        ensureCapacity(i13);
        System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i13;
        return this;
    }

    void writeAsMessageSetTo(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i13 = this.count - 1; i13 >= 0; i13--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i13]), this.objects[i13]);
            }
            return;
        }
        for (int i14 = 0; i14 < this.count; i14++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i14]), this.objects[i14]);
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i13 = 0; i13 < this.count; i13++) {
                writeField(this.tags[i13], this.objects[i13], writer);
            }
            return;
        }
        for (int i14 = this.count - 1; i14 >= 0; i14--) {
            writeField(this.tags[i14], this.objects[i14], writer);
        }
    }
}
