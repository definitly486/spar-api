package op1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.api.model.ScanGoWeightProductDialogArgs;
import ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f73414ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f73415wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f73414ppxfxbqfkf = storeFactory;
        this.f73415wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f73414ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.zoijcleaow.f73417iobyxmoadg, ppxfxbqfkf.iobyxmoadg.f73416iobyxmoadg), this.f73415wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ScanGoWeightProductDialogArgs) gxszxtbevo()).getProductId(), null, null, null, null, 0.0d, null, null, null, null, null, 0.0d, false, 8190, null);
    }
}
