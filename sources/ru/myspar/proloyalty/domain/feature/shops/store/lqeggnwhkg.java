package ru.myspar.proloyalty.domain.feature.shops.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f95834ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f95835wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f95834ppxfxbqfkf = storeFactory;
        this.f95835wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f95834ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.wkgbmnqykc.f95838iobyxmoadg, ppxfxbqfkf.C2251ppxfxbqfkf.f95837iobyxmoadg, ppxfxbqfkf.zoijcleaow.f95839iobyxmoadg, ppxfxbqfkf.iobyxmoadg.f95836iobyxmoadg), this.f95835wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ShopsArgs) gxszxtbevo()).getFlow(), false, ((ShopsArgs) gxszxtbevo()).getBannerId(), ((ShopsArgs) gxszxtbevo()).getBlockId(), null, null, null, null, null, null, null, null, null, false, null, null, null, false, 262130, null);
    }
}
