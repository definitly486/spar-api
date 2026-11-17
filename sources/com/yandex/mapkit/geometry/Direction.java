package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Direction implements Serializable {
    private double azimuth;
    private double tilt;

    public Direction(double d13, double d14) {
        this.azimuth = d13;
        this.tilt = d14;
    }

    public double getAzimuth() {
        return this.azimuth;
    }

    public double getTilt() {
        return this.tilt;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.azimuth = archive.add(this.azimuth);
        this.tilt = archive.add(this.tilt);
    }

    public Direction() {
    }
}
