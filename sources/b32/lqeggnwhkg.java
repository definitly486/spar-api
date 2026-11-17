package b32;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;
import ru.myspar.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f15090ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f15091zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f15091zoijcleaow = storeFactory;
        this.f15090ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ScanExciseStickerDialogArgs) gxszxtbevo()).getIsRemove(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getIsWeightProduct(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getProduct(), ((ScanExciseStickerDialogArgs) gxszxtbevo()).getScanGoAmountMode());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f15091zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f15090ppxfxbqfkf, new zoijcleaow());
    }
}
