package wj1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120003iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f120003iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f120003iobyxmoadg, ((eablkybsjg) obj).f120003iobyxmoadg);
        }

        public int hashCode() {
            return this.f120003iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120003iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f120003iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: wj1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3001gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120004iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3001gxszxtbevo(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f120004iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3001gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f120004iobyxmoadg, ((C3001gxszxtbevo) obj).f120004iobyxmoadg);
        }

        public int hashCode() {
            return this.f120004iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120004iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f120004iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f120005iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 475408770;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120006iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f120007ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f120008zoijcleaow;

        public /* synthetic */ lqeggnwhkg(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f120006iobyxmoadg, lqeggnwhkgVar.f120006iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120008zoijcleaow, lqeggnwhkgVar.f120008zoijcleaow) && this.f120007ppxfxbqfkf == lqeggnwhkgVar.f120007ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f120006iobyxmoadg.hashCode() * 31) + this.f120008zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f120007ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f120006iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f120007ppxfxbqfkf;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f120006iobyxmoadg + ", productName=" + this.f120008zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f120007ppxfxbqfkf) + ")";
        }

        public final String zoijcleaow() {
            return this.f120008zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private lqeggnwhkg(String productArticle, String productName, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f120006iobyxmoadg = productArticle;
            this.f120008zoijcleaow = productName;
            this.f120007ppxfxbqfkf = i13;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120009iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f120009iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f120009iobyxmoadg, ((ppxfxbqfkf) obj).f120009iobyxmoadg);
        }

        public int hashCode() {
            return this.f120009iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120009iobyxmoadg;
        }

        public String toString() {
            return "OpenProduct(article=" + this.f120009iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f120010iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f120010iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f120010iobyxmoadg, ((wkgbmnqykc) obj).f120010iobyxmoadg);
        }

        public int hashCode() {
            return this.f120010iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f120010iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f120010iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f120011iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1880345631;
        }

        public String toString() {
            return "NavigateToSpecificPurchaseSuccessRetry";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
