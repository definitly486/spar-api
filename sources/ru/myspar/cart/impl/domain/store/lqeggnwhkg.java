package ru.myspar.cart.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f84943ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f84944zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f84944zoijcleaow = storeFactory;
        this.f84943ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, false, false, false, null, null, null, null, null, null, null, false, null, null, false, 32767, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f84944zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f84946iobyxmoadg, ppxfxbqfkf.wkgbmnqykc.f84948iobyxmoadg, ppxfxbqfkf.zoijcleaow.f84949iobyxmoadg, ppxfxbqfkf.eablkybsjg.f84945iobyxmoadg, ppxfxbqfkf.C1932ppxfxbqfkf.f84947iobyxmoadg), this.f84943ppxfxbqfkf, new zoijcleaow());
    }
}
