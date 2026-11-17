package com.yandex.mapkit.map;

import com.yandex.runtime.image.AnimatedImageProvider;

/* JADX INFO: loaded from: classes3.dex */
public interface PlacemarkAnimation extends PlacemarkPresentation {
    boolean isReversed();

    void pause();

    void play();

    void play(Callback callback);

    void resume();

    void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle);

    void setIcon(AnimatedImageProvider animatedImageProvider, IconStyle iconStyle, Callback callback);

    void setIconStyle(IconStyle iconStyle);

    void setReversed(boolean z13);

    void stop();
}
