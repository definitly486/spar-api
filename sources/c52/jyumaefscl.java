package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18927iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18928ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18929zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f18930eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18931iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18932ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18933wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18934zoijcleaow;

        public iobyxmoadg(String imagePromoUrl, String imageStickerUrl, String balance, String shortDescription, String dateExpiration) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imagePromoUrl, "imagePromoUrl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageStickerUrl, "imageStickerUrl");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(balance, "balance");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateExpiration, "dateExpiration");
            this.f18931iobyxmoadg = imagePromoUrl;
            this.f18934zoijcleaow = imageStickerUrl;
            this.f18932ppxfxbqfkf = balance;
            this.f18933wkgbmnqykc = shortDescription;
            this.f18930eablkybsjg = dateExpiration;
        }

        public final String eablkybsjg() {
            return this.f18933wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18931iobyxmoadg, iobyxmoadgVar.f18931iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18934zoijcleaow, iobyxmoadgVar.f18934zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18932ppxfxbqfkf, iobyxmoadgVar.f18932ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18933wkgbmnqykc, iobyxmoadgVar.f18933wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18930eablkybsjg, iobyxmoadgVar.f18930eablkybsjg);
        }

        public int hashCode() {
            return (((((((this.f18931iobyxmoadg.hashCode() * 31) + this.f18934zoijcleaow.hashCode()) * 31) + this.f18932ppxfxbqfkf.hashCode()) * 31) + this.f18933wkgbmnqykc.hashCode()) * 31) + this.f18930eablkybsjg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18932ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18931iobyxmoadg;
        }

        public String toString() {
            return "PromoBonusesData(imagePromoUrl=" + this.f18931iobyxmoadg + ", imageStickerUrl=" + this.f18934zoijcleaow + ", balance=" + this.f18932ppxfxbqfkf + ", shortDescription=" + this.f18933wkgbmnqykc + ", dateExpiration=" + this.f18930eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f18934zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f18930eablkybsjg;
        }
    }

    public jyumaefscl(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18927iobyxmoadg = i13;
        this.f18929zoijcleaow = type;
        this.f18928ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return this.f18927iobyxmoadg == jyumaefsclVar.f18927iobyxmoadg && this.f18929zoijcleaow == jyumaefsclVar.f18929zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18928ppxfxbqfkf, jyumaefsclVar.f18928ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18927iobyxmoadg) * 31) + this.f18929zoijcleaow.hashCode()) * 31) + this.f18928ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18928ppxfxbqfkf;
    }

    public String toString() {
        return "PromoBonusesModel(index=" + this.f18927iobyxmoadg + ", type=" + this.f18929zoijcleaow + ", data=" + this.f18928ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18927iobyxmoadg;
    }
}
