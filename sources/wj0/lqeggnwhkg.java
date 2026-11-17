package wj0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.payment.impl.web.domain.store.State;
import ru.myspar.payment.impl.web.presentation.PaymentFlowParams;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f119988ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f119989zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f119989zoijcleaow = storeFactory;
        this.f119988ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, 0.0d, (PaymentFlowParams) gxszxtbevo(), 3, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f119989zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f119990iobyxmoadg), this.f119988ppxfxbqfkf, new zoijcleaow());
    }
}
