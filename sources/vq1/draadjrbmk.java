package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117721iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117722ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117723zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117724iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117725ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117726zoijcleaow;

        public iobyxmoadg(String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f117724iobyxmoadg = file;
            this.f117726zoijcleaow = desc;
            this.f117725ppxfxbqfkf = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117724iobyxmoadg, iobyxmoadgVar.f117724iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117726zoijcleaow, iobyxmoadgVar.f117726zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117725ppxfxbqfkf, iobyxmoadgVar.f117725ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f117724iobyxmoadg.hashCode() * 31) + this.f117726zoijcleaow.hashCode()) * 31) + this.f117725ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117725ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117724iobyxmoadg;
        }

        public String toString() {
            return "DataGallerySpecialBanner(file=" + this.f117724iobyxmoadg + ", desc=" + this.f117726zoijcleaow + ", adv=" + this.f117725ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f117726zoijcleaow;
        }
    }

    public draadjrbmk(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117721iobyxmoadg = i13;
        this.f117723zoijcleaow = type;
        this.f117722ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f117721iobyxmoadg == draadjrbmkVar.f117721iobyxmoadg && this.f117723zoijcleaow == draadjrbmkVar.f117723zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117722ppxfxbqfkf, draadjrbmkVar.f117722ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117721iobyxmoadg) * 31) + this.f117723zoijcleaow.hashCode()) * 31) + this.f117722ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117722ppxfxbqfkf;
    }

    public String toString() {
        return "GallerySpecialBanner(index=" + this.f117721iobyxmoadg + ", type=" + this.f117723zoijcleaow + ", data=" + this.f117722ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117721iobyxmoadg;
    }
}
