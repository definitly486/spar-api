package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.TileDataSource;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class TileDataSourceBinding extends BaseDataSourceBinding implements TileDataSource {
    protected TileDataSourceBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.layers.TileDataSource
    public native void invalidate(String str);
}
