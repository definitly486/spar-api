package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iwizpuwonk implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18888iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18889ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18890zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18891iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18892ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18893wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18894zoijcleaow;

        public iobyxmoadg(String title, String file, String desc, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f18891iobyxmoadg = title;
            this.f18894zoijcleaow = file;
            this.f18892ppxfxbqfkf = desc;
            this.f18893wkgbmnqykc = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18891iobyxmoadg, iobyxmoadgVar.f18891iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18894zoijcleaow, iobyxmoadgVar.f18894zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18892ppxfxbqfkf, iobyxmoadgVar.f18892ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18893wkgbmnqykc, iobyxmoadgVar.f18893wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f18891iobyxmoadg.hashCode() * 31) + this.f18894zoijcleaow.hashCode()) * 31) + this.f18892ppxfxbqfkf.hashCode()) * 31) + this.f18893wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18892ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18893wkgbmnqykc;
        }

        public String toString() {
            return "DataPromoProductsSpecialBanner(title=" + this.f18891iobyxmoadg + ", file=" + this.f18894zoijcleaow + ", desc=" + this.f18892ppxfxbqfkf + ", text=" + this.f18893wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18891iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f18894zoijcleaow;
        }
    }

    public iwizpuwonk(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18888iobyxmoadg = i13;
        this.f18890zoijcleaow = type;
        this.f18889ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return this.f18888iobyxmoadg == iwizpuwonkVar.f18888iobyxmoadg && this.f18890zoijcleaow == iwizpuwonkVar.f18890zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18889ppxfxbqfkf, iwizpuwonkVar.f18889ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18888iobyxmoadg) * 31) + this.f18890zoijcleaow.hashCode()) * 31) + this.f18889ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18889ppxfxbqfkf;
    }

    public String toString() {
        return "PromoProductsSpecialBanner(index=" + this.f18888iobyxmoadg + ", type=" + this.f18890zoijcleaow + ", data=" + this.f18889ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18888iobyxmoadg;
    }
}
