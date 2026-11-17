package a80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f1106iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f1107ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f1108wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f1109zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f1106iobyxmoadg = d13;
            this.f1109zoijcleaow = deliveryTime;
            this.f1107ppxfxbqfkf = workingHours;
            this.f1108wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Double.compare(this.f1106iobyxmoadg, iobyxmoadgVar.f1106iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f1109zoijcleaow, iobyxmoadgVar.f1109zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1107ppxfxbqfkf, iobyxmoadgVar.f1107ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f1108wkgbmnqykc, iobyxmoadgVar.f1108wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f1106iobyxmoadg) * 31) + this.f1109zoijcleaow.hashCode()) * 31) + this.f1107ppxfxbqfkf.hashCode()) * 31) + this.f1108wkgbmnqykc.hashCode();
        }

        public String toString() {
            return "InfoUpdated(deliveryPrice=" + this.f1106iobyxmoadg + ", deliveryTime=" + this.f1109zoijcleaow + ", workingHours=" + this.f1107ppxfxbqfkf + ", address=" + this.f1108wkgbmnqykc + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f1110iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f1110iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f1110iobyxmoadg == ((zoijcleaow) obj).f1110iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f1110iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f1110iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f1110iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
