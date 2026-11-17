package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18935iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18936ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18937zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18938iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18939ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18940wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18941zoijcleaow;

        public iobyxmoadg(String value, String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f18938iobyxmoadg = value;
            this.f18941zoijcleaow = file;
            this.f18939ppxfxbqfkf = desc;
            this.f18940wkgbmnqykc = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18938iobyxmoadg, iobyxmoadgVar.f18938iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18941zoijcleaow, iobyxmoadgVar.f18941zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18939ppxfxbqfkf, iobyxmoadgVar.f18939ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18940wkgbmnqykc, iobyxmoadgVar.f18940wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f18938iobyxmoadg.hashCode() * 31) + this.f18941zoijcleaow.hashCode()) * 31) + this.f18939ppxfxbqfkf.hashCode()) * 31) + this.f18940wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18940wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f18941zoijcleaow;
        }

        public String toString() {
            return "DataPictureTextSpecialBanner(value=" + this.f18938iobyxmoadg + ", file=" + this.f18941zoijcleaow + ", desc=" + this.f18939ppxfxbqfkf + ", adv=" + this.f18940wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18938iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f18939ppxfxbqfkf;
        }
    }

    public kcexrzcfyt(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18935iobyxmoadg = i13;
        this.f18937zoijcleaow = type;
        this.f18936ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return this.f18935iobyxmoadg == kcexrzcfytVar.f18935iobyxmoadg && this.f18937zoijcleaow == kcexrzcfytVar.f18937zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18936ppxfxbqfkf, kcexrzcfytVar.f18936ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18935iobyxmoadg) * 31) + this.f18937zoijcleaow.hashCode()) * 31) + this.f18936ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18936ppxfxbqfkf;
    }

    public String toString() {
        return "PictureTextSpecialBanner(index=" + this.f18935iobyxmoadg + ", type=" + this.f18937zoijcleaow + ", data=" + this.f18936ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18935iobyxmoadg;
    }
}
