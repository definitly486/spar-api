package com.yandex.mapkit.geometry.geo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class XYPoint implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private double f25447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private double f25448y;

    public XYPoint(double d13, double d14) {
        this.f25447x = d13;
        this.f25448y = d14;
    }

    public double getX() {
        return this.f25447x;
    }

    public double getY() {
        return this.f25448y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f25447x = archive.add(this.f25447x);
        this.f25448y = archive.add(this.f25448y);
    }

    public XYPoint() {
    }
}
