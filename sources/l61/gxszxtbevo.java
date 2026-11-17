package l61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f61694iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f61695ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f61696wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f61697zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f61694iobyxmoadg = d13;
            this.f61697zoijcleaow = deliveryTime;
            this.f61695ppxfxbqfkf = workingHours;
            this.f61696wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Double.compare(this.f61694iobyxmoadg, iobyxmoadgVar.f61694iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f61697zoijcleaow, iobyxmoadgVar.f61697zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61695ppxfxbqfkf, iobyxmoadgVar.f61695ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61696wkgbmnqykc, iobyxmoadgVar.f61696wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f61694iobyxmoadg) * 31) + this.f61697zoijcleaow.hashCode()) * 31) + this.f61695ppxfxbqfkf.hashCode()) * 31) + this.f61696wkgbmnqykc.hashCode();
        }

        public String toString() {
            return "InfoUpdated(deliveryPrice=" + this.f61694iobyxmoadg + ", deliveryTime=" + this.f61697zoijcleaow + ", workingHours=" + this.f61695ppxfxbqfkf + ", address=" + this.f61696wkgbmnqykc + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f61698iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f61698iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f61698iobyxmoadg == ((zoijcleaow) obj).f61698iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f61698iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f61698iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f61698iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
