package ru.myspar.proloyalty.videoplayer.impl.domain.store;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import or0.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f102016ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sw1.iobyxmoadg f102017wkgbmnqykc;

    public iobyxmoadg(lqeggnwhkg storeFactory, sw1.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f102016ppxfxbqfkf = storeFactory;
        this.f102017wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(VideoPlayerStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow.wkgbmnqykc(this, this.f102016ppxfxbqfkf, state, null, this.f102017wkgbmnqykc, new sw1.zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public VideoPlayerStore$State btonecajqb() {
        return VideoPlayerStore$State.Idle.f102015zdlpuopuiu;
    }
}
