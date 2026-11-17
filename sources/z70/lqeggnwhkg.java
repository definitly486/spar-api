package z70;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.domain.feature.rateorder.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f129262ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f129263zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f129263zoijcleaow = storeFactory;
        this.f129262ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((RateOrderDialogArgs) gxszxtbevo()).getId(), 0, ((RateOrderDialogArgs) gxszxtbevo()).getDate(), ((RateOrderDialogArgs) gxszxtbevo()).getAddress(), ((RateOrderDialogArgs) gxszxtbevo()).getTotalPriceInt(), ((RateOrderDialogArgs) gxszxtbevo()).getTotalPriceFractional(), false, 2, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f129263zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f129264iobyxmoadg), this.f129262ppxfxbqfkf, new zoijcleaow());
    }
}
