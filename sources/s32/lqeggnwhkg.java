package s32;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.api.model.ScanGoWeightProductDialogArgs;
import ru.myspar.scango.impl.screens.weightproduct.dialog.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f105437ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f105438zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f105438zoijcleaow = storeFactory;
        this.f105437ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ScanGoWeightProductDialogArgs) gxszxtbevo()).getProductId(), null, null, null, null, 0.0d, null, null, null, null, null, 0.0d, false, 8190, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f105438zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.zoijcleaow.f105440iobyxmoadg, ppxfxbqfkf.iobyxmoadg.f105439iobyxmoadg), this.f105437ppxfxbqfkf, new zoijcleaow());
    }
}
