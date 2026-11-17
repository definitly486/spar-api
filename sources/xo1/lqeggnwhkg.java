package xo1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;
import ru.myspar.proloyalty.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f122969ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f122970wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f122969ppxfxbqfkf = storeFactory;
        this.f122970wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f122969ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f122970wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ScanExciseStickerDialogArgs) gxszxtbevo()).getIsRemove(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getIsWeightProduct(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getProduct(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getScanGoAmountMode());
    }
}
