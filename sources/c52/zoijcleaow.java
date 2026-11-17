package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19054iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f19055ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f19056zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f19057eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f19058iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final f40.zoijcleaow f19059ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f19060wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19061zoijcleaow;

        public iobyxmoadg(int i13, String image, f40.zoijcleaow navlink, String reference, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f19058iobyxmoadg = i13;
            this.f19061zoijcleaow = image;
            this.f19059ppxfxbqfkf = navlink;
            this.f19060wkgbmnqykc = reference;
            this.f19057eablkybsjg = adv;
        }

        public final int eablkybsjg() {
            return this.f19058iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f19058iobyxmoadg == iobyxmoadgVar.f19058iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19061zoijcleaow, iobyxmoadgVar.f19061zoijcleaow) && this.f19059ppxfxbqfkf == iobyxmoadgVar.f19059ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19060wkgbmnqykc, iobyxmoadgVar.f19060wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19057eablkybsjg, iobyxmoadgVar.f19057eablkybsjg);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f19058iobyxmoadg) * 31) + this.f19061zoijcleaow.hashCode()) * 31) + this.f19059ppxfxbqfkf.hashCode()) * 31) + this.f19060wkgbmnqykc.hashCode()) * 31) + this.f19057eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f19057eablkybsjg;
        }

        public final f40.zoijcleaow ppxfxbqfkf() {
            return this.f19059ppxfxbqfkf;
        }

        public String toString() {
            return "BannerSpecialBannerModel(sort=" + this.f19058iobyxmoadg + ", image=" + this.f19061zoijcleaow + ", navlink=" + this.f19059ppxfxbqfkf + ", reference=" + this.f19060wkgbmnqykc + ", adv=" + this.f19057eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f19060wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f19061zoijcleaow;
        }
    }

    public zoijcleaow(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f19054iobyxmoadg = i13;
        this.f19056zoijcleaow = type;
        this.f19055ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f19054iobyxmoadg == zoijcleaowVar.f19054iobyxmoadg && this.f19056zoijcleaow == zoijcleaowVar.f19056zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19055ppxfxbqfkf, zoijcleaowVar.f19055ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19054iobyxmoadg) * 31) + this.f19056zoijcleaow.hashCode()) * 31) + this.f19055ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f19055ppxfxbqfkf;
    }

    public jpowsppfya ppxfxbqfkf() {
        return this.f19056zoijcleaow;
    }

    public String toString() {
        return "BannersSpecialBannerModel(index=" + this.f19054iobyxmoadg + ", type=" + this.f19056zoijcleaow + ", data=" + this.f19055ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f19054iobyxmoadg;
    }
}
