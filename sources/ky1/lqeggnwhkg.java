package ky1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.purchases.impl.list_shared_with_you.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f61087ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f61088zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f61088zoijcleaow = storeFactory;
        this.f61087ppxfxbqfkf = executor;
    }

    private final State wflxmlrfwp(PurchaseListSharedWithYouDialogArgs purchaseListSharedWithYouDialogArgs) {
        return new State(purchaseListSharedWithYouDialogArgs.getPurchaseListId(), purchaseListSharedWithYouDialogArgs.getPurchaseListName(), purchaseListSharedWithYouDialogArgs.getProductsCount(), purchaseListSharedWithYouDialogArgs.getIsUserHasTheSamePurchaseList(), purchaseListSharedWithYouDialogArgs.getIsPurchaseListFeatureEnabled(), false, 32, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return wflxmlrfwp((PurchaseListSharedWithYouDialogArgs) gxszxtbevo());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f61088zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f61089iobyxmoadg), this.f61087ppxfxbqfkf, new zoijcleaow());
    }
}
