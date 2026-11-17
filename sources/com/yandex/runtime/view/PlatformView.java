package com.yandex.runtime.view;

import android.view.View;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public interface PlatformView {
    void destroyNativePlatformView();

    NativeObject getNativePlatformView();

    View getView();

    boolean isDebugModeEnabled();

    void onMemoryWarning();

    void pause();

    void resume();

    void setNoninteractive(boolean z13);

    void start();

    void stop();
}
