package aq0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.impl.search.domain.State;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends or0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final r01.lqeggnwhkg f14091eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f14092gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f14093ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f14094wkgbmnqykc;

    public dxjokdxxww(a8.lqeggnwhkg storeFactory, ppxfxbqfkf executor, r01.lqeggnwhkg getIsProductsGridUseCase) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        zdlpuopuiu.btonecajqb(getIsProductsGridUseCase, "getIsProductsGridUseCase");
        this.f14093ppxfxbqfkf = storeFactory;
        this.f14094wkgbmnqykc = executor;
        this.f14091eablkybsjg = getIsProductsGridUseCase;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f14093ppxfxbqfkf, state, new a8.wkgbmnqykc(eablkybsjg.zoijcleaow.f14103iobyxmoadg, eablkybsjg.iobyxmoadg.f14098iobyxmoadg, eablkybsjg.lqeggnwhkg.f14099iobyxmoadg, eablkybsjg.dxjokdxxww.f14095iobyxmoadg, eablkybsjg.nufgyqmvbu.f14100iobyxmoadg, eablkybsjg.C0216eablkybsjg.f14096iobyxmoadg, eablkybsjg.wkgbmnqykc.f14102iobyxmoadg, eablkybsjg.gxszxtbevo.f14097iobyxmoadg, eablkybsjg.ppxfxbqfkf.f14101iobyxmoadg), this.f14094wkgbmnqykc, new wkgbmnqykc());
    }

    @Override // or0.zoijcleaow
    public boolean nufgyqmvbu() {
        return this.f14092gxszxtbevo;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State((SearchPayload) gxszxtbevo(), ((Boolean) this.f14091eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue(), mz0.wkgbmnqykc.ppxfxbqfkf(((SearchPayload) gxszxtbevo()).getSortType()), false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, 524280, null);
    }
}
