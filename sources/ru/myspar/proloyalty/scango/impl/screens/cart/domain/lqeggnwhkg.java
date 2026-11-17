package ru.myspar.proloyalty.scango.impl.screens.cart.domain;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zoijcleaow f100682eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f100683ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f100684wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor, zoijcleaow reducer) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        this.f100683ppxfxbqfkf = storeFactory;
        this.f100684wkgbmnqykc = executor;
        this.f100682eablkybsjg = reducer;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f100683ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f100687iobyxmoadg), this.f100684wkgbmnqykc, this.f100682eablkybsjg);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, null, null, false, null, null, false, false, 0L, null, null, null, 4095, null);
    }
}
