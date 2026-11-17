package ru.myspar.orders.impl.screens.specific.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.orders.api.model.SpecificOrderArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f91273ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f91274zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f91274zoijcleaow = storeFactory;
        this.f91273ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, ((SpecificOrderArgs) gxszxtbevo()).getOrderId(), ((SpecificOrderArgs) gxszxtbevo()).getOrderServerStatus(), ((SpecificOrderArgs) gxszxtbevo()).getOpenPaymentScreenOnStart(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, 0, false, false, false, false, false, false, false, false, null, null, false, false, false, false, null, null, 0, false, false, false, null, false, null, false, null, null, null, -15, 65535, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f91274zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f91275iobyxmoadg), this.f91273ppxfxbqfkf, new zoijcleaow());
    }
}
