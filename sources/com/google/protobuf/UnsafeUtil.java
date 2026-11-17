package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    private static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j13) {
            return (int) j13;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j13, byte[] bArr, long j14, long j15) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j13) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j13) : UnsafeUtil.getBooleanLittleEndian(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j13) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j13) : UnsafeUtil.getByteLittleEndian(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j13) {
            return Double.longBitsToDouble(getLong(obj, j13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j13) {
            return Float.intBitsToFloat(getInt(obj, j13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j13, boolean z13) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j13, z13);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j13, z13);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j13, byte b13) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j13, b13);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j13, b13);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j13, double d13) {
            putLong(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j13, float f13) {
            putInt(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j13, int i13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j13, long j14, long j15) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j13, byte b13) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j13, byte[] bArr, long j14, long j15) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j13) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j13) : UnsafeUtil.getBooleanLittleEndian(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j13) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j13) : UnsafeUtil.getByteLittleEndian(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j13) {
            return Double.longBitsToDouble(getLong(obj, j13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j13) {
            return Float.intBitsToFloat(getInt(obj, j13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j13, boolean z13) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j13, z13);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j13, z13);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j13, byte b13) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j13, b13);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j13, b13);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j13, double d13) {
            putLong(obj, j13, Double.doubleToLongBits(d13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j13, float f13) {
            putInt(obj, j13, Float.floatToIntBits(f13));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j13, int i13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j13, long j14, long j15) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j13, byte b13) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j13, byte[] bArr, long j14, long j15) {
            this.unsafe.copyMemory((Object) null, j13, bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j14, j15);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j13) {
            return this.unsafe.getBoolean(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j13) {
            return this.unsafe.getByte(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j13) {
            return this.unsafe.getDouble(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j13) {
            return this.unsafe.getFloat(obj, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j13) {
            return this.unsafe.getInt(j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j13) {
            return this.unsafe.getLong(j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j13, boolean z13) {
            this.unsafe.putBoolean(obj, j13, z13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j13, byte b13) {
            this.unsafe.putByte(obj, j13, b13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j13, double d13) {
            this.unsafe.putDouble(obj, j13, d13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j13, float f13) {
            this.unsafe.putFloat(obj, j13, f13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j13, int i13) {
            this.unsafe.putInt(j13, i13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j13, long j14) {
            this.unsafe.putLong(j13, j14);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j13, long j14, long j15) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j13, (Object) null, j14, j15);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j13) {
            return this.unsafe.getByte(j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j13, byte b13) {
            this.unsafe.putByte(j13, b13);
        }
    }

    private static abstract class MemoryAccessor {
        Unsafe unsafe;

        MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j13, byte[] bArr, long j14, long j15);

        public abstract void copyMemory(byte[] bArr, long j13, long j14, long j15);

        public abstract boolean getBoolean(Object obj, long j13);

        public abstract byte getByte(long j13);

        public abstract byte getByte(Object obj, long j13);

        public abstract double getDouble(Object obj, long j13);

        public abstract float getFloat(Object obj, long j13);

        public abstract int getInt(long j13);

        public final int getInt(Object obj, long j13) {
            return this.unsafe.getInt(obj, j13);
        }

        public abstract long getLong(long j13);

        public final long getLong(Object obj, long j13) {
            return this.unsafe.getLong(obj, j13);
        }

        public final Object getObject(Object obj, long j13) {
            return this.unsafe.getObject(obj, j13);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j13, boolean z13);

        public abstract void putByte(long j13, byte b13);

        public abstract void putByte(Object obj, long j13, byte b13);

        public abstract void putDouble(Object obj, long j13, double d13);

        public abstract void putFloat(Object obj, long j13, float f13);

        public abstract void putInt(long j13, int i13);

        public final void putInt(Object obj, long j13, int i13) {
            this.unsafe.putInt(obj, j13, i13);
        }

        public abstract void putLong(long j13, long j14);

        public final void putLong(Object obj, long j13, long j14) {
            this.unsafe.putLong(obj, j13, j14);
        }

        public final void putObject(Object obj, long j13, Object obj2) {
            this.unsafe.putObject(obj, j13, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.bufferAddressField() != null;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = jArrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (jArrayBaseOffset & 7);
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (Android.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    static void copyMemory(byte[] bArr, long j13, long j14, long j15) {
        MEMORY_ACCESSOR.copyMemory(bArr, j13, j14, j15);
    }

    static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!Android.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return memoryAccessor.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j13, long j14) {
        return (IS_BIG_ENDIAN ? Long.numberOfLeadingZeros(j13 ^ j14) : Long.numberOfTrailingZeros(j13 ^ j14)) >> 3;
    }

    static boolean getBoolean(Object obj, long j13) {
        return MEMORY_ACCESSOR.getBoolean(obj, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j13) {
        return getByteBigEndian(obj, j13) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j13) {
        return getByteLittleEndian(obj, j13) != 0;
    }

    static byte getByte(Object obj, long j13) {
        return MEMORY_ACCESSOR.getByte(obj, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j13) {
        return (byte) ((getInt(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j13) {
        return (byte) ((getInt(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    static double getDouble(Object obj, long j13) {
        return MEMORY_ACCESSOR.getDouble(obj, j13);
    }

    static float getFloat(Object obj, long j13) {
        return MEMORY_ACCESSOR.getFloat(obj, j13);
    }

    static int getInt(Object obj, long j13) {
        return MEMORY_ACCESSOR.getInt(obj, j13);
    }

    static long getLong(Object obj, long j13) {
        return MEMORY_ACCESSOR.getLong(obj, j13);
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (!Android.isOnAndroidDevice()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (IS_ANDROID_64) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (IS_ANDROID_32) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    static Object getObject(Object obj, long j13) {
        return MEMORY_ACCESSOR.getObject(obj, j13);
    }

    static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th2) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static int mismatch(byte[] bArr, int i13, byte[] bArr2, int i14, int i15) {
        if (i13 < 0 || i14 < 0 || i15 < 0 || i13 + i15 > bArr.length || i14 + i15 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i16 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i17 = (BYTE_ARRAY_ALIGNMENT + i13) & 7; i16 < i15 && (i17 & 7) != 0; i17++) {
                if (bArr[i13 + i16] != bArr2[i14 + i16]) {
                    return i16;
                }
                i16++;
            }
            int i18 = ((i15 - i16) & (-8)) + i16;
            while (i16 < i18) {
                long j13 = BYTE_ARRAY_BASE_OFFSET;
                long j14 = i16;
                long j15 = getLong((Object) bArr, ((long) i13) + j13 + j14);
                long j16 = getLong((Object) bArr2, j13 + ((long) i14) + j14);
                if (j15 != j16) {
                    return i16 + firstDifferingByteIndexNativeEndian(j15, j16);
                }
                i16 += 8;
            }
        }
        while (i16 < i15) {
            if (bArr[i13 + i16] != bArr2[i14 + i16]) {
                return i16;
            }
            i16++;
        }
        return -1;
    }

    static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    static void putBoolean(Object obj, long j13, boolean z13) {
        MEMORY_ACCESSOR.putBoolean(obj, j13, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j13, boolean z13) {
        putByteBigEndian(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j13, boolean z13) {
        putByteLittleEndian(obj, j13, z13 ? (byte) 1 : (byte) 0);
    }

    static void putByte(Object obj, long j13, byte b13) {
        MEMORY_ACCESSOR.putByte(obj, j13, b13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = getInt(obj, j14);
        int i14 = ((~((int) j13)) & 3) << 3;
        putInt(obj, j14, ((255 & b13) << i14) | (i13 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i14))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        putInt(obj, j14, ((255 & b13) << i13) | (getInt(obj, j14) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i13))));
    }

    static void putDouble(Object obj, long j13, double d13) {
        MEMORY_ACCESSOR.putDouble(obj, j13, d13);
    }

    static void putFloat(Object obj, long j13, float f13) {
        MEMORY_ACCESSOR.putFloat(obj, j13, f13);
    }

    static void putInt(Object obj, long j13, int i13) {
        MEMORY_ACCESSOR.putInt(obj, j13, i13);
    }

    static void putLong(Object obj, long j13, long j14) {
        MEMORY_ACCESSOR.putLong(obj, j13, j14);
    }

    static void putObject(Object obj, long j13, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j13, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeByteBufferOperations();
    }

    static void copyMemory(long j13, byte[] bArr, long j14, long j15) {
        MEMORY_ACCESSOR.copyMemory(j13, bArr, j14, j15);
    }

    static boolean getBoolean(boolean[] zArr, long j13) {
        return MEMORY_ACCESSOR.getBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j13 * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    static byte getByte(byte[] bArr, long j13) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j13);
    }

    static double getDouble(double[] dArr, long j13) {
        return MEMORY_ACCESSOR.getDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j13 * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static float getFloat(float[] fArr, long j13) {
        return MEMORY_ACCESSOR.getFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j13 * FLOAT_ARRAY_INDEX_SCALE));
    }

    static int getInt(int[] iArr, long j13) {
        return MEMORY_ACCESSOR.getInt(iArr, INT_ARRAY_BASE_OFFSET + (j13 * INT_ARRAY_INDEX_SCALE));
    }

    static long getLong(long[] jArr, long j13) {
        return MEMORY_ACCESSOR.getLong(jArr, LONG_ARRAY_BASE_OFFSET + (j13 * LONG_ARRAY_INDEX_SCALE));
    }

    static Object getObject(Object[] objArr, long j13) {
        return MEMORY_ACCESSOR.getObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j13 * OBJECT_ARRAY_INDEX_SCALE));
    }

    static void putBoolean(boolean[] zArr, long j13, boolean z13) {
        MEMORY_ACCESSOR.putBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j13 * BOOLEAN_ARRAY_INDEX_SCALE), z13);
    }

    static void putByte(byte[] bArr, long j13, byte b13) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j13, b13);
    }

    static void putDouble(double[] dArr, long j13, double d13) {
        MEMORY_ACCESSOR.putDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j13 * DOUBLE_ARRAY_INDEX_SCALE), d13);
    }

    static void putFloat(float[] fArr, long j13, float f13) {
        MEMORY_ACCESSOR.putFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j13 * FLOAT_ARRAY_INDEX_SCALE), f13);
    }

    static void putInt(int[] iArr, long j13, int i13) {
        MEMORY_ACCESSOR.putInt(iArr, INT_ARRAY_BASE_OFFSET + (j13 * INT_ARRAY_INDEX_SCALE), i13);
    }

    static void putLong(long[] jArr, long j13, long j14) {
        MEMORY_ACCESSOR.putLong(jArr, LONG_ARRAY_BASE_OFFSET + (j13 * LONG_ARRAY_INDEX_SCALE), j14);
    }

    static void putObject(Object[] objArr, long j13, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j13 * OBJECT_ARRAY_INDEX_SCALE), obj);
    }

    static void copyMemory(byte[] bArr, long j13, byte[] bArr2, long j14, long j15) {
        System.arraycopy(bArr, (int) j13, bArr2, (int) j14, (int) j15);
    }

    static byte getByte(long j13) {
        return MEMORY_ACCESSOR.getByte(j13);
    }

    static int getInt(long j13) {
        return MEMORY_ACCESSOR.getInt(j13);
    }

    static long getLong(long j13) {
        return MEMORY_ACCESSOR.getLong(j13);
    }

    static void putByte(long j13, byte b13) {
        MEMORY_ACCESSOR.putByte(j13, b13);
    }

    static void putInt(long j13, int i13) {
        MEMORY_ACCESSOR.putInt(j13, i13);
    }

    static void putLong(long j13, long j14) {
        MEMORY_ACCESSOR.putLong(j13, j14);
    }
}
