package es;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface draadjrbmk {

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f31856ppxfxbqfkf = nb0.wkgbmnqykc.f69531wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31857iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final nb0.wkgbmnqykc f31858zoijcleaow;

        public iobyxmoadg(String id2, nb0.wkgbmnqykc bannerGroup) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(bannerGroup, "bannerGroup");
            this.f31857iobyxmoadg = id2;
            this.f31858zoijcleaow = bannerGroup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f31857iobyxmoadg, iobyxmoadgVar.f31857iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31858zoijcleaow, iobyxmoadgVar.f31858zoijcleaow);
        }

        @Override // es.draadjrbmk
        public String getId() {
            return this.f31857iobyxmoadg;
        }

        public int hashCode() {
            return (this.f31857iobyxmoadg.hashCode() * 31) + this.f31858zoijcleaow.hashCode();
        }

        public final nb0.wkgbmnqykc iobyxmoadg() {
            return this.f31858zoijcleaow;
        }

        public String toString() {
            return "Banners(id=" + this.f31857iobyxmoadg + ", bannerGroup=" + this.f31858zoijcleaow + ")";
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f31859eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31860iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f31861ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f31862wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f31863zoijcleaow;

        public ppxfxbqfkf(String id2, String title, String image, String adv, v00.ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(image, "image");
            zdlpuopuiu.btonecajqb(adv, "adv");
            this.f31860iobyxmoadg = id2;
            this.f31863zoijcleaow = title;
            this.f31861ppxfxbqfkf = image;
            this.f31862wkgbmnqykc = adv;
            this.f31859eablkybsjg = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f31860iobyxmoadg, ppxfxbqfkfVar.f31860iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31863zoijcleaow, ppxfxbqfkfVar.f31863zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31861ppxfxbqfkf, ppxfxbqfkfVar.f31861ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31862wkgbmnqykc, ppxfxbqfkfVar.f31862wkgbmnqykc) && this.f31859eablkybsjg == ppxfxbqfkfVar.f31859eablkybsjg;
        }

        @Override // es.draadjrbmk
        public String getId() {
            return this.f31860iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f31860iobyxmoadg.hashCode() * 31) + this.f31863zoijcleaow.hashCode()) * 31) + this.f31861ppxfxbqfkf.hashCode()) * 31) + this.f31862wkgbmnqykc.hashCode()) * 31;
            v00.ppxfxbqfkf ppxfxbqfkfVar = this.f31859eablkybsjg;
            return iHashCode + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f31862wkgbmnqykc;
        }

        public final v00.ppxfxbqfkf ppxfxbqfkf() {
            return this.f31859eablkybsjg;
        }

        public String toString() {
            return "Section(id=" + this.f31860iobyxmoadg + ", title=" + this.f31863zoijcleaow + ", image=" + this.f31861ppxfxbqfkf + ", adv=" + this.f31862wkgbmnqykc + ", sortType=" + this.f31859eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f31863zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f31861ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31864iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f31865ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f31866zoijcleaow;

        public zoijcleaow(String id2, String title, String str) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(title, "title");
            this.f31864iobyxmoadg = id2;
            this.f31866zoijcleaow = title;
            this.f31865ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f31864iobyxmoadg, zoijcleaowVar.f31864iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31866zoijcleaow, zoijcleaowVar.f31866zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31865ppxfxbqfkf, zoijcleaowVar.f31865ppxfxbqfkf);
        }

        @Override // es.draadjrbmk
        public String getId() {
            return this.f31864iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((this.f31864iobyxmoadg.hashCode() * 31) + this.f31866zoijcleaow.hashCode()) * 31;
            String str = this.f31865ppxfxbqfkf;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f31866zoijcleaow;
        }

        public String toString() {
            return "Header(id=" + this.f31864iobyxmoadg + ", title=" + this.f31866zoijcleaow + ", titleImage=" + this.f31865ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f31865ppxfxbqfkf;
        }
    }

    String getId();
}
