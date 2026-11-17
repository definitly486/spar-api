package ij0;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.order.productreplacement.ProductsForReplaceModel;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j00.gxszxtbevo f44575iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d60.iobyxmoadg f44576zoijcleaow;

    public eablkybsjg(j00.gxszxtbevo productInteractor, d60.iobyxmoadg resourceManager) {
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        this.f44575iobyxmoadg = productInteractor;
        this.f44576zoijcleaow = resourceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ppxfxbqfkf(eablkybsjg eablkybsjgVar, int i13) {
        return eablkybsjgVar.f44576zoijcleaow.getString(i13);
    }

    public final ru.zoijcleaow zoijcleaow(String parentProductArticle, ProductsForReplaceModel domainModel, DeliveryCode deliveryCode, boolean z13) {
        zdlpuopuiu.btonecajqb(parentProductArticle, "parentProductArticle");
        zdlpuopuiu.btonecajqb(domainModel, "domainModel");
        boolean z14 = domainModel.getPrice() == 0.0d;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f44575iobyxmoadg.iobyxmoadg(z13, false, z14, false, new draadjrbmk() { // from class: ij0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.ppxfxbqfkf(this.f44583zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        CounterModel counterModelIobyxmoadg = pt.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), false, (4 & 4) != 0 ? false : false, domainModel.getPrice(), domainModel.getOldPrice(), null, false, domainModel.getQuantity(), domainModel.getMeasureTypeModel().nufgyqmvbu(), domainModel.getMeasureTypeModel().getOriginalMeasure(), null, null);
        String article = domainModel.getArticle();
        String name = domainModel.getName();
        double quantity = domainModel.getQuantity();
        rt.ppxfxbqfkf ppxfxbqfkfVar = rt.ppxfxbqfkf.f83717iobyxmoadg;
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, domainModel.getPrice(), 0, false, 6, null);
        Double oldPrice = domainModel.getOldPrice();
        return new ru.zoijcleaow(CommonUrlParts.Values.FALSE_INTEGER, parentProductArticle, article, name, quantity, priceWkgbmnqykc, oldPrice != null ? rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, oldPrice.doubleValue(), 0, false, 6, null) : null, domainModel.getPic(), domainModel.getAvailable(), domainModel.getIsChecked(), null, false, false, domainModel.getRating(), domainModel.getReviewsCount(), false, z14, false, false, domainModel.getCountry(), domainModel.getRegion(), domainModel.getCountryFlagEmoji(), null, domainModel.getMeasureTypeModel(), null, availabilityUiModelIobyxmoadg, deliveryCode, counterModelIobyxmoadg, null, 273062912, null);
    }
}
