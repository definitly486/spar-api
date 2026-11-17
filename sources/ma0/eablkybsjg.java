package ma0;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum eablkybsjg {
    LOYMAX_DISCOUNTS("loymax_discounts"),
    SBP_ONLINE("sbp_online"),
    POSTAMAT("postamat"),
    PRODUCTS_RATING("products_rating"),
    DYNAMIC_QR_CODE("dynamic_qr"),
    PARTNERS("partners"),
    NEW_SUBS("new_subs"),
    MY_DISCOUNTS("my_discounts"),
    SAVED_CARDS("saved_cards"),
    DARK_MODE("dark_mode"),
    CHAT_ORDERS("chat_orders"),
    PURCHASES_LIST("purchases_list"),
    SPAR_WINE("spar_wine"),
    CANCEL_ORDER_REASON("reason_cancel_order"),
    EVROPOLIS("monopoly"),
    DELIVERY_INFO("new_delivery_flow"),
    SEARCH_SUGGESTIONS("search_suggestions"),
    RECOMMENDATIONS_ANALOG("analog_test"),
    RECOMMENDATIONS_ADDITIONAL("additional_test"),
    RECOMMENDATIONS_POPULAR("popular_test"),
    RECOMMENDATIONS_PERSONAL("personal_test"),
    UNDEFINED("");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f66660zdlpuopuiu;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f66653tzroggbefp = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f66657yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final eablkybsjg iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = eablkybsjg.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((eablkybsjg) next).lqeggnwhkg(), value));
            eablkybsjg eablkybsjgVar = (eablkybsjg) next;
            return eablkybsjgVar == null ? eablkybsjg.UNDEFINED : eablkybsjgVar;
        }

        private iobyxmoadg() {
        }
    }

    eablkybsjg(String str) {
        this.f66660zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f66653tzroggbefp;
    }

    public final String lqeggnwhkg() {
        return this.f66660zdlpuopuiu;
    }
}
