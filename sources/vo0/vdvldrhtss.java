package vo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f117603zoijcleaow = o91.zoijcleaow.f72372eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o91.zoijcleaow f117604iobyxmoadg;

    public vdvldrhtss(o91.zoijcleaow productToUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        this.f117604iobyxmoadg = productToUiModelMapper;
    }

    private final wo0.btonecajqb iobyxmoadg(String str, List list, List list2, DeliveryCode deliveryCode, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f117604iobyxmoadg.ppxfxbqfkf((Product) it.next(), list2, deliveryCode, true, false, false, (64 & 64) != 0 ? null : null, rgvfuqvkyqVar));
        }
        return new wo0.btonecajqb(str, str, arrayList);
    }

    public final List zoijcleaow(List recommendations, List productDataList, DeliveryCode deliveryCode, tg.rgvfuqvkyq getStringRes) {
        wo0.btonecajqb btonecajqbVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        ArrayList arrayList = new ArrayList();
        Iterator it = recommendations.iterator();
        while (it.hasNext()) {
            ProductRecommendationsBlock productRecommendationsBlock = (ProductRecommendationsBlock) it.next();
            ProductRecommendationsBlock productRecommendationsBlock2 = !productRecommendationsBlock.getProducts().isEmpty() ? productRecommendationsBlock : null;
            if (productRecommendationsBlock2 != null && (btonecajqbVarIobyxmoadg = iobyxmoadg(productRecommendationsBlock.getTitle(), productRecommendationsBlock2.getProducts(), productDataList, deliveryCode, getStringRes)) != null) {
                arrayList.add(btonecajqbVarIobyxmoadg);
            }
        }
        return arrayList;
    }
}
