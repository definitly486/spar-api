package dc;

/* JADX INFO: loaded from: classes2.dex */
final class cqumvgiudr extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27436iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27437zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27438iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27439zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow iobyxmoadg() {
            String str;
            String str2 = this.f27438iobyxmoadg;
            if (str2 != null && (str = this.f27439zoijcleaow) != null) {
                return new cqumvgiudr(str2, str);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27438iobyxmoadg == null) {
                sb3.append(" rolloutId");
            }
            if (this.f27439zoijcleaow == null) {
                sb3.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f27439zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f27438iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow zoijcleaowVar = (iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow) obj;
        return this.f27436iobyxmoadg.equals(zoijcleaowVar.zoijcleaow()) && this.f27437zoijcleaow.equals(zoijcleaowVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((this.f27436iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27437zoijcleaow.hashCode();
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow
    public String ppxfxbqfkf() {
        return this.f27437zoijcleaow;
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f27436iobyxmoadg + ", variantId=" + this.f27437zoijcleaow + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow
    public String zoijcleaow() {
        return this.f27436iobyxmoadg;
    }

    private cqumvgiudr(String str, String str2) {
        this.f27436iobyxmoadg = str;
        this.f27437zoijcleaow = str2;
    }
}
