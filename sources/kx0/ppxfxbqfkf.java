package kx0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import rx0.ProductCardDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final ProductCardDto iobyxmoadg(ProductData productData) {
        zdlpuopuiu.btonecajqb(productData, "<this>");
        return new ProductCardDto(productData.getId(), productData.getQuantity(), productData.getMeasureType().getValue());
    }
}
