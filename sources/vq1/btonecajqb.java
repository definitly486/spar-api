package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117689iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117690ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117691zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f117692eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117693iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117694ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117695wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117696zoijcleaow;

        public iobyxmoadg(String icon, String file, String desc, String type, String size) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(icon, "icon");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(size, "size");
            this.f117693iobyxmoadg = icon;
            this.f117696zoijcleaow = file;
            this.f117694ppxfxbqfkf = desc;
            this.f117695wkgbmnqykc = type;
            this.f117692eablkybsjg = size;
        }

        public final String eablkybsjg() {
            return this.f117695wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117693iobyxmoadg, iobyxmoadgVar.f117693iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117696zoijcleaow, iobyxmoadgVar.f117696zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117694ppxfxbqfkf, iobyxmoadgVar.f117694ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117695wkgbmnqykc, iobyxmoadgVar.f117695wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117692eablkybsjg, iobyxmoadgVar.f117692eablkybsjg);
        }

        public int hashCode() {
            return (((((((this.f117693iobyxmoadg.hashCode() * 31) + this.f117696zoijcleaow.hashCode()) * 31) + this.f117694ppxfxbqfkf.hashCode()) * 31) + this.f117695wkgbmnqykc.hashCode()) * 31) + this.f117692eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117694ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117693iobyxmoadg;
        }

        public String toString() {
            return "DataFilesSpecialBanner(icon=" + this.f117693iobyxmoadg + ", file=" + this.f117696zoijcleaow + ", desc=" + this.f117694ppxfxbqfkf + ", type=" + this.f117695wkgbmnqykc + ", size=" + this.f117692eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117692eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f117696zoijcleaow;
        }
    }

    public btonecajqb(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117689iobyxmoadg = i13;
        this.f117691zoijcleaow = type;
        this.f117690ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f117689iobyxmoadg == btonecajqbVar.f117689iobyxmoadg && this.f117691zoijcleaow == btonecajqbVar.f117691zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117690ppxfxbqfkf, btonecajqbVar.f117690ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117689iobyxmoadg) * 31) + this.f117691zoijcleaow.hashCode()) * 31) + this.f117690ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117690ppxfxbqfkf;
    }

    public String toString() {
        return "FilesSpecialBanner(index=" + this.f117689iobyxmoadg + ", type=" + this.f117691zoijcleaow + ", data=" + this.f117690ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117689iobyxmoadg;
    }
}
