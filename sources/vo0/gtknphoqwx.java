package vo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bz0.eablkybsjg f117590iobyxmoadg;

    public gtknphoqwx(bz0.eablkybsjg productInteractor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f117590iobyxmoadg = productInteractor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    private final CartProductUiModel ppxfxbqfkf(CartProduct cartProduct, List list, DeliveryCode deliveryCode, boolean z13, final tg.rgvfuqvkyq rgvfuqvkyqVar) {
        ProductUIData productUIData;
        MeasureType originalMeasure;
        List limits;
        Object next;
        String str = (String) rgvfuqvkyqVar.invoke(Integer.valueOf(vk0.lqeggnwhkg.proloyalty_discount_badge), new Object[]{Integer.valueOf(cartProduct.getPercent())});
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
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f117590iobyxmoadg.iobyxmoadg(cartProduct.getIsAvailable(), z14, new tg.draadjrbmk() { // from class: vo0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.wkgbmnqykc(rgvfuqvkyqVar, ((Integer) obj).intValue());
            }
        });
        List listEablkybsjg = cartProduct.getIsAvailable() ? rs0.iobyxmoadg.eablkybsjg(cartProduct.getHints()) : hg.jyumaefscl.wflxmlrfwp();
        CounterModel counterModelIobyxmoadg = is0.iobyxmoadg.iobyxmoadg(availabilityUiModelIobyxmoadg.getIsAvailableToBuy(), productUIData != null, productUIData != null ? productUIData.getIsLoading() : false, cartProduct.getPrice(), cartProduct.getOldPrice(), cartProduct.getAvgWeight(), cartProduct.getIsDispPer100(), productUIData != null ? productUIData.getQuantity() : cartProduct.getQuantity(), measureTypeModelPpxfxbqfkf.nufgyqmvbu(), measureTypeModelPpxfxbqfkf.getCurrentMeasure(), productUIData != null ? productUIData.getMessageType() : null, null);
        String id2 = cartProduct.getId();
        String article = cartProduct.getArticle();
        String name = cartProduct.getName();
        String pic = cartProduct.getPic();
        if (pic == null) {
            pic = "";
        }
        return new CartProductUiModel(id2, article, name, pic, cartProduct.getAvgWeight(), cartProduct.getPrice(), cartProduct.getOldPrice(), str, cartProduct.getQuantity(), cartProduct.getPercent() > 0, z13, false, cartProduct.getPrice() == 0.0d, cartProduct.getRating(), cartProduct.getReviewsCount(), cartProduct.getIsDispPer100(), cartProduct.getIsFavorite(), listEablkybsjg, cartProduct.getCountry(), cartProduct.getRegion(), cartProduct.getCountryFlagEmoji(), nr0.iobyxmoadg.READY, measureTypeModelPpxfxbqfkf, null, availabilityUiModelIobyxmoadg, deliveryCode, counterModelIobyxmoadg, null, list2, cartProduct.getIsAvailable(), cartProduct.getUnavailableReason(), 142608384, null);
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
