package k21;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes5.dex */
public enum ojitshcjhn {
    BLOCKS("blocks"),
    QR_SCAN("qr_scan"),
    BANNER("banner"),
    CATALOG("catalog"),
    SECTION("section"),
    SECTIONS("sections"),
    SELECTION("selection"),
    SUBCATALOG("subcatalog"),
    PRODUCT("product"),
    PRODUCT_BY_ARTICLE("product_article"),
    FIRST_SECTION("first_section"),
    PARTNERS("partners_list"),
    PARTNER("partner_detail"),
    ONLINE_SKU("online_sku"),
    QR("qr"),
    CARD("card"),
    BASKET("basket"),
    MY_ADDRESSES("addresses"),
    MY_COUPONS("discounts"),
    PURCHASES_LISTS("purchases_lists"),
    NOTIFICATION("notification"),
    ORDER("order"),
    WITH_CARE_FOR_NATURE("with_care_for_nature"),
    RECEIVE_ELECTRONIC_CHECKS("receive_electronic_checks"),
    LOYALTY_PROMOTION("loyalty_promotion"),
    SUBSCRIPTION("subscription"),
    PICK_UP("pick_up"),
    DELIVERY("delivery"),
    INTERVALS("intervals"),
    URL(ImagesContract.URL),
    FUTURE_BASKET("future_basket"),
    CHAT("chat"),
    CALL("call"),
    SHOPS("shops"),
    FEED_BACK("form"),
    EVROPOLIS_GIFT("monopoly_gift"),
    ADD_PRODUCT_LIST_TO_BASKET("add_to_basket"),
    LOYALTY_CATEGORIES_DETAIL("loyalty_categories_choose"),
    DEEPLINK("deeplink"),
    POPUP("popup"),
    GAME_IN_WEB_VIEW("game_in_webview"),
    TIPS_ORDER("tips"),
    ACTIVATION_CARD("activation_card"),
    QUIZ("quize"),
    NONE("");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f53520zdlpuopuiu;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f53472bfopjjpdmp = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f53516yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ojitshcjhn iobyxmoadg(String str) {
            Object objPrevious;
            ng.iobyxmoadg iobyxmoadgVarDxjokdxxww = ojitshcjhn.dxjokdxxww();
            ListIterator listIterator = iobyxmoadgVarDxjokdxxww.listIterator(iobyxmoadgVarDxjokdxxww.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!zdlpuopuiu.eablkybsjg(((ojitshcjhn) objPrevious).btonecajqb(), str));
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) objPrevious;
            return ojitshcjhnVar == null ? ojitshcjhn.NONE : ojitshcjhnVar;
        }

        private iobyxmoadg() {
        }
    }

    ojitshcjhn(String str) {
        this.f53520zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg dxjokdxxww() {
        return f53472bfopjjpdmp;
    }

    public static /* synthetic */ NavigationPayload lqeggnwhkg(ojitshcjhn ojitshcjhnVar, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPayload");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        return ojitshcjhnVar.wkgbmnqykc(str);
    }

    public final String btonecajqb() {
        return this.f53520zdlpuopuiu;
    }

    public final boolean nufgyqmvbu() {
        return this != NONE;
    }

    public final NavigationPayload wkgbmnqykc(String str) {
        return new NavigationPayload(this, str, null, null, false, null, null, false, 252, null);
    }
}
