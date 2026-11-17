package ru.myspar.purchases.impl.create_list.domain.store;

import a8.lqeggnwhkg;
import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f102237ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f102238zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f102238zoijcleaow = storeFactory;
        this.f102237ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs = (CreatePurchaseListsFragmentArgs) gxszxtbevo();
        CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs2 = (CreatePurchaseListsFragmentArgs) gxszxtbevo();
        return new State(false, createPurchaseListsFragmentArgs, createPurchaseListsFragmentArgs2 instanceof CreatePurchaseListsFragmentArgs.ProductsListFromBanner ? new tzroggbefp(((CreatePurchaseListsFragmentArgs.ProductsListFromBanner) createPurchaseListsFragmentArgs2).getProductListName(), 0L, (l) null, 6, (gtknphoqwx) null) : new tzroggbefp("", 0L, (l) null, 6, (gtknphoqwx) null), 1, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f102238zoijcleaow, state, new a8.wkgbmnqykc(px1.iobyxmoadg.f77458iobyxmoadg), this.f102237ppxfxbqfkf, new zoijcleaow());
    }
}
