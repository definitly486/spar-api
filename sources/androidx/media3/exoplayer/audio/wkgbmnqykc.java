package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final wkgbmnqykc f10307wkgbmnqykc = new zoijcleaow().wkgbmnqykc();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f10308iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f10309ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f10310zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f10311iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f10312ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f10313zoijcleaow;

        public zoijcleaow eablkybsjg(boolean z13) {
            this.f10311iobyxmoadg = z13;
            return this;
        }

        public zoijcleaow gxszxtbevo(boolean z13) {
            this.f10313zoijcleaow = z13;
            return this;
        }

        public zoijcleaow lqeggnwhkg(boolean z13) {
            this.f10312ppxfxbqfkf = z13;
            return this;
        }

        public wkgbmnqykc wkgbmnqykc() {
            if (this.f10311iobyxmoadg || !(this.f10313zoijcleaow || this.f10312ppxfxbqfkf)) {
                return new wkgbmnqykc(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkgbmnqykc.class != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f10308iobyxmoadg == wkgbmnqykcVar.f10308iobyxmoadg && this.f10310zoijcleaow == wkgbmnqykcVar.f10310zoijcleaow && this.f10309ppxfxbqfkf == wkgbmnqykcVar.f10309ppxfxbqfkf;
    }

    public int hashCode() {
        return ((this.f10308iobyxmoadg ? 1 : 0) << 2) + ((this.f10310zoijcleaow ? 1 : 0) << 1) + (this.f10309ppxfxbqfkf ? 1 : 0);
    }

    private wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        this.f10308iobyxmoadg = zoijcleaowVar.f10311iobyxmoadg;
        this.f10310zoijcleaow = zoijcleaowVar.f10313zoijcleaow;
        this.f10309ppxfxbqfkf = zoijcleaowVar.f10312ppxfxbqfkf;
    }
}
