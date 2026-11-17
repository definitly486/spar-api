package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19011iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f19012ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f19013zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iozdgvuglv f19014iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final f40.zoijcleaow f19015ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f19016wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19017zoijcleaow;

        public iobyxmoadg(iozdgvuglv type, String value, f40.zoijcleaow navlink, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            this.f19014iobyxmoadg = type;
            this.f19017zoijcleaow = value;
            this.f19015ppxfxbqfkf = navlink;
            this.f19016wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f19014iobyxmoadg == iobyxmoadgVar.f19014iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19017zoijcleaow, iobyxmoadgVar.f19017zoijcleaow) && this.f19015ppxfxbqfkf == iobyxmoadgVar.f19015ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19016wkgbmnqykc, iobyxmoadgVar.f19016wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f19014iobyxmoadg.hashCode() * 31) + this.f19017zoijcleaow.hashCode()) * 31) + this.f19015ppxfxbqfkf.hashCode()) * 31;
            String str = this.f19016wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final f40.zoijcleaow iobyxmoadg() {
            return this.f19015ppxfxbqfkf;
        }

        public final iozdgvuglv ppxfxbqfkf() {
            return this.f19014iobyxmoadg;
        }

        public String toString() {
            return "DataHeaderTagSpecialBanner(type=" + this.f19014iobyxmoadg + ", value=" + this.f19017zoijcleaow + ", navlink=" + this.f19015ppxfxbqfkf + ", reference=" + this.f19016wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f19017zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f19016wkgbmnqykc;
        }
    }

    public wflxmlrfwp(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f19011iobyxmoadg = i13;
        this.f19013zoijcleaow = type;
        this.f19012ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return this.f19011iobyxmoadg == wflxmlrfwpVar.f19011iobyxmoadg && this.f19013zoijcleaow == wflxmlrfwpVar.f19013zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19012ppxfxbqfkf, wflxmlrfwpVar.f19012ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19011iobyxmoadg) * 31) + this.f19013zoijcleaow.hashCode()) * 31) + this.f19012ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f19012ppxfxbqfkf;
    }

    public String toString() {
        return "HeaderTagSpecialBanner(index=" + this.f19011iobyxmoadg + ", type=" + this.f19013zoijcleaow + ", data=" + this.f19012ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f19011iobyxmoadg;
    }
}
