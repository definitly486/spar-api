package fj1;

import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.order.FutureProduct;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseFuture;
import ru.myspar.proloyalty.purchases.impl.history.domain.store.State;
import ru.myspar.proloyalty.purchases.impl.history.presentation.model.PurchaseHistoryUiModel;
import tg.draadjrbmk;
import ti1.nufgyqmvbu;
import vk0.gxszxtbevo;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final DateTimeFormatter f34094yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f34095zdlpuopuiu;

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f34095zdlpuopuiu = resourcesManager;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        zdlpuopuiu.dxjokdxxww(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.f34094yggfygwlhe = dateTimeFormatterOfPattern;
    }

    private final PurchaseHistoryUiModel btonecajqb(Purchase purchase, int i13) {
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, purchase.getPrice(), 0, false, 6, null);
        String id2 = purchase.getId();
        String price = priceWkgbmnqykc.getPrice();
        String priceFractional = priceWkgbmnqykc.getPriceFractional();
        String strPpxfxbqfkf = ppxfxbqfkf(nufgyqmvbu.proloyalty_bonuses_accrued, purchase.getBonuses());
        String deliveryType = purchase.getDeliveryType();
        String str = deliveryType == null ? "" : deliveryType;
        LocalDateTime dateCreate = purchase.getDateCreate();
        String str2 = dateCreate != null ? dateCreate.format(this.f34094yggfygwlhe) : null;
        return new PurchaseHistoryUiModel(i13, id2, price, priceFractional, strPpxfxbqfkf, ppxfxbqfkf(lqeggnwhkg.proloyalty_bonuses_applied, purchase.getAppliedBonuses()), str, str2 == null ? "" : str2, purchase.getAddress(), !kcexrzcfyt.zfvoamnweg(purchase.getNpsUrl()));
    }

    private final aj1.lqeggnwhkg eablkybsjg(State state) {
        return new aj1.lqeggnwhkg(state.getIsLoading() && state.getCurrentPage() == 0, state.getPurchaseInfo() != null ? new aj1.nufgyqmvbu(lqeggnwhkg(state.getPurchaseInfo().getPurchases()), zoijcleaow(state.getFlow(), state.getPurchaseInfo().getFuture()), state.getIsLoading(), state.getCurrentPage()) : null);
    }

    private final gj1.iobyxmoadg gxszxtbevo(PurchaseFuture purchaseFuture) {
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, purchaseFuture.getPrice(), 0, false, 6, null);
        List basket = purchaseFuture.getBasket();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
        Iterator it = basket.iterator();
        while (it.hasNext()) {
            arrayList.add(((FutureProduct) it.next()).getPic());
        }
        return new gj1.iobyxmoadg(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), arrayList);
    }

    private final List lqeggnwhkg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            arrayList.add(btonecajqb((Purchase) obj, i13));
            i13 = i14;
        }
        return arrayList;
    }

    private final String ppxfxbqfkf(int i13, Float f13) {
        String str = null;
        if (f13 != null) {
            if (f13.floatValue() == 0.0f) {
                f13 = null;
            }
            if (f13 != null) {
                float fFloatValue = f13.floatValue();
                q41.iobyxmoadg iobyxmoadgVar = this.f34095zdlpuopuiu;
                str = iobyxmoadgVar.getString(i13) + " " + iobyxmoadgVar.nufgyqmvbu(gxszxtbevo.plural_purchase_bonuses, (int) fFloatValue, t11.iobyxmoadg.f109303iobyxmoadg.ppxfxbqfkf(Float.valueOf(fFloatValue)));
            }
        }
        return str == null ? "" : str;
    }

    private final gj1.iobyxmoadg zoijcleaow(wz0.iobyxmoadg iobyxmoadgVar, PurchaseFuture purchaseFuture) {
        if (purchaseFuture == null) {
            return null;
        }
        if (iobyxmoadgVar == wz0.iobyxmoadg.SHOW_ONLY || purchaseFuture.getBasket().isEmpty()) {
            purchaseFuture = null;
        }
        if (purchaseFuture != null) {
            return gxszxtbevo(purchaseFuture);
        }
        return null;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public aj1.lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return eablkybsjg(state);
    }
}
