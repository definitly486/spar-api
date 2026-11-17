package ru.myspar.videoplayer.impl.domain.store;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import vs.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final va2.iobyxmoadg f104661ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f104662zoijcleaow;

    public iobyxmoadg(lqeggnwhkg storeFactory, va2.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f104662zoijcleaow = storeFactory;
        this.f104661ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public VideoPlayerStore$State dxjokdxxww() {
        return VideoPlayerStore$State.Idle.f104660zdlpuopuiu;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(VideoPlayerStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow.wkgbmnqykc(this, this.f104662zoijcleaow, state, null, this.f104661ppxfxbqfkf, new va2.zoijcleaow(), 2, null);
    }
}
