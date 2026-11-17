package oj1;

import bz0.eablkybsjg;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseProduct;
import tg.draadjrbmk;
import ti1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q41.iobyxmoadg f72993iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f72994zoijcleaow;

    public zoijcleaow(q41.iobyxmoadg resourcesManager, eablkybsjg productInteractor) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f72993iobyxmoadg = resourcesManager;
        this.f72994zoijcleaow = productInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ppxfxbqfkf(zoijcleaow zoijcleaowVar, int i13) {
        return zoijcleaowVar.f72993iobyxmoadg.getString(i13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final pj1.ppxfxbqfkf zoijcleaow(PurchaseProduct product, List list, DeliveryCode deliveryCode) {
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
            strPpxfxbqfkf = this.f72993iobyxmoadg.getString(nufgyqmvbu.proloyalty_discount_badge, Integer.valueOf(discount2.intValue()));
            if (strPpxfxbqfkf == null) {
                strPpxfxbqfkf = dxjokdxxww.ppxfxbqfkf();
            }
        } else {
            strPpxfxbqfkf = dxjokdxxww.ppxfxbqfkf();
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
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f72994zoijcleaow.iobyxmoadg(product.getIsAvailable(), product.getIsProductWithZeroPrice(), new draadjrbmk() { // from class: oj1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.ppxfxbqfkf(this.f72991zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        return new pj1.ppxfxbqfkf(product.getId(), product.getName(), product.getArticle(), product.getPrice(), product.getOldPrice(), product.getDiscount(), z13, str, rs0.iobyxmoadg.eablkybsjg(product.getHints()), measureTypeModelPpxfxbqfkf, product.getAvgWeight(), product.getIsProductWithZeroPrice(), false, false, product.getIsDispPer100(), product.getIsFavorite(), product.getPic(), product.getCountry(), product.getRegion(), product.getCountryFlagEmoji(), product.getHidePrice(), product.getRating(), product.getReviews(), quantity, null, is0.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), productData != null, productData != null ? productData.getIsLoading() : false, product.getPrice(), product.getOldPrice(), product.getAvgWeight(), product.getIsDispPer100(), quantity, measureTypeModelPpxfxbqfkf.nufgyqmvbu(), measureType, productData != null ? productData.getMessageType() : null, null), deliveryCode, availabilityUiModelIobyxmoadg, null, 268435456, null);
    }
}
