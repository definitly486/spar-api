package u32;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.api.model.ScanGoWeightProductPartialArgs;
import ru.myspar.scango.impl.screens.weightproduct.partial.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f112595ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f112596zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f112596zoijcleaow = storeFactory;
        this.f112595ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ScanGoWeightProductPartialArgs) gxszxtbevo()).getProductId(), null, null, false, 14, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f112596zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f112597iobyxmoadg), this.f112595ppxfxbqfkf, new zoijcleaow());
    }
}
