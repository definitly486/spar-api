package com.yandex.runtime.bindings;

import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
public class EnumHandler<T extends Enum<T>> implements ArchivingHandler<T> {
    private Class<T> enumClass;
    private final boolean isOptional;

    public EnumHandler(Class<T> cls) {
        this(false, cls);
    }

    public EnumHandler(boolean z13, Class<T> cls) {
        this.isOptional = z13;
        this.enumClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t13, Archive archive) {
        return (T) archive.add(t13, this.isOptional, this.enumClass);
    }
}
