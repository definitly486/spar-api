package com.yandex.runtime.bindings;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class PointHandler implements ArchivingHandler<PointF> {
    private final boolean isOptional;

    public PointHandler() {
        this(false);
    }

    public PointHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public PointF add(PointF pointF, Archive archive) {
        return archive.add(pointF, this.isOptional);
    }
}
