package ru.myspar.proloyalty.cart.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f92874eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f92875ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f92876wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f92875ppxfxbqfkf = storeFactory;
        this.f92876wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f92875ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f92878iobyxmoadg, ppxfxbqfkf.wkgbmnqykc.f92880iobyxmoadg, ppxfxbqfkf.zoijcleaow.f92881iobyxmoadg, ppxfxbqfkf.eablkybsjg.f92877iobyxmoadg, ppxfxbqfkf.C2174ppxfxbqfkf.f92879iobyxmoadg), this.f92876wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f92874eablkybsjg;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, false, false, false, null, null, null, null, null, null, null, false, null, null, false, 32767, null);
    }
}
