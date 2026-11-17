package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i13, int i14, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z13, int[] iArr2, int i15, int i16, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i13;
        this.maxFieldNumber = i14;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z13;
        this.intArray = iArr2;
        this.checkInitializedCount = i15;
        this.repeatedFieldOffsetStart = i16;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t13, T t14, int i13) {
        return isFieldPresent(t13, i13) == isFieldPresent(t14, i13);
    }

    private static <T> boolean booleanAt(T t13, long j13) {
        return UnsafeUtil.getBoolean(t13, j13);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i13, int i14, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
        int i15 = registers.int1;
        if (i15 < 0 || i15 > i14 - iDecodeVarint33) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i16 = iDecodeVarint33 + i15;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint33 < i16) {
            int i17 = iDecodeVarint33 + 1;
            int i18 = bArr[iDecodeVarint33];
            if (i18 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(i18, bArr, i17, registers);
                i18 = registers.int1;
            } else {
                iDecodeVarint32 = i17;
            }
            int i19 = i18 >>> 3;
            int i23 = i18 & 7;
            if (i19 != 1) {
                if (i19 == 2 && i23 == metadata.valueType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i14, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint33 = ArrayDecoders.skipField(i18, bArr, iDecodeVarint32, i14, registers);
                }
            } else if (i23 == metadata.keyType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i14, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint33 = ArrayDecoders.skipField(i18, bArr, iDecodeVarint32, i14, registers);
            }
        }
        if (iDecodeVarint33 != i16) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i16;
    }

    private int decodeMapEntryValue(byte[] bArr, int i13, int i14, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i13, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i13));
                return i13 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i13));
                return i13 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i13));
                return i13 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i13));
                return i13 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i13, i14, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i13, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t13, long j13) {
        return UnsafeUtil.getDouble(t13, j13);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i13, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i13);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i13)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i13)) == null) ? ub3 : (UB) filterUnknownEnumMap(i13, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub3, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i13, int i14, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i13));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub3 == null) {
                    ub3 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub3, i14, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e13) {
                    throw new RuntimeException(e13);
                }
            }
        }
        return ub3;
    }

    private static <T> float floatAt(T t13, long j13) {
        return UnsafeUtil.getFloat(t13, j13);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i13) {
        return (Internal.EnumVerifier) this.objects[((i13 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i13) {
        return this.objects[(i13 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i13) {
        int i14 = (i13 / 3) * 2;
        Schema schema = (Schema) this.objects[i14];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i14 + 1]);
        this.objects[i14] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t13) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t13));
    }

    private static <T> int intAt(T t13, long j13) {
        return UnsafeUtil.getInt(t13, j13);
    }

    private static boolean isEnforceUtf8(int i13) {
        return (i13 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t13, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return isFieldPresent(t13, i13);
        }
        return (i15 & i16) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i13) {
        return (i13 & LEGACY_ENUM_IS_CLOSED_MASK) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i13, int i14) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i13));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i14);
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!messageFieldSchema.isInitialized(list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t13, int i13, int i14) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t13, offset(i13)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i14)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t13, T t14, int i13) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i13) & 1048575;
        return UnsafeUtil.getInt(t13, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t14, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t13, int i13, int i14) {
        return UnsafeUtil.getInt(t13, (long) (presenceMaskAndOffsetAt(i14) & 1048575)) == i13;
    }

    private static boolean isRequired(int i13) {
        return (i13 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t13, long j13) {
        return UnsafeUtil.getLong(t13, j13);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0658 A[LOOP:2: B:173:0x0654->B:175:0x0658, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x066d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0673 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0675 A[Catch: all -> 0x0671, TRY_ENTER, TryCatch #0 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0687 A[LOOP:3: B:186:0x0683->B:188:0x0687, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x069c  */
    /* JADX WARN: Code duplicated, block: B:198:0x06b1 A[LOOP:4: B:196:0x06ad->B:198:0x06b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:227:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t13, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        T t14;
        UnknownFieldSchema unknownFieldSchema2;
        int i13;
        Object objFilterMapUnknownEnumValues;
        T t15;
        ExtensionRegistryLite extensionRegistryLite2;
        int i14;
        Object objFilterMapUnknownEnumValues2;
        int i15;
        Object objFilterMapUnknownEnumValues3;
        Object obj;
        UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        T t16 = t13;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        Object builderFromMessage = null;
        Object obj2 = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    t14 = t16;
                    try {
                        int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                        try {
                            switch (type(iTypeAndOffsetAt)) {
                                case 0:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putDouble(t14, offset(iTypeAndOffsetAt), reader.readDouble());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 1:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putFloat(t14, offset(iTypeAndOffsetAt), reader.readFloat());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 2:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader.readInt64());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 3:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader.readUInt64());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 4:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader.readInt32());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 5:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader.readFixed64());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 6:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader.readFixed32());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 7:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putBoolean(t14, offset(iTypeAndOffsetAt), reader.readBool());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 8:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readString(t14, iTypeAndOffsetAt, reader);
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 9:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    MessageLite messageLite = (MessageLite) mutableMessageFieldForMerge(t14, iPositionForFieldNumber);
                                    reader.mergeMessageField(messageLite, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t14, iPositionForFieldNumber, messageLite);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 10:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader.readBytes());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 11:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader.readUInt32());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 12:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    int i16 = reader.readEnum();
                                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i16)) {
                                        UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), i16);
                                        setFieldPresent(t14, iPositionForFieldNumber);
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = SchemaUtil.storeUnknownEnum(t14, fieldNumber, i16, obj, unknownFieldSchema2);
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 13:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader.readSFixed32());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 14:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader.readSFixed64());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 15:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader.readSInt32());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 16:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader.readSInt64());
                                    setFieldPresent(t14, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 17:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    MessageLite messageLite2 = (MessageLite) mutableMessageFieldForMerge(t14, iPositionForFieldNumber);
                                    reader.mergeGroupField(messageLite2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t14, iPositionForFieldNumber, messageLite2);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 18:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readDoubleList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 19:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFloatList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 20:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 21:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 22:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 23:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 24:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case C4007z9.F /* 25 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBoolList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case C4007z9.G /* 26 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readStringList(t14, iTypeAndOffsetAt, reader);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 27:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readMessageList(t13, iTypeAndOffsetAt, reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 28:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBytesList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case C4007z9.I /* 29 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 30:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt));
                                    reader.readEnumList(listMutableListAt);
                                    builderFromMessage = SchemaUtil.filterUnknownEnumList(t13, fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 32:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 33:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case C4007z9.J /* 35 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readDoubleList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFloatList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case C4007z9.K /* 38 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 40:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 42:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBoolList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 43:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt));
                                    reader.readEnumList(listMutableListAt2);
                                    builderFromMessage = SchemaUtil.filterUnknownEnumList(t13, fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 46:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 47:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 48:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 49:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    try {
                                        readGroupList(t13, offset(iTypeAndOffsetAt), reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        builderFromMessage = obj;
                                        try {
                                            if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t14);
                                                }
                                                if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    for (i14 = this.checkInitializedCount; i14 < this.repeatedFieldOffsetStart; i14++) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t13, this.intArray[i14], objFilterMapUnknownEnumValues2, unknownFieldSchema, t13);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!reader.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                for (i15 = this.checkInitializedCount; i15 < this.repeatedFieldOffsetStart; i15++) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t13, this.intArray[i15], objFilterMapUnknownEnumValues3, unknownFieldSchema, t13);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        builderFromMessage = obj;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        for (i13 = this.checkInitializedCount; i13 < this.repeatedFieldOffsetStart; i13++) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 50:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    try {
                                        mergeMap(t13, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, reader);
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                        if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t14);
                                            }
                                            if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                while (i14 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t13, this.intArray[i14], objFilterMapUnknownEnumValues2, unknownFieldSchema, t13);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!reader.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            while (i15 < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t13, this.intArray[i15], objFilterMapUnknownEnumValues3, unknownFieldSchema, t13);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i13 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case ONEOF_TYPE_OFFSET /* 51 */:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Double.valueOf(reader.readDouble()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 52:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Float.valueOf(reader.readFloat()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 53:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader.readInt64()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 54:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader.readUInt64()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 55:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readInt32()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 56:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader.readFixed64()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 57:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readFixed32()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 58:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Boolean.valueOf(reader.readBool()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 59:
                                    readString(t14, iTypeAndOffsetAt, reader);
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 60:
                                    MessageLite messageLite3 = (MessageLite) mutableOneofMessageFieldForMerge(t14, fieldNumber, iPositionForFieldNumber);
                                    reader.mergeMessageField(messageLite3, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                    storeOneofMessageField(t14, fieldNumber, iPositionForFieldNumber, messageLite3);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 61:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader.readBytes());
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 62:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readUInt32()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 63:
                                    int i17 = reader.readEnum();
                                    Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(i17)) {
                                        builderFromMessage = SchemaUtil.storeUnknownEnum(t14, fieldNumber, i17, builderFromMessage, unknownFieldSchema3);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t16 = t14;
                                    }
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(i17));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSFixed32()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSFixed64()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 66:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSInt32()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 67:
                                    UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSInt64()));
                                    setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                case 68:
                                    MessageLite messageLite4 = (MessageLite) mutableOneofMessageFieldForMerge(t14, fieldNumber, iPositionForFieldNumber);
                                    reader.mergeGroupField(messageLite4, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                    storeOneofMessageField(t14, fieldNumber, iPositionForFieldNumber, messageLite4);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                                default:
                                    if (builderFromMessage == null) {
                                        try {
                                            builderFromMessage = unknownFieldSchema3.getBuilderFromMessage(t14);
                                            break;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            extensionRegistryLite2 = extensionRegistryLite3;
                                            unknownFieldSchema2 = unknownFieldSchema3;
                                            if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t14);
                                                }
                                                if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i14 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t13, this.intArray[i14], objFilterMapUnknownEnumValues2, unknownFieldSchema, t13);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!reader.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i15 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t13, this.intArray[i15], objFilterMapUnknownEnumValues3, unknownFieldSchema, t13);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            unknownFieldSchema2 = unknownFieldSchema3;
                                            objFilterMapUnknownEnumValues = builderFromMessage;
                                            while (i13 < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
                                            }
                                            if (objFilterMapUnknownEnumValues != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!unknownFieldSchema3.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                        Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                        for (int i18 = this.checkInitializedCount; i18 < this.repeatedFieldOffsetStart; i18++) {
                                            objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(t13, this.intArray[i18], objFilterMapUnknownEnumValues4, unknownFieldSchema, t13);
                                        }
                                        if (objFilterMapUnknownEnumValues4 != null) {
                                            unknownFieldSchema3.setBuilderToMessage(t14, objFilterMapUnknownEnumValues4);
                                            return;
                                        }
                                        return;
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t16 = t14;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                        for (int i19 = this.checkInitializedCount; i19 < this.repeatedFieldOffsetStart; i19++) {
                            objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(t13, this.intArray[i19], objFilterMapUnknownEnumValues5, unknownFieldSchema, t13);
                        }
                        if (objFilterMapUnknownEnumValues5 != null) {
                            unknownFieldSchema3.setBuilderToMessage(t16, objFilterMapUnknownEnumValues5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objFindExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite3, this.defaultInstance, fieldNumber);
                        if (objFindExtensionByNumber != null) {
                            Object mutableExtensions = obj2 == null ? extensionSchema.getMutableExtensions(t13) : obj2;
                            t15 = t16;
                            try {
                                builderFromMessage = extensionSchema.parseExtension(t13, reader, objFindExtensionByNumber, extensionRegistryLite, mutableExtensions, builderFromMessage, unknownFieldSchema);
                                obj2 = mutableExtensions;
                            } catch (Throwable th7) {
                                th = th7;
                                t14 = t15;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                objFilterMapUnknownEnumValues = builderFromMessage;
                                while (i13 < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                        } else {
                            t15 = t16;
                            if (!unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                if (builderFromMessage == null) {
                                    builderFromMessage = unknownFieldSchema3.getBuilderFromMessage(t15);
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(builderFromMessage, reader, 0)) {
                                }
                            } else if (!reader.skipField()) {
                            }
                        }
                        t16 = t15;
                    } catch (Throwable th8) {
                        th = th8;
                        t14 = t16;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        objFilterMapUnknownEnumValues = builderFromMessage;
                        while (i13 < this.repeatedFieldOffsetStart) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                            unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            while (i13 < this.repeatedFieldOffsetStart) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t13, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema, t13);
            }
            if (objFilterMapUnknownEnumValues != null) {
                unknownFieldSchema2.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
        int i23 = this.checkInitializedCount;
        Object objFilterMapUnknownEnumValues6 = builderFromMessage;
        while (i23 < this.repeatedFieldOffsetStart) {
            objFilterMapUnknownEnumValues6 = filterMapUnknownEnumValues(t13, this.intArray[i23], objFilterMapUnknownEnumValues6, unknownFieldSchema, t13);
            i23++;
            t15 = t15;
        }
        T t17 = t15;
        if (objFilterMapUnknownEnumValues6 != null) {
            unknownFieldSchema3.setBuilderToMessage(t17, objFilterMapUnknownEnumValues6);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i13, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i13));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t13, T t14, int i13) {
        if (isFieldPresent(t14, i13)) {
            long jOffset = offset(typeAndOffsetAt(i13));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t14, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i13) + " is present but null: " + t14);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i13);
            if (!isFieldPresent(t13, i13)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t13, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t13, jOffset, object);
                }
                setFieldPresent(t13, i13);
                return;
            }
            Object object2 = unsafe.getObject(t13, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t13, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t13, T t14, int i13) {
        int iNumberAt = numberAt(i13);
        if (isOneofPresent(t14, iNumberAt, i13)) {
            long jOffset = offset(typeAndOffsetAt(i13));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t14, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i13) + " is present but null: " + t14);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i13);
            if (!isOneofPresent(t13, iNumberAt, i13)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t13, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t13, jOffset, object);
                }
                setOneofPresent(t13, iNumberAt, i13);
                return;
            }
            Object object2 = unsafe.getObject(t13, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t13, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t13, T t14, int i13) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i13);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i13);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putDouble(t13, jOffset, UnsafeUtil.getDouble(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 1:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putFloat(t13, jOffset, UnsafeUtil.getFloat(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 2:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putLong(t13, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 3:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putLong(t13, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 4:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 5:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putLong(t13, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 6:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 7:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putBoolean(t13, jOffset, UnsafeUtil.getBoolean(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 8:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putObject(t13, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 9:
                mergeMessage(t13, t14, i13);
                break;
            case 10:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putObject(t13, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 11:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 12:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 13:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 14:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putLong(t13, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 15:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putInt(t13, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 16:
                if (isFieldPresent(t14, i13)) {
                    UnsafeUtil.putLong(t13, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t13, i13);
                }
                break;
            case 17:
                mergeMessage(t13, t14, i13);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t13, t14, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t13, t14, jOffset);
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t14, iNumberAt, i13)) {
                    UnsafeUtil.putObject(t13, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setOneofPresent(t13, iNumberAt, i13);
                }
                break;
            case 60:
                mergeOneofMessage(t13, t14, i13);
                break;
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
                if (isOneofPresent(t14, iNumberAt, i13)) {
                    UnsafeUtil.putObject(t13, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setOneofPresent(t13, iNumberAt, i13);
                }
                break;
            case 68:
                mergeOneofMessage(t13, t14, i13);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t13, int i13) {
        Schema messageFieldSchema = getMessageFieldSchema(i13);
        long jOffset = offset(typeAndOffsetAt(i13));
        if (!isFieldPresent(t13, i13)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t13, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t13, int i13, int i14) {
        Schema messageFieldSchema = getMessageFieldSchema(i14);
        if (!isOneofPresent(t13, i13, i14)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t13, offset(typeAndOffsetAt(i14)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i13 = 0;
        int i14 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i13++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i14++;
            }
        }
        int[] iArr2 = i13 > 0 ? new int[i13] : null;
        int[] iArr3 = i14 > 0 ? new int[i14] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i15 < fields.length) {
            FieldInfo fieldInfo2 = fields[i15];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i16, objArr);
            if (i17 < checkInitialized.length && checkInitialized[i17] == fieldNumber3) {
                checkInitialized[i17] = i16;
                i17++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i18] = i16;
                i18++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i19] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i19++;
                }
                i15++;
                i16 += 3;
            }
            i15++;
            i16 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0264  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i13;
        int iCharAt;
        int iCharAt2;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int i19;
        char cCharAt;
        int i23;
        char cCharAt2;
        int i24;
        char cCharAt3;
        int i25;
        char cCharAt4;
        int i26;
        char cCharAt5;
        int i27;
        char cCharAt6;
        int i28;
        char cCharAt7;
        int i29;
        char cCharAt8;
        int i33;
        int i34;
        int i35;
        int i36;
        int iObjectFieldOffset;
        int i37;
        int i38;
        int iObjectFieldOffset2;
        java.lang.reflect.Field fieldReflectField;
        int i39;
        char cCharAt9;
        int i43;
        int i44;
        int i45;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i46;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i47;
        char cCharAt10;
        int i48;
        char cCharAt11;
        int i49;
        char cCharAt12;
        int i53;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c13 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i54 = 1;
            while (true) {
                i13 = i54 + 1;
                if (stringInfo.charAt(i54) < 55296) {
                    break;
                }
                i54 = i13;
            }
        } else {
            i13 = 1;
        }
        int i55 = i13 + 1;
        int iCharAt3 = stringInfo.charAt(i13);
        if (iCharAt3 >= 55296) {
            int i56 = iCharAt3 & 8191;
            int i57 = 13;
            while (true) {
                i53 = i55 + 1;
                cCharAt13 = stringInfo.charAt(i55);
                if (cCharAt13 < 55296) {
                    break;
                }
                i56 |= (cCharAt13 & 8191) << i57;
                i57 += 13;
                i55 = i53;
            }
            iCharAt3 = i56 | (cCharAt13 << i57);
            i55 = i53;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i17 = 0;
            i18 = 0;
            i14 = 0;
            i16 = 0;
            iArr = EMPTY_INT_ARRAY;
            i15 = 0;
        } else {
            int i58 = i55 + 1;
            int iCharAt4 = stringInfo.charAt(i55);
            if (iCharAt4 >= 55296) {
                int i59 = iCharAt4 & 8191;
                int i63 = 13;
                while (true) {
                    i29 = i58 + 1;
                    cCharAt8 = stringInfo.charAt(i58);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt8 & 8191) << i63;
                    i63 += 13;
                    i58 = i29;
                }
                iCharAt4 = i59 | (cCharAt8 << i63);
                i58 = i29;
            }
            int i64 = i58 + 1;
            int iCharAt5 = stringInfo.charAt(i58);
            if (iCharAt5 >= 55296) {
                int i65 = iCharAt5 & 8191;
                int i66 = 13;
                while (true) {
                    i28 = i64 + 1;
                    cCharAt7 = stringInfo.charAt(i64);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt7 & 8191) << i66;
                    i66 += 13;
                    i64 = i28;
                }
                iCharAt5 = i65 | (cCharAt7 << i66);
                i64 = i28;
            }
            int i67 = i64 + 1;
            int iCharAt6 = stringInfo.charAt(i64);
            if (iCharAt6 >= 55296) {
                int i68 = iCharAt6 & 8191;
                int i69 = 13;
                while (true) {
                    i27 = i67 + 1;
                    cCharAt6 = stringInfo.charAt(i67);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt6 & 8191) << i69;
                    i69 += 13;
                    i67 = i27;
                }
                iCharAt6 = i68 | (cCharAt6 << i69);
                i67 = i27;
            }
            int i73 = i67 + 1;
            int iCharAt7 = stringInfo.charAt(i67);
            if (iCharAt7 >= 55296) {
                int i74 = iCharAt7 & 8191;
                int i75 = 13;
                while (true) {
                    i26 = i73 + 1;
                    cCharAt5 = stringInfo.charAt(i73);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt5 & 8191) << i75;
                    i75 += 13;
                    i73 = i26;
                }
                iCharAt7 = i74 | (cCharAt5 << i75);
                i73 = i26;
            }
            int i76 = i73 + 1;
            iCharAt = stringInfo.charAt(i73);
            if (iCharAt >= 55296) {
                int i77 = iCharAt & 8191;
                int i78 = 13;
                while (true) {
                    i25 = i76 + 1;
                    cCharAt4 = stringInfo.charAt(i76);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt4 & 8191) << i78;
                    i78 += 13;
                    i76 = i25;
                }
                iCharAt = i77 | (cCharAt4 << i78);
                i76 = i25;
            }
            int i79 = i76 + 1;
            iCharAt2 = stringInfo.charAt(i76);
            if (iCharAt2 >= 55296) {
                int i83 = iCharAt2 & 8191;
                int i84 = 13;
                while (true) {
                    i24 = i79 + 1;
                    cCharAt3 = stringInfo.charAt(i79);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt3 & 8191) << i84;
                    i84 += 13;
                    i79 = i24;
                }
                iCharAt2 = i83 | (cCharAt3 << i84);
                i79 = i24;
            }
            int i85 = i79 + 1;
            int iCharAt8 = stringInfo.charAt(i79);
            if (iCharAt8 >= 55296) {
                int i86 = iCharAt8 & 8191;
                int i87 = 13;
                while (true) {
                    i23 = i85 + 1;
                    cCharAt2 = stringInfo.charAt(i85);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt2 & 8191) << i87;
                    i87 += 13;
                    i85 = i23;
                }
                iCharAt8 = i86 | (cCharAt2 << i87);
                i85 = i23;
            }
            int i88 = i85 + 1;
            int iCharAt9 = stringInfo.charAt(i85);
            if (iCharAt9 >= 55296) {
                int i89 = iCharAt9 & 8191;
                int i93 = 13;
                while (true) {
                    i19 = i88 + 1;
                    cCharAt = stringInfo.charAt(i88);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i89 |= (cCharAt & 8191) << i93;
                    i93 += 13;
                    i88 = i19;
                }
                iCharAt9 = i89 | (cCharAt << i93);
                i88 = i19;
            }
            i14 = (iCharAt4 * 2) + iCharAt5;
            i15 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i16 = iCharAt9;
            i55 = i88;
            i17 = iCharAt6;
            i18 = iCharAt7;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i94 = i16 + iCharAt2;
        int i95 = i16;
        int i96 = i94;
        int i97 = 0;
        int i98 = 0;
        while (i55 < length) {
            int i99 = i55 + 1;
            int iCharAt10 = stringInfo.charAt(i55);
            if (iCharAt10 >= c13) {
                int i100 = iCharAt10 & 8191;
                int i101 = i99;
                int i102 = 13;
                while (true) {
                    i49 = i101 + 1;
                    cCharAt12 = stringInfo.charAt(i101);
                    if (cCharAt12 < c13) {
                        break;
                    }
                    i100 |= (cCharAt12 & 8191) << i102;
                    i102 += 13;
                    i101 = i49;
                }
                iCharAt10 = i100 | (cCharAt12 << i102);
                i33 = i49;
            } else {
                i33 = i99;
            }
            int i103 = i33 + 1;
            int iCharAt11 = stringInfo.charAt(i33);
            if (iCharAt11 >= c13) {
                int i104 = iCharAt11 & 8191;
                int i105 = i103;
                int i106 = 13;
                while (true) {
                    i48 = i105 + 1;
                    cCharAt11 = stringInfo.charAt(i105);
                    if (cCharAt11 < c13) {
                        break;
                    }
                    i104 |= (cCharAt11 & 8191) << i106;
                    i106 += 13;
                    i105 = i48;
                }
                iCharAt11 = i104 | (cCharAt11 << i106);
                i34 = i48;
            } else {
                i34 = i103;
            }
            int i107 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i108 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i97] = i98;
                i97++;
            }
            int i109 = i97;
            if (i107 >= ONEOF_TYPE_OFFSET) {
                int i110 = i34 + 1;
                int iCharAt12 = stringInfo.charAt(i34);
                char c14 = 55296;
                if (iCharAt12 >= 55296) {
                    int i111 = iCharAt12 & 8191;
                    int i112 = 13;
                    while (true) {
                        i47 = i110 + 1;
                        cCharAt10 = stringInfo.charAt(i110);
                        if (cCharAt10 < c14) {
                            break;
                        }
                        i111 |= (cCharAt10 & 8191) << i112;
                        i112 += 13;
                        i110 = i47;
                        c14 = 55296;
                    }
                    iCharAt12 = i111 | (cCharAt10 << i112);
                    i110 = i47;
                }
                int i113 = i107 - 51;
                int i114 = i110;
                if (i113 == 9 || i113 == 17) {
                    i44 = i14 + 1;
                    objArr[((i98 / 3) * 2) + 1] = objects[i14];
                } else {
                    if (i113 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0)) {
                        i44 = i14 + 1;
                        objArr[((i98 / 3) * 2) + 1] = objects[i14];
                    }
                    i45 = iCharAt12 * 2;
                    obj = objects[i45];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i45] = fieldReflectField2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i46 = i45 + 1;
                    obj2 = objects[i46];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i46] = fieldReflectField3;
                    }
                    i36 = i18;
                    i35 = i14;
                    i37 = i114;
                    stringInfo = stringInfo;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i38 = 0;
                }
                i14 = i44;
                i45 = iCharAt12 * 2;
                obj = objects[i45];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i45] = fieldReflectField2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i46 = i45 + 1;
                obj2 = objects[i46];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i46] = fieldReflectField3;
                }
                i36 = i18;
                i35 = i14;
                i37 = i114;
                stringInfo = stringInfo;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i38 = 0;
            } else {
                i35 = i14 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i14]);
                if (i107 == 9 || i107 == 17) {
                    i36 = i18;
                    objArr[((i98 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i107 == 27 || i107 == 49) {
                        i36 = i18;
                        i43 = i14 + 2;
                        objArr[((i98 / 3) * 2) + 1] = objects[i35];
                    } else if (i107 == 12 || i107 == 30 || i107 == 44) {
                        i36 = i18;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                            i43 = i14 + 2;
                            objArr[((i98 / 3) * 2) + 1] = objects[i35];
                        }
                    } else {
                        if (i107 == 50) {
                            int i115 = i95 + 1;
                            iArr[i95] = i98;
                            int i116 = (i98 / 3) * 2;
                            int i117 = i14 + 2;
                            objArr[i116] = objects[i35];
                            if ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                                i35 = i14 + 3;
                                objArr[i116 + 1] = objects[i117];
                                i95 = i115;
                            } else {
                                i95 = i115;
                                i35 = i117;
                            }
                        }
                        i36 = i18;
                    }
                    i35 = i43;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) == 0 || i107 > 17) {
                    iObjectFieldOffset = 1048575;
                    i37 = i34;
                    i38 = 0;
                } else {
                    i37 = i34 + 1;
                    int iCharAt13 = stringInfo.charAt(i34);
                    if (iCharAt13 >= 55296) {
                        int i118 = iCharAt13 & 8191;
                        int i119 = 13;
                        while (true) {
                            i39 = i37 + 1;
                            cCharAt9 = stringInfo.charAt(i37);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i118 |= (cCharAt9 & 8191) << i119;
                            i119 += 13;
                            i37 = i39;
                        }
                        iCharAt13 = i118 | (cCharAt9 << i119);
                        i37 = i39;
                    }
                    int i120 = (i15 * 2) + (iCharAt13 / 32);
                    Object obj3 = objects[i120];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldReflectField = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldReflectField = reflectField(cls, (String) obj3);
                        objects[i120] = fieldReflectField;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField);
                    i38 = iCharAt13 % 32;
                }
                if (i107 >= 18 && i107 <= 49) {
                    iArr[i96] = iObjectFieldOffset3;
                    i96++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i121 = i98 + 1;
            iArr2[i98] = iCharAt10;
            int i122 = i98 + 2;
            int i123 = i15;
            iArr2[i121] = iObjectFieldOffset2 | (i107 << 20) | ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0 ? LEGACY_ENUM_IS_CLOSED_MASK : 0);
            i98 += 3;
            iArr2[i122] = iObjectFieldOffset | (i38 << 20);
            i55 = i37;
            stringInfo = stringInfo;
            i14 = i35;
            length = i108;
            i18 = i36;
            i97 = i109;
            i15 = i123;
            i17 = i17;
            c13 = 55296;
        }
        return new MessageSchema<>(iArr2, objArr, i17, i18, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i16, i94, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i13) {
        return this.buffer[i13];
    }

    private static long offset(int i13) {
        return i13 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t13, long j13) {
        return ((Boolean) UnsafeUtil.getObject(t13, j13)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t13, long j13) {
        return ((Double) UnsafeUtil.getObject(t13, j13)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t13, long j13) {
        return ((Float) UnsafeUtil.getObject(t13, j13)).floatValue();
    }

    private static <T> int oneofIntAt(T t13, long j13) {
        return ((Integer) UnsafeUtil.getObject(t13, j13)).intValue();
    }

    private static <T> long oneofLongAt(T t13, long j13) {
        return ((Long) UnsafeUtil.getObject(t13, j13)).longValue();
    }

    private <K, V> int parseMapField(T t13, byte[] bArr, int i13, int i14, int i15, long j13, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i15);
        Object object = unsafe.getObject(t13, j13);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t13, j13, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i13, i14, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t13, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, int i23, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j14 = this.buffer[i23 + 2] & 1048575;
        switch (i19) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(t13, j13, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i13)));
                int i24 = i13 + 8;
                unsafe.putInt(t13, j14, i16);
                return i24;
            case 52:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(t13, j13, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i13)));
                int i25 = i13 + 4;
                unsafe.putInt(t13, j14, i16);
                return i25;
            case 53:
            case 54:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                unsafe.putObject(t13, j13, Long.valueOf(registers.long1));
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                unsafe.putObject(t13, j13, Integer.valueOf(registers.int1));
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint32;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i17 != 1) {
                    return i13;
                }
                unsafe.putObject(t13, j13, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i13)));
                int i26 = i13 + 8;
                unsafe.putInt(t13, j14, i16);
                return i26;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i17 != 5) {
                    return i13;
                }
                unsafe.putObject(t13, j13, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i13)));
                int i27 = i13 + 4;
                unsafe.putInt(t13, j14, i16);
                return i27;
            case 58:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                unsafe.putObject(t13, j13, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint65;
            case 59:
                if (i17 != 2) {
                    return i13;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                int i28 = registers.int1;
                if (i28 == 0) {
                    unsafe.putObject(t13, j13, "");
                } else {
                    if ((i18 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i28)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t13, j13, new String(bArr, iDecodeVarint33, i28, Internal.UTF_8));
                    iDecodeVarint33 += i28;
                }
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint33;
            case 60:
                if (i17 != 2) {
                    return i13;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t13, i16, i23);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i23), bArr, i13, i14, registers);
                storeOneofMessageField(t13, i16, i23, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i17 != 2) {
                    return i13;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i13, registers);
                unsafe.putObject(t13, j13, registers.object1);
                unsafe.putInt(t13, j14, i16);
                return iDecodeBytes;
            case 63:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                int i29 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i23);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i29)) {
                    unsafe.putObject(t13, j13, Integer.valueOf(i29));
                    unsafe.putInt(t13, j14, i16);
                } else {
                    getMutableUnknownFields(t13).storeField(i15, Long.valueOf(i29));
                }
                return iDecodeVarint34;
            case 66:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i13, registers);
                unsafe.putObject(t13, j13, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint35;
            case 67:
                if (i17 != 0) {
                    return i13;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i13, registers);
                unsafe.putObject(t13, j13, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t13, j14, i16);
                return iDecodeVarint66;
            case 68:
                if (i17 != 3) {
                    return i13;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t13, i16, i23);
                int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i23), bArr, i13, i14, (i15 & (-8)) | 4, registers);
                storeOneofMessageField(t13, i16, i23, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i13;
        }
    }

    private int parseRepeatedField(T t13, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, long j13, int i19, long j14, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t13, j14);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t13, j14, protobufListMutableCopyWithCapacity2);
        }
        switch (i19) {
            case 18:
            case C4007z9.J /* 35 */:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 1 ? ArrayDecoders.decodeDoubleList(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 5 ? ArrayDecoders.decodeFloatList(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 0 ? ArrayDecoders.decodeVarint64List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 22:
            case C4007z9.I /* 29 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 0 ? ArrayDecoders.decodeVarint32List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 1 ? ArrayDecoders.decodeFixed64List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 5 ? ArrayDecoders.decodeFixed32List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case C4007z9.F /* 25 */:
            case 42:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 0 ? ArrayDecoders.decodeBoolList(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case C4007z9.G /* 26 */:
                if (i17 == 2) {
                    return (j13 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers);
                }
                return i13;
            case 27:
                return i17 == 2 ? ArrayDecoders.decodeMessageList(getMessageFieldSchema(i18), i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 28:
                return i17 == 2 ? ArrayDecoders.decodeBytesList(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i17 == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (i17 != 0) {
                        return i13;
                    }
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) t13, i16, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i18), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 0 ? ArrayDecoders.decodeSInt32List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i17 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i13, protobufListMutableCopyWithCapacity2, registers);
                }
                return i17 == 0 ? ArrayDecoders.decodeSInt64List(i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            case 49:
                return i17 == 3 ? ArrayDecoders.decodeGroupList(getMessageFieldSchema(i18), i15, bArr, i13, i14, protobufListMutableCopyWithCapacity2, registers) : i13;
            default:
                return i13;
        }
    }

    private int positionForFieldNumber(int i13) {
        if (i13 < this.minFieldNumber || i13 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i13, 0);
    }

    private int presenceMaskAndOffsetAt(int i13) {
        return this.buffer[i13 + 2];
    }

    private <E> void readGroupList(Object obj, long j13, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j13), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i13, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i13)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i13, Reader reader) throws IOException {
        if (isEnforceUtf8(i13)) {
            UnsafeUtil.putObject(obj, offset(i13), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i13), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i13), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i13, Reader reader) throws IOException {
        if (isEnforceUtf8(i13)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i13)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i13)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t13, int i13) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i13);
        long j13 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j13 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t13, j13, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t13, j13));
    }

    private void setOneofPresent(T t13, int i13, int i14) {
        UnsafeUtil.putInt(t13, presenceMaskAndOffsetAt(i14) & 1048575, i13);
    }

    private int slowPositionForFieldNumber(int i13, int i14) {
        int length = (this.buffer.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int iNumberAt = numberAt(i16);
            if (i13 == iNumberAt) {
                return i16;
            }
            if (i13 < iNumberAt) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i13, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i14;
        Class<?> messageFieldClass;
        int i15;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i13] = fieldInfo.getFieldNumber();
            int i16 = i13 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i14 = ENFORCE_UTF8_MASK;
            } else {
                i14 = 0;
            }
            iArr[i16] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i14 | (iId << 20) | iObjectFieldOffset;
            iArr[i13 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i13 / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i13 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i15 = (i13 / 3) * 2;
            objArr[i15] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i15 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i15 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + ONEOF_TYPE_OFFSET;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i13] = fieldInfo.getFieldNumber();
        int i17 = i13 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i14 = ENFORCE_UTF8_MASK;
        } else {
            i14 = 0;
        }
        iArr[i17] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i14 | (iId << 20) | iObjectFieldOffset;
        iArr[i13 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i13 / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[((i13 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i15 = (i13 / 3) * 2;
        objArr[i15] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i15 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i15 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t13, int i13, Object obj) {
        UNSAFE.putObject(t13, offset(typeAndOffsetAt(i13)), obj);
        setFieldPresent(t13, i13);
    }

    private void storeOneofMessageField(T t13, int i13, int i14, Object obj) {
        UNSAFE.putObject(t13, offset(typeAndOffsetAt(i14)), obj);
        setOneofPresent(t13, i13, i14);
    }

    private static int type(int i13) {
        return (i13 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i13) {
        return this.buffer[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t13, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i13;
        Map.Entry<?, ?> entry2;
        int i14;
        int i15;
        Map.Entry<?, ?> entry3;
        boolean z13;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t13);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i19 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i19);
            int iNumberAt = numberAt(i19);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i23 = this.buffer[i19 + 2];
                int i24 = i23 & i16;
                if (i24 != i17) {
                    i18 = i24 == i16 ? 0 : unsafe.getInt(t13, i24);
                    i17 = i24;
                } else {
                    entry = entry;
                }
                int i25 = 1 << (i23 >>> 20);
                i13 = i17;
                i14 = i25;
                entry2 = entry;
            } else {
                i13 = i17;
                entry2 = entry;
                i14 = 0;
            }
            int i26 = i18;
            while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeDouble(iNumberAt, doubleAt(t13, jOffset));
                    }
                    break;
                case 1:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeFloat(iNumberAt, floatAt(t13, jOffset));
                    }
                    break;
                case 2:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t13, jOffset));
                    }
                    break;
                case 3:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t13, jOffset));
                    }
                    break;
                case 4:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 5:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t13, jOffset));
                    }
                    break;
                case 6:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 7:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeBool(iNumberAt, booleanAt(t13, jOffset));
                    }
                    break;
                case 8:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writeString(iNumberAt, unsafe.getObject(t13, jOffset), writer);
                    }
                    break;
                case 9:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    }
                    break;
                case 10:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t13, jOffset));
                    }
                    break;
                case 11:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 12:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 13:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 14:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t13, jOffset));
                    }
                    break;
                case 15:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t13, jOffset));
                    }
                    break;
                case 16:
                    i15 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t13, jOffset));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    i15 = length;
                    if (isFieldPresent(t13, i19, i13, i26, i14)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    }
                    break;
                case 18:
                    z13 = false;
                    SchemaUtil.writeDoubleList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z13 = false;
                    SchemaUtil.writeFloatList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z13 = false;
                    SchemaUtil.writeInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z13 = false;
                    SchemaUtil.writeUInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z13 = false;
                    SchemaUtil.writeInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z13 = false;
                    SchemaUtil.writeFixed64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z13 = false;
                    SchemaUtil.writeFixed32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case C4007z9.F /* 25 */:
                    z13 = false;
                    SchemaUtil.writeBoolList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case C4007z9.G /* 26 */:
                    SchemaUtil.writeStringList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, getMessageFieldSchema(i19));
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case C4007z9.I /* 29 */:
                    z13 = false;
                    SchemaUtil.writeUInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    z13 = false;
                    SchemaUtil.writeEnumList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z13 = false;
                    SchemaUtil.writeSFixed32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 32:
                    z13 = false;
                    SchemaUtil.writeSFixed64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 33:
                    z13 = false;
                    SchemaUtil.writeSInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z13 = false;
                    SchemaUtil.writeSInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, false);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case C4007z9.J /* 35 */:
                    SchemaUtil.writeDoubleList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    SchemaUtil.writeFloatList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    SchemaUtil.writeInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case C4007z9.K /* 38 */:
                    SchemaUtil.writeUInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    SchemaUtil.writeInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    SchemaUtil.writeFixed32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    SchemaUtil.writeEnumList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    SchemaUtil.writeSFixed32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, true);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i19), (List) unsafe.getObject(t13, jOffset), writer, getMessageFieldSchema(i19));
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t13, jOffset), i19);
                    i15 = length;
                    entry3 = entry2;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 54:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writeString(iNumberAt, unsafe.getObject(t13, jOffset), writer);
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t13, jOffset));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    }
                    i15 = length;
                    entry3 = entry2;
                    break;
                default:
                    i15 = length;
                    entry3 = entry2;
                    break;
            }
            i19 += 3;
            i17 = i13;
            entry = entry3;
            i18 = i26;
            length = i15;
            i16 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t13, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t13, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t13, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t13);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t13, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t13, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t13, length)) {
                        writer.writeInt64(iNumberAt, longAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t13, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t13, length)) {
                        writer.writeInt32(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t13, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t13, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t13, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t13, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t13, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t13, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t13, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t13, length)) {
                        writer.writeEnum(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t13, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t13, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t13, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t13, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t13, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case C4007z9.F /* 25 */:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case C4007z9.G /* 26 */:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer);
                    break;
                case C4007z9.I /* 29 */:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case C4007z9.J /* 35 */:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case C4007z9.K /* 38 */:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), length);
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t13, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t13, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t13, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i13, Object obj, int i14) throws IOException {
        if (obj != null) {
            writer.writeMap(i13, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i14)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i13, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i13, (String) obj);
        } else {
            writer.writeBytes(i13, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t13, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t13), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t13, T t14) {
        int length = this.buffer.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            if (!equals(t13, t14, i13)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t13).equals(this.unknownFieldSchema.getFromMessage(t14))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t13).equals(this.extensionSchema.getExtensions(t14));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[PHI: r12
      0x0079: PHI (r12v4 int) = 
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v8 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v1 int)
      (r12v9 int)
      (r12v1 int)
     binds: [B:21:0x0060, B:225:0x0560, B:222:0x054a, B:216:0x0522, B:213:0x0503, B:210:0x04e6, B:207:0x04cb, B:204:0x04b0, B:201:0x0498, B:198:0x0482, B:195:0x0468, B:192:0x044d, B:189:0x042c, B:165:0x032e, B:159:0x0310, B:153:0x02f2, B:147:0x02d4, B:141:0x02b6, B:135:0x0298, B:129:0x027a, B:123:0x025c, B:117:0x023e, B:111:0x0221, B:105:0x0204, B:99:0x01e7, B:93:0x01ca, B:86:0x01aa, B:81:0x0176, B:78:0x016a, B:75:0x015a, B:72:0x014a, B:69:0x013a, B:66:0x012e, B:63:0x0122, B:60:0x0116, B:54:0x00f8, B:51:0x00e5, B:48:0x00d4, B:45:0x00c5, B:42:0x00b6, B:40:0x00b0, B:38:0x00a9, B:35:0x009e, B:32:0x008f, B:29:0x0080, B:26:0x0078, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t13) {
        int i13;
        int i14;
        int i15;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z13;
        int iComputeSizeFixed32List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        while (i19 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i19);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i19);
            int i24 = this.buffer[i19 + 2];
            int i25 = i24 & i16;
            if (iType <= 17) {
                if (i25 != i17) {
                    i18 = i25 == i16 ? 0 : unsafe.getInt(t13, i25);
                    i17 = i25;
                }
                i13 = i17;
                i14 = i18;
                i15 = 1 << (i24 >>> 20);
            } else {
                i13 = i17;
                i14 = i18;
                i15 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i25 = 0;
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t13, jOffset));
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t13, jOffset));
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t13, jOffset));
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i23 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        Object object = unsafe.getObject(t13, jOffset);
                        iComputeBoolSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t13, i19, i13, i14, i15)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeBoolSize;
                    break;
                case 19:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 20:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 21:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 22:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 23:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 24:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case C4007z9.F /* 25 */:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case C4007z9.G /* 26 */:
                    iComputeBoolSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t13, jOffset));
                    i23 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    i23 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t13, jOffset));
                    i23 += iComputeBoolSize;
                    break;
                case C4007z9.I /* 29 */:
                    iComputeBoolSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeBoolSize;
                    break;
                case 30:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 32:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case 33:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z13 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t13, jOffset), false);
                    i23 += iComputeSizeFixed32List;
                    break;
                case C4007z9.J /* 35 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case C4007z9.K /* 38 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t13, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t13, i25, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                    i23 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t13, jOffset), getMapFieldDefaultEntry(i19));
                    i23 += iComputeBoolSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        Object object2 = unsafe.getObject(t13, jOffset);
                        iComputeBoolSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i23 += iComputeSFixed32Size;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t13, jOffset));
                        i23 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t13, iNumberAt, i19)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t13, jOffset), getMessageFieldSchema(i19));
                        i23 += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i19 += 3;
            i17 = i13;
            i18 = i14;
            i16 = 1048575;
        }
        int unknownFieldsSerializedSize = i23 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t13);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t13).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t13) {
        int i13;
        int iHashLong;
        int length = this.buffer.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int iNumberAt = numberAt(i15);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t13, jOffset)));
                    i14 = i13 + iHashLong;
                    break;
                case 1:
                    i13 = i14 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 2:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 3:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 5:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 7:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 8:
                    i13 = i14 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t13, jOffset)).hashCode();
                    i14 = i13 + iHashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t13, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                    i14 = i13 + iHashLong;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 14:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getInt(t13, jOffset);
                    i14 = i13 + iHashLong;
                    break;
                case 16:
                    i13 = i14 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t13, jOffset));
                    i14 = i13 + iHashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t13, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                case 28:
                case C4007z9.I /* 29 */:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case C4007z9.J /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case C4007z9.K /* 38 */:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                    i14 = i13 + iHashLong;
                    break;
                case 50:
                    i13 = i14 * 53;
                    iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                    i14 = i13 + iHashLong;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t13, jOffset)));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t13, jOffset)).hashCode();
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = oneofIntAt(t13, jOffset);
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t13, jOffset));
                        i14 = i13 + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t13, iNumberAt, i15)) {
                        i13 = i14 * 53;
                        iHashLong = UnsafeUtil.getObject(t13, jOffset).hashCode();
                        i14 = i13 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i14 * 53) + this.unknownFieldSchema.getFromMessage(t13).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t13).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t13) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.checkInitializedCount) {
            int i18 = this.intArray[i17];
            int iNumberAt = numberAt(i18);
            int iTypeAndOffsetAt = typeAndOffsetAt(i18);
            int i19 = this.buffer[i18 + 2];
            int i23 = i19 & 1048575;
            int i24 = 1 << (i19 >>> 20);
            if (i23 != i15) {
                if (i23 != 1048575) {
                    i16 = UNSAFE.getInt(t13, i23);
                }
                i14 = i16;
                i13 = i23;
            } else {
                i13 = i15;
                i14 = i16;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t13, i18, i13, i14, i24)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t13, i18, i13, i14, i24) && !isInitialized(t13, iTypeAndOffsetAt, getMessageFieldSchema(i18))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t13, iTypeAndOffsetAt, i18)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t13, iNumberAt, i18) && !isInitialized(t13, iTypeAndOffsetAt, getMessageFieldSchema(i18))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t13, iTypeAndOffsetAt, i18)) {
                    return false;
                }
            } else if (!isListInitialized(t13, iTypeAndOffsetAt, i18)) {
                return false;
            }
            i17++;
            i15 = i13;
            i16 = i14;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t13).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t13) {
        if (isMutable(t13)) {
            if (t13 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t13;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i13);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t13, i13)) {
                                    getMessageFieldSchema(i13).makeImmutable(UNSAFE.getObject(t13, jOffset));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case C4007z9.F /* 25 */:
                            case C4007z9.G /* 26 */:
                            case 27:
                            case 28:
                            case C4007z9.I /* 29 */:
                            case 30:
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case C4007z9.J /* 35 */:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case C4007z9.K /* 38 */:
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case 42:
                            case 43:
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t13, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t13, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t13, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t13, numberAt(i13), i13)) {
                        getMessageFieldSchema(i13).makeImmutable(UNSAFE.getObject(t13, jOffset));
                    }
                } else if (isFieldPresent(t13, i13)) {
                    getMessageFieldSchema(i13).makeImmutable(UNSAFE.getObject(t13, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t13);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t13);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t13, T t14) {
        checkMutable(t13);
        t14.getClass();
        for (int i13 = 0; i13 < this.buffer.length; i13 += 3) {
            mergeSingleField(t13, t14, i13);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t13, t14);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t13, t14);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0372 A[PHI: r0 r18 r24 r25 r26 r27
      0x0372: PHI (r0v33 int) = (r0v28 int), (r0v31 int), (r0v35 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r24v2 int) = (r24v0 int), (r24v0 int), (r24v4 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r25v5 int) = (r25v3 int), (r25v3 int), (r25v6 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r26v6 int) = (r26v4 int), (r26v4 int), (r26v7 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r27v7 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x038c A[PHI: r0 r18 r24 r25 r26 r27
      0x038c: PHI (r0v32 int) = (r0v28 int), (r0v31 int), (r0v35 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r24v1 int) = (r24v0 int), (r24v0 int), (r24v4 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r25v4 int) = (r25v3 int), (r25v3 int), (r25v6 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r26v5 int) = (r26v4 int), (r26v4 int), (r26v7 int) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r27v6 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:128:0x03e3, B:124:0x03c2, B:114:0x0370] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0095. Please report as an issue. */
    @CanIgnoreReturnValue
    int parseMessage(T t13, byte[] bArr, int i13, int i14, int i15, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i16;
        int i17;
        int i18;
        int i19;
        T t14;
        int i23;
        int iDecodeVarint32;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        int i36;
        byte[] bArr2;
        int i37;
        ArrayDecoders.Registers registers2;
        MessageSchema<T> messageSchema2 = this;
        t13 = t13;
        bArr = bArr;
        i14 = i14;
        registers = registers;
        checkMutable(t13);
        Unsafe unsafe2 = UNSAFE;
        int i38 = -1;
        int iDecodeUnknownField = i13;
        int i39 = -1;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i14) {
                int i47 = iDecodeUnknownField + 1;
                byte b13 = bArr[iDecodeUnknownField];
                if (b13 < 0) {
                    iDecodeVarint32 = ArrayDecoders.decodeVarint32(b13, bArr, i47, registers);
                    i23 = registers.int1;
                } else {
                    i23 = b13;
                    iDecodeVarint32 = i47;
                }
                int i48 = i23 >>> 3;
                int i49 = i23 & 7;
                int iPositionForFieldNumber = i48 > i39 ? messageSchema2.positionForFieldNumber(i48, i43 / 3) : messageSchema2.positionForFieldNumber(i48);
                if (iPositionForFieldNumber == i38) {
                    i24 = i48;
                    i25 = iDecodeVarint32;
                    i26 = i45;
                    i27 = i46;
                    i28 = i38;
                    unsafe = unsafe2;
                    i29 = 0;
                    i15 = i15;
                    i17 = i23;
                } else {
                    int i53 = messageSchema2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i53);
                    long jOffset = offset(i53);
                    int i54 = i23;
                    if (iType <= 17) {
                        int i55 = messageSchema2.buffer[iPositionForFieldNumber + 2];
                        int i56 = 1 << (i55 >>> 20);
                        int i57 = 1048575;
                        int i58 = i55 & 1048575;
                        if (i58 != i46) {
                            if (i46 != 1048575) {
                                unsafe2.putInt(t13, i46, i45);
                                i57 = 1048575;
                            }
                            i45 = i58 == i57 ? 0 : unsafe2.getInt(t13, i58);
                        } else {
                            i58 = i46;
                        }
                        int i59 = i45;
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i58 = i58;
                                i36 = i54;
                                i37 = iDecodeVarint32;
                                if (i49 == 1) {
                                    UnsafeUtil.putDouble(t13, jOffset, ArrayDecoders.decodeDouble(bArr2, i37));
                                    iDecodeUnknownField = i37 + 8;
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr2;
                                } else {
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                registers = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i58 = i58;
                                i36 = i54;
                                i37 = iDecodeVarint32;
                                if (i49 == 5) {
                                    UnsafeUtil.putFloat(t13, jOffset, ArrayDecoders.decodeFloat(bArr2, i37));
                                    iDecodeUnknownField = i37 + 4;
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr2;
                                } else {
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 2:
                            case 3:
                                registers = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i58 = i58;
                                i36 = i54;
                                i37 = iDecodeVarint32;
                                if (i49 == 0) {
                                    int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i37, registers);
                                    unsafe2.putLong(t13, jOffset, registers.long1);
                                    int i63 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr;
                                    i45 = i63;
                                    iDecodeUnknownField = iDecodeVarint64;
                                } else {
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                registers = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i58 = i58;
                                i36 = i54;
                                i37 = iDecodeVarint32;
                                if (i49 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i37, registers);
                                    unsafe2.putInt(t13, jOffset, registers.int1);
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr2;
                                } else {
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 1) {
                                    i58 = i58;
                                    i37 = iDecodeVarint32;
                                    unsafe2.putLong(t13, jOffset, ArrayDecoders.decodeFixed64(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = i37 + 8;
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr2;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                registers = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 5) {
                                    unsafe2.putInt(t13, jOffset, ArrayDecoders.decodeFixed32(bArr2, iDecodeVarint32));
                                    iDecodeUnknownField = iDecodeVarint32 + 4;
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    bArr = bArr2;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 7:
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 0) {
                                    int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers2);
                                    UnsafeUtil.putBoolean(t13, jOffset, registers2.long1 != 0);
                                    int i64 = i59 | i56;
                                    registers = registers2;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i64;
                                    bArr = bArr;
                                    iDecodeUnknownField = iDecodeVarint65;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i53) ? ArrayDecoders.decodeStringRequireUtf8(bArr2, iDecodeVarint32, registers2) : ArrayDecoders.decodeString(bArr2, iDecodeVarint32, registers2);
                                    unsafe2.putObject(t13, jOffset, registers2.object1);
                                    int i65 = i59 | i56;
                                    registers = registers2;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i65;
                                    bArr = bArr2;
                                    i39 = i24;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 2) {
                                    Object objMutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t13, i35);
                                    iDecodeUnknownField = ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i35), bArr, iDecodeVarint32, i14, registers);
                                    messageSchema2.storeMessageField(t13, i35, objMutableMessageFieldForMerge);
                                    int i66 = i59 | i56;
                                    registers = registers2;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i66;
                                    bArr = bArr2;
                                    i39 = i24;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr2, iDecodeVarint32, registers2);
                                    unsafe2.putObject(t13, jOffset, registers2.object1);
                                    int i67 = i59 | i56;
                                    registers = registers2;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i67;
                                    bArr = bArr2;
                                    i39 = i24;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, iDecodeVarint32, registers2);
                                    int i68 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i35);
                                    if (!isLegacyEnumIsClosed(i53) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i68)) {
                                        unsafe2.putInt(t13, jOffset, i68);
                                        int i69 = i59 | i56;
                                        registers = registers2;
                                        i46 = i58;
                                        i43 = i35;
                                        i44 = i36;
                                        i38 = -1;
                                        i14 = i14;
                                        i45 = i69;
                                        bArr = bArr2;
                                        i39 = i24;
                                    } else {
                                        getMutableUnknownFields(t13).storeField(i36, Long.valueOf(i68));
                                        registers = registers2;
                                        i45 = i59;
                                        i46 = i58;
                                        i43 = i35;
                                        i44 = i36;
                                        i39 = i24;
                                        i38 = -1;
                                        i14 = i14;
                                        bArr = bArr2;
                                    }
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                registers2 = registers;
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, iDecodeVarint32, registers2);
                                    unsafe2.putInt(t13, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    int i610 = i59 | i56;
                                    registers = registers2;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i610;
                                    bArr = bArr2;
                                    i39 = i24;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 16:
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                if (i49 == 0) {
                                    int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                    unsafe2.putLong(t13, jOffset, CodedInputStream.decodeZigZag64(registers.long1));
                                    int i73 = i59 | i56;
                                    registers = registers;
                                    i46 = i58;
                                    i43 = i35;
                                    i44 = i36;
                                    i39 = i24;
                                    i38 = -1;
                                    i14 = i14;
                                    i45 = i73;
                                    bArr = bArr;
                                    iDecodeUnknownField = iDecodeVarint66;
                                } else {
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            case 17:
                                if (i49 == 3) {
                                    Object objMutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t13, iPositionForFieldNumber);
                                    iDecodeUnknownField = ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), bArr, iDecodeVarint32, i14, (i48 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t13, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
                                    i45 = i59 | i56;
                                    i46 = i58;
                                    i43 = iPositionForFieldNumber;
                                    i44 = i54;
                                    i39 = i48;
                                    i38 = -1;
                                    bArr = bArr;
                                    i14 = i14;
                                } else {
                                    i35 = iPositionForFieldNumber;
                                    i24 = i48;
                                    i36 = i54;
                                    i37 = iDecodeVarint32;
                                    i27 = i58;
                                    i26 = i59;
                                    i25 = i37;
                                    unsafe = unsafe2;
                                    i29 = i35;
                                    i17 = i36;
                                    i28 = -1;
                                    i15 = i15;
                                }
                                break;
                            default:
                                i35 = iPositionForFieldNumber;
                                i24 = i48;
                                i36 = i54;
                                i37 = iDecodeVarint32;
                                i27 = i58;
                                i26 = i59;
                                i25 = i37;
                                unsafe = unsafe2;
                                i29 = i35;
                                i17 = i36;
                                i28 = -1;
                                i15 = i15;
                                break;
                        }
                    } else {
                        i24 = i48;
                        int i74 = iDecodeVarint32;
                        if (iType != 27) {
                            i26 = i45;
                            if (iType <= 49) {
                                i27 = i46;
                                i28 = -1;
                                unsafe = unsafe2;
                                i29 = iPositionForFieldNumber;
                                i34 = i54;
                                iDecodeUnknownField = parseRepeatedField(t13, bArr, i74, i14, i54, i24, i49, iPositionForFieldNumber, i53, iType, jOffset, registers);
                                if (iDecodeUnknownField != i74) {
                                    messageSchema2 = this;
                                    registers = registers;
                                    i39 = i24;
                                    i38 = i28;
                                    i45 = i26;
                                    i44 = i34;
                                } else {
                                    i25 = iDecodeUnknownField;
                                    i17 = i34;
                                }
                                i43 = i29;
                                i46 = i27;
                                unsafe2 = unsafe;
                            } else {
                                i27 = i46;
                                i33 = i74;
                                unsafe = unsafe2;
                                i29 = iPositionForFieldNumber;
                                i34 = i54;
                                i28 = -1;
                                if (iType == 50) {
                                    if (i49 == 2) {
                                        iDecodeUnknownField = parseMapField(t13, bArr, i33, i14, i29, jOffset, registers);
                                        if (iDecodeUnknownField != i33) {
                                            messageSchema2 = this;
                                            registers = registers;
                                            i39 = i24;
                                            i38 = i28;
                                            i45 = i26;
                                            i44 = i34;
                                        } else {
                                            i25 = iDecodeUnknownField;
                                        }
                                        i43 = i29;
                                        i46 = i27;
                                        unsafe2 = unsafe;
                                    }
                                    i17 = i34;
                                } else {
                                    iDecodeUnknownField = parseOneofField(t13, bArr, i33, i14, i34, i24, i49, i53, iType, jOffset, i29, registers);
                                    if (iDecodeUnknownField != i33) {
                                        messageSchema2 = this;
                                        registers = registers;
                                        i39 = i24;
                                        i38 = i28;
                                        i45 = i26;
                                        i44 = i34;
                                    } else {
                                        i25 = iDecodeUnknownField;
                                        i17 = i34;
                                    }
                                    i43 = i29;
                                    i46 = i27;
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i49 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t13, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t13, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), i54, bArr, i74, i14, protobufListMutableCopyWithCapacity2, registers);
                            i43 = iPositionForFieldNumber;
                            i44 = i54;
                            i39 = i24;
                            i45 = i45;
                            i38 = -1;
                            bArr = bArr;
                            i14 = i14;
                        } else {
                            i26 = i45;
                            i27 = i46;
                            i33 = i74;
                            unsafe = unsafe2;
                            i29 = iPositionForFieldNumber;
                            i34 = i54;
                            i28 = -1;
                        }
                        i25 = i33;
                        i17 = i34;
                    }
                }
                if (i17 != i15 || i15 == 0) {
                    registers = registers;
                    iDecodeUnknownField = (!this.hasExtensions || registers.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? ArrayDecoders.decodeUnknownField(i17, bArr, i25, i14, getMutableUnknownFields(t13), registers) : ArrayDecoders.decodeExtensionOrUnknownField(i17, bArr, i25, i14, t13, this.defaultInstance, this.unknownFieldSchema, registers);
                    i44 = i17;
                    messageSchema2 = this;
                    i39 = i24;
                    i38 = i28;
                    i45 = i26;
                    i43 = i29;
                    i46 = i27;
                    unsafe2 = unsafe;
                } else {
                    i19 = 1048575;
                    messageSchema = this;
                    i16 = i25;
                    i18 = i26;
                    i46 = i27;
                }
            } else {
                i15 = i15;
                int i75 = i45;
                unsafe = unsafe2;
                messageSchema = messageSchema2;
                i16 = iDecodeUnknownField;
                i17 = i44;
                i18 = i75;
                i19 = 1048575;
            }
        }
        if (i46 != i19) {
            long j13 = i46;
            t14 = t13;
            unsafe.putInt(t14, j13, i18);
        } else {
            t14 = t13;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i76 = messageSchema.checkInitializedCount; i76 < messageSchema.repeatedFieldOffsetStart; i76++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t13, messageSchema.intArray[i76], unknownFieldSetLite, messageSchema.unknownFieldSchema, t13);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t14, unknownFieldSetLite);
        }
        if (i15 == 0) {
            if (i16 != i14) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i16 > i14 || i17 != i15) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i16;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t13, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t13, writer);
        } else {
            writeFieldsInAscendingOrder(t13, writer);
        }
    }

    private boolean isFieldPresent(T t13, int i13) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i13);
        long j13 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j13 != 1048575) {
            return (UnsafeUtil.getInt(t13, j13) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i13);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t13, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t13, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t13, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t13, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t13, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t13, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t13, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t13, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t13, jOffset));
            case 11:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t13, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t13, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t13, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t13, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i13, int i14) {
        if (i13 < this.minFieldNumber || i13 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i13, i14);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t13, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t13);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t13, reader, extensionRegistryLite);
    }

    private boolean equals(T t13, T t14, int i13) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i13);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t13, t14, i13) && Double.doubleToLongBits(UnsafeUtil.getDouble(t13, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t14, jOffset));
            case 1:
                return arePresentForEquals(t13, t14, i13) && Float.floatToIntBits(UnsafeUtil.getFloat(t13, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t14, jOffset));
            case 2:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getLong(t13, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 3:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getLong(t13, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 4:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 5:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getLong(t13, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 6:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 7:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getBoolean(t13, jOffset) == UnsafeUtil.getBoolean(t14, jOffset);
            case 8:
                return arePresentForEquals(t13, t14, i13) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 9:
                return arePresentForEquals(t13, t14, i13) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 10:
                return arePresentForEquals(t13, t14, i13) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 11:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 12:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 13:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 14:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getLong(t13, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 15:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getInt(t13, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 16:
                return arePresentForEquals(t13, t14, i13) && UnsafeUtil.getLong(t13, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 17:
                return arePresentForEquals(t13, t14, i13) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t13, t14, i13) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t13, jOffset), UnsafeUtil.getObject(t14, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t13, byte[] bArr, int i13, int i14, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t13, bArr, i13, i14, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i13, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i13)));
    }
}
