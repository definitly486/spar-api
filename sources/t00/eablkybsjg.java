package t00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f109220iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1814470910;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f109221iobyxmoadg;

        public zoijcleaow(Cart cart) {
            zdlpuopuiu.btonecajqb(cart, "cart");
            this.f109221iobyxmoadg = cart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109221iobyxmoadg, ((zoijcleaow) obj).f109221iobyxmoadg);
        }

        public int hashCode() {
            return this.f109221iobyxmoadg.hashCode();
        }

        public final Cart iobyxmoadg() {
            return this.f109221iobyxmoadg;
        }

        public String toString() {
            return "Filled(cart=" + this.f109221iobyxmoadg + ")";
        }
    }
}
