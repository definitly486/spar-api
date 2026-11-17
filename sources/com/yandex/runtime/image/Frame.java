package com.yandex.runtime.image;

/* JADX INFO: loaded from: classes3.dex */
public class Frame {
    private final long duration;
    private final ImageProvider image;

    public Frame(ImageProvider imageProvider, long j13) {
        this.image = imageProvider;
        this.duration = j13;
    }

    public long getDuration() {
        return this.duration;
    }

    public ImageProvider getImage() {
        return this.image;
    }
}
