package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ZoomRange implements Serializable {
    private int zMax;
    private int zMin;

    public ZoomRange(int i13, int i14) {
        this.zMin = i13;
        this.zMax = i14;
    }

    public int getZMax() {
        return this.zMax;
    }

    public int getZMin() {
        return this.zMin;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.zMin = archive.add(this.zMin);
        this.zMax = archive.add(this.zMax);
    }

    public ZoomRange() {
    }
}
