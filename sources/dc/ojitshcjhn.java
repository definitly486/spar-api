package dc;

/* JADX INFO: loaded from: classes2.dex */
final class ojitshcjhn extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f27708iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27709ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f27710wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f27711zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private byte f27712eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f27713iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f27714ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f27715wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f27716zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg eablkybsjg(String str) {
            this.f27715wkgbmnqykc = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg iobyxmoadg() {
            String str;
            if (this.f27712eablkybsjg == 3 && (str = this.f27714ppxfxbqfkf) != null) {
                return new ojitshcjhn(this.f27713iobyxmoadg, this.f27716zoijcleaow, str, this.f27715wkgbmnqykc);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27712eablkybsjg & 1) == 0) {
                sb3.append(" baseAddress");
            }
            if ((this.f27712eablkybsjg & 2) == 0) {
                sb3.append(" size");
            }
            if (this.f27714ppxfxbqfkf == null) {
                sb3.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f27714ppxfxbqfkf = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg wkgbmnqykc(long j13) {
            this.f27716zoijcleaow = j13;
            this.f27712eablkybsjg = (byte) (this.f27712eablkybsjg | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg zoijcleaow(long j13) {
            this.f27713iobyxmoadg = j13;
            this.f27712eablkybsjg = (byte) (this.f27712eablkybsjg | 1);
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg
    public String eablkybsjg() {
        return this.f27710wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg abstractC0520iobyxmoadg = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg) obj;
        if (this.f27708iobyxmoadg == abstractC0520iobyxmoadg.zoijcleaow() && this.f27711zoijcleaow == abstractC0520iobyxmoadg.wkgbmnqykc() && this.f27709ppxfxbqfkf.equals(abstractC0520iobyxmoadg.ppxfxbqfkf())) {
            String str = this.f27710wkgbmnqykc;
            if (str == null) {
                if (abstractC0520iobyxmoadg.eablkybsjg() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0520iobyxmoadg.eablkybsjg())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j13 = this.f27708iobyxmoadg;
        long j14 = this.f27711zoijcleaow;
        int iHashCode = (((((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f27709ppxfxbqfkf.hashCode()) * 1000003;
        String str = this.f27710wkgbmnqykc;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f27709ppxfxbqfkf;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f27708iobyxmoadg + ", size=" + this.f27711zoijcleaow + ", name=" + this.f27709ppxfxbqfkf + ", uuid=" + this.f27710wkgbmnqykc + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg
    public long wkgbmnqykc() {
        return this.f27711zoijcleaow;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg
    public long zoijcleaow() {
        return this.f27708iobyxmoadg;
    }

    private ojitshcjhn(long j13, long j14, String str, String str2) {
        this.f27708iobyxmoadg = j13;
        this.f27711zoijcleaow = j14;
        this.f27709ppxfxbqfkf = str;
        this.f27710wkgbmnqykc = str2;
    }
}
