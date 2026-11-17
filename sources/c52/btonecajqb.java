package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18770iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18771ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18772zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f18773eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18774iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18775ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18776wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18777zoijcleaow;

        public iobyxmoadg(String icon, String file, String desc, String type, String size) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(icon, "icon");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(size, "size");
            this.f18774iobyxmoadg = icon;
            this.f18777zoijcleaow = file;
            this.f18775ppxfxbqfkf = desc;
            this.f18776wkgbmnqykc = type;
            this.f18773eablkybsjg = size;
        }

        public final String eablkybsjg() {
            return this.f18776wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18774iobyxmoadg, iobyxmoadgVar.f18774iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18777zoijcleaow, iobyxmoadgVar.f18777zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18775ppxfxbqfkf, iobyxmoadgVar.f18775ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18776wkgbmnqykc, iobyxmoadgVar.f18776wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18773eablkybsjg, iobyxmoadgVar.f18773eablkybsjg);
        }

        public int hashCode() {
            return (((((((this.f18774iobyxmoadg.hashCode() * 31) + this.f18777zoijcleaow.hashCode()) * 31) + this.f18775ppxfxbqfkf.hashCode()) * 31) + this.f18776wkgbmnqykc.hashCode()) * 31) + this.f18773eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18775ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18774iobyxmoadg;
        }

        public String toString() {
            return "DataFilesSpecialBanner(icon=" + this.f18774iobyxmoadg + ", file=" + this.f18777zoijcleaow + ", desc=" + this.f18775ppxfxbqfkf + ", type=" + this.f18776wkgbmnqykc + ", size=" + this.f18773eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18773eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f18777zoijcleaow;
        }
    }

    public btonecajqb(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18770iobyxmoadg = i13;
        this.f18772zoijcleaow = type;
        this.f18771ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f18770iobyxmoadg == btonecajqbVar.f18770iobyxmoadg && this.f18772zoijcleaow == btonecajqbVar.f18772zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18771ppxfxbqfkf, btonecajqbVar.f18771ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18770iobyxmoadg) * 31) + this.f18772zoijcleaow.hashCode()) * 31) + this.f18771ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18771ppxfxbqfkf;
    }

    public String toString() {
        return "FilesSpecialBanner(index=" + this.f18770iobyxmoadg + ", type=" + this.f18772zoijcleaow + ", data=" + this.f18771ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18770iobyxmoadg;
    }
}
