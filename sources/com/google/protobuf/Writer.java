package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i13, boolean z13) throws IOException;

    void writeBoolList(int i13, List<Boolean> list, boolean z13) throws IOException;

    void writeBytes(int i13, ByteString byteString) throws IOException;

    void writeBytesList(int i13, List<ByteString> list) throws IOException;

    void writeDouble(int i13, double d13) throws IOException;

    void writeDoubleList(int i13, List<Double> list, boolean z13) throws IOException;

    @Deprecated
    void writeEndGroup(int i13) throws IOException;

    void writeEnum(int i13, int i14) throws IOException;

    void writeEnumList(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeFixed32(int i13, int i14) throws IOException;

    void writeFixed32List(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeFixed64(int i13, long j13) throws IOException;

    void writeFixed64List(int i13, List<Long> list, boolean z13) throws IOException;

    void writeFloat(int i13, float f13) throws IOException;

    void writeFloatList(int i13, List<Float> list, boolean z13) throws IOException;

    @Deprecated
    void writeGroup(int i13, Object obj) throws IOException;

    @Deprecated
    void writeGroup(int i13, Object obj, Schema schema) throws IOException;

    @Deprecated
    void writeGroupList(int i13, List<?> list) throws IOException;

    @Deprecated
    void writeGroupList(int i13, List<?> list, Schema schema) throws IOException;

    void writeInt32(int i13, int i14) throws IOException;

    void writeInt32List(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeInt64(int i13, long j13) throws IOException;

    void writeInt64List(int i13, List<Long> list, boolean z13) throws IOException;

    <K, V> void writeMap(int i13, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException;

    void writeMessage(int i13, Object obj) throws IOException;

    void writeMessage(int i13, Object obj, Schema schema) throws IOException;

    void writeMessageList(int i13, List<?> list) throws IOException;

    void writeMessageList(int i13, List<?> list, Schema schema) throws IOException;

    void writeMessageSetItem(int i13, Object obj) throws IOException;

    void writeSFixed32(int i13, int i14) throws IOException;

    void writeSFixed32List(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeSFixed64(int i13, long j13) throws IOException;

    void writeSFixed64List(int i13, List<Long> list, boolean z13) throws IOException;

    void writeSInt32(int i13, int i14) throws IOException;

    void writeSInt32List(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeSInt64(int i13, long j13) throws IOException;

    void writeSInt64List(int i13, List<Long> list, boolean z13) throws IOException;

    @Deprecated
    void writeStartGroup(int i13) throws IOException;

    void writeString(int i13, String str) throws IOException;

    void writeStringList(int i13, List<String> list) throws IOException;

    void writeUInt32(int i13, int i14) throws IOException;

    void writeUInt32List(int i13, List<Integer> list, boolean z13) throws IOException;

    void writeUInt64(int i13, long j13) throws IOException;

    void writeUInt64List(int i13, List<Long> list, boolean z13) throws IOException;
}
