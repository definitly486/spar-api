package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117879iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117880ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117881zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117882iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117883ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117884zoijcleaow;

        public iobyxmoadg(String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f117882iobyxmoadg = file;
            this.f117884zoijcleaow = desc;
            this.f117883ppxfxbqfkf = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117882iobyxmoadg, iobyxmoadgVar.f117882iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117884zoijcleaow, iobyxmoadgVar.f117884zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117883ppxfxbqfkf, iobyxmoadgVar.f117883ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f117882iobyxmoadg.hashCode() * 31) + this.f117884zoijcleaow.hashCode()) * 31) + this.f117883ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117883ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117882iobyxmoadg;
        }

        public String toString() {
            return "DataImageSpecialBanner(file=" + this.f117882iobyxmoadg + ", desc=" + this.f117884zoijcleaow + ", adv=" + this.f117883ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f117884zoijcleaow;
        }
    }

    public ojitshcjhn(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117879iobyxmoadg = i13;
        this.f117881zoijcleaow = type;
        this.f117880ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return this.f117879iobyxmoadg == ojitshcjhnVar.f117879iobyxmoadg && this.f117881zoijcleaow == ojitshcjhnVar.f117881zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117880ppxfxbqfkf, ojitshcjhnVar.f117880ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117879iobyxmoadg) * 31) + this.f117881zoijcleaow.hashCode()) * 31) + this.f117880ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117880ppxfxbqfkf;
    }

    public String toString() {
        return "ImageSpecialBanner(index=" + this.f117879iobyxmoadg + ", type=" + this.f117881zoijcleaow + ", data=" + this.f117880ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117879iobyxmoadg;
    }
}
