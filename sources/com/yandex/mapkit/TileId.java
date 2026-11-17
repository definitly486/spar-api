package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TileId implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25445y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f25446z;

    public TileId(int i13, int i14, int i15) {
        this.f25444x = i13;
        this.f25445y = i14;
        this.f25446z = i15;
    }

    public int getX() {
        return this.f25444x;
    }

    public int getY() {
        return this.f25445y;
    }

    public int getZ() {
        return this.f25446z;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f25444x = archive.add(this.f25444x);
        this.f25445y = archive.add(this.f25445y);
        this.f25446z = archive.add(this.f25446z);
    }

    public TileId() {
    }
}
