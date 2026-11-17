package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Point implements Serializable {
    private double latitude;
    private double longitude;

    public Point(double d13, double d14) {
        this.latitude = d13;
        this.longitude = d14;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.latitude = archive.add(this.latitude);
        this.longitude = archive.add(this.longitude);
    }

    public Point() {
    }
}
