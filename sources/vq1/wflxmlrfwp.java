package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117931iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117932ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117933zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iozdgvuglv f117934iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final k21.ojitshcjhn f117935ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117936wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117937zoijcleaow;

        public iobyxmoadg(iozdgvuglv type, String value, k21.ojitshcjhn navlink, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            this.f117934iobyxmoadg = type;
            this.f117937zoijcleaow = value;
            this.f117935ppxfxbqfkf = navlink;
            this.f117936wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f117934iobyxmoadg == iobyxmoadgVar.f117934iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117937zoijcleaow, iobyxmoadgVar.f117937zoijcleaow) && this.f117935ppxfxbqfkf == iobyxmoadgVar.f117935ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117936wkgbmnqykc, iobyxmoadgVar.f117936wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f117934iobyxmoadg.hashCode() * 31) + this.f117937zoijcleaow.hashCode()) * 31) + this.f117935ppxfxbqfkf.hashCode()) * 31;
            String str = this.f117936wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f117935ppxfxbqfkf;
        }

        public final iozdgvuglv ppxfxbqfkf() {
            return this.f117934iobyxmoadg;
        }

        public String toString() {
            return "DataHeaderTagSpecialBanner(type=" + this.f117934iobyxmoadg + ", value=" + this.f117937zoijcleaow + ", navlink=" + this.f117935ppxfxbqfkf + ", reference=" + this.f117936wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117937zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f117936wkgbmnqykc;
        }
    }

    public wflxmlrfwp(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117931iobyxmoadg = i13;
        this.f117933zoijcleaow = type;
        this.f117932ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return this.f117931iobyxmoadg == wflxmlrfwpVar.f117931iobyxmoadg && this.f117933zoijcleaow == wflxmlrfwpVar.f117933zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117932ppxfxbqfkf, wflxmlrfwpVar.f117932ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117931iobyxmoadg) * 31) + this.f117933zoijcleaow.hashCode()) * 31) + this.f117932ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117932ppxfxbqfkf;
    }

    public String toString() {
        return "HeaderTagSpecialBanner(index=" + this.f117931iobyxmoadg + ", type=" + this.f117933zoijcleaow + ", data=" + this.f117932ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117931iobyxmoadg;
    }
}
