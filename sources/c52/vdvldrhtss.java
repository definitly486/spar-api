package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18994iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18995ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18996zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f18997eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18998iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f18999ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final f40.zoijcleaow f19000wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19001zoijcleaow;

        public iobyxmoadg(String percent, String text, List categories, f40.zoijcleaow navLink, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(percent, "percent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categories, "categories");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f18998iobyxmoadg = percent;
            this.f19001zoijcleaow = text;
            this.f18999ppxfxbqfkf = categories;
            this.f19000wkgbmnqykc = navLink;
            this.f18997eablkybsjg = str;
        }

        public final String eablkybsjg() {
            return this.f19001zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18998iobyxmoadg, iobyxmoadgVar.f18998iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19001zoijcleaow, iobyxmoadgVar.f19001zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18999ppxfxbqfkf, iobyxmoadgVar.f18999ppxfxbqfkf) && this.f19000wkgbmnqykc == iobyxmoadgVar.f19000wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18997eablkybsjg, iobyxmoadgVar.f18997eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = ((((((this.f18998iobyxmoadg.hashCode() * 31) + this.f19001zoijcleaow.hashCode()) * 31) + this.f18999ppxfxbqfkf.hashCode()) * 31) + this.f19000wkgbmnqykc.hashCode()) * 31;
            String str = this.f18997eablkybsjg;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final List iobyxmoadg() {
            return this.f18999ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18998iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyLevelInfo(percent=" + this.f18998iobyxmoadg + ", text=" + this.f19001zoijcleaow + ", categories=" + this.f18999ppxfxbqfkf + ", navLink=" + this.f19000wkgbmnqykc + ", reference=" + this.f18997eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18997eablkybsjg;
        }

        public final f40.zoijcleaow zoijcleaow() {
            return this.f19000wkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f19002eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final zoijcleaow f19003gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19004iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f19005ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f19006wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19007zoijcleaow;

        public ppxfxbqfkf(String title, String date, boolean z13, boolean z14, List info, zoijcleaow zoijcleaowVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(date, "date");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
            this.f19004iobyxmoadg = title;
            this.f19007zoijcleaow = date;
            this.f19005ppxfxbqfkf = z13;
            this.f19006wkgbmnqykc = z14;
            this.f19002eablkybsjg = info;
            this.f19003gxszxtbevo = zoijcleaowVar;
        }

        public final String eablkybsjg() {
            return this.f19004iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19004iobyxmoadg, ppxfxbqfkfVar.f19004iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19007zoijcleaow, ppxfxbqfkfVar.f19007zoijcleaow) && this.f19005ppxfxbqfkf == ppxfxbqfkfVar.f19005ppxfxbqfkf && this.f19006wkgbmnqykc == ppxfxbqfkfVar.f19006wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19002eablkybsjg, ppxfxbqfkfVar.f19002eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19003gxszxtbevo, ppxfxbqfkfVar.f19003gxszxtbevo);
        }

        public final boolean gxszxtbevo() {
            return this.f19005ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f19004iobyxmoadg.hashCode() * 31) + this.f19007zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f19005ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f19006wkgbmnqykc)) * 31) + this.f19002eablkybsjg.hashCode()) * 31;
            zoijcleaow zoijcleaowVar = this.f19003gxszxtbevo;
            return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f19007zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f19006wkgbmnqykc;
        }

        public String toString() {
            return "LoyaltyProgramLevel(title=" + this.f19004iobyxmoadg + ", date=" + this.f19007zoijcleaow + ", isLevelBlocked=" + this.f19005ppxfxbqfkf + ", locks=" + this.f19006wkgbmnqykc + ", info=" + this.f19002eablkybsjg + ", progress=" + this.f19003gxszxtbevo + ")";
        }

        public final zoijcleaow wkgbmnqykc() {
            return this.f19003gxszxtbevo;
        }

        public final List zoijcleaow() {
            return this.f19002eablkybsjg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19008iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f19009ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f19010zoijcleaow;

        public zoijcleaow(String title, double d13, double d14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f19008iobyxmoadg = title;
            this.f19010zoijcleaow = d13;
            this.f19009ppxfxbqfkf = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19008iobyxmoadg, zoijcleaowVar.f19008iobyxmoadg) && Double.compare(this.f19010zoijcleaow, zoijcleaowVar.f19010zoijcleaow) == 0 && Double.compare(this.f19009ppxfxbqfkf, zoijcleaowVar.f19009ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f19008iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f19010zoijcleaow)) * 31) + Double.hashCode(this.f19009ppxfxbqfkf);
        }

        public final double iobyxmoadg() {
            return this.f19010zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f19008iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyLevelProgress(title=" + this.f19008iobyxmoadg + ", current=" + this.f19010zoijcleaow + ", need=" + this.f19009ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f19009ppxfxbqfkf;
        }
    }

    public vdvldrhtss(int i13, jpowsppfya type, List levels) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(levels, "levels");
        this.f18994iobyxmoadg = i13;
        this.f18996zoijcleaow = type;
        this.f18995ppxfxbqfkf = levels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return this.f18994iobyxmoadg == vdvldrhtssVar.f18994iobyxmoadg && this.f18996zoijcleaow == vdvldrhtssVar.f18996zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18995ppxfxbqfkf, vdvldrhtssVar.f18995ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18994iobyxmoadg) * 31) + this.f18996zoijcleaow.hashCode()) * 31) + this.f18995ppxfxbqfkf.hashCode();
    }

    public int iobyxmoadg() {
        return this.f18994iobyxmoadg;
    }

    public String toString() {
        return "LoyaltyProgram(index=" + this.f18994iobyxmoadg + ", type=" + this.f18996zoijcleaow + ", levels=" + this.f18995ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f18995ppxfxbqfkf;
    }
}
