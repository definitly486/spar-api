package ij0;

import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.order.productreplacement.ProductToReplaceModel;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f44581iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j00.gxszxtbevo f44582zoijcleaow;

    public ppxfxbqfkf(d60.iobyxmoadg resourcesManager, j00.gxszxtbevo productInteractor) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f44581iobyxmoadg = resourcesManager;
        this.f44582zoijcleaow = productInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return ppxfxbqfkfVar.f44581iobyxmoadg.getString(i13);
    }

    private final int zoijcleaow(boolean z13) {
        return z13 ? s40.gxszxtbevo.ic_close_cancel_cross : s40.gxszxtbevo.ic_delete_14_red;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final ru.iobyxmoadg ppxfxbqfkf(ProductToReplaceModel item, DeliveryCode deliveryCode, boolean z13) {
        String string;
        zdlpuopuiu.btonecajqb(item, "item");
        boolean z14 = false;
        boolean z15 = item.getSum() == 0.0d;
        Integer discount = item.getDiscount();
        if (discount != null) {
            string = this.f44581iobyxmoadg.getString(dxjokdxxww.discount_badge, Integer.valueOf(discount.intValue()));
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        String str = string;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f44582zoijcleaow.iobyxmoadg(item.getAvailable() || (item.getReplace() && !item.getIsDeleted()), false, z15, false, new draadjrbmk() { // from class: ij0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(this.f44584zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        boolean isAvailableToBuy = availabilityUiModelIobyxmoadg.getIsAvailableToBuy();
        double sum = item.getSum();
        Double dValueOf = Double.valueOf(item.getOldSum());
        CounterModel counterModelIobyxmoadg = pt.iobyxmoadg.iobyxmoadg(isAvailableToBuy, false, (4 & 4) != 0 ? false : false, sum, !((dValueOf.doubleValue() > item.getSum() ? 1 : (dValueOf.doubleValue() == item.getSum() ? 0 : -1)) == 0) ? dValueOf : null, null, false, item.getQuantity(), item.getMeasureTypeModel().nufgyqmvbu(), item.getMeasureTypeModel().getOriginalMeasure(), null, null);
        String id2 = item.getId();
        String article = item.getArticle();
        String name = item.getName();
        double quantity = item.getQuantity();
        rt.ppxfxbqfkf ppxfxbqfkfVar = rt.ppxfxbqfkf.f83717iobyxmoadg;
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getPrice(), 0, false, 6, null);
        Double oldPrice = item.getOldPrice();
        Price priceWkgbmnqykc2 = oldPrice != null ? rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, oldPrice.doubleValue(), 0, false, 6, null) : null;
        Price priceWkgbmnqykc3 = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getSum(), 0, false, 6, null);
        Price priceWkgbmnqykc4 = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, item.getOldSum(), 0, false, 6, null);
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
        return new ru.iobyxmoadg(id2, article, name, quantity, priceWkgbmnqykc, priceWkgbmnqykc2, priceWkgbmnqykc3, priceWkgbmnqykc4, pic, available, replace, iZoijcleaow, z16, z17, str, z14, false, item.getRating(), item.getReviewsCount(), false, z15, z13, false, item.getCountry(), item.getRegion(), item.getCountryFlagEmoji(), xt.iobyxmoadg.eablkybsjg(item.getHints()), item.getMeasureTypeModel(), null, counterModelIobyxmoadg, deliveryCode, availabilityUiModelIobyxmoadg, null, 4784128, 1, null);
    }
}
