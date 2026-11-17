package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18763iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18764ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18765zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18766iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18767ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18768wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final f40.zoijcleaow f18769zoijcleaow;

        public iobyxmoadg(String image, f40.zoijcleaow navlink, String reference, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f18766iobyxmoadg = image;
            this.f18769zoijcleaow = navlink;
            this.f18767ppxfxbqfkf = reference;
            this.f18768wkgbmnqykc = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18766iobyxmoadg, iobyxmoadgVar.f18766iobyxmoadg) && this.f18769zoijcleaow == iobyxmoadgVar.f18769zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18767ppxfxbqfkf, iobyxmoadgVar.f18767ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18768wkgbmnqykc, iobyxmoadgVar.f18768wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f18766iobyxmoadg.hashCode() * 31) + this.f18769zoijcleaow.hashCode()) * 31) + this.f18767ppxfxbqfkf.hashCode()) * 31) + this.f18768wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18768wkgbmnqykc;
        }

        public final f40.zoijcleaow ppxfxbqfkf() {
            return this.f18769zoijcleaow;
        }

        public String toString() {
            return "ImageExtSpecialBannerData(image=" + this.f18766iobyxmoadg + ", navlink=" + this.f18769zoijcleaow + ", reference=" + this.f18767ppxfxbqfkf + ", adv=" + this.f18768wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18767ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f18766iobyxmoadg;
        }
    }

    public agtfadlqog(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18763iobyxmoadg = i13;
        this.f18765zoijcleaow = type;
        this.f18764ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return this.f18763iobyxmoadg == agtfadlqogVar.f18763iobyxmoadg && this.f18765zoijcleaow == agtfadlqogVar.f18765zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18764ppxfxbqfkf, agtfadlqogVar.f18764ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18763iobyxmoadg) * 31) + this.f18765zoijcleaow.hashCode()) * 31) + this.f18764ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18764ppxfxbqfkf;
    }

    public String toString() {
        return "ImageExtSpecialBannerModel(index=" + this.f18763iobyxmoadg + ", type=" + this.f18765zoijcleaow + ", data=" + this.f18764ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18763iobyxmoadg;
    }
}
