package s22;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: s22.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2560eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f105223iobyxmoadg;

        public C2560eablkybsjg(boolean z13) {
            super(null);
            this.f105223iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2560eablkybsjg) && this.f105223iobyxmoadg == ((C2560eablkybsjg) obj).f105223iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f105223iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f105223iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(isRemove=" + this.f105223iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f105224iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f105225iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f105225iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f105225iobyxmoadg, ((ppxfxbqfkf) obj).f105225iobyxmoadg);
        }

        public int hashCode() {
            return this.f105225iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f105225iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f105225iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105226iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f105226iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f105226iobyxmoadg, ((wkgbmnqykc) obj).f105226iobyxmoadg);
        }

        public int hashCode() {
            return this.f105226iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f105226iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f105226iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105227iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final f22.iobyxmoadg f105228ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f105229zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String barcode, double d13, f22.iobyxmoadg scanGoAmountMode) {
            super(null);
            zdlpuopuiu.btonecajqb(barcode, "barcode");
            zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
            this.f105227iobyxmoadg = barcode;
            this.f105229zoijcleaow = d13;
            this.f105228ppxfxbqfkf = scanGoAmountMode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f105227iobyxmoadg, zoijcleaowVar.f105227iobyxmoadg) && Double.compare(this.f105229zoijcleaow, zoijcleaowVar.f105229zoijcleaow) == 0 && this.f105228ppxfxbqfkf == zoijcleaowVar.f105228ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f105227iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f105229zoijcleaow)) * 31) + this.f105228ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f105227iobyxmoadg;
        }

        public final f22.iobyxmoadg ppxfxbqfkf() {
            return this.f105228ppxfxbqfkf;
        }

        public String toString() {
            return "NavigateToScanGoMatrixScreen(barcode=" + this.f105227iobyxmoadg + ", quantity=" + this.f105229zoijcleaow + ", scanGoAmountMode=" + this.f105228ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f105229zoijcleaow;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
