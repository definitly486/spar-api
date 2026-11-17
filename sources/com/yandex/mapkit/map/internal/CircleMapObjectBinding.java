package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class CircleMapObjectBinding extends MapObjectBinding implements CircleMapObject {
    protected CircleMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native int getFillColor();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native Circle getGeometry();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native int getStrokeColor();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native boolean isGeodesic();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setFillColor(int i13);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setGeodesic(boolean z13);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setGeometry(Circle circle);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setStrokeColor(int i13);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setStrokeWidth(float f13);
}
