package jq;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ru.myspar.common.view.product.model.cart.AvailableIntervalUiModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f52069iobyxmoadg;

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String strHcddaimhww;
            AvailableIntervalUiModel availableInterval = ((CartProductUiModel) obj).getAvailableInterval();
            String strHcddaimhww2 = null;
            if (availableInterval != null) {
                strHcddaimhww = mj.kcexrzcfyt.hcddaimhww(availableInterval.getFromTime() + availableInterval.getToTime(), StringUtils.PROCESS_POSTFIX_DELIMITER, "", false, 4, null);
            } else {
                strHcddaimhww = null;
            }
            AvailableIntervalUiModel availableInterval2 = ((CartProductUiModel) obj2).getAvailableInterval();
            if (availableInterval2 != null) {
                strHcddaimhww2 = mj.kcexrzcfyt.hcddaimhww(availableInterval2.getFromTime() + availableInterval2.getToTime(), StringUtils.PROCESS_POSTFIX_DELIMITER, "", false, 4, null);
            }
            return kg.iobyxmoadg.wkgbmnqykc(strHcddaimhww, strHcddaimhww2);
        }
    }

    public agtfadlqog(gtknphoqwx cartProductUiMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartProductUiMapper, "cartProductUiMapper");
        this.f52069iobyxmoadg = cartProductUiMapper;
    }

    private final List btonecajqb(List list, boolean z13, boolean z14, final tg.rgvfuqvkyq rgvfuqvkyqVar) {
        List listD = hg.jyumaefscl.d(list, new iobyxmoadg());
        if (listD.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        AvailableIntervalUiModel availableIntervalUiModel = null;
        int i13 = 0;
        for (Object obj : listD) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            CartProductUiModel cartProductUiModel = (CartProductUiModel) obj;
            AvailableIntervalUiModel availableInterval = cartProductUiModel.getAvailableInterval();
            boolean z15 = true;
            if (availableInterval == null && i13 == 0) {
                arrayList.add(gxszxtbevo(this, z14, true, false, new tg.draadjrbmk() { // from class: jq.wflxmlrfwp
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return agtfadlqog.gtknphoqwx(rgvfuqvkyqVar, ((Integer) obj2).intValue());
                    }
                }, 4, null));
            } else if (cartProductUiModel.getAvailability() == t00.nufgyqmvbu.INTERVAL_UNAVAILABLE && availableInterval != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(availableInterval, availableIntervalUiModel)) {
                CartProductUiModel cartProductUiModel2 = (CartProductUiModel) hg.jyumaefscl.lrnfpwlwnk(listD, i14);
                arrayList.add(wkgbmnqykc(availableInterval, cartProductUiModel2 != null ? cartProductUiModel2.getAvailableInterval() : null, i13 == 0, rgvfuqvkyqVar));
            }
            if (!z13 || i13 != hg.jyumaefscl.ojitshcjhn(listD)) {
                z15 = false;
            }
            arrayList.add(new kq.draadjrbmk(cartProductUiModel, false, z15));
            i13 = i14;
            availableIntervalUiModel = availableInterval;
        }
        return arrayList;
    }

    private final List dxjokdxxww(List list, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        if (list.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(ppxfxbqfkf(z13, draadjrbmkVar));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            listKcexrzcfyt.add(new kq.iobyxmoadg((CartProductUiModel) obj, false, i13 == hg.jyumaefscl.ojitshcjhn(list)));
            i13 = i14;
        }
        return listKcexrzcfyt;
    }

    private final kq.eablkybsjg eablkybsjg(boolean z13, boolean z14, boolean z15, tg.draadjrbmk draadjrbmkVar) {
        return new kq.eablkybsjg((String) draadjrbmkVar.invoke(Integer.valueOf(z13 ? up.ppxfxbqfkf.cart_unavailable_products_partner_title : up.ppxfxbqfkf.cart_unavailable_products_title)), z14, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gtknphoqwx(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    static /* synthetic */ kq.eablkybsjg gxszxtbevo(agtfadlqog agtfadlqogVar, boolean z13, boolean z14, boolean z15, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        if ((i13 & 4) != 0) {
            z15 = false;
        }
        return agtfadlqogVar.eablkybsjg(z13, z14, z15, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    private final kq.eablkybsjg ppxfxbqfkf(boolean z13, tg.draadjrbmk draadjrbmkVar) {
        return new kq.eablkybsjg((String) draadjrbmkVar.invoke(Integer.valueOf(up.ppxfxbqfkf.cart_available_products_title)), z13, false);
    }

    private final kq.eablkybsjg wkgbmnqykc(AvailableIntervalUiModel availableIntervalUiModel, AvailableIntervalUiModel availableIntervalUiModel2, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new kq.eablkybsjg((String) rgvfuqvkyqVar.invoke(Integer.valueOf(!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(availableIntervalUiModel2, availableIntervalUiModel) ? up.ppxfxbqfkf.cart_unavailable_product_interval : up.ppxfxbqfkf.cart_unavailable_products_interval), new Object[]{availableIntervalUiModel.getFromTime(), availableIntervalUiModel.getToTime()}), z13, false);
    }

    public final List lqeggnwhkg(Cart cart, List list, boolean z13, final tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cart, "cart");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        gtknphoqwx gtknphoqwxVar = this.f52069iobyxmoadg;
        List basket = cart.getBasket();
        if (basket == null) {
            basket = hg.jyumaefscl.wflxmlrfwp();
        }
        List<CartProductUiModel> listZoijcleaow = gtknphoqwxVar.zoijcleaow(basket, list, cart.dxjokdxxww(), z13, getStringRes);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CartProductUiModel cartProductUiModel : listZoijcleaow) {
            if (cartProductUiModel.getIsAvailable()) {
                arrayList.add(cartProductUiModel);
            } else {
                arrayList2.add(cartProductUiModel);
            }
        }
        return hg.jyumaefscl.ixidwrxhsl(btonecajqb(arrayList2, arrayList.isEmpty(), cart.jlmebxxoox(), getStringRes), dxjokdxxww(arrayList, arrayList2.isEmpty(), new tg.draadjrbmk() { // from class: jq.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.nufgyqmvbu(getStringRes, ((Integer) obj).intValue());
            }
        }));
    }
}
