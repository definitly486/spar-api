package py;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.ProductData;
import xy.ProductCardDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {
    public static final ProductCardDto iobyxmoadg(ProductData productData) {
        zdlpuopuiu.btonecajqb(productData, "<this>");
        return new ProductCardDto(productData.getId(), productData.getQuantity(), productData.getMeasureType().getValue());
    }
}
