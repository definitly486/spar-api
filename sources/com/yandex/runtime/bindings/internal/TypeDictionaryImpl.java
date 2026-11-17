package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeDictionaryImpl<T> implements TypeDictionary<T> {
    private Map<String, T> map;
    private NativeObject nativeObject;

    private TypeDictionaryImpl(NativeObject nativeObject) {
        this.map = new ConcurrentHashMap();
        this.nativeObject = nativeObject;
    }

    private <U extends T> U getItemByKey(String str) {
        T tPutIfAbsent;
        T t13 = this.map.get(str);
        if (t13 != null || this.nativeObject == null) {
            return t13;
        }
        U u13 = (U) getItemNative(str);
        return (u13 == null || (tPutIfAbsent = this.map.putIfAbsent(str, (T) u13)) == null) ? u13 : tPutIfAbsent;
    }

    private native Object getItemNative(String str);

    private native List<String> getKeys();

    private <U> String keyForClass(Class<U> cls) {
        try {
            return (String) cls.getMethod("getNativeName", null).invoke(null, null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e13) {
            throw new IllegalArgumentException(String.format("Objects of class %s cannot be stored in com.yandex.runtime.bindings.internal.TypeDictionaryImpl", cls.getName()), e13);
        }
    }

    @Override // com.yandex.runtime.TypeDictionary
    public Map<String, T> getAllItems() {
        if (this.nativeObject != null) {
            Iterator<String> it = getKeys().iterator();
            while (it.hasNext()) {
                getItemByKey(it.next());
            }
        }
        return this.map;
    }

    @Override // com.yandex.runtime.TypeDictionary
    public <U extends T> U getItem(Class<U> cls) {
        String strKeyForClass = keyForClass(cls);
        if (strKeyForClass == null) {
            return null;
        }
        return (U) getItemByKey(strKeyForClass);
    }

    TypeDictionaryImpl(Map<String, T> map) {
        new ConcurrentHashMap();
        this.map = map;
    }
}
