package b80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f15475iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1534210907;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f15476iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f15476iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f15476iobyxmoadg, ((ppxfxbqfkf) obj).f15476iobyxmoadg);
        }

        public int hashCode() {
            return this.f15476iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f15476iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f15476iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15477iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f15478zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f15477iobyxmoadg = productArticle;
            this.f15478zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f15477iobyxmoadg, wkgbmnqykcVar.f15477iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15478zoijcleaow, wkgbmnqykcVar.f15478zoijcleaow);
        }

        public int hashCode() {
            return (this.f15477iobyxmoadg.hashCode() * 31) + this.f15478zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15477iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f15477iobyxmoadg + ", productName=" + this.f15478zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15478zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f15479iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 453725268;
        }

        public String toString() {
            return "NavigateToUnauthorized";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
