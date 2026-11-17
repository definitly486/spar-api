package ty1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.order.FutureProduct;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f112173zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f112173zdlpuopuiu = resourcesManager;
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

    private final mx1.iobyxmoadg.C1458iobyxmoadg ppxfxbqfkf(FutureProduct futureProduct, List list) {
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(rt.ppxfxbqfkf.f83717iobyxmoadg, futureProduct.getSum(), 0, false, 6, null);
        return new mx1.iobyxmoadg.C1458iobyxmoadg(futureProduct.getName(), futureProduct.getArticle(), futureProduct.getQuantity(), this.f112173zdlpuopuiu.getString(dxjokdxxww.price_format, n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(futureProduct.getPrice()))), priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), futureProduct.getMeasureTypeModel(), futureProduct.getPic(), iobyxmoadg(list, futureProduct.getArticle()), false, true, futureProduct.getIsOnlyPickup(), futureProduct.getIsAvailable());
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public List invoke(List items, List productsInBasket) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(productsInBasket, "productsInBasket");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((FutureProduct) it.next(), productsInBasket));
        }
        return arrayList;
    }
}
