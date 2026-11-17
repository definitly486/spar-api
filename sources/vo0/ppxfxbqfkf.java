package vo0;

import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.cart.impl.domain.store.State;
import ru.myspar.proloyalty.cart.impl.utils.BonusesEditorState;
import ru.myspar.proloyalty.core.domain.models.LoadInfo;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements tg.draadjrbmk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f117596cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f117597esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q41.iobyxmoadg f117598iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final vdvldrhtss f117599jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jyumaefscl f117600yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final yggfygwlhe f117601zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: vo0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    /* synthetic */ class C2924ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        C2924ppxfxbqfkf(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        zoijcleaow(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public ppxfxbqfkf(yggfygwlhe cartScreenContentUiMapper, jyumaefscl cartTotalPriceUiModelMapper, vdvldrhtss recommendationsUiModelMapper, q41.iobyxmoadg resourcesManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartScreenContentUiMapper, "cartScreenContentUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartTotalPriceUiModelMapper, "cartTotalPriceUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendationsUiModelMapper, "recommendationsUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f117601zdlpuopuiu = cartScreenContentUiMapper;
        this.f117600yggfygwlhe = cartTotalPriceUiModelMapper;
        this.f117599jyumaefscl = recommendationsUiModelMapper;
        this.f117598iwizpuwonk = resourcesManager;
    }

    private final st0.wkgbmnqykc eablkybsjg(State state) {
        boolean z13;
        jyumaefscl jyumaefsclVar = this.f117600yggfygwlhe;
        Cart cart = state.getCart();
        BonusesEditorState bonusesEditorState = state.getBonusesEditorState();
        if (state.getIsLoading()) {
            z13 = true;
        } else {
            List productDataList = state.getProductDataList();
            if (productDataList == null || !productDataList.isEmpty()) {
                Iterator it = productDataList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ProductUIData) it.next()).getIsLoading()) {
                            z13 = true;
                        }
                    }
                }
            }
            z13 = false;
        }
        return jyumaefsclVar.iobyxmoadg(cart, bonusesEditorState, z13);
    }

    private final wo0.agtfadlqog ppxfxbqfkf(State state) {
        List listZoijcleaow;
        wo0.ojitshcjhn ojitshcjhnVarIobyxmoadg;
        List listPpxfxbqfkf = hg.jyumaefscl.ppxfxbqfkf();
        LoadInfo loadInfo = state.getLoadInfo();
        if (loadInfo != null && (ojitshcjhnVarIobyxmoadg = gxszxtbevo.iobyxmoadg(loadInfo)) != null) {
            listPpxfxbqfkf.add(ojitshcjhnVarIobyxmoadg);
        }
        listPpxfxbqfkf.add(wo0.ppxfxbqfkf.f120330iobyxmoadg);
        List recommendations = state.getRecommendations();
        if (recommendations.isEmpty()) {
            recommendations = null;
        }
        if (recommendations != null && (listZoijcleaow = this.f117599jyumaefscl.zoijcleaow(recommendations, state.getProductDataList(), state.getCart().dxjokdxxww(), new C2924ppxfxbqfkf(this.f117598iwizpuwonk))) != null) {
            listPpxfxbqfkf.addAll(listZoijcleaow);
        }
        return new wo0.agtfadlqog(hg.jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
    }

    private final boolean zoijcleaow(kz0.nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar == kz0.nufgyqmvbu.EMPTY;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ho0.lqeggnwhkg invoke(State state) {
        List listWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        String title = state.getCart().getDeliveryInfo().getTitle();
        boolean isLoading = state.getIsLoading();
        String subtitle = state.getCart().getDeliveryInfo().getSubtitle();
        String price = state.getCart().getDeliveryInfo().getPrice();
        if (price == null) {
            price = "";
        }
        bs0.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = bs0.vdvldrhtss.iobyxmoadg(title, subtitle, price, state.getCart().getDeliveryInfo().nufgyqmvbu(), isLoading, true);
        boolean z13 = true;
        if ((!zoijcleaow(state.getWarningState()) ? state : null) == null || (listWflxmlrfwp = this.f117601zdlpuopuiu.eablkybsjg(state, true, new zoijcleaow(this.f117598iwizpuwonk))) == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        List list = listWflxmlrfwp;
        List basket = state.getCart().getBasket();
        if (basket != null && !basket.isEmpty()) {
            z13 = false;
        }
        State state2 = !z13 ? state : null;
        st0.wkgbmnqykc wkgbmnqykcVarEablkybsjg = state2 != null ? eablkybsjg(state2) : null;
        State state3 = zoijcleaow(state.getWarningState()) ? state : null;
        return new ho0.lqeggnwhkg(rgvfuqvkyqVarIobyxmoadg, list, wkgbmnqykcVarEablkybsjg, state3 != null ? ppxfxbqfkf(state3) : null, state.getIsLoading(), state.getCurrentDialogType(), state.getIsRemoveProductLoading(), state.getIsNeededScrollContentToTop());
    }
}
