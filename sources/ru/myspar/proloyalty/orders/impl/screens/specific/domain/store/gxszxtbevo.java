package ru.myspar.proloyalty.orders.impl.screens.specific.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f98754iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 859687240;
        }

        public String toString() {
            return "StopTimer";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final OrderDetail f98755iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f98756ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f98757wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f98758zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(OrderDetail order, boolean z13, boolean z14, boolean z15) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            this.f98755iobyxmoadg = order;
            this.f98758zoijcleaow = z13;
            this.f98756ppxfxbqfkf = z14;
            this.f98757wkgbmnqykc = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f98755iobyxmoadg, eablkybsjgVar.f98755iobyxmoadg) && this.f98758zoijcleaow == eablkybsjgVar.f98758zoijcleaow && this.f98756ppxfxbqfkf == eablkybsjgVar.f98756ppxfxbqfkf && this.f98757wkgbmnqykc == eablkybsjgVar.f98757wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f98755iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f98758zoijcleaow)) * 31) + Boolean.hashCode(this.f98756ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f98757wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f98758zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f98757wkgbmnqykc;
        }

        public String toString() {
            return "InfoUpdated(order=" + this.f98755iobyxmoadg + ", callButtonIsVisible=" + this.f98758zoijcleaow + ", isTrackingFeatureEnabled=" + this.f98756ppxfxbqfkf + ", isPickupStatusButtonFeatureEnabled=" + this.f98757wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f98756ppxfxbqfkf;
        }

        public final OrderDetail zoijcleaow() {
            return this.f98755iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2360gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98759iobyxmoadg;

        public C2360gxszxtbevo(boolean z13) {
            super(null);
            this.f98759iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2360gxszxtbevo) && this.f98759iobyxmoadg == ((C2360gxszxtbevo) obj).f98759iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98759iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98759iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f98759iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98760iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f98760iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f98760iobyxmoadg == ((iobyxmoadg) obj).f98760iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98760iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98760iobyxmoadg;
        }

        public String toString() {
            return "ChangeNeededOpenPaymentScreen(isNeededOpenPaymentScreen=" + this.f98760iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final OrderPickupStatus f98761iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(OrderPickupStatus status) {
            super(null);
            zdlpuopuiu.btonecajqb(status, "status");
            this.f98761iobyxmoadg = status;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f98761iobyxmoadg == ((lqeggnwhkg) obj).f98761iobyxmoadg;
        }

        public int hashCode() {
            return this.f98761iobyxmoadg.hashCode();
        }

        public final OrderPickupStatus iobyxmoadg() {
            return this.f98761iobyxmoadg;
        }

        public String toString() {
            return "PickupStatusChanged(status=" + this.f98761iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98762iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98763zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String productArticle, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f98762iobyxmoadg = productArticle;
            this.f98763zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f98762iobyxmoadg, nufgyqmvbuVar.f98762iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98763zoijcleaow, nufgyqmvbuVar.f98763zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f98762iobyxmoadg.hashCode() * 31;
            String str = this.f98763zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f98762iobyxmoadg;
        }

        public String toString() {
            return "ReplaceSelected(productArticle=" + this.f98762iobyxmoadg + ", replaceArticle=" + this.f98763zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98763zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f98764iobyxmoadg;

        public ppxfxbqfkf(int i13) {
            super(null);
            this.f98764iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f98764iobyxmoadg == ((ppxfxbqfkf) obj).f98764iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f98764iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f98764iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductReplacementTimer(remainTime=" + this.f98764iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98765iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f98766ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f98767zoijcleaow;

        public wkgbmnqykc(boolean z13, boolean z14, boolean z15) {
            super(null);
            this.f98765iobyxmoadg = z13;
            this.f98767zoijcleaow = z14;
            this.f98766ppxfxbqfkf = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f98765iobyxmoadg == wkgbmnqykcVar.f98765iobyxmoadg && this.f98767zoijcleaow == wkgbmnqykcVar.f98767zoijcleaow && this.f98766ppxfxbqfkf == wkgbmnqykcVar.f98766ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f98765iobyxmoadg) * 31) + Boolean.hashCode(this.f98767zoijcleaow)) * 31) + Boolean.hashCode(this.f98766ppxfxbqfkf);
        }

        public final boolean iobyxmoadg() {
            return this.f98766ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f98767zoijcleaow;
        }

        public String toString() {
            return "ChangeProductsInfo(isOneProductReplacement=" + this.f98765iobyxmoadg + ", isOneProductUnavailable=" + this.f98767zoijcleaow + ", isOneProductAvailableWithoutReplacement=" + this.f98766ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f98765iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98768iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f98768iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f98768iobyxmoadg == ((zoijcleaow) obj).f98768iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98768iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98768iobyxmoadg;
        }

        public String toString() {
            return "ChangePayButtonEnabled(isEnabled=" + this.f98768iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
