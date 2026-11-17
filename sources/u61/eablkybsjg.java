package u61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: u61.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2789eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112783iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112784zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2789eablkybsjg(String article, String partnerCode) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f112783iobyxmoadg = article;
            this.f112784zoijcleaow = partnerCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2789eablkybsjg)) {
                return false;
            }
            C2789eablkybsjg c2789eablkybsjg = (C2789eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f112783iobyxmoadg, c2789eablkybsjg.f112783iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112784zoijcleaow, c2789eablkybsjg.f112784zoijcleaow);
        }

        public int hashCode() {
            return (this.f112783iobyxmoadg.hashCode() * 31) + this.f112784zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112783iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDetails(article=" + this.f112783iobyxmoadg + ", partnerCode=" + this.f112784zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f112784zoijcleaow;
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f112785iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f112786iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f112787iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f112787iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112787iobyxmoadg, ((ppxfxbqfkf) obj).f112787iobyxmoadg);
        }

        public int hashCode() {
            return this.f112787iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f112787iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f112787iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f112788iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f112789ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f112790wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112791zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f112788iobyxmoadg = d13;
            this.f112791zoijcleaow = deliveryTime;
            this.f112789ppxfxbqfkf = workingHours;
            this.f112790wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return Double.compare(this.f112788iobyxmoadg, wkgbmnqykcVar.f112788iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f112791zoijcleaow, wkgbmnqykcVar.f112791zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f112789ppxfxbqfkf, wkgbmnqykcVar.f112789ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112790wkgbmnqykc, wkgbmnqykcVar.f112790wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f112788iobyxmoadg) * 31) + this.f112791zoijcleaow.hashCode()) * 31) + this.f112789ppxfxbqfkf.hashCode()) * 31) + this.f112790wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112790wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f112791zoijcleaow;
        }

        public String toString() {
            return "ShowDescriptionDialog(deliveryPrice=" + this.f112788iobyxmoadg + ", deliveryTime=" + this.f112791zoijcleaow + ", workingHours=" + this.f112789ppxfxbqfkf + ", address=" + this.f112790wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f112789ppxfxbqfkf;
        }

        public final double zoijcleaow() {
            return this.f112788iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f112792iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
