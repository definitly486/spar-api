package ru.myspar.orders.impl.screens.specific.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f91100iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -190989429;
        }

        public String toString() {
            return "StopTimer";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Order f91101iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f91102ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f91103wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f91104zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Order order, boolean z13, boolean z14, boolean z15) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            this.f91101iobyxmoadg = order;
            this.f91104zoijcleaow = z13;
            this.f91102ppxfxbqfkf = z14;
            this.f91103wkgbmnqykc = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f91101iobyxmoadg, eablkybsjgVar.f91101iobyxmoadg) && this.f91104zoijcleaow == eablkybsjgVar.f91104zoijcleaow && this.f91102ppxfxbqfkf == eablkybsjgVar.f91102ppxfxbqfkf && this.f91103wkgbmnqykc == eablkybsjgVar.f91103wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f91101iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f91104zoijcleaow)) * 31) + Boolean.hashCode(this.f91102ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f91103wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f91104zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f91103wkgbmnqykc;
        }

        public String toString() {
            return "InfoUpdated(order=" + this.f91101iobyxmoadg + ", callButtonIsVisible=" + this.f91104zoijcleaow + ", isTrackingFeatureEnabled=" + this.f91102ppxfxbqfkf + ", isPickupStatusButtonFeatureEnabled=" + this.f91103wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f91102ppxfxbqfkf;
        }

        public final Order zoijcleaow() {
            return this.f91101iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2113gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f91105iobyxmoadg;

        public C2113gxszxtbevo(boolean z13) {
            super(null);
            this.f91105iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2113gxszxtbevo) && this.f91105iobyxmoadg == ((C2113gxszxtbevo) obj).f91105iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91105iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f91105iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f91105iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f91106iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f91106iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f91106iobyxmoadg == ((iobyxmoadg) obj).f91106iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91106iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f91106iobyxmoadg;
        }

        public String toString() {
            return "ChangeNeededOpenPaymentScreen(isNeededOpenPaymentScreen=" + this.f91106iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final OrderPickupStatus f91107iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(OrderPickupStatus status) {
            super(null);
            zdlpuopuiu.btonecajqb(status, "status");
            this.f91107iobyxmoadg = status;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f91107iobyxmoadg == ((lqeggnwhkg) obj).f91107iobyxmoadg;
        }

        public int hashCode() {
            return this.f91107iobyxmoadg.hashCode();
        }

        public final OrderPickupStatus iobyxmoadg() {
            return this.f91107iobyxmoadg;
        }

        public String toString() {
            return "PickupStatusChanged(status=" + this.f91107iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91108iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f91109zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String productArticle, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f91108iobyxmoadg = productArticle;
            this.f91109zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f91108iobyxmoadg, nufgyqmvbuVar.f91108iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91109zoijcleaow, nufgyqmvbuVar.f91109zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f91108iobyxmoadg.hashCode() * 31;
            String str = this.f91109zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f91108iobyxmoadg;
        }

        public String toString() {
            return "ReplaceSelected(productArticle=" + this.f91108iobyxmoadg + ", replaceArticle=" + this.f91109zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f91109zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91110iobyxmoadg;

        public ppxfxbqfkf(int i13) {
            super(null);
            this.f91110iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f91110iobyxmoadg == ((ppxfxbqfkf) obj).f91110iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91110iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f91110iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductReplacementTimer(remainTime=" + this.f91110iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f91111iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f91112ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f91113zoijcleaow;

        public wkgbmnqykc(boolean z13, boolean z14, boolean z15) {
            super(null);
            this.f91111iobyxmoadg = z13;
            this.f91113zoijcleaow = z14;
            this.f91112ppxfxbqfkf = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f91111iobyxmoadg == wkgbmnqykcVar.f91111iobyxmoadg && this.f91113zoijcleaow == wkgbmnqykcVar.f91113zoijcleaow && this.f91112ppxfxbqfkf == wkgbmnqykcVar.f91112ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f91111iobyxmoadg) * 31) + Boolean.hashCode(this.f91113zoijcleaow)) * 31) + Boolean.hashCode(this.f91112ppxfxbqfkf);
        }

        public final boolean iobyxmoadg() {
            return this.f91112ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f91113zoijcleaow;
        }

        public String toString() {
            return "ChangeProductsInfo(isOneProductReplacement=" + this.f91111iobyxmoadg + ", isOneProductUnavailable=" + this.f91113zoijcleaow + ", isOneProductAvailableWithoutReplacement=" + this.f91112ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f91111iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f91114iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f91114iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f91114iobyxmoadg == ((zoijcleaow) obj).f91114iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91114iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f91114iobyxmoadg;
        }

        public String toString() {
            return "ChangePayButtonEnabled(isEnabled=" + this.f91114iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
