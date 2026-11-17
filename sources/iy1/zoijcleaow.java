package iy1;

import j00.gxszxtbevo;
import java.util.Iterator;
import java.util.List;
import k30.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import nx1.nufgyqmvbu;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.purchases_list.api.models.PurchaseProduct;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f50035iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f50036zoijcleaow;

    public zoijcleaow(d60.iobyxmoadg resourcesManager, gxszxtbevo productInteractor) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f50035iobyxmoadg = resourcesManager;
        this.f50036zoijcleaow = productInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ppxfxbqfkf(zoijcleaow zoijcleaowVar, int i13) {
        return zoijcleaowVar.f50035iobyxmoadg.getString(i13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final jy1.ppxfxbqfkf zoijcleaow(PurchaseProduct product, List list, DeliveryCode deliveryCode) {
        boolean z13;
        String strPpxfxbqfkf;
        ProductData productData;
        MeasureType originalMeasure;
        Object next;
        zdlpuopuiu.btonecajqb(product, "product");
        if (product.getDiscount() != null) {
            Integer discount = product.getDiscount();
            zdlpuopuiu.lqeggnwhkg(discount);
            if (discount.intValue() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        Integer discount2 = product.getDiscount();
        if (discount2 != null) {
            strPpxfxbqfkf = this.f50035iobyxmoadg.getString(nufgyqmvbu.discount_badge, Integer.valueOf(discount2.intValue()));
            if (strPpxfxbqfkf == null) {
                strPpxfxbqfkf = draadjrbmk.ppxfxbqfkf();
            }
        } else {
            strPpxfxbqfkf = draadjrbmk.ppxfxbqfkf();
        }
        String str = strPpxfxbqfkf;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((ProductData) next).getId(), product.getId()));
            productData = (ProductData) next;
        } else {
            productData = null;
        }
        if (productData == null || (originalMeasure = productData.getMeasureType()) == null) {
            originalMeasure = product.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureType measureType = originalMeasure;
        double quantity = productData != null ? productData.getQuantity() : product.getQuantity();
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(product.getMeasureTypeModel(), null, null, measureType, 3, null);
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f50036zoijcleaow.iobyxmoadg(product.getIsAvailable(), false, product.getIsProductWithZeroPrice(), false, new tg.draadjrbmk() { // from class: iy1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.ppxfxbqfkf(this.f50033zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        return new jy1.ppxfxbqfkf(product.getId(), product.getName(), product.getArticle(), product.getPrice(), product.getOldPrice(), product.getDiscount(), z13, str, xt.iobyxmoadg.eablkybsjg(product.getHints()), measureTypeModelPpxfxbqfkf, product.getAvgWeight(), product.getIsProductWithZeroPrice(), false, false, product.getIsDispPer100(), product.getIsFavorite(), product.getPic(), product.getCountry(), product.getRegion(), product.getCountryFlagEmoji(), product.getHidePrice(), product.getRating(), product.getReviews(), quantity, null, pt.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), productData != null, productData != null ? productData.getIsLoading() : false, product.getPrice(), product.getOldPrice(), product.getAvgWeight(), product.getIsDispPer100(), quantity, measureTypeModelPpxfxbqfkf.nufgyqmvbu(), measureType, productData != null ? productData.getMessageType() : null, null), deliveryCode, availabilityUiModelIobyxmoadg, null, 268435456, null);
    }
}
