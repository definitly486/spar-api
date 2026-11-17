package com.yandex.runtime.view.internal;

import android.graphics.PointF;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public class SurfaceBinding implements Surface {
    private final NativeObject nativeObject;

    protected SurfaceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.view.Surface
    public native PointF getAnchorPoint();

    @Override // com.yandex.runtime.view.Surface
    public native void setAnchorPoint(PointF pointF);
}
