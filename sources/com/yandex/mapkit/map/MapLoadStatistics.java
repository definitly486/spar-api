package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MapLoadStatistics implements Serializable {
    private long curZoomGeometryLoaded;
    private long curZoomLabelsLoaded;
    private long curZoomModelsLoaded;
    private long curZoomPlacemarksLoaded;
    private long delayedGeometryLoaded;
    private long fullyAppeared;
    private long fullyLoaded;
    private int renderObjectCount;
    private int tileMemoryUsage;

    public MapLoadStatistics(long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i13, int i14) {
        this.curZoomGeometryLoaded = j13;
        this.curZoomPlacemarksLoaded = j14;
        this.curZoomLabelsLoaded = j15;
        this.delayedGeometryLoaded = j16;
        this.curZoomModelsLoaded = j17;
        this.fullyLoaded = j18;
        this.fullyAppeared = j19;
        this.renderObjectCount = i13;
        this.tileMemoryUsage = i14;
    }

    public long getCurZoomGeometryLoaded() {
        return this.curZoomGeometryLoaded;
    }

    public long getCurZoomLabelsLoaded() {
        return this.curZoomLabelsLoaded;
    }

    public long getCurZoomModelsLoaded() {
        return this.curZoomModelsLoaded;
    }

    public long getCurZoomPlacemarksLoaded() {
        return this.curZoomPlacemarksLoaded;
    }

    public long getDelayedGeometryLoaded() {
        return this.delayedGeometryLoaded;
    }

    public long getFullyAppeared() {
        return this.fullyAppeared;
    }

    public long getFullyLoaded() {
        return this.fullyLoaded;
    }

    public int getRenderObjectCount() {
        return this.renderObjectCount;
    }

    public int getTileMemoryUsage() {
        return this.tileMemoryUsage;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.curZoomGeometryLoaded = archive.add(this.curZoomGeometryLoaded);
        this.curZoomPlacemarksLoaded = archive.add(this.curZoomPlacemarksLoaded);
        this.curZoomLabelsLoaded = archive.add(this.curZoomLabelsLoaded);
        this.delayedGeometryLoaded = archive.add(this.delayedGeometryLoaded);
        this.curZoomModelsLoaded = archive.add(this.curZoomModelsLoaded);
        this.fullyLoaded = archive.add(this.fullyLoaded);
        this.fullyAppeared = archive.add(this.fullyAppeared);
        this.renderObjectCount = archive.add(this.renderObjectCount);
        this.tileMemoryUsage = archive.add(this.tileMemoryUsage);
    }

    public MapLoadStatistics() {
    }
}
