package dc;

/* JADX INFO: loaded from: classes2.dex */
final class vdvldrhtss extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27756iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f27757ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27758zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27759iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f27760ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private byte f27761wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27762zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc iobyxmoadg() {
            String str;
            String str2;
            if (this.f27761wkgbmnqykc == 1 && (str = this.f27759iobyxmoadg) != null && (str2 = this.f27762zoijcleaow) != null) {
                return new vdvldrhtss(str, str2, this.f27760ppxfxbqfkf);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27759iobyxmoadg == null) {
                sb3.append(" name");
            }
            if (this.f27762zoijcleaow == null) {
                sb3.append(" code");
            }
            if ((1 & this.f27761wkgbmnqykc) == 0) {
                sb3.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f27762zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg wkgbmnqykc(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f27759iobyxmoadg = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg zoijcleaow(long j13) {
            this.f27760ppxfxbqfkf = j13;
            this.f27761wkgbmnqykc = (byte) (this.f27761wkgbmnqykc | 1);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc abstractC0523wkgbmnqykc = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc) obj;
        return this.f27756iobyxmoadg.equals(abstractC0523wkgbmnqykc.wkgbmnqykc()) && this.f27758zoijcleaow.equals(abstractC0523wkgbmnqykc.ppxfxbqfkf()) && this.f27757ppxfxbqfkf == abstractC0523wkgbmnqykc.zoijcleaow();
    }

    public int hashCode() {
        int iHashCode = (((this.f27756iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27758zoijcleaow.hashCode()) * 1000003;
        long j13 = this.f27757ppxfxbqfkf;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc
    public String ppxfxbqfkf() {
        return this.f27758zoijcleaow;
    }

    public String toString() {
        return "Signal{name=" + this.f27756iobyxmoadg + ", code=" + this.f27758zoijcleaow + ", address=" + this.f27757ppxfxbqfkf + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc
    public String wkgbmnqykc() {
        return this.f27756iobyxmoadg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc
    public long zoijcleaow() {
        return this.f27757ppxfxbqfkf;
    }

    private vdvldrhtss(String str, String str2, long j13) {
        this.f27756iobyxmoadg = str;
        this.f27758zoijcleaow = str2;
        this.f27757ppxfxbqfkf = j13;
    }
}
