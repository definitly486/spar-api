package ty1;

import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import nx1.nufgyqmvbu;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.PurchaseFuture;
import ru.myspar.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.purchases.impl.specific.domain.store.State;
import ry1.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dt.zoijcleaow f112174jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ty1.iobyxmoadg f112175yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zoijcleaow f112176zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f112177iobyxmoadg;

        static {
            int[] iArr = new int[State.zoijcleaow.values().length];
            try {
                iArr[State.zoijcleaow.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.zoijcleaow.COMPILATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112177iobyxmoadg = iArr;
        }
    }

    public ppxfxbqfkf(zoijcleaow purchaseHistoryProductToUiModelMapper, ty1.iobyxmoadg futureProductsUiMapper, dt.zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(purchaseHistoryProductToUiModelMapper, "purchaseHistoryProductToUiModelMapper");
        zdlpuopuiu.btonecajqb(futureProductsUiMapper, "futureProductsUiMapper");
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f112176zdlpuopuiu = purchaseHistoryProductToUiModelMapper;
        this.f112175yggfygwlhe = futureProductsUiMapper;
        this.f112174jyumaefscl = dateUtils;
    }

    private final List ppxfxbqfkf(List list, List list2) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f112176zdlpuopuiu.invoke((PurchaseHistoryProduct) it.next(), list2));
        }
        return arrayList;
    }

    private final List zoijcleaow(List list, List list2) {
        return this.f112175yggfygwlhe.invoke(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww invoke(State state) {
        uy1.iobyxmoadg iobyxmoadgVar;
        Double dValueOf;
        List basket;
        int i13;
        int i14;
        boolean z13;
        List basket2;
        zdlpuopuiu.btonecajqb(state, "state");
        Purchase purchase = state.getPurchase();
        List listPpxfxbqfkf = null;
        if (state.gtknphoqwx() != State.zoijcleaow.DEFAULT) {
            purchase = null;
        }
        if (purchase != null) {
            String strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(purchase.getAddress());
            LocalDateTime dateCreate = purchase.getDateCreate();
            iobyxmoadgVar = new uy1.iobyxmoadg(strWkgbmnqykc, k30.draadjrbmk.wkgbmnqykc(this.f112174jyumaefscl.eablkybsjg(dateCreate != null ? dateCreate.toLocalDate() : null, "dd MMMM yyyy")));
        } else {
            iobyxmoadgVar = null;
        }
        State.zoijcleaow zoijcleaowVarGtknphoqwx = state.gtknphoqwx();
        int[] iArr = iobyxmoadg.f112177iobyxmoadg;
        int i15 = iArr[zoijcleaowVarGtknphoqwx.ordinal()];
        if (i15 == 1) {
            Purchase purchase2 = state.getPurchase();
            if (purchase2 != null) {
                dValueOf = Double.valueOf(purchase2.getPrice());
            } else {
                dValueOf = null;
            }
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PurchaseFuture futurePurchases = state.getFuturePurchases();
            if (futurePurchases != null) {
                dValueOf = Double.valueOf(futurePurchases.getPrice());
            } else {
                dValueOf = null;
            }
        }
        Price priceWkgbmnqykc = dValueOf != null ? rt.ppxfxbqfkf.wkgbmnqykc(rt.ppxfxbqfkf.f83717iobyxmoadg, dValueOf.doubleValue(), 0, false, 6, null) : null;
        int i16 = iArr[state.gtknphoqwx().ordinal()];
        if (i16 == 1) {
            Purchase purchase3 = state.getPurchase();
            if (purchase3 != null && (basket = purchase3.getBasket()) != null) {
                listPpxfxbqfkf = ppxfxbqfkf(basket, state.getProductsInBasket());
            }
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PurchaseFuture futurePurchases2 = state.getFuturePurchases();
            if (futurePurchases2 != null && (basket2 = futurePurchases2.getBasket()) != null) {
                listPpxfxbqfkf = zoijcleaow(basket2, state.getProductsInBasket());
            }
        }
        List list = listPpxfxbqfkf;
        int i17 = iArr[state.gtknphoqwx().ordinal()];
        if (i17 == 1) {
            i13 = nufgyqmvbu.specific_purchase_title;
        } else {
            if (i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = nufgyqmvbu.specific_compilation_title;
        }
        int i18 = i13;
        int i19 = iArr[state.gtknphoqwx().ordinal()];
        if (i19 == 1) {
            i14 = nufgyqmvbu.specific_purchase_retry_order;
        } else {
            if (i19 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = nufgyqmvbu.specific_compilation_retry_order;
        }
        int i23 = i14;
        int i24 = iArr[state.gtknphoqwx().ordinal()];
        if (i24 != 1) {
            if (i24 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (state.getFuturePurchases() == null || !state.gxszxtbevo()) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else if (state.getPurchase() != null && state.gxszxtbevo() && state.getPurchase().getCanRepeat()) {
            z13 = true;
        } else {
            z13 = false;
        }
        return new dxjokdxxww(iobyxmoadgVar, priceWkgbmnqykc, list, i18, z13, i23, state.getIsLoading());
    }
}
