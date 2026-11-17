package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18812iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f18813ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18814zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f18815iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18816zoijcleaow;

        public iobyxmoadg(int i13, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f18815iobyxmoadg = i13;
            this.f18816zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f18815iobyxmoadg == iobyxmoadgVar.f18815iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18816zoijcleaow, iobyxmoadgVar.f18816zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f18815iobyxmoadg) * 31) + this.f18816zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f18815iobyxmoadg;
        }

        public String toString() {
            return "EvropolisStickerData(id=" + this.f18815iobyxmoadg + ", text=" + this.f18816zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18816zoijcleaow;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f18817eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final wkgbmnqykc.iobyxmoadg f18818gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18819iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18820ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18821wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18822zoijcleaow;

        public zoijcleaow(String title, String subtitle, String image, String stickerTitle, List stickers, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtitle, "subtitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickerTitle, "stickerTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickers, "stickers");
            this.f18819iobyxmoadg = title;
            this.f18822zoijcleaow = subtitle;
            this.f18820ppxfxbqfkf = image;
            this.f18821wkgbmnqykc = stickerTitle;
            this.f18817eablkybsjg = stickers;
            this.f18818gxszxtbevo = iobyxmoadgVar;
        }

        public final String eablkybsjg() {
            return this.f18822zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18819iobyxmoadg, zoijcleaowVar.f18819iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18822zoijcleaow, zoijcleaowVar.f18822zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18820ppxfxbqfkf, zoijcleaowVar.f18820ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18821wkgbmnqykc, zoijcleaowVar.f18821wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18817eablkybsjg, zoijcleaowVar.f18817eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18818gxszxtbevo, zoijcleaowVar.f18818gxszxtbevo);
        }

        public final String gxszxtbevo() {
            return this.f18819iobyxmoadg;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f18819iobyxmoadg.hashCode() * 31) + this.f18822zoijcleaow.hashCode()) * 31) + this.f18820ppxfxbqfkf.hashCode()) * 31) + this.f18821wkgbmnqykc.hashCode()) * 31) + this.f18817eablkybsjg.hashCode()) * 31;
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f18818gxszxtbevo;
            return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
        }

        public final wkgbmnqykc.iobyxmoadg iobyxmoadg() {
            return this.f18818gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f18821wkgbmnqykc;
        }

        public String toString() {
            return "EvropolisStickersCardData(title=" + this.f18819iobyxmoadg + ", subtitle=" + this.f18822zoijcleaow + ", image=" + this.f18820ppxfxbqfkf + ", stickerTitle=" + this.f18821wkgbmnqykc + ", stickers=" + this.f18817eablkybsjg + ", button=" + this.f18818gxszxtbevo + ")";
        }

        public final List wkgbmnqykc() {
            return this.f18817eablkybsjg;
        }

        public final String zoijcleaow() {
            return this.f18820ppxfxbqfkf;
        }
    }

    public dxjokdxxww(int i13, jpowsppfya type, zoijcleaow data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18812iobyxmoadg = i13;
        this.f18814zoijcleaow = type;
        this.f18813ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f18812iobyxmoadg == dxjokdxxwwVar.f18812iobyxmoadg && this.f18814zoijcleaow == dxjokdxxwwVar.f18814zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18813ppxfxbqfkf, dxjokdxxwwVar.f18813ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18812iobyxmoadg) * 31) + this.f18814zoijcleaow.hashCode()) * 31) + this.f18813ppxfxbqfkf.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f18813ppxfxbqfkf;
    }

    public String toString() {
        return "EvropolisStickersCardModel(index=" + this.f18812iobyxmoadg + ", type=" + this.f18814zoijcleaow + ", data=" + this.f18813ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18812iobyxmoadg;
    }
}
