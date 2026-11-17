package f40;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ListIterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes4.dex */
public enum zoijcleaow {
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
    QUIZ("quize"),
    NONE("");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f32836zdlpuopuiu;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f32834zfvoamnweg = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f32832yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(String str) {
            Object objPrevious;
            ng.iobyxmoadg iobyxmoadgVarNufgyqmvbu = zoijcleaow.nufgyqmvbu();
            ListIterator listIterator = iobyxmoadgVarNufgyqmvbu.listIterator(iobyxmoadgVarNufgyqmvbu.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!zdlpuopuiu.eablkybsjg(((zoijcleaow) objPrevious).dxjokdxxww(), str));
            zoijcleaow zoijcleaowVar = (zoijcleaow) objPrevious;
            return zoijcleaowVar == null ? zoijcleaow.NONE : zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f32836zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg nufgyqmvbu() {
        return f32834zfvoamnweg;
    }

    public final String dxjokdxxww() {
        return this.f32836zdlpuopuiu;
    }

    public final boolean lqeggnwhkg() {
        return this != NONE;
    }

    public final NavigationPayload wkgbmnqykc() {
        return new NavigationPayload(this, null, null, null, false, null, null, false, 254, null);
    }
}
