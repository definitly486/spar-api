package jq;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.cart.impl.domain.store.State;
import ru.myspar.cart.impl.utils.BonusesEditorState;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.ProductUIData;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements tg.draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final d60.iobyxmoadg f52082jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jyumaefscl f52083yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final yggfygwlhe f52084zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final iobyxmoadg f52081iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f52080cqumvgiudr = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: jq.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    /* synthetic */ class C1115ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        C1115ppxfxbqfkf(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f52085iobyxmoadg;

        static {
            int[] iArr = new int[t00.dxjokdxxww.values().length];
            try {
                iArr[t00.dxjokdxxww.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t00.dxjokdxxww.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t00.dxjokdxxww.HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52085iobyxmoadg = iArr;
        }
    }

    public ppxfxbqfkf(yggfygwlhe cartScreenContentUiMapper, jyumaefscl cartTotalPriceUiModelMapper, d60.iobyxmoadg resourcesManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartScreenContentUiMapper, "cartScreenContentUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartTotalPriceUiModelMapper, "cartTotalPriceUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f52084zdlpuopuiu = cartScreenContentUiMapper;
        this.f52083yggfygwlhe = cartTotalPriceUiModelMapper;
        this.f52082jyumaefscl = resourcesManager;
    }

    private final kq.wflxmlrfwp ppxfxbqfkf(t00.dxjokdxxww dxjokdxxwwVar) {
        int i13 = dxjokdxxwwVar == null ? -1 : zoijcleaow.f52085iobyxmoadg[dxjokdxxwwVar.ordinal()];
        if (i13 == -1) {
            return kq.wflxmlrfwp.NOTHING;
        }
        if (i13 == 1) {
            return kq.wflxmlrfwp.EMPTY_CART;
        }
        if (i13 == 2) {
            return kq.wflxmlrfwp.UNAUTHORIZED;
        }
        if (i13 == 3) {
            return kq.wflxmlrfwp.NOTHING;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final yu.wkgbmnqykc zoijcleaow(State state) {
        boolean z13;
        jyumaefscl jyumaefsclVar = this.f52083yggfygwlhe;
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

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wp.lqeggnwhkg invoke(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kq.wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = ppxfxbqfkf(state.getWarningState());
        String title = state.getCart().getDeliveryInfo().getTitle();
        String subtitle = state.getCart().getDeliveryInfo().getSubtitle();
        String price = state.getCart().getDeliveryInfo().getPrice();
        if (price == null) {
            price = "";
        }
        ht.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = ht.dxjokdxxww.iobyxmoadg(title, subtitle, price, state.getCart().getDeliveryInfo().nufgyqmvbu());
        boolean z13 = true;
        List listEablkybsjg = this.f52084zdlpuopuiu.eablkybsjg(state, true, new C1115ppxfxbqfkf(this.f52082jyumaefscl));
        List basket = state.getCart().getBasket();
        if (basket != null && !basket.isEmpty()) {
            z13 = false;
        }
        State state2 = !z13 ? state : null;
        return new wp.lqeggnwhkg(wflxmlrfwpVarPpxfxbqfkf, nufgyqmvbuVarIobyxmoadg, listEablkybsjg, state2 != null ? zoijcleaow(state2) : null, state.getIsLoading(), state.getCurrentDialogType(), state.getIsRemoveProductLoading(), state.getIsNeededScrollContentToTop());
    }
}
