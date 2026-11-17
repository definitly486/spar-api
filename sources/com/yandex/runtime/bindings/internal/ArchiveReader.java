package com.yandex.runtime.bindings.internal;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ArchiveReader implements Archive {
    private final ByteBuffer data;

    public ArchiveReader(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(0);
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    private static <T> T create(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(null);
        } catch (Exception e13) {
            throw new RuntimeException(String.format("Cannot create an instance of class %s. %s", cls.getName(), e13.getMessage()));
        }
    }

    private boolean readOptionalFlag() {
        return add(false);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z13) {
        byte bAdd = add((byte) 0);
        if (bAdd == 1) {
            return true;
        }
        if (bAdd == 0) {
            return false;
        }
        throw new RuntimeException(String.format("0x%02x is not valid boolean value", Byte.valueOf(bAdd)));
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b13) {
        return this.data.get();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i13) {
        return this.data.getInt();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j13) {
        return this.data.getLong();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f13) {
        return this.data.getFloat();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d13) {
        return this.data.getDouble();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Boolean.valueOf(add(false));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b13, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Byte.valueOf(add((byte) 0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Integer.valueOf(add(0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l13, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Long.valueOf(add(0L));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f13, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Float.valueOf(add(0.0f));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d13, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return Double.valueOf(add(0.0d));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z13) {
        if (z13 && !readOptionalFlag()) {
            return null;
        }
        byte[] bArr2 = new byte[add(0)];
        this.data.get(bArr2);
        return bArr2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z13) {
        if (z13 && !readOptionalFlag()) {
            return null;
        }
        try {
            byte[] bArr = new byte[add(0)];
            this.data.get(bArr);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t13, boolean z13, Class<T> cls) {
        if (!z13 || readOptionalFlag()) {
            return cls.getEnumConstants()[add(0)];
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z13, ArchivingHandler<T> archivingHandler) {
        if (z13 && !readOptionalFlag()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iAdd = add(0);
        for (int i13 = 0; i13 < iAdd; i13++) {
            arrayList.add(archivingHandler.add(null, this));
        }
        return arrayList;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z13, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (z13 && !readOptionalFlag()) {
            return null;
        }
        HashMap map2 = new HashMap();
        int iAdd = add(0);
        for (int i13 = 0; i13 < iAdd; i13++) {
            map2.put(archivingHandler.add(null, this), archivingHandler2.add(null, this));
        }
        return map2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z13, ArchivingHandler<Value> archivingHandler) {
        if (!z13 || readOptionalFlag()) {
            return new TypeDictionaryImpl(add(null, false, new StringHandler(), archivingHandler));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t13, boolean z13, Class<T> cls) {
        if (z13 && !readOptionalFlag()) {
            return null;
        }
        if (cls.isInterface()) {
            try {
                cls = (Class<T>) Class.forName(add((String) null, false));
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException(e13);
            }
        }
        T t14 = (T) create(cls);
        t14.serialize(this);
        return t14;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t13, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t13, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z13) {
        if (!z13 || readOptionalFlag()) {
            return new PointF(add(0.0f), add(0.0f));
        }
        return null;
    }
}
