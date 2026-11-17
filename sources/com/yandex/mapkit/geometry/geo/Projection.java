package com.yandex.mapkit.geometry.geo;

import com.yandex.mapkit.geometry.Point;

/* JADX INFO: loaded from: classes3.dex */
public interface Projection {
    boolean isValid();

    XYPoint worldToXY(Point point, int i13);

    Point xyToWorld(XYPoint xYPoint, int i13);
}
