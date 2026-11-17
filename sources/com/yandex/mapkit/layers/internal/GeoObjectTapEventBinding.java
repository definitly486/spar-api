package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class GeoObjectTapEventBinding implements GeoObjectTapEvent {
    private final NativeObject nativeObject;

    protected GeoObjectTapEventBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapEvent
    public native GeoObject getGeoObject();

    @Override // com.yandex.mapkit.layers.GeoObjectTapEvent
    public native boolean isValid();
}
