package com.yandex.runtime.view.internal;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.yandex.runtime.view.PlatformView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class MemoryPressureListener implements ComponentCallbacks2 {
    private WeakReference<PlatformView> weakPlatformView;

    public MemoryPressureListener(PlatformView platformView) {
        this.weakPlatformView = new WeakReference<>(platformView);
    }

    private void onMemoryWarning() {
        PlatformView platformView = this.weakPlatformView.get();
        if (platformView != null) {
            platformView.onMemoryWarning();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onMemoryWarning();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        if (i13 == 80 || i13 == 20 || i13 == 10 || i13 == 15) {
            onMemoryWarning();
        }
    }
}
