package jg1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ProductToReplaceModel;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q41.iobyxmoadg f51284iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bz0.eablkybsjg f51285zoijcleaow;

    public ppxfxbqfkf(q41.iobyxmoadg resourcesManager, bz0.eablkybsjg productInteractor) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f51284iobyxmoadg = resourcesManager;
        this.f51285zoijcleaow = productInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return ppxfxbqfkfVar.f51284iobyxmoadg.getString(i13);
    }

    private final int zoijcleaow(boolean z13) {
        return z13 ? b31.gxszxtbevo.ic_close_cancel_cross : b31.gxszxtbevo.ic_delete_14_red;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    public final lt0.iobyxmoadg ppxfxbqfkf(ProductToReplaceModel item, DeliveryCode deliveryCode, boolean z13) {
        String string;
        zdlpuopuiu.btonecajqb(item, "item");
        boolean z14 = false;
        boolean z15 = item.getSum() == 0.0d;
        Integer discount = item.getDiscount();
        if (discount != null) {
            string = this.f51284iobyxmoadg.getString(lqeggnwhkg.proloyalty_discount_badge, Integer.valueOf(discount.intValue()));
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        String str = string;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f51285zoijcleaow.iobyxmoadg(item.getAvailable() || (item.getReplace() && !item.getIsDeleted()), z15, new draadjrbmk() { // from class: jg1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(this.f51287zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        boolean isAvailableToBuy = availabilityUiModelIobyxmoadg.getIsAvailableToBuy();
        double sum = item.getSum();
        Double dValueOf = Double.valueOf(item.getOldSum());
        CounterModel counterModelIobyxmoadg = is0.iobyxmoadg.iobyxmoadg(isAvailableToBuy, false, (4 & 4) != 0 ? false : false, sum, !((dValueOf.doubleValue() > item.getSum() ? 1 : (dValueOf.doubleValue() == item.getSum() ? 0 : -1)) == 0) ? dValueOf : null, null, false, item.getQuantity(), item.getMeasureTypeModel().nufgyqmvbu(), item.getMeasureTypeModel().getOriginalMeasure(), null, null);
        String id2 = item.getId();
        String article = item.getArticle();
        String name = item.getName();
        double quantity = item.getQuantity();
        ks0.ppxfxbqfkf ppxfxbqfkfVar = ks0.ppxfxbqfkf.f60512iobyxmoadg;
        Price priceWkgbmnqykc = ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getPrice(), 0, false, 6, null);
        Double oldPrice = item.getOldPrice();
        Price priceWkgbmnqykc2 = oldPrice != null ? ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, oldPrice.doubleValue(), 0, false, 6, null) : null;
        Price priceWkgbmnqykc3 = ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getSum(), 0, false, 6, null);
        Price priceWkgbmnqykc4 = ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getOldSum(), 0, false, 6, null);
        String pic = item.getPic();
        boolean available = item.getAvailable();
        boolean replace = item.getReplace();
        int iZoijcleaow = zoijcleaow(item.getIsDeleted());
        boolean z16 = !item.getIsDeleted();
        boolean z17 = !item.getAvailable() && item.getReplace();
        if (item.getDiscount() != null) {
            Integer discount2 = item.getDiscount();
            zdlpuopuiu.lqeggnwhkg(discount2);
            if (discount2.intValue() > 0) {
                z14 = true;
            }
        }
        return new lt0.iobyxmoadg(id2, article, name, quantity, priceWkgbmnqykc, priceWkgbmnqykc2, priceWkgbmnqykc3, priceWkgbmnqykc4, pic, available, replace, iZoijcleaow, z16, z17, str, z14, false, item.getRating(), item.getReviewsCount(), false, z15, z13, false, item.getCountry(), item.getRegion(), item.getCountryFlagEmoji(), rs0.iobyxmoadg.eablkybsjg(item.getHints()), item.getMeasureTypeModel(), null, counterModelIobyxmoadg, deliveryCode, availabilityUiModelIobyxmoadg, null, 4784128, 1, null);
    }
}
