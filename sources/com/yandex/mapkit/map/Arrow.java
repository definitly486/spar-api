package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.PolylinePosition;

/* JADX INFO: loaded from: classes3.dex */
public interface Arrow {
    int getFillColor();

    float getLength();

    int getOutlineColor();

    float getOutlineWidth();

    PolylinePosition getPosition();

    float getTriangleHeight();

    boolean isValid();

    boolean isVisible();

    void setFillColor(int i13);

    void setLength(float f13);

    void setOutlineColor(int i13);

    void setOutlineWidth(float f13);

    void setTriangleHeight(float f13);

    void setVisible(boolean z13);
}
