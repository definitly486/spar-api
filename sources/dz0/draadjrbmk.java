package dz0;

import jz0.CartChangeProductsRequest;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import tz0.OrderChangeProductsRequest;

/* JADX INFO: loaded from: classes5.dex */
public abstract class draadjrbmk {
    public static final CartChangeProductsRequest.ChangeProductDto iobyxmoadg(ProductData productData) {
        zdlpuopuiu.btonecajqb(productData, "<this>");
        return new CartChangeProductsRequest.ChangeProductDto(productData.getId(), productData.getArticle(), productData.getQuantity(), productData.getMeasureType().getValue());
    }

    public static final OrderChangeProductsRequest.ChangeProductDto zoijcleaow(ProductData productData) {
        zdlpuopuiu.btonecajqb(productData, "<this>");
        return new OrderChangeProductsRequest.ChangeProductDto(productData.getId(), productData.getArticle(), productData.getQuantity(), productData.getMeasureType().getValue());
    }
}
