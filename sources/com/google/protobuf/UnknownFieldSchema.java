package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    UnknownFieldSchema() {
    }

    private final void mergeFrom(B b13, Reader reader, int i13) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b13, reader, i13)) {
        }
    }

    abstract void addFixed32(B b13, int i13, int i14);

    abstract void addFixed64(B b13, int i13, long j13);

    abstract void addGroup(B b13, int i13, T t13);

    abstract void addLengthDelimited(B b13, int i13, ByteString byteString);

    abstract void addVarint(B b13, int i13, long j13);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t13);

    abstract int getSerializedSizeAsMessageSet(T t13);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t13, T t14);

    final boolean mergeOneFieldFrom(B b13, Reader reader, int i13) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b13, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b13, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b13, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b13, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i14 = i13 + 1;
        if (i14 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i14);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b13, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b13);

    public void setRecursionLimit(int i13) {
        recursionLimit = i13;
    }

    abstract void setToMessage(Object obj, T t13);

    abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract T toImmutable(B b13);

    abstract void writeAsMessageSetTo(T t13, Writer writer) throws IOException;

    abstract void writeTo(T t13, Writer writer) throws IOException;
}
