package ru.myspar.domain.feature.shops.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f88057ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f88058zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f88058zoijcleaow = storeFactory;
        this.f88057ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ShopsArgs) gxszxtbevo()).getFlow(), false, ((ShopsArgs) gxszxtbevo()).getBannerId(), ((ShopsArgs) gxszxtbevo()).getBlockId(), null, null, null, null, null, null, null, null, null, false, null, null, null, false, 262130, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f88058zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.wkgbmnqykc.f88061iobyxmoadg, ppxfxbqfkf.C2014ppxfxbqfkf.f88060iobyxmoadg, ppxfxbqfkf.zoijcleaow.f88062iobyxmoadg, ppxfxbqfkf.iobyxmoadg.f88059iobyxmoadg), this.f88057ppxfxbqfkf, new zoijcleaow());
    }
}
