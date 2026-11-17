package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenPoint implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f25442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f25443y;

    public ScreenPoint(float f13, float f14) {
        this.f25442x = f13;
        this.f25443y = f14;
    }

    public float getX() {
        return this.f25442x;
    }

    public float getY() {
        return this.f25443y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f25442x = archive.add(this.f25442x);
        this.f25443y = archive.add(this.f25443y);
    }

    public ScreenPoint() {
    }
}
