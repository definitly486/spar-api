package m12;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.sbp_recurring.api.model.SbpSelectBankAppDialogArgs;
import ru.myspar.sbp_recurring.impl.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f64956ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f64957zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f64957zoijcleaow = storeFactory;
        this.f64956ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((SbpSelectBankAppDialogArgs) gxszxtbevo()).getBanks());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f64957zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f64958iobyxmoadg), this.f64956ppxfxbqfkf, new zoijcleaow());
    }
}
