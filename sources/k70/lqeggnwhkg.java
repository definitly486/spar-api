package k70;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f54107ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f54108zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f54108zoijcleaow = storeFactory;
        this.f54107ppxfxbqfkf = executor;
    }

    private final State wflxmlrfwp(BuildYourComboDialogArgs buildYourComboDialogArgs) {
        return new State(buildYourComboDialogArgs.getSelectedProductFirst(), buildYourComboDialogArgs.getSelectedProductSecond(), buildYourComboDialogArgs.getProductsFirst(), buildYourComboDialogArgs.getProductsSecond());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return wflxmlrfwp((BuildYourComboDialogArgs) gxszxtbevo());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f54108zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f54109iobyxmoadg), this.f54107ppxfxbqfkf, new zoijcleaow());
    }
}
