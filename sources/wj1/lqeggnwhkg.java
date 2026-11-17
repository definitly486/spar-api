package wj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseFuture;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {

    public static final class eablkybsjg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Purchase f120016iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Purchase purchase) {
            super(null);
            zdlpuopuiu.btonecajqb(purchase, "purchase");
            this.f120016iobyxmoadg = purchase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f120016iobyxmoadg, ((eablkybsjg) obj).f120016iobyxmoadg);
        }

        public int hashCode() {
            return this.f120016iobyxmoadg.hashCode();
        }

        public final Purchase iobyxmoadg() {
            return this.f120016iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchase(purchase=" + this.f120016iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f120017iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 86856606;
        }

        public String toString() {
            return "CartEmptyUpdated";
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f120018iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f120018iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f120018iobyxmoadg == ((ppxfxbqfkf) obj).f120018iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f120018iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f120018iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f120018iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseFuture f120019iobyxmoadg;

        public wkgbmnqykc(PurchaseFuture purchaseFuture) {
            super(null);
            this.f120019iobyxmoadg = purchaseFuture;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f120019iobyxmoadg, ((wkgbmnqykc) obj).f120019iobyxmoadg);
        }

        public int hashCode() {
            PurchaseFuture purchaseFuture = this.f120019iobyxmoadg;
            if (purchaseFuture == null) {
                return 0;
            }
            return purchaseFuture.hashCode();
        }

        public final PurchaseFuture iobyxmoadg() {
            return this.f120019iobyxmoadg;
        }

        public String toString() {
            return "ProcessFuturePurchases(purchases=" + this.f120019iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f120020iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Cart cart) {
            super(null);
            zdlpuopuiu.btonecajqb(cart, "cart");
            this.f120020iobyxmoadg = cart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120020iobyxmoadg, ((zoijcleaow) obj).f120020iobyxmoadg);
        }

        public int hashCode() {
            return this.f120020iobyxmoadg.hashCode();
        }

        public final Cart iobyxmoadg() {
            return this.f120020iobyxmoadg;
        }

        public String toString() {
            return "CartInfoUpdated(cart=" + this.f120020iobyxmoadg + ")";
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}
