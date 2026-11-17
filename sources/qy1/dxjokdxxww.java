package qy1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: qy1.dxjokdxxww$dxjokdxxww, reason: collision with other inner class name */
    public static final class C1803dxjokdxxww extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80980iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f80981ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f80982zoijcleaow;

        public /* synthetic */ C1803dxjokdxxww(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, str2, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1803dxjokdxxww)) {
                return false;
            }
            C1803dxjokdxxww c1803dxjokdxxww = (C1803dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f80980iobyxmoadg, c1803dxjokdxxww.f80980iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80982zoijcleaow, c1803dxjokdxxww.f80982zoijcleaow) && this.f80981ppxfxbqfkf == c1803dxjokdxxww.f80981ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f80980iobyxmoadg.hashCode() * 31) + this.f80982zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f80981ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f80980iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f80981ppxfxbqfkf;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f80980iobyxmoadg + ", productName=" + this.f80982zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f80981ppxfxbqfkf) + ")";
        }

        public final String zoijcleaow() {
            return this.f80982zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C1803dxjokdxxww(String productArticle, String productName, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f80980iobyxmoadg = productArticle;
            this.f80982zoijcleaow = productName;
            this.f80981ppxfxbqfkf = i13;
        }
    }

    public static final class eablkybsjg extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f80983iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f80983iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f80983iobyxmoadg, ((eablkybsjg) obj).f80983iobyxmoadg);
        }

        public int hashCode() {
            return this.f80983iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f80983iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f80983iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f80984iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f80985zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(qy1.iobyxmoadg params, String message) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f80984iobyxmoadg = params;
            this.f80985zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f80984iobyxmoadg, gxszxtbevoVar.f80984iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80985zoijcleaow, gxszxtbevoVar.f80985zoijcleaow);
        }

        public int hashCode() {
            return (this.f80984iobyxmoadg.hashCode() * 31) + this.f80985zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80985zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f80984iobyxmoadg + ", message=" + this.f80985zoijcleaow + ")";
        }

        public final qy1.iobyxmoadg zoijcleaow() {
            return this.f80984iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f80986iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 864161477;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80987iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f80987iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f80987iobyxmoadg, ((lqeggnwhkg) obj).f80987iobyxmoadg);
        }

        public int hashCode() {
            return this.f80987iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80987iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f80987iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80988iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f80988iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f80988iobyxmoadg, ((nufgyqmvbu) obj).f80988iobyxmoadg);
        }

        public int hashCode() {
            return this.f80988iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80988iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f80988iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f80989iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f80989iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f80989iobyxmoadg == ((ppxfxbqfkf) obj).f80989iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f80989iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f80989iobyxmoadg;
        }

        public String toString() {
            return "OpenDeliveryInfoScreen(hasUserAnyAddress=" + this.f80989iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80990iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f80990iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f80990iobyxmoadg, ((wkgbmnqykc) obj).f80990iobyxmoadg);
        }

        public int hashCode() {
            return this.f80990iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80990iobyxmoadg;
        }

        public String toString() {
            return "OpenProduct(article=" + this.f80990iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f80991iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -893345630;
        }

        public String toString() {
            return "NavigateToSpecificPurchaseSuccessRetry";
        }
    }

    public /* synthetic */ dxjokdxxww(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private dxjokdxxww() {
    }
}
