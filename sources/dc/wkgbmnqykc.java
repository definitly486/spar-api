package dc;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27778iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27779ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27780zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27781iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f27782ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27783zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg
        public iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg iobyxmoadg() {
            String str;
            String str2;
            String str3 = this.f27781iobyxmoadg;
            if (str3 != null && (str = this.f27783zoijcleaow) != null && (str2 = this.f27782ppxfxbqfkf) != null) {
                return new wkgbmnqykc(str3, str, str2);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27781iobyxmoadg == null) {
                sb3.append(" arch");
            }
            if (this.f27783zoijcleaow == null) {
                sb3.append(" libraryName");
            }
            if (this.f27782ppxfxbqfkf == null) {
                sb3.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg
        public iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f27782ppxfxbqfkf = str;
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg
        public iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg wkgbmnqykc(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f27783zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg
        public iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f27781iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg)) {
            return false;
        }
        iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg abstractC0527iobyxmoadg = (iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg) obj;
        return this.f27778iobyxmoadg.equals(abstractC0527iobyxmoadg.zoijcleaow()) && this.f27780zoijcleaow.equals(abstractC0527iobyxmoadg.wkgbmnqykc()) && this.f27779ppxfxbqfkf.equals(abstractC0527iobyxmoadg.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((((this.f27778iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27780zoijcleaow.hashCode()) * 1000003) ^ this.f27779ppxfxbqfkf.hashCode();
    }

    @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f27779ppxfxbqfkf;
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f27778iobyxmoadg + ", libraryName=" + this.f27780zoijcleaow + ", buildId=" + this.f27779ppxfxbqfkf + "}";
    }

    @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg
    public String wkgbmnqykc() {
        return this.f27780zoijcleaow;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg
    public String zoijcleaow() {
        return this.f27778iobyxmoadg;
    }

    private wkgbmnqykc(String str, String str2, String str3) {
        this.f27778iobyxmoadg = str;
        this.f27780zoijcleaow = str2;
        this.f27779ppxfxbqfkf = str3;
    }
}
