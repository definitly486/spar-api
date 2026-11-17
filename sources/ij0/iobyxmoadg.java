package ij0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.productreplacement.ProductReplaceModel;
import ru.myspar.core.domain.models.order.productreplacement.ProductsForReplaceModel;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f44579iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f44580zoijcleaow;

    public iobyxmoadg(ppxfxbqfkf productToReplaceMapper, eablkybsjg productForReplaceMapper) {
        zdlpuopuiu.btonecajqb(productToReplaceMapper, "productToReplaceMapper");
        zdlpuopuiu.btonecajqb(productForReplaceMapper, "productForReplaceMapper");
        this.f44579iobyxmoadg = productToReplaceMapper;
        this.f44580zoijcleaow = productForReplaceMapper;
    }

    private final ru.ppxfxbqfkf zoijcleaow(ProductReplaceModel productReplaceModel, DeliveryCode deliveryCode) {
        ru.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = this.f44579iobyxmoadg.ppxfxbqfkf(productReplaceModel.getProductToReplace(), deliveryCode, true);
        List<ProductsForReplaceModel> productsForReplace = productReplaceModel.getProductsForReplace();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productsForReplace, 10));
        for (ProductsForReplaceModel productsForReplaceModel : productsForReplace) {
            arrayList.add(this.f44580zoijcleaow.zoijcleaow(productReplaceModel.getProductToReplace().getArticle(), productsForReplaceModel, deliveryCode, productReplaceModel.getProductToReplace().getAvailable()));
        }
        return new ru.ppxfxbqfkf(iobyxmoadgVarPpxfxbqfkf, arrayList);
    }

    public final List iobyxmoadg(List items, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(items, "items");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((ProductReplaceModel) it.next(), deliveryCode));
        }
        return arrayList;
    }
}
