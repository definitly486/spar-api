package v00;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final Product iobyxmoadg(List list, String productId) {
        Product product;
        zdlpuopuiu.btonecajqb(list, "<this>");
        zdlpuopuiu.btonecajqb(productId, "productId");
        Iterator it = list.iterator();
        do {
            product = null;
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            for (Object obj2 : ((ProductRecommendationsBlock) it.next()).getProducts()) {
                if (zdlpuopuiu.eablkybsjg(((Product) obj2).getId(), productId)) {
                    obj = obj2;
                    break;
                }
            }
            product = (Product) obj;
        } while (product == null);
        return product;
    }
}
