package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117938iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117939ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117940zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f117941eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117942iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117943ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final k21.ojitshcjhn f117944wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117945zoijcleaow;

        public iobyxmoadg(String title, String str, String str2, k21.ojitshcjhn navlink, String str3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            this.f117942iobyxmoadg = title;
            this.f117945zoijcleaow = str;
            this.f117943ppxfxbqfkf = str2;
            this.f117944wkgbmnqykc = navlink;
            this.f117941eablkybsjg = str3;
        }

        public final String eablkybsjg() {
            return this.f117942iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117942iobyxmoadg, iobyxmoadgVar.f117942iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117945zoijcleaow, iobyxmoadgVar.f117945zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117943ppxfxbqfkf, iobyxmoadgVar.f117943ppxfxbqfkf) && this.f117944wkgbmnqykc == iobyxmoadgVar.f117944wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117941eablkybsjg, iobyxmoadgVar.f117941eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f117942iobyxmoadg.hashCode() * 31;
            String str = this.f117945zoijcleaow;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117943ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f117944wkgbmnqykc.hashCode()) * 31;
            String str3 = this.f117941eablkybsjg;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f117945zoijcleaow;
        }

        public final k21.ojitshcjhn ppxfxbqfkf() {
            return this.f117944wkgbmnqykc;
        }

        public String toString() {
            return "DataButtonExtSpecialBanner(title=" + this.f117942iobyxmoadg + ", colorButton=" + this.f117945zoijcleaow + ", colorText=" + this.f117943ppxfxbqfkf + ", navlink=" + this.f117944wkgbmnqykc + ", reference=" + this.f117941eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117941eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f117943ppxfxbqfkf;
        }
    }

    public wkgbmnqykc(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117938iobyxmoadg = i13;
        this.f117940zoijcleaow = type;
        this.f117939ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f117938iobyxmoadg == wkgbmnqykcVar.f117938iobyxmoadg && this.f117940zoijcleaow == wkgbmnqykcVar.f117940zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117939ppxfxbqfkf, wkgbmnqykcVar.f117939ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117938iobyxmoadg) * 31) + this.f117940zoijcleaow.hashCode()) * 31) + this.f117939ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117939ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonExtSpecialBanner(index=" + this.f117938iobyxmoadg + ", type=" + this.f117940zoijcleaow + ", data=" + this.f117939ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117938iobyxmoadg;
    }
}
