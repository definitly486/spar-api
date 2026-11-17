package ru.myspar.favorites.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f88477ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f88478zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f88478zoijcleaow = storeFactory;
        this.f88477ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, null, false, null, false, null, false, false, false, null, null, 0, false, null, null, null, 65535, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f88478zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f88479iobyxmoadg), this.f88477ppxfxbqfkf, new zoijcleaow());
    }
}
