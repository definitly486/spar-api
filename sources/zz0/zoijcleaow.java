package zz0;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final ojitshcjhn f131707eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String f131708gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f131709iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final zz0.iobyxmoadg f131710lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f131711ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f131712wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f131713zoijcleaow;

        public iobyxmoadg(String imageUrl, String title, String description, String buttonText, ojitshcjhn navLink, String str) {
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(buttonText, "buttonText");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f131709iobyxmoadg = imageUrl;
            this.f131713zoijcleaow = title;
            this.f131711ppxfxbqfkf = description;
            this.f131712wkgbmnqykc = buttonText;
            this.f131707eablkybsjg = navLink;
            this.f131708gxszxtbevo = str;
            this.f131710lqeggnwhkg = zz0.iobyxmoadg.PURCHASE_RATING;
        }

        public final String eablkybsjg() {
            return this.f131708gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f131709iobyxmoadg, iobyxmoadgVar.f131709iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f131713zoijcleaow, iobyxmoadgVar.f131713zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f131711ppxfxbqfkf, iobyxmoadgVar.f131711ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f131712wkgbmnqykc, iobyxmoadgVar.f131712wkgbmnqykc) && this.f131707eablkybsjg == iobyxmoadgVar.f131707eablkybsjg && zdlpuopuiu.eablkybsjg(this.f131708gxszxtbevo, iobyxmoadgVar.f131708gxszxtbevo);
        }

        @Override // zz0.zoijcleaow
        public zz0.iobyxmoadg getType() {
            return this.f131710lqeggnwhkg;
        }

        public final String gxszxtbevo() {
            return this.f131713zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f131709iobyxmoadg.hashCode() * 31) + this.f131713zoijcleaow.hashCode()) * 31) + this.f131711ppxfxbqfkf.hashCode()) * 31) + this.f131712wkgbmnqykc.hashCode()) * 31) + this.f131707eablkybsjg.hashCode()) * 31;
            String str = this.f131708gxszxtbevo;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f131712wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f131709iobyxmoadg;
        }

        public String toString() {
            return "PurchaseRating(imageUrl=" + this.f131709iobyxmoadg + ", title=" + this.f131713zoijcleaow + ", description=" + this.f131711ppxfxbqfkf + ", buttonText=" + this.f131712wkgbmnqykc + ", navLink=" + this.f131707eablkybsjg + ", reference=" + this.f131708gxszxtbevo + ")";
        }

        public final ojitshcjhn wkgbmnqykc() {
            return this.f131707eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f131711ppxfxbqfkf;
        }
    }

    zz0.iobyxmoadg getType();
}
