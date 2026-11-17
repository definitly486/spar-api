package m61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f66220iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1049443944;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f66221iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f66221iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f66221iobyxmoadg, ((ppxfxbqfkf) obj).f66221iobyxmoadg);
        }

        public int hashCode() {
            return this.f66221iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f66221iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f66221iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66222iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f66223zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f66222iobyxmoadg = productArticle;
            this.f66223zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f66222iobyxmoadg, wkgbmnqykcVar.f66222iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66223zoijcleaow, wkgbmnqykcVar.f66223zoijcleaow);
        }

        public int hashCode() {
            return (this.f66222iobyxmoadg.hashCode() * 31) + this.f66223zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f66222iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f66222iobyxmoadg + ", productName=" + this.f66223zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f66223zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f66224iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -58519736;
        }

        public String toString() {
            return "NavigateToAuthorizationScreen";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
