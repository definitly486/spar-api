package bo1;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public enum zoijcleaow {
    UNKNOWN(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE),
    MARK_PIECE_IS_EMPTY_CODE("mark_piece_is_empty"),
    MARK_WEIGHT_IS_EMPTY_CODE("mark_weight_is_empty"),
    MARK_IS_INCORRECT("mark_is_incorrect"),
    MARK_IS_DUPLICATED("mark_is_duplicate"),
    PRODUCT_UNAVAILABLE("product_unavailable"),
    PRODUCT_NOT_FOUND("product_not_found");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f16914zdlpuopuiu;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f16904cdpycssgdh = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f16912yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(String str) {
            Object next;
            Iterator<E> it = zoijcleaow.lqeggnwhkg().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((zoijcleaow) next).f16914zdlpuopuiu, str));
            zoijcleaow zoijcleaowVar = (zoijcleaow) next;
            return zoijcleaowVar == null ? zoijcleaow.UNKNOWN : zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f16914zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg lqeggnwhkg() {
        return f16904cdpycssgdh;
    }
}
