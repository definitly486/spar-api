package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CameraPosition implements Serializable {
    private float azimuth;
    private Point target;
    private float tilt;
    private float zoom;

    public CameraPosition(Point point, float f13, float f14, float f15) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"target\" cannot be null");
        }
        this.target = point;
        this.zoom = f13;
        this.azimuth = f14;
        this.tilt = f15;
    }

    public float getAzimuth() {
        return this.azimuth;
    }

    public Point getTarget() {
        return this.target;
    }

    public float getTilt() {
        return this.tilt;
    }

    public float getZoom() {
        return this.zoom;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.target = (Point) archive.add(this.target, false, (Class<Point>) Point.class);
        this.zoom = archive.add(this.zoom);
        this.azimuth = archive.add(this.azimuth);
        this.tilt = archive.add(this.tilt);
    }

    public CameraPosition() {
    }
}
