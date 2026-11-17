package yu0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126672iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f126673ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f126674zoijcleaow;

        public iobyxmoadg(String url, boolean z13, List banks) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f126672iobyxmoadg = url;
            this.f126674zoijcleaow = z13;
            this.f126673ppxfxbqfkf = banks;
        }

        public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, boolean z13, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = iobyxmoadgVar.f126672iobyxmoadg;
            }
            if ((i13 & 2) != 0) {
                z13 = iobyxmoadgVar.f126674zoijcleaow;
            }
            if ((i13 & 4) != 0) {
                list = iobyxmoadgVar.f126673ppxfxbqfkf;
            }
            return iobyxmoadgVar.iobyxmoadg(str, z13, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f126672iobyxmoadg, iobyxmoadgVar.f126672iobyxmoadg) && this.f126674zoijcleaow == iobyxmoadgVar.f126674zoijcleaow && zdlpuopuiu.eablkybsjg(this.f126673ppxfxbqfkf, iobyxmoadgVar.f126673ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f126672iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f126674zoijcleaow)) * 31) + this.f126673ppxfxbqfkf.hashCode();
        }

        public final iobyxmoadg iobyxmoadg(String url, boolean z13, List banks) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(banks, "banks");
            return new iobyxmoadg(url, z13, banks);
        }

        public final List ppxfxbqfkf() {
            return this.f126673ppxfxbqfkf;
        }

        public String toString() {
            return "Sbp(url=" + this.f126672iobyxmoadg + ", addAccount=" + this.f126674zoijcleaow + ", banks=" + this.f126673ppxfxbqfkf + ")";
        }

        public final String wkgbmnqykc() {
            return this.f126672iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: yu0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C3229ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3229ppxfxbqfkf f126675iobyxmoadg = new C3229ppxfxbqfkf();

        private C3229ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3229ppxfxbqfkf);
        }

        public int hashCode() {
            return 2050819113;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126676iobyxmoadg;

        public wkgbmnqykc(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f126676iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f126676iobyxmoadg, ((wkgbmnqykc) obj).f126676iobyxmoadg);
        }

        public int hashCode() {
            return this.f126676iobyxmoadg.hashCode();
        }

        public String toString() {
            return "WebView(url=" + this.f126676iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126677iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f126678ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f126679wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f126680zoijcleaow;

        public zoijcleaow(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f126677iobyxmoadg = merchantLogin;
            this.f126680zoijcleaow = apiKey;
            this.f126678ppxfxbqfkf = orderNumber;
            this.f126679wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f126677iobyxmoadg, zoijcleaowVar.f126677iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126680zoijcleaow, zoijcleaowVar.f126680zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126678ppxfxbqfkf, zoijcleaowVar.f126678ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f126679wkgbmnqykc, zoijcleaowVar.f126679wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f126677iobyxmoadg.hashCode() * 31) + this.f126680zoijcleaow.hashCode()) * 31) + this.f126678ppxfxbqfkf.hashCode()) * 31) + this.f126679wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f126680zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f126677iobyxmoadg;
        }

        public String toString() {
            return "Sdk(merchantLogin=" + this.f126677iobyxmoadg + ", apiKey=" + this.f126680zoijcleaow + ", orderNumber=" + this.f126678ppxfxbqfkf + ", bankInvoiceId=" + this.f126679wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f126678ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f126679wkgbmnqykc;
        }
    }
}
