package cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f20018iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f20019ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f20020wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f20021zoijcleaow;

    static final class zoijcleaow extends eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f20022iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f20023ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f20024wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f20025zoijcleaow;

        zoijcleaow() {
        }

        @Override // cllcsxoeiz.eablkybsjg.iobyxmoadg
        public eablkybsjg.iobyxmoadg eablkybsjg(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f20022iobyxmoadg = str;
            return this;
        }

        @Override // cllcsxoeiz.eablkybsjg.iobyxmoadg
        public eablkybsjg iobyxmoadg() {
            String str = "";
            if (this.f20022iobyxmoadg == null) {
                str = " glVersion";
            }
            if (this.f20025zoijcleaow == null) {
                str = str + " eglVersion";
            }
            if (this.f20023ppxfxbqfkf == null) {
                str = str + " glExtensions";
            }
            if (this.f20024wkgbmnqykc == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new iobyxmoadg(this.f20022iobyxmoadg, this.f20025zoijcleaow, this.f20023ppxfxbqfkf, this.f20024wkgbmnqykc);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cllcsxoeiz.eablkybsjg.iobyxmoadg
        public eablkybsjg.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f20025zoijcleaow = str;
            return this;
        }

        @Override // cllcsxoeiz.eablkybsjg.iobyxmoadg
        public eablkybsjg.iobyxmoadg wkgbmnqykc(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f20023ppxfxbqfkf = str;
            return this;
        }

        @Override // cllcsxoeiz.eablkybsjg.iobyxmoadg
        public eablkybsjg.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f20024wkgbmnqykc = str;
            return this;
        }
    }

    @Override // cllcsxoeiz.eablkybsjg
    public String eablkybsjg() {
        return this.f20018iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f20018iobyxmoadg.equals(eablkybsjgVar.eablkybsjg()) && this.f20021zoijcleaow.equals(eablkybsjgVar.ppxfxbqfkf()) && this.f20019ppxfxbqfkf.equals(eablkybsjgVar.wkgbmnqykc()) && this.f20020wkgbmnqykc.equals(eablkybsjgVar.zoijcleaow());
    }

    public int hashCode() {
        return ((((((this.f20018iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f20021zoijcleaow.hashCode()) * 1000003) ^ this.f20019ppxfxbqfkf.hashCode()) * 1000003) ^ this.f20020wkgbmnqykc.hashCode();
    }

    @Override // cllcsxoeiz.eablkybsjg
    public String ppxfxbqfkf() {
        return this.f20021zoijcleaow;
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f20018iobyxmoadg + ", eglVersion=" + this.f20021zoijcleaow + ", glExtensions=" + this.f20019ppxfxbqfkf + ", eglExtensions=" + this.f20020wkgbmnqykc + "}";
    }

    @Override // cllcsxoeiz.eablkybsjg
    public String wkgbmnqykc() {
        return this.f20019ppxfxbqfkf;
    }

    @Override // cllcsxoeiz.eablkybsjg
    public String zoijcleaow() {
        return this.f20020wkgbmnqykc;
    }

    private iobyxmoadg(String str, String str2, String str3, String str4) {
        this.f20018iobyxmoadg = str;
        this.f20021zoijcleaow = str2;
        this.f20019ppxfxbqfkf = str3;
        this.f20020wkgbmnqykc = str4;
    }
}
