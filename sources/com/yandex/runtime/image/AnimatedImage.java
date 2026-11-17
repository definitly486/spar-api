package com.yandex.runtime.image;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AnimatedImage {
    public static final int INFINITE_ANIMATION = 0;
    private final List<Frame> frames;
    private final int loopCount;

    public AnimatedImage(int i13, List<Frame> list) {
        this.frames = list;
        this.loopCount = i13;
    }

    public void addFrame(ImageProvider imageProvider, long j13) {
        this.frames.add(new Frame(imageProvider, j13));
    }

    public List<Frame> getFrames() {
        return this.frames;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public AnimatedImage(int i13) {
        this(i13, new ArrayList());
    }
}
