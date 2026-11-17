package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117846iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117847ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117848zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f117849eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117850iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117851ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117852wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117853zoijcleaow;

        public iobyxmoadg(String imagePromoUrl, String imageStickerUrl, String balance, String shortDescription, String dateExpiration) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imagePromoUrl, "imagePromoUrl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageStickerUrl, "imageStickerUrl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(balance, "balance");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateExpiration, "dateExpiration");
            this.f117850iobyxmoadg = imagePromoUrl;
            this.f117853zoijcleaow = imageStickerUrl;
            this.f117851ppxfxbqfkf = balance;
            this.f117852wkgbmnqykc = shortDescription;
            this.f117849eablkybsjg = dateExpiration;
        }

        public final String eablkybsjg() {
            return this.f117852wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117850iobyxmoadg, iobyxmoadgVar.f117850iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117853zoijcleaow, iobyxmoadgVar.f117853zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117851ppxfxbqfkf, iobyxmoadgVar.f117851ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117852wkgbmnqykc, iobyxmoadgVar.f117852wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117849eablkybsjg, iobyxmoadgVar.f117849eablkybsjg);
        }

        public int hashCode() {
            return (((((((this.f117850iobyxmoadg.hashCode() * 31) + this.f117853zoijcleaow.hashCode()) * 31) + this.f117851ppxfxbqfkf.hashCode()) * 31) + this.f117852wkgbmnqykc.hashCode()) * 31) + this.f117849eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117851ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117850iobyxmoadg;
        }

        public String toString() {
            return "PromoBonusesData(imagePromoUrl=" + this.f117850iobyxmoadg + ", imageStickerUrl=" + this.f117853zoijcleaow + ", balance=" + this.f117851ppxfxbqfkf + ", shortDescription=" + this.f117852wkgbmnqykc + ", dateExpiration=" + this.f117849eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f117853zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f117849eablkybsjg;
        }
    }

    public jyumaefscl(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117846iobyxmoadg = i13;
        this.f117848zoijcleaow = type;
        this.f117847ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return this.f117846iobyxmoadg == jyumaefsclVar.f117846iobyxmoadg && this.f117848zoijcleaow == jyumaefsclVar.f117848zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117847ppxfxbqfkf, jyumaefsclVar.f117847ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117846iobyxmoadg) * 31) + this.f117848zoijcleaow.hashCode()) * 31) + this.f117847ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117847ppxfxbqfkf;
    }

    public String toString() {
        return "PromoBonusesModel(index=" + this.f117846iobyxmoadg + ", type=" + this.f117848zoijcleaow + ", data=" + this.f117847ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117846iobyxmoadg;
    }
}
