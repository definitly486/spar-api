package jq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.cart.impl.presentation.model.CartHeaderUiModel;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f52087zoijcleaow = pb0.zoijcleaow.f76305eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pb0.zoijcleaow f52088iobyxmoadg;

    public vdvldrhtss(pb0.zoijcleaow productToUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        this.f52088iobyxmoadg = productToUiModelMapper;
    }

    private final kq.dxjokdxxww iobyxmoadg(String str, List list, List list2, DeliveryCode deliveryCode, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52088iobyxmoadg.ppxfxbqfkf((Product) it.next(), list2, deliveryCode, true, false, false, (64 & 64) != 0 ? null : null, rgvfuqvkyqVar));
        }
        return new kq.dxjokdxxww(str, arrayList);
    }

    public final List zoijcleaow(List recommendations, List productDataList, DeliveryCode deliveryCode, tg.rgvfuqvkyq getStringRes) {
        kq.dxjokdxxww dxjokdxxwwVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        ArrayList arrayList = new ArrayList();
        Iterator it = recommendations.iterator();
        while (it.hasNext()) {
            ProductRecommendationsBlock productRecommendationsBlock = (ProductRecommendationsBlock) it.next();
            ProductRecommendationsBlock productRecommendationsBlock2 = !productRecommendationsBlock.getProducts().isEmpty() ? productRecommendationsBlock : null;
            if (productRecommendationsBlock2 != null && (dxjokdxxwwVarIobyxmoadg = iobyxmoadg(productRecommendationsBlock.getTitle(), productRecommendationsBlock2.getProducts(), productDataList, deliveryCode, getStringRes)) != null) {
                arrayList.add(new CartHeaderUiModel(productRecommendationsBlock.getTitle(), null, 2, null));
                arrayList.add(dxjokdxxwwVarIobyxmoadg);
            }
        }
        return arrayList;
    }
}
