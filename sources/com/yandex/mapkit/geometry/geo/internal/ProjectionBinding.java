package com.yandex.mapkit.geometry.geo.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class ProjectionBinding implements Projection {
    private final NativeObject nativeObject;

    protected ProjectionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.geo.Projection
    public native boolean isValid();

    @Override // com.yandex.mapkit.geometry.geo.Projection
    public native XYPoint worldToXY(Point point, int i13);

    @Override // com.yandex.mapkit.geometry.geo.Projection
    public native Point xyToWorld(XYPoint xYPoint, int i13);
}
