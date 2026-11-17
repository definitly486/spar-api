package vo0;

import java.util.ArrayList;
import java.util.List;
import p0.tzroggbefp;
import ru.myspar.proloyalty.cart.impl.domain.store.State;
import ru.myspar.proloyalty.cart.impl.presentation.model.CartHeaderUiModel;
import ru.myspar.proloyalty.cart.impl.presentation.model.PaymentBonusesUiModel;
import ru.myspar.proloyalty.core.domain.models.LoadInfo;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBar;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;
import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;
import ru.myspar.proloyalty.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes5.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vdvldrhtss f117606dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final agtfadlqog f117607eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ojitshcjhn f117608gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f117609iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final lqeggnwhkg f117610lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final zoijcleaow f117611nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq f117612ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f117613wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f117614zoijcleaow;

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
        this.f117609iobyxmoadg = receiverUiModelMapper;
        this.f117614zoijcleaow = receiptInfoUiModelMapper;
        this.f117612ppxfxbqfkf = promoCodeUiModelMapper;
        this.f117613wkgbmnqykc = paymentBonusesMapper;
        this.f117607eablkybsjg = productsListUiModelMapper;
        this.f117608gxszxtbevo = progressBarUiModelMapper;
        this.f117610lqeggnwhkg = orderInfoUiModelMapper;
        this.f117611nufgyqmvbu = cartCommentsUiModelMapper;
        this.f117606dxjokdxxww = recommendationsUiModelMapper;
    }

    private final CartHeaderUiModel dxjokdxxww(tg.draadjrbmk draadjrbmkVar) {
        return new CartHeaderUiModel((String) draadjrbmkVar.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_basket_products)), new CartHeaderUiModel.Button((String) draadjrbmkVar.invoke(Integer.valueOf(fo0.ppxfxbqfkf.proloyalty_clear_cart)), CartHeaderUiModel.iobyxmoadg.CLEAR_CART));
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
        return new CartHeaderUiModel((String) draadjrbmkVar.invoke(Integer.valueOf(vk0.lqeggnwhkg.proloyalty_specific_order_info)), null, 2, null);
    }

    public final List eablkybsjg(State state, boolean z13, final tg.rgvfuqvkyq getStringRes) {
        PaymentBonusesUiModel paymentBonusesUiModelPpxfxbqfkf;
        wo0.eablkybsjg eablkybsjgVar;
        wo0.wkgbmnqykc wkgbmnqykcVar;
        wo0.vdvldrhtss vdvldrhtssVar;
        List listZoijcleaow;
        wo0.ojitshcjhn ojitshcjhnVarIobyxmoadg;
        wo0.nufgyqmvbu nufgyqmvbuVar;
        wo0.zoijcleaow zoijcleaowVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        Cart cart = state.getCart();
        ArrayList arrayList = new ArrayList();
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        if (intervalInfo != null && (zoijcleaowVar = (wo0.zoijcleaow) this.f117614zoijcleaow.invoke(intervalInfo)) != null) {
            arrayList.add(zoijcleaowVar);
        }
        CartProgressBar progressBar = cart.getProgressBar();
        if (progressBar != null && (nufgyqmvbuVar = (wo0.nufgyqmvbu) this.f117608gxszxtbevo.invoke(progressBar)) != null) {
            arrayList.add(nufgyqmvbuVar);
        }
        LoadInfo loadInfo = state.getLoadInfo();
        if (loadInfo != null && (ojitshcjhnVarIobyxmoadg = gxszxtbevo.iobyxmoadg(loadInfo)) != null) {
            arrayList.add(ojitshcjhnVarIobyxmoadg);
        }
        arrayList.add(dxjokdxxww(new tg.draadjrbmk() { // from class: vo0.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yggfygwlhe.lqeggnwhkg(getStringRes, ((Integer) obj).intValue());
            }
        }));
        arrayList.addAll(this.f117607eablkybsjg.gxszxtbevo(cart, state.getProductDataList(), z13, getStringRes));
        List recommendations = state.getRecommendations();
        if (recommendations.isEmpty()) {
            recommendations = null;
        }
        if (recommendations != null && (listZoijcleaow = this.f117606dxjokdxxww.zoijcleaow(recommendations, state.getProductDataList(), state.getCart().dxjokdxxww(), getStringRes)) != null) {
            if (listZoijcleaow.isEmpty()) {
                listZoijcleaow = null;
            }
            if (listZoijcleaow != null) {
                arrayList.addAll(listZoijcleaow);
            }
        }
        arrayList.add(wkgbmnqykc(new tg.draadjrbmk() { // from class: vo0.kcexrzcfyt
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
            if (cartInfoList != null && (vdvldrhtssVar = (wo0.vdvldrhtss) this.f117610lqeggnwhkg.invoke(cartInfoList)) != null) {
                arrayList.add(vdvldrhtssVar);
            }
        }
        List selectedComments = cart.getSelectedComments();
        if (selectedComments != null && (wkgbmnqykcVar = (wo0.wkgbmnqykc) this.f117611nufgyqmvbu.invoke(selectedComments)) != null) {
            arrayList.add(wkgbmnqykcVar);
        }
        CartReceiver receiver = cart.getReceiver();
        if (receiver != null && (eablkybsjgVar = (wo0.eablkybsjg) this.f117609iobyxmoadg.invoke(receiver)) != null) {
            arrayList.add(eablkybsjgVar);
        }
        CartBonuses cartBonuses = cart.getCartBonuses();
        if (cartBonuses != null) {
            if (!cart.ribwqtqdhb()) {
                cartBonuses = null;
            }
            if (cartBonuses != null && (paymentBonusesUiModelPpxfxbqfkf = this.f117613wkgbmnqykc.ppxfxbqfkf(cartBonuses, state.getBonusesEditorState(), new tg.rgvfuqvkyq() { // from class: vo0.zdlpuopuiu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return yggfygwlhe.gxszxtbevo(getStringRes, ((Integer) obj).intValue(), obj2);
                }
            })) != null) {
                arrayList.add(paymentBonusesUiModelPpxfxbqfkf);
            }
        }
        if (!cart.jlmebxxoox()) {
            rgvfuqvkyq rgvfuqvkyqVar = this.f117612ppxfxbqfkf;
            tzroggbefp promoCodeFromInput = state.getPromoCodeEditorState().getPromoCodeFromInput();
            pt0.btonecajqb stateFromInput = state.getPromoCodeEditorState().getStateFromInput();
            Promocode promocode = cart.getPromocode();
            String statusText = promocode != null ? promocode.getStatusText() : null;
            if (statusText == null) {
                statusText = "";
            }
            arrayList.add(rgvfuqvkyqVar.invoke(promoCodeFromInput, stateFromInput, statusText));
        }
        return arrayList;
    }
}
