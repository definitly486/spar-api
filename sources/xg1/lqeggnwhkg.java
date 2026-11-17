package xg1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.kcexrzcfyt;
import ru.myspar.proloyalty.payment.impl.web.domain.store.State;
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFlowParams;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final kcexrzcfyt f122358eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f122359ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f122360wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor, kcexrzcfyt getTokenUseCase) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        zdlpuopuiu.btonecajqb(getTokenUseCase, "getTokenUseCase");
        this.f122359ppxfxbqfkf = storeFactory;
        this.f122360wkgbmnqykc = executor;
        this.f122358eablkybsjg = getTokenUseCase;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f122359ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f122361iobyxmoadg), this.f122360wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, 0.0d, (PaymentFlowParams) gxszxtbevo(), (String) this.f122358eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), 3, null);
    }
}
