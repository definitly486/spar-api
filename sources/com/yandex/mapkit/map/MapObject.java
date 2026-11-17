package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;

/* JADX INFO: loaded from: classes3.dex */
public interface MapObject {
    void addTapListener(MapObjectTapListener mapObjectTapListener);

    BaseMapObjectCollection getParent();

    Object getUserData();

    float getZIndex();

    boolean isDraggable();

    boolean isValid();

    boolean isVisible();

    void removeTapListener(MapObjectTapListener mapObjectTapListener);

    void setDragListener(MapObjectDragListener mapObjectDragListener);

    void setDraggable(boolean z13);

    void setUserData(Object obj);

    void setVisible(boolean z13);

    void setVisible(boolean z13, Animation animation);

    void setVisible(boolean z13, Animation animation, Callback callback);

    void setZIndex(float f13);
}
