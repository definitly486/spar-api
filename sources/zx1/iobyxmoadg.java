package zx1;

import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import nx1.nufgyqmvbu;
import pm.dxjokdxxww;
import rt.ppxfxbqfkf;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.order.FutureProduct;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.PurchaseFuture;
import ru.myspar.purchases.impl.history.domain.store.State;
import ru.myspar.purchases.impl.history.presentation.model.PurchaseHistoryUiModel;
import tg.draadjrbmk;
import ux1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final DateTimeFormatter f131476yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f131477zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f131477zdlpuopuiu = resourcesManager;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        zdlpuopuiu.dxjokdxxww(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.f131476yggfygwlhe = dateTimeFormatterOfPattern;
    }

    private final PurchaseHistoryUiModel btonecajqb(Purchase purchase, int i13) {
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f83717iobyxmoadg, purchase.getPrice(), 0, false, 6, null);
        String id2 = purchase.getId();
        String price = priceWkgbmnqykc.getPrice();
        String priceFractional = priceWkgbmnqykc.getPriceFractional();
        String strPpxfxbqfkf = ppxfxbqfkf(nufgyqmvbu.bonuses_accrued, purchase.getBonuses());
        String deliveryType = purchase.getDeliveryType();
        String str = deliveryType == null ? "" : deliveryType;
        LocalDateTime dateCreate = purchase.getDateCreate();
        String str2 = dateCreate != null ? dateCreate.format(this.f131476yggfygwlhe) : null;
        return new PurchaseHistoryUiModel(i13, id2, price, priceFractional, strPpxfxbqfkf, ppxfxbqfkf(dxjokdxxww.bonuses_applied, purchase.getAppliedBonuses()), str, str2 == null ? "" : str2, purchase.getAddress(), !kcexrzcfyt.zfvoamnweg(purchase.getNpsUrl()));
    }

    private final lqeggnwhkg eablkybsjg(State state) {
        return new lqeggnwhkg(state.getIsLoading() && state.getCurrentPage() == 0, state.getPurchaseInfo() != null ? new ux1.nufgyqmvbu(lqeggnwhkg(state.getPurchaseInfo().getPurchases()), zoijcleaow(state.getFlow(), state.getPurchaseInfo().getFuture()), state.getIsLoading(), state.getCurrentPage()) : null);
    }

    private final ay1.iobyxmoadg gxszxtbevo(PurchaseFuture purchaseFuture) {
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f83717iobyxmoadg, purchaseFuture.getPrice(), 0, false, 6, null);
        List basket = purchaseFuture.getBasket();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
        Iterator it = basket.iterator();
        while (it.hasNext()) {
            arrayList.add(((FutureProduct) it.next()).getPic());
        }
        return new ay1.iobyxmoadg(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), arrayList);
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
                d60.iobyxmoadg iobyxmoadgVar = this.f131477zdlpuopuiu;
                str = iobyxmoadgVar.getString(i13) + " " + iobyxmoadgVar.nufgyqmvbu(pm.lqeggnwhkg.plural_purchase_bonuses, (int) fFloatValue, n30.iobyxmoadg.f68492iobyxmoadg.wkgbmnqykc(Float.valueOf(fFloatValue)));
            }
        }
        return str == null ? "" : str;
    }

    private final ay1.iobyxmoadg zoijcleaow(g10.iobyxmoadg iobyxmoadgVar, PurchaseFuture purchaseFuture) {
        if (purchaseFuture == null) {
            return null;
        }
        if (iobyxmoadgVar == g10.iobyxmoadg.SHOW_ONLY || purchaseFuture.getBasket().isEmpty()) {
            purchaseFuture = null;
        }
        if (purchaseFuture != null) {
            return gxszxtbevo(purchaseFuture);
        }
        return null;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return eablkybsjg(state);
    }
}
