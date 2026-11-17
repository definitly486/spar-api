package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117914iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117915ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117916zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f117917eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117918iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f117919ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final k21.ojitshcjhn f117920wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117921zoijcleaow;

        public iobyxmoadg(String percent, String text, List categories, k21.ojitshcjhn navLink, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(percent, "percent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categories, "categories");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f117918iobyxmoadg = percent;
            this.f117921zoijcleaow = text;
            this.f117919ppxfxbqfkf = categories;
            this.f117920wkgbmnqykc = navLink;
            this.f117917eablkybsjg = str;
        }

        public final String eablkybsjg() {
            return this.f117921zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117918iobyxmoadg, iobyxmoadgVar.f117918iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117921zoijcleaow, iobyxmoadgVar.f117921zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117919ppxfxbqfkf, iobyxmoadgVar.f117919ppxfxbqfkf) && this.f117920wkgbmnqykc == iobyxmoadgVar.f117920wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117917eablkybsjg, iobyxmoadgVar.f117917eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = ((((((this.f117918iobyxmoadg.hashCode() * 31) + this.f117921zoijcleaow.hashCode()) * 31) + this.f117919ppxfxbqfkf.hashCode()) * 31) + this.f117920wkgbmnqykc.hashCode()) * 31;
            String str = this.f117917eablkybsjg;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final List iobyxmoadg() {
            return this.f117919ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117918iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyLevelInfo(percent=" + this.f117918iobyxmoadg + ", text=" + this.f117921zoijcleaow + ", categories=" + this.f117919ppxfxbqfkf + ", navLink=" + this.f117920wkgbmnqykc + ", reference=" + this.f117917eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117917eablkybsjg;
        }

        public final k21.ojitshcjhn zoijcleaow() {
            return this.f117920wkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f117922eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final zoijcleaow f117923gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117924iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f117925ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f117926wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117927zoijcleaow;

        public ppxfxbqfkf(String title, String date, boolean z13, boolean z14, List info, zoijcleaow zoijcleaowVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(date, "date");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
            this.f117924iobyxmoadg = title;
            this.f117927zoijcleaow = date;
            this.f117925ppxfxbqfkf = z13;
            this.f117926wkgbmnqykc = z14;
            this.f117922eablkybsjg = info;
            this.f117923gxszxtbevo = zoijcleaowVar;
        }

        public final String eablkybsjg() {
            return this.f117924iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117924iobyxmoadg, ppxfxbqfkfVar.f117924iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117927zoijcleaow, ppxfxbqfkfVar.f117927zoijcleaow) && this.f117925ppxfxbqfkf == ppxfxbqfkfVar.f117925ppxfxbqfkf && this.f117926wkgbmnqykc == ppxfxbqfkfVar.f117926wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117922eablkybsjg, ppxfxbqfkfVar.f117922eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117923gxszxtbevo, ppxfxbqfkfVar.f117923gxszxtbevo);
        }

        public final boolean gxszxtbevo() {
            return this.f117925ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f117924iobyxmoadg.hashCode() * 31) + this.f117927zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f117925ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f117926wkgbmnqykc)) * 31) + this.f117922eablkybsjg.hashCode()) * 31;
            zoijcleaow zoijcleaowVar = this.f117923gxszxtbevo;
            return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f117927zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f117926wkgbmnqykc;
        }

        public String toString() {
            return "LoyaltyProgramLevel(title=" + this.f117924iobyxmoadg + ", date=" + this.f117927zoijcleaow + ", isLevelBlocked=" + this.f117925ppxfxbqfkf + ", locks=" + this.f117926wkgbmnqykc + ", info=" + this.f117922eablkybsjg + ", progress=" + this.f117923gxszxtbevo + ")";
        }

        public final zoijcleaow wkgbmnqykc() {
            return this.f117923gxszxtbevo;
        }

        public final List zoijcleaow() {
            return this.f117922eablkybsjg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117928iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f117929ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f117930zoijcleaow;

        public zoijcleaow(String title, double d13, double d14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f117928iobyxmoadg = title;
            this.f117930zoijcleaow = d13;
            this.f117929ppxfxbqfkf = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117928iobyxmoadg, zoijcleaowVar.f117928iobyxmoadg) && Double.compare(this.f117930zoijcleaow, zoijcleaowVar.f117930zoijcleaow) == 0 && Double.compare(this.f117929ppxfxbqfkf, zoijcleaowVar.f117929ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f117928iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f117930zoijcleaow)) * 31) + Double.hashCode(this.f117929ppxfxbqfkf);
        }

        public final double iobyxmoadg() {
            return this.f117930zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f117928iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyLevelProgress(title=" + this.f117928iobyxmoadg + ", current=" + this.f117930zoijcleaow + ", need=" + this.f117929ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f117929ppxfxbqfkf;
        }
    }

    public vdvldrhtss(int i13, jpowsppfya type, List levels) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(levels, "levels");
        this.f117914iobyxmoadg = i13;
        this.f117916zoijcleaow = type;
        this.f117915ppxfxbqfkf = levels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return this.f117914iobyxmoadg == vdvldrhtssVar.f117914iobyxmoadg && this.f117916zoijcleaow == vdvldrhtssVar.f117916zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117915ppxfxbqfkf, vdvldrhtssVar.f117915ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117914iobyxmoadg) * 31) + this.f117916zoijcleaow.hashCode()) * 31) + this.f117915ppxfxbqfkf.hashCode();
    }

    public int iobyxmoadg() {
        return this.f117914iobyxmoadg;
    }

    public String toString() {
        return "LoyaltyProgram(index=" + this.f117914iobyxmoadg + ", type=" + this.f117916zoijcleaow + ", levels=" + this.f117915ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f117915ppxfxbqfkf;
    }
}
