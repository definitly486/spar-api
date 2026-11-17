package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.BoundingBox;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraBounds {
    BoundingBox getLatLngBounds();

    float getMaxZoom();

    float getMinZoom();

    boolean isValid();

    void resetMinMaxZoomPreference();

    void setLatLngBounds(BoundingBox boundingBox);

    void setMaxZoomPreference(float f13);

    void setMinZoomPreference(float f13);
}
