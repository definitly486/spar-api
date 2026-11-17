package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Span implements Serializable {
    private double horizontalAngle;
    private double verticalAngle;

    public Span(double d13, double d14) {
        this.horizontalAngle = d13;
        this.verticalAngle = d14;
    }

    public double getHorizontalAngle() {
        return this.horizontalAngle;
    }

    public double getVerticalAngle() {
        return this.verticalAngle;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.horizontalAngle = archive.add(this.horizontalAngle);
        this.verticalAngle = archive.add(this.verticalAngle);
    }

    public Span() {
    }
}
