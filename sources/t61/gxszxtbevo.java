package t61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f109919iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Promotion.PromotionItem product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f109919iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109919iobyxmoadg, ((iobyxmoadg) obj).f109919iobyxmoadg);
        }

        public int hashCode() {
            return this.f109919iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f109919iobyxmoadg;
        }

        public String toString() {
            return "PromoProductReceived(product=" + this.f109919iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
