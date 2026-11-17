package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import a8.lqeggnwhkg;
import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f99529ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f99530wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f99529ppxfxbqfkf = storeFactory;
        this.f99530wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f99529ppxfxbqfkf, state, new a8.wkgbmnqykc(vi1.iobyxmoadg.f117014iobyxmoadg), this.f99530wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs = (CreatePurchaseListsFragmentArgs) gxszxtbevo();
        CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs2 = (CreatePurchaseListsFragmentArgs) gxszxtbevo();
        return new State(false, createPurchaseListsFragmentArgs, createPurchaseListsFragmentArgs2 instanceof CreatePurchaseListsFragmentArgs.ProductsListFromBanner ? new tzroggbefp(((CreatePurchaseListsFragmentArgs.ProductsListFromBanner) createPurchaseListsFragmentArgs2).getProductListName(), 0L, (l) null, 6, (gtknphoqwx) null) : new tzroggbefp("", 0L, (l) null, 6, (gtknphoqwx) null), 1, null);
    }
}
