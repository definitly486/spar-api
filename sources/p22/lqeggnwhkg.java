package p22;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.api.model.ScanGoAmountProductDialogArgs;
import ru.myspar.scango.impl.screens.amountproduct.dialog.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f75447ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f75448zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f75448zoijcleaow = storeFactory;
        this.f75447ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, ((ScanGoAmountProductDialogArgs) gxszxtbevo()).getProductId(), null, false, null, null, 61, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f75448zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f75449iobyxmoadg, ppxfxbqfkf.zoijcleaow.f75450iobyxmoadg), this.f75447ppxfxbqfkf, new zoijcleaow());
    }
}
