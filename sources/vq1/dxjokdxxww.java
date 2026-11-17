package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117731iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f117732ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117733zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f117734iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117735zoijcleaow;

        public iobyxmoadg(int i13, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f117734iobyxmoadg = i13;
            this.f117735zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f117734iobyxmoadg == iobyxmoadgVar.f117734iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117735zoijcleaow, iobyxmoadgVar.f117735zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f117734iobyxmoadg) * 31) + this.f117735zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f117734iobyxmoadg;
        }

        public String toString() {
            return "EvropolisStickerData(id=" + this.f117734iobyxmoadg + ", text=" + this.f117735zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f117735zoijcleaow;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f117736eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final wkgbmnqykc.iobyxmoadg f117737gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117738iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117739ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117740wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117741zoijcleaow;

        public zoijcleaow(String title, String subtitle, String image, String stickerTitle, List stickers, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtitle, "subtitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickerTitle, "stickerTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickers, "stickers");
            this.f117738iobyxmoadg = title;
            this.f117741zoijcleaow = subtitle;
            this.f117739ppxfxbqfkf = image;
            this.f117740wkgbmnqykc = stickerTitle;
            this.f117736eablkybsjg = stickers;
            this.f117737gxszxtbevo = iobyxmoadgVar;
        }

        public final String eablkybsjg() {
            return this.f117741zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117738iobyxmoadg, zoijcleaowVar.f117738iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117741zoijcleaow, zoijcleaowVar.f117741zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117739ppxfxbqfkf, zoijcleaowVar.f117739ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117740wkgbmnqykc, zoijcleaowVar.f117740wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117736eablkybsjg, zoijcleaowVar.f117736eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117737gxszxtbevo, zoijcleaowVar.f117737gxszxtbevo);
        }

        public final String gxszxtbevo() {
            return this.f117738iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f117738iobyxmoadg.hashCode() * 31) + this.f117741zoijcleaow.hashCode()) * 31) + this.f117739ppxfxbqfkf.hashCode()) * 31) + this.f117740wkgbmnqykc.hashCode()) * 31) + this.f117736eablkybsjg.hashCode()) * 31;
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f117737gxszxtbevo;
            return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
        }

        public final wkgbmnqykc.iobyxmoadg iobyxmoadg() {
            return this.f117737gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f117740wkgbmnqykc;
        }

        public String toString() {
            return "EvropolisStickersCardData(title=" + this.f117738iobyxmoadg + ", subtitle=" + this.f117741zoijcleaow + ", image=" + this.f117739ppxfxbqfkf + ", stickerTitle=" + this.f117740wkgbmnqykc + ", stickers=" + this.f117736eablkybsjg + ", button=" + this.f117737gxszxtbevo + ")";
        }

        public final List wkgbmnqykc() {
            return this.f117736eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f117739ppxfxbqfkf;
        }
    }

    public dxjokdxxww(int i13, jpowsppfya type, zoijcleaow data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117731iobyxmoadg = i13;
        this.f117733zoijcleaow = type;
        this.f117732ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f117731iobyxmoadg == dxjokdxxwwVar.f117731iobyxmoadg && this.f117733zoijcleaow == dxjokdxxwwVar.f117733zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117732ppxfxbqfkf, dxjokdxxwwVar.f117732ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117731iobyxmoadg) * 31) + this.f117733zoijcleaow.hashCode()) * 31) + this.f117732ppxfxbqfkf.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f117732ppxfxbqfkf;
    }

    public String toString() {
        return "EvropolisStickersCardModel(index=" + this.f117731iobyxmoadg + ", type=" + this.f117733zoijcleaow + ", data=" + this.f117732ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117731iobyxmoadg;
    }
}
