package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117974iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117975ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117976zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f117977eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f117978iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final k21.ojitshcjhn f117979ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117980wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117981zoijcleaow;

        public iobyxmoadg(int i13, String image, k21.ojitshcjhn navlink, String reference, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navlink, "navlink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f117978iobyxmoadg = i13;
            this.f117981zoijcleaow = image;
            this.f117979ppxfxbqfkf = navlink;
            this.f117980wkgbmnqykc = reference;
            this.f117977eablkybsjg = adv;
        }

        public final int eablkybsjg() {
            return this.f117978iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f117978iobyxmoadg == iobyxmoadgVar.f117978iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117981zoijcleaow, iobyxmoadgVar.f117981zoijcleaow) && this.f117979ppxfxbqfkf == iobyxmoadgVar.f117979ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117980wkgbmnqykc, iobyxmoadgVar.f117980wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117977eablkybsjg, iobyxmoadgVar.f117977eablkybsjg);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f117978iobyxmoadg) * 31) + this.f117981zoijcleaow.hashCode()) * 31) + this.f117979ppxfxbqfkf.hashCode()) * 31) + this.f117980wkgbmnqykc.hashCode()) * 31) + this.f117977eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117977eablkybsjg;
        }

        public final k21.ojitshcjhn ppxfxbqfkf() {
            return this.f117979ppxfxbqfkf;
        }

        public String toString() {
            return "BannerSpecialBannerModel(sort=" + this.f117978iobyxmoadg + ", image=" + this.f117981zoijcleaow + ", navlink=" + this.f117979ppxfxbqfkf + ", reference=" + this.f117980wkgbmnqykc + ", adv=" + this.f117977eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117980wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f117981zoijcleaow;
        }
    }

    public zoijcleaow(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117974iobyxmoadg = i13;
        this.f117976zoijcleaow = type;
        this.f117975ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f117974iobyxmoadg == zoijcleaowVar.f117974iobyxmoadg && this.f117976zoijcleaow == zoijcleaowVar.f117976zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117975ppxfxbqfkf, zoijcleaowVar.f117975ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117974iobyxmoadg) * 31) + this.f117976zoijcleaow.hashCode()) * 31) + this.f117975ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117975ppxfxbqfkf;
    }

    public jpowsppfya ppxfxbqfkf() {
        return this.f117976zoijcleaow;
    }

    public String toString() {
        return "BannersSpecialBannerModel(index=" + this.f117974iobyxmoadg + ", type=" + this.f117976zoijcleaow + ", data=" + this.f117975ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117974iobyxmoadg;
    }
}
