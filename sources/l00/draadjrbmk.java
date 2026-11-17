package l00;

import d10.OrderChangeProductsRequest;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.ProductData;
import s00.CartChangeProductsRequest;

/* JADX INFO: loaded from: classes4.dex */
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
