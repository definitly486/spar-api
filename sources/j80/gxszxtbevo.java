package j80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f50867iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Promotion.PromotionItem product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f50867iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50867iobyxmoadg, ((iobyxmoadg) obj).f50867iobyxmoadg);
        }

        public int hashCode() {
            return this.f50867iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f50867iobyxmoadg;
        }

        public String toString() {
            return "PromoProductReceived(product=" + this.f50867iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
