package oj1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj1.dxjokdxxww;
import nj1.istkbnxepw;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.purchases.impl.list_details.domain.store.State;
import ru.myspar.proloyalty.purchases_list.api.models.PurchaseProduct;
import tg.draadjrbmk;
import ti1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zoijcleaow f72992zdlpuopuiu;

    public ppxfxbqfkf(zoijcleaow purchaseProductUiMapper) {
        zdlpuopuiu.btonecajqb(purchaseProductUiMapper, "purchaseProductUiMapper");
        this.f72992zdlpuopuiu = purchaseProductUiMapper;
    }

    private final dxjokdxxww eablkybsjg(State state, DeliveryCode deliveryCode) {
        List productsBuy = state.getProductsBuy();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productsBuy, 10));
        Iterator it = productsBuy.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f72992zdlpuopuiu.zoijcleaow((PurchaseProduct) it.next(), state.getProductDataList(), deliveryCode));
        }
        List productsBought = state.getProductsBought();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productsBought, 10));
        Iterator it2 = productsBought.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f72992zdlpuopuiu.zoijcleaow((PurchaseProduct) it2.next(), state.getProductDataList(), deliveryCode));
        }
        return new dxjokdxxww(state.getListName(), state.getSum(), state.getCount(), ppxfxbqfkf(arrayList, arrayList2), state.getIsEmptyViewVisible(), state.getIsShareListFeatureEnabled(), state.getIsLoading());
    }

    private final List ppxfxbqfkf(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pj1.iobyxmoadg.zoijcleaow(nufgyqmvbu.proloyalty_purchases_list_details_top_comment));
        int i13 = nufgyqmvbu.proloyalty_purchases_list_details_subtitle_buy;
        istkbnxepw istkbnxepwVar = istkbnxepw.TO_BUY;
        arrayList.add(new pj1.iobyxmoadg.wkgbmnqykc(i13, istkbnxepwVar, list.isEmpty()));
        if (list.isEmpty()) {
            arrayList.add(new pj1.iobyxmoadg.C1698iobyxmoadg(nufgyqmvbu.proloyalty_purchases_list_details_empty_list_buy_comment));
        } else {
            arrayList.addAll(zoijcleaow(list, istkbnxepwVar));
        }
        int i14 = nufgyqmvbu.proloyalty_purchases_list_details_subtitle_bought;
        istkbnxepw istkbnxepwVar2 = istkbnxepw.BOUGHT;
        arrayList.add(new pj1.iobyxmoadg.wkgbmnqykc(i14, istkbnxepwVar2, list2.isEmpty()));
        if (list2.isEmpty()) {
            arrayList.add(new pj1.iobyxmoadg.C1698iobyxmoadg(nufgyqmvbu.proloyalty_purchases_list_details_empty_list_bought_comment));
        } else {
            arrayList.addAll(zoijcleaow(list2, istkbnxepwVar2));
        }
        return arrayList;
    }

    private final List zoijcleaow(List list, istkbnxepw istkbnxepwVar) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pj1.iobyxmoadg.ppxfxbqfkf((pj1.ppxfxbqfkf) it.next(), istkbnxepwVar));
        }
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return eablkybsjg(state, state.getDeliveryCode());
    }
}
