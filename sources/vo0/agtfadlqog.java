package vo0;

import java.util.ArrayList;
import java.util.List;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f117585iobyxmoadg;

    public agtfadlqog(gtknphoqwx cartProductUiMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartProductUiMapper, "cartProductUiMapper");
        this.f117585iobyxmoadg = cartProductUiMapper;
    }

    private final List btonecajqb(List list, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        if (list.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        List listWkgbmnqykc = hg.jyumaefscl.wkgbmnqykc(list.size() + 1);
        listWkgbmnqykc.add(eablkybsjg(this, z13, false, draadjrbmkVar, 2, null));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            listWkgbmnqykc.add(new wo0.wflxmlrfwp((CartProductUiModel) obj, false, i13 == hg.jyumaefscl.ojitshcjhn(list)));
            i13 = i14;
        }
        return hg.jyumaefscl.iobyxmoadg(listWkgbmnqykc);
    }

    private final List dxjokdxxww(List list, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        if (list.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        List listWkgbmnqykc = hg.jyumaefscl.wkgbmnqykc(list.size() + 1);
        listWkgbmnqykc.add(ppxfxbqfkf(draadjrbmkVar));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            listWkgbmnqykc.add(new wo0.iobyxmoadg((CartProductUiModel) obj, false, i13 == hg.jyumaefscl.ojitshcjhn(list) && z13));
            i13 = i14;
        }
        return hg.jyumaefscl.iobyxmoadg(listWkgbmnqykc);
    }

    static /* synthetic */ wo0.gxszxtbevo eablkybsjg(agtfadlqog agtfadlqogVar, boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        return agtfadlqogVar.wkgbmnqykc(z13, z14, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lqeggnwhkg(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    private final wo0.gxszxtbevo ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar) {
        return new wo0.gxszxtbevo((String) draadjrbmkVar.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_cart_available_products_title)), true, false);
    }

    private final wo0.gxszxtbevo wkgbmnqykc(boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar) {
        return new wo0.gxszxtbevo((String) draadjrbmkVar.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_cart_unavailable_products_title)), z13, z14);
    }

    public final List gxszxtbevo(Cart cart, List list, boolean z13, final tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cart, "cart");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        gtknphoqwx gtknphoqwxVar = this.f117585iobyxmoadg;
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
        return hg.jyumaefscl.ixidwrxhsl(dxjokdxxww(arrayList, arrayList2.isEmpty(), new tg.draadjrbmk() { // from class: vo0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.nufgyqmvbu(getStringRes, ((Integer) obj).intValue());
            }
        }), btonecajqb(arrayList2, arrayList.isEmpty(), new tg.draadjrbmk() { // from class: vo0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.lqeggnwhkg(getStringRes, ((Integer) obj).intValue());
            }
        }));
    }
}
