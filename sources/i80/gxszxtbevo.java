package i80;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.sparclub.store.SparClubStore$State;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f42121ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f42122zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f42122zoijcleaow = storeFactory;
        this.f42121ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public SparClubStore$State dxjokdxxww() {
        return SparClubStore$State.f88083zdlpuopuiu;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(SparClubStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return vs.zoijcleaow.wkgbmnqykc(this, this.f42122zoijcleaow, state, null, this.f42121ppxfxbqfkf, new zoijcleaow(), 2, null);
    }
}
