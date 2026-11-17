package ew;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32229iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f32230ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f32231zoijcleaow;

        public iobyxmoadg(String url, boolean z13, List banks) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f32229iobyxmoadg = url;
            this.f32231zoijcleaow = z13;
            this.f32230ppxfxbqfkf = banks;
        }

        public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, boolean z13, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = iobyxmoadgVar.f32229iobyxmoadg;
            }
            if ((i13 & 2) != 0) {
                z13 = iobyxmoadgVar.f32231zoijcleaow;
            }
            if ((i13 & 4) != 0) {
                list = iobyxmoadgVar.f32230ppxfxbqfkf;
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
            return zdlpuopuiu.eablkybsjg(this.f32229iobyxmoadg, iobyxmoadgVar.f32229iobyxmoadg) && this.f32231zoijcleaow == iobyxmoadgVar.f32231zoijcleaow && zdlpuopuiu.eablkybsjg(this.f32230ppxfxbqfkf, iobyxmoadgVar.f32230ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f32229iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f32231zoijcleaow)) * 31) + this.f32230ppxfxbqfkf.hashCode();
        }

        public final iobyxmoadg iobyxmoadg(String url, boolean z13, List banks) {
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(banks, "banks");
            return new iobyxmoadg(url, z13, banks);
        }

        public final List ppxfxbqfkf() {
            return this.f32230ppxfxbqfkf;
        }

        public String toString() {
            return "Sbp(url=" + this.f32229iobyxmoadg + ", addAccount=" + this.f32231zoijcleaow + ", banks=" + this.f32230ppxfxbqfkf + ")";
        }

        public final String wkgbmnqykc() {
            return this.f32229iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ew.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C0695ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0695ppxfxbqfkf f32232iobyxmoadg = new C0695ppxfxbqfkf();

        private C0695ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0695ppxfxbqfkf);
        }

        public int hashCode() {
            return 1642334892;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32233iobyxmoadg;

        public wkgbmnqykc(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f32233iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f32233iobyxmoadg, ((wkgbmnqykc) obj).f32233iobyxmoadg);
        }

        public int hashCode() {
            return this.f32233iobyxmoadg.hashCode();
        }

        public String toString() {
            return "WebView(url=" + this.f32233iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32234iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f32235ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f32236wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f32237zoijcleaow;

        public zoijcleaow(String merchantLogin, String apiKey, String orderNumber, String bankInvoiceId) {
            zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
            zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
            this.f32234iobyxmoadg = merchantLogin;
            this.f32237zoijcleaow = apiKey;
            this.f32235ppxfxbqfkf = orderNumber;
            this.f32236wkgbmnqykc = bankInvoiceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f32234iobyxmoadg, zoijcleaowVar.f32234iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32237zoijcleaow, zoijcleaowVar.f32237zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32235ppxfxbqfkf, zoijcleaowVar.f32235ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f32236wkgbmnqykc, zoijcleaowVar.f32236wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f32234iobyxmoadg.hashCode() * 31) + this.f32237zoijcleaow.hashCode()) * 31) + this.f32235ppxfxbqfkf.hashCode()) * 31) + this.f32236wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f32237zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f32234iobyxmoadg;
        }

        public String toString() {
            return "Sdk(merchantLogin=" + this.f32234iobyxmoadg + ", apiKey=" + this.f32237zoijcleaow + ", orderNumber=" + this.f32235ppxfxbqfkf + ", bankInvoiceId=" + this.f32236wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f32235ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f32236wkgbmnqykc;
        }
    }
}
