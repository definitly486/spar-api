package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iwizpuwonk implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117807iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117808ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117809zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117810iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117811ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117812wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117813zoijcleaow;

        public iobyxmoadg(String title, String file, String desc, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f117810iobyxmoadg = title;
            this.f117813zoijcleaow = file;
            this.f117811ppxfxbqfkf = desc;
            this.f117812wkgbmnqykc = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117810iobyxmoadg, iobyxmoadgVar.f117810iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117813zoijcleaow, iobyxmoadgVar.f117813zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117811ppxfxbqfkf, iobyxmoadgVar.f117811ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117812wkgbmnqykc, iobyxmoadgVar.f117812wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f117810iobyxmoadg.hashCode() * 31) + this.f117813zoijcleaow.hashCode()) * 31) + this.f117811ppxfxbqfkf.hashCode()) * 31) + this.f117812wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117811ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117812wkgbmnqykc;
        }

        public String toString() {
            return "DataPromoProductsSpecialBanner(title=" + this.f117810iobyxmoadg + ", file=" + this.f117813zoijcleaow + ", desc=" + this.f117811ppxfxbqfkf + ", text=" + this.f117812wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117810iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f117813zoijcleaow;
        }
    }

    public iwizpuwonk(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117807iobyxmoadg = i13;
        this.f117809zoijcleaow = type;
        this.f117808ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return this.f117807iobyxmoadg == iwizpuwonkVar.f117807iobyxmoadg && this.f117809zoijcleaow == iwizpuwonkVar.f117809zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117808ppxfxbqfkf, iwizpuwonkVar.f117808ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117807iobyxmoadg) * 31) + this.f117809zoijcleaow.hashCode()) * 31) + this.f117808ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117808ppxfxbqfkf;
    }

    public String toString() {
        return "PromoProductsSpecialBanner(index=" + this.f117807iobyxmoadg + ", type=" + this.f117809zoijcleaow + ", data=" + this.f117808ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117807iobyxmoadg;
    }
}
