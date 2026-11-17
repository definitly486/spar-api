package qj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.purchases.impl.list_shared_with_you.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f78945ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f78946wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f78945ppxfxbqfkf = storeFactory;
        this.f78946wkgbmnqykc = executor;
    }

    private final State agtfadlqog(PurchaseListSharedWithYouDialogArgs purchaseListSharedWithYouDialogArgs) {
        return new State(purchaseListSharedWithYouDialogArgs.getPurchaseListId(), purchaseListSharedWithYouDialogArgs.getPurchaseListName(), purchaseListSharedWithYouDialogArgs.getProductsCount(), purchaseListSharedWithYouDialogArgs.getIsUserHasTheSamePurchaseList(), purchaseListSharedWithYouDialogArgs.getIsPurchaseListFeatureEnabled(), false, 32, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f78945ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.f78947iobyxmoadg), this.f78946wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return agtfadlqog((PurchaseListSharedWithYouDialogArgs) gxszxtbevo());
    }
}
