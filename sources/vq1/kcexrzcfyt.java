package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117854iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117855ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117856zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117857iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117858ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117859wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117860zoijcleaow;

        public iobyxmoadg(String value, String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f117857iobyxmoadg = value;
            this.f117860zoijcleaow = file;
            this.f117858ppxfxbqfkf = desc;
            this.f117859wkgbmnqykc = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117857iobyxmoadg, iobyxmoadgVar.f117857iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117860zoijcleaow, iobyxmoadgVar.f117860zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117858ppxfxbqfkf, iobyxmoadgVar.f117858ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117859wkgbmnqykc, iobyxmoadgVar.f117859wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f117857iobyxmoadg.hashCode() * 31) + this.f117860zoijcleaow.hashCode()) * 31) + this.f117858ppxfxbqfkf.hashCode()) * 31) + this.f117859wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117859wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f117860zoijcleaow;
        }

        public String toString() {
            return "DataPictureTextSpecialBanner(value=" + this.f117857iobyxmoadg + ", file=" + this.f117860zoijcleaow + ", desc=" + this.f117858ppxfxbqfkf + ", adv=" + this.f117859wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117857iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f117858ppxfxbqfkf;
        }
    }

    public kcexrzcfyt(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117854iobyxmoadg = i13;
        this.f117856zoijcleaow = type;
        this.f117855ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return this.f117854iobyxmoadg == kcexrzcfytVar.f117854iobyxmoadg && this.f117856zoijcleaow == kcexrzcfytVar.f117856zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117855ppxfxbqfkf, kcexrzcfytVar.f117855ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117854iobyxmoadg) * 31) + this.f117856zoijcleaow.hashCode()) * 31) + this.f117855ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117855ppxfxbqfkf;
    }

    public String toString() {
        return "PictureTextSpecialBanner(index=" + this.f117854iobyxmoadg + ", type=" + this.f117856zoijcleaow + ", data=" + this.f117855ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117854iobyxmoadg;
    }
}
