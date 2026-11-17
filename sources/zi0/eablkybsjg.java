package zi0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: zi0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C3317eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f130171iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3317eablkybsjg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f130171iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3317eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f130171iobyxmoadg, ((C3317eablkybsjg) obj).f130171iobyxmoadg);
        }

        public int hashCode() {
            return this.f130171iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f130171iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f130171iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f130172iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 83385750;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130173iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f130173iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f130173iobyxmoadg, ((ppxfxbqfkf) obj).f130173iobyxmoadg);
        }

        public int hashCode() {
            return this.f130173iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130173iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCall(phone=" + this.f130173iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dj0.wkgbmnqykc f130174iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final c10.gxszxtbevo f130175zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(dj0.wkgbmnqykc order, c10.gxszxtbevo ordersStatus) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
            this.f130174iobyxmoadg = order;
            this.f130175zoijcleaow = ordersStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f130174iobyxmoadg, wkgbmnqykcVar.f130174iobyxmoadg) && this.f130175zoijcleaow == wkgbmnqykcVar.f130175zoijcleaow;
        }

        public int hashCode() {
            return (this.f130174iobyxmoadg.hashCode() * 31) + this.f130175zoijcleaow.hashCode();
        }

        public final dj0.wkgbmnqykc iobyxmoadg() {
            return this.f130174iobyxmoadg;
        }

        public String toString() {
            return "NavigateToOrder(order=" + this.f130174iobyxmoadg + ", ordersStatus=" + this.f130175zoijcleaow + ")";
        }

        public final c10.gxszxtbevo zoijcleaow() {
            return this.f130175zoijcleaow;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130176iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f130176iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f130176iobyxmoadg, ((zoijcleaow) obj).f130176iobyxmoadg);
        }

        public int hashCode() {
            return this.f130176iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130176iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f130176iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
