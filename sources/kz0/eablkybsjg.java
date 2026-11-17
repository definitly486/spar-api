package kz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f61162iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 952562303;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f61163iobyxmoadg;

        public zoijcleaow(Cart cart) {
            zdlpuopuiu.btonecajqb(cart, "cart");
            this.f61163iobyxmoadg = cart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61163iobyxmoadg, ((zoijcleaow) obj).f61163iobyxmoadg);
        }

        public int hashCode() {
            return this.f61163iobyxmoadg.hashCode();
        }

        public final Cart iobyxmoadg() {
            return this.f61163iobyxmoadg;
        }

        public String toString() {
            return "Filled(cart=" + this.f61163iobyxmoadg + ")";
        }
    }
}
