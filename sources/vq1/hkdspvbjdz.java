package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hkdspvbjdz implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117776iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117777ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117778zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117779iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final k21.ojitshcjhn f117780ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117781wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f117782zoijcleaow;

        public iobyxmoadg(String image, boolean z13, k21.ojitshcjhn navlink, String reference) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            this.f117779iobyxmoadg = image;
            this.f117782zoijcleaow = z13;
            this.f117780ppxfxbqfkf = navlink;
            this.f117781wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117779iobyxmoadg, iobyxmoadgVar.f117779iobyxmoadg) && this.f117782zoijcleaow == iobyxmoadgVar.f117782zoijcleaow && this.f117780ppxfxbqfkf == iobyxmoadgVar.f117780ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117781wkgbmnqykc, iobyxmoadgVar.f117781wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f117779iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f117782zoijcleaow)) * 31) + this.f117780ppxfxbqfkf.hashCode()) * 31) + this.f117781wkgbmnqykc.hashCode();
        }

        public final boolean iobyxmoadg() {
            return this.f117782zoijcleaow;
        }

        public final k21.ojitshcjhn ppxfxbqfkf() {
            return this.f117780ppxfxbqfkf;
        }

        public String toString() {
            return "SquareCardData(image=" + this.f117779iobyxmoadg + ", hasShadow=" + this.f117782zoijcleaow + ", navlink=" + this.f117780ppxfxbqfkf + ", reference=" + this.f117781wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117781wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f117779iobyxmoadg;
        }
    }

    public hkdspvbjdz(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117776iobyxmoadg = i13;
        this.f117778zoijcleaow = type;
        this.f117777ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkdspvbjdz)) {
            return false;
        }
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) obj;
        return this.f117776iobyxmoadg == hkdspvbjdzVar.f117776iobyxmoadg && this.f117778zoijcleaow == hkdspvbjdzVar.f117778zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117777ppxfxbqfkf, hkdspvbjdzVar.f117777ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117776iobyxmoadg) * 31) + this.f117778zoijcleaow.hashCode()) * 31) + this.f117777ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117777ppxfxbqfkf;
    }

    public String toString() {
        return "SquareCardsListModel(index=" + this.f117776iobyxmoadg + ", type=" + this.f117778zoijcleaow + ", data=" + this.f117777ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117776iobyxmoadg;
    }
}
