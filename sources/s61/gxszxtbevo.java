package s61;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.sparclub.store.SparClubStore$State;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f105605ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f105606wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f105605ppxfxbqfkf = storeFactory;
        this.f105606wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(SparClubStore$State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return or0.zoijcleaow.wkgbmnqykc(this, this.f105605ppxfxbqfkf, state, null, this.f105606wkgbmnqykc, new zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public SparClubStore$State btonecajqb() {
        return SparClubStore$State.f95860zdlpuopuiu;
    }
}
