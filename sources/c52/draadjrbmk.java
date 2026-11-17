package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18802iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18803ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18804zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18805iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18806ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18807zoijcleaow;

        public iobyxmoadg(String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f18805iobyxmoadg = file;
            this.f18807zoijcleaow = desc;
            this.f18806ppxfxbqfkf = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18805iobyxmoadg, iobyxmoadgVar.f18805iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18807zoijcleaow, iobyxmoadgVar.f18807zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18806ppxfxbqfkf, iobyxmoadgVar.f18806ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f18805iobyxmoadg.hashCode() * 31) + this.f18807zoijcleaow.hashCode()) * 31) + this.f18806ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18806ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18805iobyxmoadg;
        }

        public String toString() {
            return "DataGallerySpecialBanner(file=" + this.f18805iobyxmoadg + ", desc=" + this.f18807zoijcleaow + ", adv=" + this.f18806ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f18807zoijcleaow;
        }
    }

    public draadjrbmk(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18802iobyxmoadg = i13;
        this.f18804zoijcleaow = type;
        this.f18803ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f18802iobyxmoadg == draadjrbmkVar.f18802iobyxmoadg && this.f18804zoijcleaow == draadjrbmkVar.f18804zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18803ppxfxbqfkf, draadjrbmkVar.f18803ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18802iobyxmoadg) * 31) + this.f18804zoijcleaow.hashCode()) * 31) + this.f18803ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18803ppxfxbqfkf;
    }

    public String toString() {
        return "GallerySpecialBanner(index=" + this.f18802iobyxmoadg + ", type=" + this.f18804zoijcleaow + ", data=" + this.f18803ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18802iobyxmoadg;
    }
}
