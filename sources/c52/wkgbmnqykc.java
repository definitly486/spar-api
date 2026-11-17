package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19018iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f19019ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f19020zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f19021eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19022iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f19023ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final f40.zoijcleaow f19024wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19025zoijcleaow;

        public iobyxmoadg(String title, String str, String str2, f40.zoijcleaow navlink, String str3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            this.f19022iobyxmoadg = title;
            this.f19025zoijcleaow = str;
            this.f19023ppxfxbqfkf = str2;
            this.f19024wkgbmnqykc = navlink;
            this.f19021eablkybsjg = str3;
        }

        public final String eablkybsjg() {
            return this.f19022iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19022iobyxmoadg, iobyxmoadgVar.f19022iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19025zoijcleaow, iobyxmoadgVar.f19025zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19023ppxfxbqfkf, iobyxmoadgVar.f19023ppxfxbqfkf) && this.f19024wkgbmnqykc == iobyxmoadgVar.f19024wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19021eablkybsjg, iobyxmoadgVar.f19021eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f19022iobyxmoadg.hashCode() * 31;
            String str = this.f19025zoijcleaow;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19023ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19024wkgbmnqykc.hashCode()) * 31;
            String str3 = this.f19021eablkybsjg;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f19025zoijcleaow;
        }

        public final f40.zoijcleaow ppxfxbqfkf() {
            return this.f19024wkgbmnqykc;
        }

        public String toString() {
            return "DataButtonExtSpecialBanner(title=" + this.f19022iobyxmoadg + ", colorButton=" + this.f19025zoijcleaow + ", colorText=" + this.f19023ppxfxbqfkf + ", navlink=" + this.f19024wkgbmnqykc + ", reference=" + this.f19021eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f19021eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f19023ppxfxbqfkf;
        }
    }

    public wkgbmnqykc(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f19018iobyxmoadg = i13;
        this.f19020zoijcleaow = type;
        this.f19019ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f19018iobyxmoadg == wkgbmnqykcVar.f19018iobyxmoadg && this.f19020zoijcleaow == wkgbmnqykcVar.f19020zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19019ppxfxbqfkf, wkgbmnqykcVar.f19019ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19018iobyxmoadg) * 31) + this.f19020zoijcleaow.hashCode()) * 31) + this.f19019ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f19019ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonExtSpecialBanner(index=" + this.f19018iobyxmoadg + ", type=" + this.f19020zoijcleaow + ", data=" + this.f19019ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f19018iobyxmoadg;
    }
}
