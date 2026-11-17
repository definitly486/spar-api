package com.google.protobuf;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* JADX INFO: renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int i13) throws InvalidProtocolBufferException {
        if (i13 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static int decodeBoolList(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i14, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeBytes(byte[] bArr, int i13, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i14 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i14);
        return iDecodeVarint32 + i14;
    }

    static int decodeBytesList(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i16 = registers.int1;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i16 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i16 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i16));
            iDecodeVarint32 += i16;
        }
        while (iDecodeVarint32 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i17 = registers.int1;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i17 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i17 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i17));
                iDecodeVarint32 += i17;
            }
        }
        return iDecodeVarint32;
    }

    static double decodeDouble(byte[] bArr, int i13) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i13));
    }

    static int decodeDoubleList(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i14));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, i16, registers);
            if (i13 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i16 = iDecodeVarint32 + 8;
        }
        return i16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int i13, byte[] bArr, int i14, int i15, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i16 = i13 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i14, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i14, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i14, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i14, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i14, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i14, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i14, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i14, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i14, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i14, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i16, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i14 = decodeVarint32(bArr, i14, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i16, registers.int1, null, unknownFieldSchema);
                return i14;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(decodeDouble(bArr, i14));
                    i14 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(decodeFloat(bArr, i14));
                    i14 += 4;
                    break;
                case 3:
                case 4:
                    i14 = decodeVarint64(bArr, i14, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i14 = decodeVarint32(bArr, i14, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i14));
                    i14 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i14));
                    i14 += 4;
                    break;
                case 11:
                    i14 = decodeVarint64(bArr, i14, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i14 = decodeVarint32(bArr, i14, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i14 = decodeVarint64(bArr, i14, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i14 = decodeBytes(bArr, i14, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i14 = decodeString(bArr, i14, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i17 = (i16 << 3) | 4;
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i14, i15, i17, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i14, i15, i17, registers);
                case 18:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i14, i15, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i14, i15, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
        } else {
            fieldSet.setField(generatedExtension.descriptor, objValueOf);
        }
        return i14;
    }

    static int decodeExtensionOrUnknownField(int i13, byte[] bArr, int i14, int i15, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i13 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i13, bArr, i14, i15, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i13, bArr, i14, i15, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    static int decodeFixed32(byte[] bArr, int i13) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    static int decodeFixed32List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i14));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, i16, registers);
            if (i13 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i16 = iDecodeVarint32 + 4;
        }
        return i16;
    }

    static long decodeFixed64(byte[] bArr, int i13) {
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    static int decodeFixed64List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i14));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, i16, registers);
            if (i13 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i16 = iDecodeVarint32 + 8;
        }
        return i16;
    }

    static float decodeFloat(byte[] bArr, int i13) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i13));
    }

    static int decodeFloatList(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i14));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, i16, registers);
            if (i13 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i16 = iDecodeVarint32 + 4;
        }
        return i16;
    }

    static int decodeGroupField(Schema schema, byte[] bArr, int i13, int i14, int i15, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i13, i14, i15, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    static int decodeGroupList(Schema schema, int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i16 = (i13 & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i14, i15, i16, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i15, i16, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    static int decodeMessageField(Schema schema, byte[] bArr, int i13, int i14, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i13, i14, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    static int decodeMessageList(Schema<?> schema, int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i14, i15, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i15, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    static int decodePackedBoolList(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint32List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] bArr, int i13, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i14) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i14) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeSInt32List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i14, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    static int decodeString(byte[] bArr, int i13, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i14, Internal.UTF_8);
        return iDecodeVarint32 + i14;
    }

    static int decodeStringList(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i16 = registers.int1;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i16 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i16, Internal.UTF_8));
            iDecodeVarint32 += i16;
        }
        while (iDecodeVarint32 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i17 = registers.int1;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i17 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i17, Internal.UTF_8));
                iDecodeVarint32 += i17;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringListRequireUtf8(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i16 = registers.int1;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i16 == 0) {
            protobufList.add("");
        } else {
            int i17 = iDecodeVarint32 + i16;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i17)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i16, Internal.UTF_8));
            iDecodeVarint32 = i17;
        }
        while (iDecodeVarint32 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i18 = registers.int1;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i18 == 0) {
                protobufList.add("");
            } else {
                int i19 = iDecodeVarint32 + i18;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i19)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i18, Internal.UTF_8));
                iDecodeVarint32 = i19;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringRequireUtf8(byte[] bArr, int i13, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
        int i14 = registers.int1;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i14);
        return iDecodeVarint32 + i14;
    }

    static int decodeUnknownField(int i13, byte[] bArr, int i14, int i15, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i13) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i13);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i14, registers);
            unknownFieldSetLite.storeField(i13, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i13, Long.valueOf(decodeFixed64(bArr, i14)));
            return i14 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
            int i16 = registers.int1;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i16 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i16 == 0) {
                unknownFieldSetLite.storeField(i13, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i13, ByteString.copyFrom(bArr, iDecodeVarint32, i16));
            }
            return iDecodeVarint32 + i16;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i13, Integer.valueOf(decodeFixed32(bArr, i14)));
            return i14 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i17 = (i13 & (-8)) | 4;
        int i18 = registers.recursionDepth + 1;
        registers.recursionDepth = i18;
        checkRecursionLimit(i18);
        int i19 = 0;
        while (i14 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, i14, registers);
            int i23 = registers.int1;
            if (i23 == i17) {
                i19 = i23;
                i14 = iDecodeVarint33;
                break;
            }
            i19 = i23;
            i14 = decodeUnknownField(i23, bArr, iDecodeVarint33, i15, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (i14 > i15 || i19 != i17) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i13, unknownFieldSetLiteNewInstance);
        return i14;
    }

    static int decodeVarint32(byte[] bArr, int i13, Registers registers) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return decodeVarint32(b13, bArr, i14, registers);
        }
        registers.int1 = b13;
        return i14;
    }

    static int decodeVarint32List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i15) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64(byte[] bArr, int i13, Registers registers) {
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        if (j13 < 0) {
            return decodeVarint64(j13, bArr, i14, registers);
        }
        registers.long1 = j13;
        return i14;
    }

    static int decodeVarint64List(int i13, byte[] bArr, int i14, int i15, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i14, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i15) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i13 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i13, int i14, int i15, Registers registers) throws IOException {
        MessageSchema messageSchema = (MessageSchema) schema;
        int i16 = registers.recursionDepth + 1;
        registers.recursionDepth = i16;
        checkRecursionLimit(i16);
        int message = messageSchema.parseMessage(obj, bArr, i13, i14, i15, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return message;
    }

    static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i13, int i14, Registers registers) throws IOException {
        int iDecodeVarint32 = i13 + 1;
        int i15 = bArr[i13];
        if (i15 < 0) {
            iDecodeVarint32 = decodeVarint32(i15, bArr, iDecodeVarint32, registers);
            i15 = registers.int1;
        }
        int i16 = iDecodeVarint32;
        if (i15 < 0 || i15 > i14 - i16) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i17 = registers.recursionDepth + 1;
        registers.recursionDepth = i17;
        checkRecursionLimit(i17);
        int i18 = i15 + i16;
        schema.mergeFrom(obj, bArr, i16, i18, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i18;
    }

    public static void setRecursionLimit(int i13) {
        recursionLimit = i13;
    }

    static int skipField(int i13, byte[] bArr, int i14, int i15, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i13) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i13);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i14, registers);
        }
        if (tagWireType == 1) {
            return i14 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i14, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i14 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i16 = (i13 & (-8)) | 4;
        int i17 = 0;
        while (i14 < i15) {
            i14 = decodeVarint32(bArr, i14, registers);
            i17 = registers.int1;
            if (i17 == i16) {
                break;
            }
            i14 = skipField(i17, bArr, i14, i15, registers);
        }
        if (i14 > i15 || i17 != i16) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i14;
    }

    static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    static int decodeVarint32(int i13, byte[] bArr, int i14, Registers registers) {
        int i15 = i13 & 127;
        int i16 = i14 + 1;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            registers.int1 = i15 | (b13 << 7);
            return i16;
        }
        int i17 = i15 | ((b13 & 127) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i16];
        if (b14 >= 0) {
            registers.int1 = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & 127) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            registers.int1 = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & 127) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            registers.int1 = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & 127) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                registers.int1 = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    static int decodeVarint64(long j13, byte[] bArr, int i13, Registers registers) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        long j14 = (j13 & 127) | (((long) (b13 & 127)) << 7);
        int i15 = 7;
        while (b13 < 0) {
            int i16 = i14 + 1;
            byte b14 = bArr[i14];
            i15 += 7;
            j14 |= ((long) (b14 & 127)) << i15;
            i14 = i16;
            b13 = b14;
        }
        registers.long1 = j14;
        return i14;
    }
}
