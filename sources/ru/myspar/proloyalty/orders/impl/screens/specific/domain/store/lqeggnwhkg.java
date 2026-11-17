package ru.myspar.proloyalty.orders.impl.screens.specific.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f98917eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f98918ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f98919wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f98918ppxfxbqfkf = storeFactory;
        this.f98919wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f98918ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f98920iobyxmoadg), this.f98919wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f98917eablkybsjg;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, ((SpecificOrderArgs) gxszxtbevo()).getOrderId(), ((SpecificOrderArgs) gxszxtbevo()).getOrderServerStatus(), ((SpecificOrderArgs) gxszxtbevo()).getOpenPaymentScreenOnStart(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, 0, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, null, null, 0, false, false, false, null, false, null, false, null, null, null, -15, 131071, null);
    }
}
