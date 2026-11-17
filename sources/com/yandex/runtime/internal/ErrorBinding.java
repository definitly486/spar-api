package com.yandex.runtime.internal;

import com.yandex.runtime.Error;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorBinding implements Error {
    private final NativeObject nativeObject;

    protected ErrorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.Error
    public native boolean isValid();
}
