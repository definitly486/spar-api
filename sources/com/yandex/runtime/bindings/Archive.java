package com.yandex.runtime.bindings;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface Archive {
    byte add(byte b13);

    double add(double d13);

    float add(float f13);

    int add(int i13);

    long add(long j13);

    PointF add(PointF pointF, boolean z13);

    <T> TypeDictionary<T> add(TypeDictionary<T> typeDictionary, boolean z13, ArchivingHandler<T> archivingHandler);

    <T extends Serializable> T add(T t13, boolean z13, Class<T> cls);

    Boolean add(Boolean bool, boolean z13);

    Byte add(Byte b13, boolean z13);

    Double add(Double d13, boolean z13);

    <T extends Enum<T>> T add(T t13, boolean z13, Class<T> cls);

    Float add(Float f13, boolean z13);

    Integer add(Integer num, boolean z13);

    Long add(Long l13, boolean z13);

    <T> T add(T t13, ArchivingHandler<T> archivingHandler);

    String add(String str, boolean z13);

    ByteBuffer add(ByteBuffer byteBuffer);

    <T> List<T> add(List<T> list, boolean z13, ArchivingHandler<T> archivingHandler);

    <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z13, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2);

    boolean add(boolean z13);

    byte[] add(byte[] bArr, boolean z13);

    boolean isReader();
}
