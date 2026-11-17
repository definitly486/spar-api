package jg1;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ProductsForReplaceModel;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bz0.eablkybsjg f51278iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final q41.iobyxmoadg f51279zoijcleaow;

    public eablkybsjg(bz0.eablkybsjg productInteractor, q41.iobyxmoadg resourceManager) {
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        this.f51278iobyxmoadg = productInteractor;
        this.f51279zoijcleaow = resourceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ppxfxbqfkf(eablkybsjg eablkybsjgVar, int i13) {
        return eablkybsjgVar.f51279zoijcleaow.getString(i13);
    }

    public final lt0.zoijcleaow zoijcleaow(String parentProductArticle, ProductsForReplaceModel domainModel, DeliveryCode deliveryCode, boolean z13) {
        zdlpuopuiu.btonecajqb(parentProductArticle, "parentProductArticle");
        zdlpuopuiu.btonecajqb(domainModel, "domainModel");
        boolean z14 = domainModel.getPrice() == 0.0d;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f51278iobyxmoadg.iobyxmoadg(z13, z14, new draadjrbmk() { // from class: jg1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.ppxfxbqfkf(this.f51286zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        CounterModel counterModelIobyxmoadg = is0.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), false, (4 & 4) != 0 ? false : false, domainModel.getPrice(), domainModel.getOldPrice(), null, false, domainModel.getQuantity(), domainModel.getMeasureTypeModel().nufgyqmvbu(), domainModel.getMeasureTypeModel().getOriginalMeasure(), null, null);
        String article = domainModel.getArticle();
        String name = domainModel.getName();
        double quantity = domainModel.getQuantity();
        ks0.ppxfxbqfkf ppxfxbqfkfVar = ks0.ppxfxbqfkf.f60512iobyxmoadg;
        Price priceWkgbmnqykc = ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, domainModel.getPrice(), 0, false, 6, null);
        Double oldPrice = domainModel.getOldPrice();
        return new lt0.zoijcleaow(CommonUrlParts.Values.FALSE_INTEGER, parentProductArticle, article, name, quantity, priceWkgbmnqykc, oldPrice != null ? ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, oldPrice.doubleValue(), 0, false, 6, null) : null, domainModel.getPic(), domainModel.getAvailable(), domainModel.getIsChecked(), null, false, false, domainModel.getRating(), domainModel.getReviewsCount(), false, z14, false, false, domainModel.getCountry(), domainModel.getRegion(), domainModel.getCountryFlagEmoji(), null, domainModel.getMeasureTypeModel(), null, availabilityUiModelIobyxmoadg, deliveryCode, counterModelIobyxmoadg, null, 273062912, null);
    }
}
