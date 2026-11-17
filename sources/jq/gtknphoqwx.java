package jq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.cart.AvailableIntervalUiModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.cart.AvailableInterval;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j00.gxszxtbevo f52074iobyxmoadg;

    public gtknphoqwx(j00.gxszxtbevo productInteractor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f52074iobyxmoadg = productInteractor;
    }

    private final AvailableIntervalUiModel eablkybsjg(AvailableInterval availableInterval) {
        if (mj.kcexrzcfyt.zfvoamnweg(availableInterval.getFrom()) || mj.kcexrzcfyt.zfvoamnweg(availableInterval.getTo())) {
            availableInterval = null;
        }
        if (availableInterval != null) {
            return new AvailableIntervalUiModel(availableInterval.getFrom(), availableInterval.getTo());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    private final CartProductUiModel ppxfxbqfkf(CartProduct cartProduct, List list, DeliveryCode deliveryCode, boolean z13, final tg.rgvfuqvkyq rgvfuqvkyqVar) {
        ProductUIData productUIData;
        MeasureType originalMeasure;
        List limits;
        Object next;
        String str = (String) rgvfuqvkyqVar.invoke(Integer.valueOf(pm.dxjokdxxww.discount_badge), new Object[]{Integer.valueOf(cartProduct.getPercent())});
        boolean z14 = cartProduct.getPrice() == 0.0d;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), cartProduct.getId()));
            productUIData = (ProductUIData) next;
        } else {
            productUIData = null;
        }
        if (productUIData == null || (originalMeasure = productUIData.getMeasureType()) == null) {
            originalMeasure = cartProduct.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(cartProduct.getMeasureTypeModel(), null, null, originalMeasure, 3, null);
        if (productUIData == null || (limits = productUIData.getLimits()) == null) {
            limits = cartProduct.getLimits();
        } else {
            if (limits.isEmpty()) {
                limits = null;
            }
            if (limits == null) {
                limits = cartProduct.getLimits();
            }
        }
        List list2 = limits;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f52074iobyxmoadg.iobyxmoadg(cartProduct.ylkuphrtab(), false, z14, false, new tg.draadjrbmk() { // from class: jq.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.wkgbmnqykc(rgvfuqvkyqVar, ((Integer) obj).intValue());
            }
        });
        CounterModel counterModelIobyxmoadg = pt.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), productUIData != null, productUIData != null ? productUIData.getIsLoading() : false, cartProduct.getPrice(), cartProduct.getOldPrice(), cartProduct.getAvgWeight(), cartProduct.getIsDispPer100(), productUIData != null ? productUIData.getQuantity() : cartProduct.getQuantity(), measureTypeModelPpxfxbqfkf.nufgyqmvbu(), measureTypeModelPpxfxbqfkf.getCurrentMeasure(), productUIData != null ? productUIData.getMessageType() : null, null);
        String id2 = cartProduct.getId();
        String article = cartProduct.getArticle();
        String name = cartProduct.getName();
        String pic = cartProduct.getPic();
        if (pic == null) {
            pic = "";
        }
        Double avgWeight = cartProduct.getAvgWeight();
        double price = cartProduct.getPrice();
        Double oldPrice = cartProduct.getOldPrice();
        boolean z15 = cartProduct.getPercent() > 0;
        boolean z16 = cartProduct.getPrice() == 0.0d;
        Double rating = cartProduct.getRating();
        int reviewsCount = cartProduct.getReviewsCount();
        String country = cartProduct.getCountry();
        String region = cartProduct.getRegion();
        String countryFlagEmoji = cartProduct.getCountryFlagEmoji();
        boolean isDispPer100 = cartProduct.getIsDispPer100();
        double quantity = cartProduct.getQuantity();
        boolean isFavorite = cartProduct.getIsFavorite();
        t00.nufgyqmvbu availability = cartProduct.getAvailability();
        List listEablkybsjg = xt.iobyxmoadg.eablkybsjg(cartProduct.getHints());
        us.iobyxmoadg iobyxmoadgVar = us.iobyxmoadg.READY;
        AvailableInterval availableInterval = cartProduct.getAvailableInterval();
        return new CartProductUiModel(id2, article, name, pic, avgWeight, price, oldPrice, str, quantity, z15, z13, false, z16, rating, reviewsCount, isDispPer100, isFavorite, listEablkybsjg, country, region, countryFlagEmoji, availability, iobyxmoadgVar, availableInterval != null ? eablkybsjg(availableInterval) : null, measureTypeModelPpxfxbqfkf, null, availabilityUiModelIobyxmoadg, deliveryCode, counterModelIobyxmoadg, null, list2, 570427392, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    public final List zoijcleaow(List products, List list, DeliveryCode deliveryCode, boolean z13, tg.rgvfuqvkyq getStringFromRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringFromRes, "getStringFromRes");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(products, 10));
        Iterator it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((CartProduct) it.next(), list, deliveryCode, z13, getStringFromRes));
        }
        return arrayList;
    }
}
