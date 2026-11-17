package jj1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.purchases.impl.list_add_product.domain.model.AddProductType;
import ru.myspar.proloyalty.purchases.impl.list_add_product.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f51615ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f51616wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f51615ppxfxbqfkf = storeFactory;
        this.f51616wkgbmnqykc = executor;
    }

    private final State agtfadlqog(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs) {
        if (purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.ProductsListFromBanner) {
            PurchaseListAddProductDialogArgs.ProductsListFromBanner productsListFromBanner = (PurchaseListAddProductDialogArgs.ProductsListFromBanner) purchaseListAddProductDialogArgs;
            return new State(new AddProductType.ProductsListFromBanner(productsListFromBanner.getProductListName(), productsListFromBanner.getBlockId()), productsListFromBanner.getPurchaseLists(), false, 4, null);
        }
        if (!(purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.SingleProduct)) {
            throw new NoWhenBranchMatchedException();
        }
        PurchaseListAddProductDialogArgs.SingleProduct singleProduct = (PurchaseListAddProductDialogArgs.SingleProduct) purchaseListAddProductDialogArgs;
        return new State(new AddProductType.SingleProduct(singleProduct.getArticle(), singleProduct.getQuantity(), singleProduct.getMeasure()), singleProduct.getPurchaseLists(), false, 4, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f51615ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.f51617iobyxmoadg), this.f51616wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return agtfadlqog((PurchaseListAddProductDialogArgs) gxszxtbevo());
    }
}
