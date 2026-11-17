package jq;

import java.util.ArrayList;
import java.util.List;
import p0.tzroggbefp;
import ru.myspar.cart.impl.domain.store.State;
import ru.myspar.cart.impl.presentation.model.CartHeaderUiModel;
import ru.myspar.cart.impl.presentation.model.PaymentBonusesUiModel;
import ru.myspar.core.domain.models.LoadInfo;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartBonuses;
import ru.myspar.core.domain.models.cart.CartProgressBar;
import ru.myspar.core.domain.models.cart.CartReceiver;
import ru.myspar.core.domain.models.cart.IntervalInfo;
import ru.myspar.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes4.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vdvldrhtss f52090dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final agtfadlqog f52091eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ojitshcjhn f52092gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f52093iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final lqeggnwhkg f52094lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final zoijcleaow f52095nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq f52096ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f52097wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f52098zoijcleaow;

    public yggfygwlhe(nufgyqmvbu receiverUiModelMapper, wkgbmnqykc receiptInfoUiModelMapper, rgvfuqvkyq promoCodeUiModelMapper, dxjokdxxww paymentBonusesMapper, agtfadlqog productsListUiModelMapper, ojitshcjhn progressBarUiModelMapper, lqeggnwhkg orderInfoUiModelMapper, zoijcleaow cartCommentsUiModelMapper, vdvldrhtss recommendationsUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(receiverUiModelMapper, "receiverUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(receiptInfoUiModelMapper, "receiptInfoUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCodeUiModelMapper, "promoCodeUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentBonusesMapper, "paymentBonusesMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productsListUiModelMapper, "productsListUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(progressBarUiModelMapper, "progressBarUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderInfoUiModelMapper, "orderInfoUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartCommentsUiModelMapper, "cartCommentsUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendationsUiModelMapper, "recommendationsUiModelMapper");
        this.f52093iobyxmoadg = receiverUiModelMapper;
        this.f52098zoijcleaow = receiptInfoUiModelMapper;
        this.f52096ppxfxbqfkf = promoCodeUiModelMapper;
        this.f52097wkgbmnqykc = paymentBonusesMapper;
        this.f52091eablkybsjg = productsListUiModelMapper;
        this.f52092gxszxtbevo = progressBarUiModelMapper;
        this.f52094lqeggnwhkg = orderInfoUiModelMapper;
        this.f52095nufgyqmvbu = cartCommentsUiModelMapper;
        this.f52090dxjokdxxww = recommendationsUiModelMapper;
    }

    private final CartHeaderUiModel dxjokdxxww(tg.draadjrbmk draadjrbmkVar) {
        return new CartHeaderUiModel((String) draadjrbmkVar.invoke(Integer.valueOf(up.ppxfxbqfkf.basket_products)), new CartHeaderUiModel.Button((String) draadjrbmkVar.invoke(Integer.valueOf(up.ppxfxbqfkf.clear_cart)), CartHeaderUiModel.iobyxmoadg.CLEAR_CART));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxszxtbevo(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), obj != null ? new Object[]{obj} : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lqeggnwhkg(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    private final CartHeaderUiModel wkgbmnqykc(tg.draadjrbmk draadjrbmkVar) {
        return new CartHeaderUiModel((String) draadjrbmkVar.invoke(Integer.valueOf(pm.dxjokdxxww.specific_order_info)), null, 2, null);
    }

    public final List eablkybsjg(State state, boolean z13, final tg.rgvfuqvkyq getStringRes) {
        PaymentBonusesUiModel paymentBonusesUiModelPpxfxbqfkf;
        kq.wkgbmnqykc wkgbmnqykcVar;
        kq.ppxfxbqfkf ppxfxbqfkfVar;
        kq.rgvfuqvkyq rgvfuqvkyqVar;
        List listZoijcleaow;
        kq.agtfadlqog agtfadlqogVarIobyxmoadg;
        kq.lqeggnwhkg lqeggnwhkgVar;
        kq.zoijcleaow zoijcleaowVar;
        kq.agtfadlqog agtfadlqogVarIobyxmoadg2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        Cart cart = state.getCart();
        ArrayList arrayList = new ArrayList();
        List basket = cart.getBasket();
        if (basket == null) {
            basket = hg.jyumaefscl.wflxmlrfwp();
        }
        if (basket.isEmpty()) {
            LoadInfo loadInfo = state.getLoadInfo();
            if (loadInfo != null && (agtfadlqogVarIobyxmoadg2 = gxszxtbevo.iobyxmoadg(loadInfo)) != null) {
                arrayList.add(agtfadlqogVarIobyxmoadg2);
            }
            return arrayList;
        }
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        if (intervalInfo != null && (zoijcleaowVar = (kq.zoijcleaow) this.f52098zoijcleaow.invoke(intervalInfo)) != null) {
            arrayList.add(zoijcleaowVar);
        }
        CartProgressBar progressBar = cart.getProgressBar();
        if (progressBar != null && (lqeggnwhkgVar = (kq.lqeggnwhkg) this.f52092gxszxtbevo.invoke(progressBar)) != null) {
            arrayList.add(lqeggnwhkgVar);
        }
        LoadInfo loadInfo2 = state.getLoadInfo();
        if (loadInfo2 != null && (agtfadlqogVarIobyxmoadg = gxszxtbevo.iobyxmoadg(loadInfo2)) != null) {
            arrayList.add(agtfadlqogVarIobyxmoadg);
        }
        arrayList.add(dxjokdxxww(new tg.draadjrbmk() { // from class: jq.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yggfygwlhe.lqeggnwhkg(getStringRes, ((Integer) obj).intValue());
            }
        }));
        arrayList.addAll(this.f52091eablkybsjg.lqeggnwhkg(cart, state.getProductDataList(), z13, getStringRes));
        List recommendations = state.getRecommendations();
        if (recommendations.isEmpty()) {
            recommendations = null;
        }
        if (recommendations != null && (listZoijcleaow = this.f52090dxjokdxxww.zoijcleaow(recommendations, state.getProductDataList(), state.getCart().dxjokdxxww(), getStringRes)) != null) {
            if (listZoijcleaow.isEmpty()) {
                listZoijcleaow = null;
            }
            if (listZoijcleaow != null) {
                arrayList.addAll(listZoijcleaow);
            }
        }
        arrayList.add(wkgbmnqykc(new tg.draadjrbmk() { // from class: jq.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yggfygwlhe.nufgyqmvbu(getStringRes, ((Integer) obj).intValue());
            }
        }));
        List cartInfoList = cart.getCartInfoList();
        if (cartInfoList != null) {
            if (cartInfoList.isEmpty()) {
                cartInfoList = null;
            }
            if (cartInfoList != null && (rgvfuqvkyqVar = (kq.rgvfuqvkyq) this.f52094lqeggnwhkg.invoke(cartInfoList)) != null) {
                arrayList.add(rgvfuqvkyqVar);
            }
        }
        List selectedComments = cart.getSelectedComments();
        if (selectedComments != null && (ppxfxbqfkfVar = (kq.ppxfxbqfkf) this.f52095nufgyqmvbu.invoke(selectedComments)) != null) {
            arrayList.add(ppxfxbqfkfVar);
        }
        CartReceiver receiver = cart.getReceiver();
        if (receiver != null && (wkgbmnqykcVar = (kq.wkgbmnqykc) this.f52093iobyxmoadg.invoke(receiver)) != null) {
            arrayList.add(wkgbmnqykcVar);
        }
        CartBonuses cartBonuses = cart.getCartBonuses();
        if (cartBonuses != null) {
            if (!cart.ribwqtqdhb()) {
                cartBonuses = null;
            }
            if (cartBonuses != null && (paymentBonusesUiModelPpxfxbqfkf = this.f52097wkgbmnqykc.ppxfxbqfkf(cartBonuses, state.getBonusesEditorState(), new tg.rgvfuqvkyq() { // from class: jq.zdlpuopuiu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return yggfygwlhe.gxszxtbevo(getStringRes, ((Integer) obj).intValue(), obj2);
                }
            })) != null) {
                arrayList.add(paymentBonusesUiModelPpxfxbqfkf);
            }
        }
        if (!cart.jlmebxxoox()) {
            rgvfuqvkyq rgvfuqvkyqVar2 = this.f52096ppxfxbqfkf;
            tzroggbefp promoCodeFromInput = state.getPromoCodeEditorState().getPromoCodeFromInput();
            vu.btonecajqb stateFromInput = state.getPromoCodeEditorState().getStateFromInput();
            Promocode promocode = cart.getPromocode();
            String statusText = promocode != null ? promocode.getStatusText() : null;
            if (statusText == null) {
                statusText = "";
            }
            arrayList.add(rgvfuqvkyqVar2.invoke(promoCodeFromInput, stateFromInput, statusText));
        }
        return arrayList;
    }
}
