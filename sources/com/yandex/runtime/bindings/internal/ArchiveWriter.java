package com.yandex.runtime.bindings.internal;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ArchiveWriter implements Archive {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_SIZE = 16384;
    private ByteBuffer data = allocate(DEFAULT_SIZE);

    private static ByteBuffer allocate(int i13) {
        return ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
    }

    private void ensureSize(int i13) {
        int iPosition = this.data.position();
        int iCapacity = this.data.capacity();
        int i14 = i13 + iPosition;
        if (i14 > iCapacity) {
            ByteBuffer byteBufferAllocate = allocate(Math.max((int) (((double) iCapacity) * 1.6d), i14));
            this.data.position(0);
            byteBufferAllocate.put(this.data);
            byteBufferAllocate.position(iPosition);
            this.data = byteBufferAllocate;
        }
    }

    private <T> boolean writeOptionalFlag(boolean z13, T t13) {
        if (z13) {
            return add(t13 != null);
        }
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z13) {
        add(z13 ? (byte) 1 : (byte) 0);
        return z13;
    }

    public ByteBuffer data() {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return false;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b13) {
        ensureSize(1);
        this.data.put(b13);
        return b13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i13) {
        ensureSize(4);
        this.data.putInt(i13);
        return i13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j13) {
        ensureSize(8);
        this.data.putLong(j13);
        return j13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f13) {
        ensureSize(4);
        this.data.putFloat(f13);
        return f13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d13) {
        ensureSize(8);
        this.data.putDouble(d13);
        return d13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z13) {
        if (writeOptionalFlag(z13, bool)) {
            return Boolean.valueOf(add(bool.booleanValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b13, boolean z13) {
        if (writeOptionalFlag(z13, b13)) {
            return Byte.valueOf(add(b13.byteValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z13) {
        if (writeOptionalFlag(z13, num)) {
            return Integer.valueOf(add(num.intValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l13, boolean z13) {
        if (writeOptionalFlag(z13, l13)) {
            return Long.valueOf(add(l13.longValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f13, boolean z13) {
        if (writeOptionalFlag(z13, f13)) {
            return Float.valueOf(add(f13.floatValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d13, boolean z13) {
        if (writeOptionalFlag(z13, d13)) {
            return Double.valueOf(add(d13.doubleValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        ensureSize(byteBuffer.capacity());
        this.data.put(byteBuffer);
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z13) {
        if (!writeOptionalFlag(z13, bArr)) {
            return null;
        }
        add(bArr.length);
        ensureSize(bArr.length);
        this.data.put(bArr);
        return bArr;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z13) {
        if (!writeOptionalFlag(z13, str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            add(bytes.length);
            ensureSize(bytes.length);
            this.data.put(bytes);
            return str;
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t13, boolean z13, Class<T> cls) {
        if (!writeOptionalFlag(z13, t13)) {
            return null;
        }
        add(t13.ordinal());
        return t13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z13, ArchivingHandler<T> archivingHandler) {
        if (!writeOptionalFlag(z13, list)) {
            return null;
        }
        add(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            archivingHandler.add(it.next(), this);
        }
        return list;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z13, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (!writeOptionalFlag(z13, map)) {
            return null;
        }
        add(map.size());
        for (Map.Entry<Key, Value> entry : map.entrySet()) {
            archivingHandler.add(entry.getKey(), this);
            archivingHandler2.add(entry.getValue(), this);
        }
        return map;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z13, ArchivingHandler<Value> archivingHandler) {
        if (!writeOptionalFlag(z13, typeDictionary)) {
            return null;
        }
        add(typeDictionary.getAllItems(), false, new StringHandler(), archivingHandler);
        return typeDictionary;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t13, boolean z13, Class<T> cls) {
        if (!writeOptionalFlag(z13, t13)) {
            return null;
        }
        if (cls.isInterface()) {
            add(t13.getClass().getName(), false);
        }
        t13.serialize(this);
        return t13;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t13, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t13, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z13) {
        if (!writeOptionalFlag(z13, pointF)) {
            return null;
        }
        add(pointF.x);
        add(pointF.y);
        return pointF;
    }
}
