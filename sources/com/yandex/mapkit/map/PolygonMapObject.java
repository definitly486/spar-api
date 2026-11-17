package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Polygon;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;

/* JADX INFO: loaded from: classes3.dex */
public interface PolygonMapObject extends MapObject {
    int getFillColor();

    Polygon getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void resetPattern();

    void setFillColor(int i13);

    void setGeodesic(boolean z13);

    void setGeometry(Polygon polygon);

    void setPattern(AnimatedImageProvider animatedImageProvider, float f13);

    void setPattern(ImageProvider imageProvider, float f13);

    void setStrokeColor(int i13);

    void setStrokeWidth(float f13);
}
