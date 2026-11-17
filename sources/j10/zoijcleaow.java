package j10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final f40.zoijcleaow f50516eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String f50517gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50518iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final j10.iobyxmoadg f50519lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f50520ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f50521wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f50522zoijcleaow;

        public iobyxmoadg(String imageUrl, String title, String description, String buttonText, f40.zoijcleaow navLink, String str) {
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(buttonText, "buttonText");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f50518iobyxmoadg = imageUrl;
            this.f50522zoijcleaow = title;
            this.f50520ppxfxbqfkf = description;
            this.f50521wkgbmnqykc = buttonText;
            this.f50516eablkybsjg = navLink;
            this.f50517gxszxtbevo = str;
            this.f50519lqeggnwhkg = j10.iobyxmoadg.PURCHASE_RATING;
        }

        public final String eablkybsjg() {
            return this.f50517gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f50518iobyxmoadg, iobyxmoadgVar.f50518iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50522zoijcleaow, iobyxmoadgVar.f50522zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50520ppxfxbqfkf, iobyxmoadgVar.f50520ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50521wkgbmnqykc, iobyxmoadgVar.f50521wkgbmnqykc) && this.f50516eablkybsjg == iobyxmoadgVar.f50516eablkybsjg && zdlpuopuiu.eablkybsjg(this.f50517gxszxtbevo, iobyxmoadgVar.f50517gxszxtbevo);
        }

        @Override // j10.zoijcleaow
        public j10.iobyxmoadg getType() {
            return this.f50519lqeggnwhkg;
        }

        public final String gxszxtbevo() {
            return this.f50522zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f50518iobyxmoadg.hashCode() * 31) + this.f50522zoijcleaow.hashCode()) * 31) + this.f50520ppxfxbqfkf.hashCode()) * 31) + this.f50521wkgbmnqykc.hashCode()) * 31) + this.f50516eablkybsjg.hashCode()) * 31;
            String str = this.f50517gxszxtbevo;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f50521wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f50518iobyxmoadg;
        }

        public String toString() {
            return "PurchaseRating(imageUrl=" + this.f50518iobyxmoadg + ", title=" + this.f50522zoijcleaow + ", description=" + this.f50520ppxfxbqfkf + ", buttonText=" + this.f50521wkgbmnqykc + ", navLink=" + this.f50516eablkybsjg + ", reference=" + this.f50517gxszxtbevo + ")";
        }

        public final f40.zoijcleaow wkgbmnqykc() {
            return this.f50516eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f50520ppxfxbqfkf;
        }
    }

    j10.iobyxmoadg getType();
}
