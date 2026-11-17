package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    static int computeSizeBoolList(int i13, List<?> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(i13, true);
    }

    static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    static int computeSizeByteStringList(int i13, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i13);
        for (int i14 = 0; i14 < list.size(); i14++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i14));
        }
        return iComputeTagSize;
    }

    static int computeSizeEnumList(int i13, List<Integer> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) : iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeEnumListNoTag(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeEnumSizeNoTag = 0;
            while (i13 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i13));
                i13++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i13 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i13).intValue());
                i13++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    static int computeSizeFixed32List(int i13, List<?> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(i13, 0);
    }

    static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    static int computeSizeFixed64List(int i13, List<?> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(i13, 0L);
    }

    static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i13, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i13, list.get(i14));
        }
        return iComputeGroupSize;
    }

    static int computeSizeInt32List(int i13, List<Integer> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) : iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeInt32ListNoTag(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i13));
                i13++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i13).intValue());
                i13++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    static int computeSizeInt64List(int i13, List<Long> list, boolean z13) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) : iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeInt64ListNoTag(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i13));
                i13++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i13).longValue());
                i13++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    static int computeSizeMessage(int i13, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i13, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i13, (MessageLite) obj, schema);
    }

    static int computeSizeMessageList(int i13, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            iComputeTagSize += obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
        }
        return iComputeTagSize;
    }

    static int computeSizeSInt32List(int i13, List<Integer> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) : iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeSInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i13));
                i13++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i13).intValue());
                i13++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    static int computeSizeSInt64List(int i13, List<Long> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) : iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeSInt64ListNoTag(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeSInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i13));
                i13++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i13).longValue());
                i13++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    static int computeSizeStringList(int i13, List<?> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i13) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i14 < size) {
                Object raw = lazyStringList.getRaw(i14);
                iComputeTagSize += raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                iComputeTagSize += obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i14++;
            }
        }
        return iComputeTagSize;
    }

    static int computeSizeUInt32List(int i13, List<Integer> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) : iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            iComputeUInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i13));
                i13++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i13 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i13).intValue());
                i13++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    static int computeSizeUInt64List(int i13, List<Long> list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        return z13 ? CodedOutputStream.computeTagSize(i13) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) : iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i13));
    }

    static int computeSizeUInt64ListNoTag(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            iComputeUInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i13));
                i13++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i13 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i13).longValue());
                i13++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    @CanIgnoreReturnValue
    static <UT, UB> UB filterUnknownEnumList(Object obj, int i13, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub3;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = list.get(i15);
                int iIntValue = num.intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    ub3 = (UB) storeUnknownEnum(obj, i13, iIntValue, ub3, unknownFieldSchema);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue2) == null) {
                    ub3 = (UB) storeUnknownEnum(obj, i13, iIntValue2, ub3, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub3;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t13, T t14) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t14);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t13).mergeFrom(extensions);
    }

    static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t13, T t14, long j13) {
        UnsafeUtil.putObject(t13, j13, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t13, j13), UnsafeUtil.getObject(t14, j13)));
    }

    static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t13, T t14) {
        unknownFieldSchema.setToMessage(t13, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t13), unknownFieldSchema.getFromMessage(t14)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i13, int i14, int i15) {
        if (i14 < 40) {
            return true;
        }
        long j13 = ((long) i14) - ((long) i13);
        long j14 = i15;
        return j13 + 10 <= ((2 * j14) + 3) + ((j14 + 3) * 3);
    }

    @CanIgnoreReturnValue
    static <UT, UB> UB storeUnknownEnum(Object obj, int i13, int i14, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub3 == null) {
            ub3 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub3, i13, i14);
        return ub3;
    }

    static String toCamelCase(String str, boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb3.append(cCharAt);
                    }
                    z13 = true;
                } else if (i13 != 0 || z13) {
                    sb3.append(cCharAt);
                } else {
                    sb3.append((char) (cCharAt + ' '));
                }
            } else if (z13) {
                sb3.append((char) (cCharAt - ' '));
            } else {
                sb3.append(cCharAt);
            }
            z13 = false;
        }
        return sb3.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i13, boolean z13, Writer writer) throws IOException {
        if (z13) {
            writer.writeBool(i13, true);
        }
    }

    public static void writeBoolList(int i13, List<Boolean> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i13, list, z13);
    }

    public static void writeBytes(int i13, ByteString byteString, Writer writer) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i13, byteString);
    }

    public static void writeBytesList(int i13, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i13, list);
    }

    public static void writeDouble(int i13, double d13, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(d13) != 0) {
            writer.writeDouble(i13, d13);
        }
    }

    public static void writeDoubleList(int i13, List<Double> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i13, list, z13);
    }

    public static void writeEnum(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeEnum(i13, i14);
        }
    }

    public static void writeEnumList(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i13, list, z13);
    }

    public static void writeFixed32(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeFixed32(i13, i14);
        }
    }

    public static void writeFixed32List(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i13, list, z13);
    }

    public static void writeFixed64(int i13, long j13, Writer writer) throws IOException {
        if (j13 != 0) {
            writer.writeFixed64(i13, j13);
        }
    }

    public static void writeFixed64List(int i13, List<Long> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i13, list, z13);
    }

    public static void writeFloat(int i13, float f13, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(f13) != 0) {
            writer.writeFloat(i13, f13);
        }
    }

    public static void writeFloatList(int i13, List<Float> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i13, list, z13);
    }

    public static void writeGroupList(int i13, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i13, list);
    }

    public static void writeInt32(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeInt32(i13, i14);
        }
    }

    public static void writeInt32List(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i13, list, z13);
    }

    public static void writeInt64(int i13, long j13, Writer writer) throws IOException {
        if (j13 != 0) {
            writer.writeInt64(i13, j13);
        }
    }

    public static void writeInt64List(int i13, List<Long> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i13, list, z13);
    }

    public static void writeLazyFieldList(int i13, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i13);
        }
    }

    public static void writeMessage(int i13, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.writeMessage(i13, obj);
        }
    }

    public static void writeMessageList(int i13, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i13, list);
    }

    public static void writeSFixed32(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeSFixed32(i13, i14);
        }
    }

    public static void writeSFixed32List(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i13, list, z13);
    }

    public static void writeSFixed64(int i13, long j13, Writer writer) throws IOException {
        if (j13 != 0) {
            writer.writeSFixed64(i13, j13);
        }
    }

    public static void writeSFixed64List(int i13, List<Long> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i13, list, z13);
    }

    public static void writeSInt32(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeSInt32(i13, i14);
        }
    }

    public static void writeSInt32List(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i13, list, z13);
    }

    public static void writeSInt64(int i13, long j13, Writer writer) throws IOException {
        if (j13 != 0) {
            writer.writeSInt64(i13, j13);
        }
    }

    public static void writeSInt64List(int i13, List<Long> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i13, list, z13);
    }

    public static void writeString(int i13, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i13, (String) obj, writer);
        } else {
            writeBytes(i13, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i13, String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i13, str);
    }

    public static void writeStringList(int i13, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i13, list);
    }

    public static void writeUInt32(int i13, int i14, Writer writer) throws IOException {
        if (i14 != 0) {
            writer.writeUInt32(i13, i14);
        }
    }

    public static void writeUInt32List(int i13, List<Integer> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i13, list, z13);
    }

    public static void writeUInt64(int i13, long j13, Writer writer) throws IOException {
        if (j13 != 0) {
            writer.writeUInt64(i13, j13);
        }
    }

    public static void writeUInt64List(int i13, List<Long> list, Writer writer, boolean z13) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i13, list, z13);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    static int computeSizeGroupList(int i13, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i13, list.get(i14), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i13, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i13, list, schema);
    }

    public static void writeMessageList(int i13, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i13, list, schema);
    }

    static int computeSizeMessageList(int i13, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    static <UT, UB> UB filterUnknownEnumList(Object obj, int i13, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub3;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = list.get(i15);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    ub3 = (UB) storeUnknownEnum(obj, i13, iIntValue, ub3, unknownFieldSchema);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub3 = (UB) storeUnknownEnum(obj, i13, iIntValue2, ub3, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub3;
    }
}
