package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hkdspvbjdz implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18857iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18858ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18859zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18860iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final f40.zoijcleaow f18861ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18862wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f18863zoijcleaow;

        public iobyxmoadg(String image, boolean z13, f40.zoijcleaow navlink, String reference) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            this.f18860iobyxmoadg = image;
            this.f18863zoijcleaow = z13;
            this.f18861ppxfxbqfkf = navlink;
            this.f18862wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18860iobyxmoadg, iobyxmoadgVar.f18860iobyxmoadg) && this.f18863zoijcleaow == iobyxmoadgVar.f18863zoijcleaow && this.f18861ppxfxbqfkf == iobyxmoadgVar.f18861ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18862wkgbmnqykc, iobyxmoadgVar.f18862wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f18860iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f18863zoijcleaow)) * 31) + this.f18861ppxfxbqfkf.hashCode()) * 31) + this.f18862wkgbmnqykc.hashCode();
        }

        public final boolean iobyxmoadg() {
            return this.f18863zoijcleaow;
        }

        public final f40.zoijcleaow ppxfxbqfkf() {
            return this.f18861ppxfxbqfkf;
        }

        public String toString() {
            return "SquareCardData(image=" + this.f18860iobyxmoadg + ", hasShadow=" + this.f18863zoijcleaow + ", navlink=" + this.f18861ppxfxbqfkf + ", reference=" + this.f18862wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18862wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f18860iobyxmoadg;
        }
    }

    public hkdspvbjdz(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18857iobyxmoadg = i13;
        this.f18859zoijcleaow = type;
        this.f18858ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkdspvbjdz)) {
            return false;
        }
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) obj;
        return this.f18857iobyxmoadg == hkdspvbjdzVar.f18857iobyxmoadg && this.f18859zoijcleaow == hkdspvbjdzVar.f18859zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18858ppxfxbqfkf, hkdspvbjdzVar.f18858ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18857iobyxmoadg) * 31) + this.f18859zoijcleaow.hashCode()) * 31) + this.f18858ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18858ppxfxbqfkf;
    }

    public String toString() {
        return "SquareCardsListModel(index=" + this.f18857iobyxmoadg + ", type=" + this.f18859zoijcleaow + ", data=" + this.f18858ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18857iobyxmoadg;
    }
}
