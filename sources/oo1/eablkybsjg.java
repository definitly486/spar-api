package oo1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: oo1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1599eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f73304iobyxmoadg;

        public C1599eablkybsjg(boolean z13) {
            super(null);
            this.f73304iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1599eablkybsjg) && this.f73304iobyxmoadg == ((C1599eablkybsjg) obj).f73304iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73304iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f73304iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(isRemove=" + this.f73304iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f73305iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f73306iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f73306iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f73306iobyxmoadg, ((ppxfxbqfkf) obj).f73306iobyxmoadg);
        }

        public int hashCode() {
            return this.f73306iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f73306iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f73306iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f73307iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f73307iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f73307iobyxmoadg, ((wkgbmnqykc) obj).f73307iobyxmoadg);
        }

        public int hashCode() {
            return this.f73307iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f73307iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f73307iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f73308iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final bo1.iobyxmoadg f73309ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f73310zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String barcode, double d13, bo1.iobyxmoadg scanGoAmountMode) {
            super(null);
            zdlpuopuiu.btonecajqb(barcode, "barcode");
            zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
            this.f73308iobyxmoadg = barcode;
            this.f73310zoijcleaow = d13;
            this.f73309ppxfxbqfkf = scanGoAmountMode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f73308iobyxmoadg, zoijcleaowVar.f73308iobyxmoadg) && Double.compare(this.f73310zoijcleaow, zoijcleaowVar.f73310zoijcleaow) == 0 && this.f73309ppxfxbqfkf == zoijcleaowVar.f73309ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f73308iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f73310zoijcleaow)) * 31) + this.f73309ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f73308iobyxmoadg;
        }

        public final bo1.iobyxmoadg ppxfxbqfkf() {
            return this.f73309ppxfxbqfkf;
        }

        public String toString() {
            return "NavigateToScanGoMatrixScreen(barcode=" + this.f73308iobyxmoadg + ", quantity=" + this.f73310zoijcleaow + ", scanGoAmountMode=" + this.f73309ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f73310zoijcleaow;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
