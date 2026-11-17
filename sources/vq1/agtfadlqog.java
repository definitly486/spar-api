package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117682iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117683ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117684zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117685iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117686ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117687wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final k21.ojitshcjhn f117688zoijcleaow;

        public iobyxmoadg(String image, k21.ojitshcjhn navlink, String reference, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f117685iobyxmoadg = image;
            this.f117688zoijcleaow = navlink;
            this.f117686ppxfxbqfkf = reference;
            this.f117687wkgbmnqykc = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117685iobyxmoadg, iobyxmoadgVar.f117685iobyxmoadg) && this.f117688zoijcleaow == iobyxmoadgVar.f117688zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117686ppxfxbqfkf, iobyxmoadgVar.f117686ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117687wkgbmnqykc, iobyxmoadgVar.f117687wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f117685iobyxmoadg.hashCode() * 31) + this.f117688zoijcleaow.hashCode()) * 31) + this.f117686ppxfxbqfkf.hashCode()) * 31) + this.f117687wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117687wkgbmnqykc;
        }

        public final k21.ojitshcjhn ppxfxbqfkf() {
            return this.f117688zoijcleaow;
        }

        public String toString() {
            return "ImageExtSpecialBannerData(image=" + this.f117685iobyxmoadg + ", navlink=" + this.f117688zoijcleaow + ", reference=" + this.f117686ppxfxbqfkf + ", adv=" + this.f117687wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117686ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f117685iobyxmoadg;
        }
    }

    public agtfadlqog(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117682iobyxmoadg = i13;
        this.f117684zoijcleaow = type;
        this.f117683ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return this.f117682iobyxmoadg == agtfadlqogVar.f117682iobyxmoadg && this.f117684zoijcleaow == agtfadlqogVar.f117684zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117683ppxfxbqfkf, agtfadlqogVar.f117683ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117682iobyxmoadg) * 31) + this.f117684zoijcleaow.hashCode()) * 31) + this.f117683ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117683ppxfxbqfkf;
    }

    public String toString() {
        return "ImageExtSpecialBannerModel(index=" + this.f117682iobyxmoadg + ", type=" + this.f117684zoijcleaow + ", data=" + this.f117683ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117682iobyxmoadg;
    }
}
