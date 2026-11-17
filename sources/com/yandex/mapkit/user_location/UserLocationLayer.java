package com.yandex.mapkit.user_location;

import android.graphics.PointF;
import com.yandex.mapkit.location.LocationViewSource;
import com.yandex.mapkit.map.CameraPosition;

/* JADX INFO: loaded from: classes3.dex */
public interface UserLocationLayer {
    CameraPosition cameraPosition();

    boolean isAnchorEnabled();

    boolean isAutoZoomEnabled();

    boolean isHeadingModeActive();

    boolean isValid();

    boolean isVisible();

    void resetAnchor();

    void setAnchor(PointF pointF, PointF pointF2);

    void setAutoZoomEnabled(boolean z13);

    void setDefaultSource();

    void setHeadingModeActive(boolean z13);

    void setObjectListener(UserLocationObjectListener userLocationObjectListener);

    void setSource(LocationViewSource locationViewSource);

    void setTapListener(UserLocationTapListener userLocationTapListener);

    void setVisible(boolean z13);
}
