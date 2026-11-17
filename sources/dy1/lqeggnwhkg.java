package dy1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.purchases.impl.list_add_product.domain.model.AddProductType;
import ru.myspar.purchases.impl.list_add_product.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f29956ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f29957zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f29957zoijcleaow = storeFactory;
        this.f29956ppxfxbqfkf = executor;
    }

    private final State wflxmlrfwp(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs) {
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

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return wflxmlrfwp((PurchaseListAddProductDialogArgs) gxszxtbevo());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f29957zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f29958iobyxmoadg), this.f29956ppxfxbqfkf, new zoijcleaow());
    }
}
