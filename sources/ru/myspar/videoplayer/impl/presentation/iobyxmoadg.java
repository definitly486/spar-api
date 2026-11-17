package ru.myspar.videoplayer.impl.presentation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.ppxfxbqfkf;
import m9.wkgbmnqykc;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(VideoPlayerArgs videoPlayerArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return VideoPlayerFragment.INSTANCE.iobyxmoadg(videoPlayerArgs);
    }

    public static final wkgbmnqykc zoijcleaow(final VideoPlayerArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, null, false, new ppxfxbqfkf() { // from class: wa2.dxjokdxxww
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ru.myspar.videoplayer.impl.presentation.iobyxmoadg.ppxfxbqfkf(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
