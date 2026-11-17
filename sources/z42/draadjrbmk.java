package z42;

import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public enum draadjrbmk {
    HTAG("htag"),
    TEXT("text"),
    IMAGE("image"),
    BUTTON_LINK("button_link"),
    BUTTON_EXT("button_ext"),
    BUTTON_PARTICIPATE("participate_button"),
    FILES("files"),
    GALLERY("gallery"),
    PICTURE_TEXT("picture_text"),
    VIDEO("video"),
    ACCORDION("accordion"),
    PROMO_PRODUCTS("promo_products"),
    PROMO("promo"),
    PRODUCTS("products"),
    MAP("map"),
    FORM("form"),
    COMBO_SET("combo"),
    TABLE("table"),
    BANNERS("banners"),
    IMAGE_EXT("image_ext"),
    VIDEOS("videos"),
    SQUARE_CARDS("square_cards_list"),
    EVROPOLIS_STICKER_CARD("monopoly_user_stickers"),
    TIMER("timer"),
    BONUS_CARD("bonuses"),
    LOYALTY_PROGRAM_LEVEL("loyalty"),
    PROMO_BONUSES("promo_bonuses"),
    DIVIDER("divider"),
    PROMO_COLLECTION("promo_collection"),
    UNKNOWN("");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f128629zdlpuopuiu;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f128622vipkmwdibw = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f128626yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = draadjrbmk.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((draadjrbmk) next).lqeggnwhkg(), value));
            draadjrbmk draadjrbmkVar = (draadjrbmk) next;
            return draadjrbmkVar == null ? draadjrbmk.UNKNOWN : draadjrbmkVar;
        }

        private iobyxmoadg() {
        }
    }

    draadjrbmk(String str) {
        this.f128629zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f128622vipkmwdibw;
    }

    public final String lqeggnwhkg() {
        return this.f128629zdlpuopuiu;
    }
}
