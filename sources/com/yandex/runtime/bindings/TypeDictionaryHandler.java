package com.yandex.runtime.bindings;

import com.yandex.runtime.TypeDictionary;

/* JADX INFO: loaded from: classes3.dex */
public class TypeDictionaryHandler<T> implements ArchivingHandler<TypeDictionary<T>> {
    private final boolean isOptional;
    private final ArchivingHandler<T> valueHandler;

    public TypeDictionaryHandler(ArchivingHandler<T> archivingHandler) {
        this(false, archivingHandler);
    }

    public TypeDictionaryHandler(boolean z13, ArchivingHandler<T> archivingHandler) {
        this.isOptional = z13;
        this.valueHandler = archivingHandler;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public TypeDictionary<T> add(TypeDictionary<T> typeDictionary, Archive archive) {
        return archive.add(typeDictionary, this.isOptional, this.valueHandler);
    }
}
