package k80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: k80.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1162eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54120iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f54121zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1162eablkybsjg(String article, String partnerCode) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f54120iobyxmoadg = article;
            this.f54121zoijcleaow = partnerCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1162eablkybsjg)) {
                return false;
            }
            C1162eablkybsjg c1162eablkybsjg = (C1162eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f54120iobyxmoadg, c1162eablkybsjg.f54120iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54121zoijcleaow, c1162eablkybsjg.f54121zoijcleaow);
        }

        public int hashCode() {
            return (this.f54120iobyxmoadg.hashCode() * 31) + this.f54121zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f54120iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDetails(article=" + this.f54120iobyxmoadg + ", partnerCode=" + this.f54121zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f54121zoijcleaow;
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f54122iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f54123iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f54124iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f54124iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54124iobyxmoadg, ((ppxfxbqfkf) obj).f54124iobyxmoadg);
        }

        public int hashCode() {
            return this.f54124iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f54124iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f54124iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f54125iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f54126ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f54127wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f54128zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f54125iobyxmoadg = d13;
            this.f54128zoijcleaow = deliveryTime;
            this.f54126ppxfxbqfkf = workingHours;
            this.f54127wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return Double.compare(this.f54125iobyxmoadg, wkgbmnqykcVar.f54125iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f54128zoijcleaow, wkgbmnqykcVar.f54128zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54126ppxfxbqfkf, wkgbmnqykcVar.f54126ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54127wkgbmnqykc, wkgbmnqykcVar.f54127wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f54125iobyxmoadg) * 31) + this.f54128zoijcleaow.hashCode()) * 31) + this.f54126ppxfxbqfkf.hashCode()) * 31) + this.f54127wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f54127wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f54128zoijcleaow;
        }

        public String toString() {
            return "ShowDescriptionDialog(deliveryPrice=" + this.f54125iobyxmoadg + ", deliveryTime=" + this.f54128zoijcleaow + ", workingHours=" + this.f54126ppxfxbqfkf + ", address=" + this.f54127wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f54126ppxfxbqfkf;
        }

        public final double zoijcleaow() {
            return this.f54125iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f54129iobyxmoadg = new zoijcleaow();

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
