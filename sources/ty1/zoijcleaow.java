package ty1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import s40.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f112178zdlpuopuiu;

    public zoijcleaow(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f112178zdlpuopuiu = resourcesManager;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    private final boolean iobyxmoadg(List list, String str) {
        for (Object obj : list) {
            if (zdlpuopuiu.eablkybsjg(((CartProduct) obj).getArticle(), str)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public mx1.iobyxmoadg.zoijcleaow invoke(PurchaseHistoryProduct model, List productsInBasket) {
        String strNufgyqmvbu;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(productsInBasket, "productsInBasket");
        rt.ppxfxbqfkf ppxfxbqfkfVar = rt.ppxfxbqfkf.f83717iobyxmoadg;
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, model.getPrice(), 0, false, 6, null);
        Price priceWkgbmnqykc2 = rt.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, model.getSum(), 0, false, 6, null);
        String name = model.getName();
        String article = model.getArticle();
        double quantity = model.getQuantity();
        String price = priceWkgbmnqykc2.getPrice();
        String priceFractional = priceWkgbmnqykc2.getPriceFractional();
        MeasureTypeModel measureTypeModel = model.getMeasureTypeModel();
        String pic = model.getPic();
        boolean zIobyxmoadg = iobyxmoadg(productsInBasket, model.getArticle());
        boolean isFavorite = model.getIsFavorite();
        Integer reviews = model.getReviews();
        if (reviews != null) {
            int iIntValue = reviews.intValue();
            strNufgyqmvbu = this.f112178zdlpuopuiu.nufgyqmvbu(gtknphoqwx.plural_reviews, iIntValue, Integer.valueOf(iIntValue));
        } else {
            strNufgyqmvbu = null;
        }
        String str = strNufgyqmvbu;
        Double rating = model.getRating();
        Integer reviews2 = model.getReviews();
        return new mx1.iobyxmoadg.zoijcleaow(name, article, quantity, price, priceFractional, measureTypeModel, pic, zIobyxmoadg, isFavorite, true, reviews2 != null ? reviews2.intValue() : 0, rating, str, new ts.iobyxmoadg(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), n30.iobyxmoadg.f68492iobyxmoadg.dxjokdxxww(Double.valueOf(model.getQuantity()))), model.getIsOnlyPickup(), model.getIsAvailable(), model.getUserRating());
    }
}
