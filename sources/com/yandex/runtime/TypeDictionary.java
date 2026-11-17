package com.yandex.runtime;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface TypeDictionary<T> {
    Map<String, T> getAllItems();

    <U extends T> U getItem(Class<U> cls);
}
