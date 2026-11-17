package com.yandex.runtime.view.internal;

import android.view.Surface;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformVulkanRenderer {
    private NativeObject nativeObject;

    public PlatformVulkanRenderer(boolean z13) {
        this.nativeObject = null;
        this.nativeObject = createNative(z13);
    }

    private static native NativeObject createNative(boolean z13);

    public native boolean isDebugModeEnabled();

    public native void surfaceChanged(Surface surface, int i13, int i14);

    public native void surfaceCreated(Surface surface, int i13, int i14);

    public native void surfaceDestroyed(Surface surface);
}
