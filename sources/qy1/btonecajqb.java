package qy1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.PurchaseFuture;

/* JADX INFO: loaded from: classes6.dex */
public abstract class btonecajqb {

    public static final class eablkybsjg extends btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Purchase f80975iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Purchase purchase) {
            super(null);
            zdlpuopuiu.btonecajqb(purchase, "purchase");
            this.f80975iobyxmoadg = purchase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f80975iobyxmoadg, ((eablkybsjg) obj).f80975iobyxmoadg);
        }

        public int hashCode() {
            return this.f80975iobyxmoadg.hashCode();
        }

        public final Purchase iobyxmoadg() {
            return this.f80975iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchase(purchase=" + this.f80975iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f80976iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1370926277;
        }

        public String toString() {
            return "CartEmptyUpdated";
        }
    }

    public static final class ppxfxbqfkf extends btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f80977iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f80977iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f80977iobyxmoadg == ((ppxfxbqfkf) obj).f80977iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f80977iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f80977iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f80977iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseFuture f80978iobyxmoadg;

        public wkgbmnqykc(PurchaseFuture purchaseFuture) {
            super(null);
            this.f80978iobyxmoadg = purchaseFuture;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f80978iobyxmoadg, ((wkgbmnqykc) obj).f80978iobyxmoadg);
        }

        public int hashCode() {
            PurchaseFuture purchaseFuture = this.f80978iobyxmoadg;
            if (purchaseFuture == null) {
                return 0;
            }
            return purchaseFuture.hashCode();
        }

        public final PurchaseFuture iobyxmoadg() {
            return this.f80978iobyxmoadg;
        }

        public String toString() {
            return "ProcessFuturePurchases(purchases=" + this.f80978iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f80979iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Cart cart) {
            super(null);
            zdlpuopuiu.btonecajqb(cart, "cart");
            this.f80979iobyxmoadg = cart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80979iobyxmoadg, ((zoijcleaow) obj).f80979iobyxmoadg);
        }

        public int hashCode() {
            return this.f80979iobyxmoadg.hashCode();
        }

        public final Cart iobyxmoadg() {
            return this.f80979iobyxmoadg;
        }

        public String toString() {
            return "CartInfoUpdated(cart=" + this.f80979iobyxmoadg + ")";
        }
    }

    public /* synthetic */ btonecajqb(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private btonecajqb() {
    }
}
