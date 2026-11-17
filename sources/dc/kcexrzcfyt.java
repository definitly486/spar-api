package dc;

/* JADX INFO: loaded from: classes2.dex */
final class kcexrzcfyt extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f27659eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f27660iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27661ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f27662wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27663zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f27664eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private byte f27665gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f27666iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f27667ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f27668wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27669zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg eablkybsjg(long j13) {
            this.f27666iobyxmoadg = j13;
            this.f27665gxszxtbevo = (byte) (this.f27665gxszxtbevo | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg gxszxtbevo(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f27669zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow iobyxmoadg() {
            String str;
            if (this.f27665gxszxtbevo == 7 && (str = this.f27669zoijcleaow) != null) {
                return new kcexrzcfyt(this.f27666iobyxmoadg, str, this.f27667ppxfxbqfkf, this.f27668wkgbmnqykc, this.f27664eablkybsjg);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27665gxszxtbevo & 1) == 0) {
                sb3.append(" pc");
            }
            if (this.f27669zoijcleaow == null) {
                sb3.append(" symbol");
            }
            if ((this.f27665gxszxtbevo & 2) == 0) {
                sb3.append(" offset");
            }
            if ((this.f27665gxszxtbevo & 4) == 0) {
                sb3.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg ppxfxbqfkf(int i13) {
            this.f27664eablkybsjg = i13;
            this.f27665gxszxtbevo = (byte) (this.f27665gxszxtbevo | 4);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg wkgbmnqykc(long j13) {
            this.f27668wkgbmnqykc = j13;
            this.f27665gxszxtbevo = (byte) (this.f27665gxszxtbevo | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg zoijcleaow(String str) {
            this.f27667ppxfxbqfkf = str;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow
    public long eablkybsjg() {
        return this.f27660iobyxmoadg;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow abstractC0518zoijcleaow = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow) obj;
        return this.f27660iobyxmoadg == abstractC0518zoijcleaow.eablkybsjg() && this.f27663zoijcleaow.equals(abstractC0518zoijcleaow.gxszxtbevo()) && ((str = this.f27661ppxfxbqfkf) != null ? str.equals(abstractC0518zoijcleaow.zoijcleaow()) : abstractC0518zoijcleaow.zoijcleaow() == null) && this.f27662wkgbmnqykc == abstractC0518zoijcleaow.wkgbmnqykc() && this.f27659eablkybsjg == abstractC0518zoijcleaow.ppxfxbqfkf();
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow
    public String gxszxtbevo() {
        return this.f27663zoijcleaow;
    }

    public int hashCode() {
        long j13 = this.f27660iobyxmoadg;
        int iHashCode = (((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ this.f27663zoijcleaow.hashCode()) * 1000003;
        String str = this.f27661ppxfxbqfkf;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j14 = this.f27662wkgbmnqykc;
        return ((iHashCode2 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f27659eablkybsjg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow
    public int ppxfxbqfkf() {
        return this.f27659eablkybsjg;
    }

    public String toString() {
        return "Frame{pc=" + this.f27660iobyxmoadg + ", symbol=" + this.f27663zoijcleaow + ", file=" + this.f27661ppxfxbqfkf + ", offset=" + this.f27662wkgbmnqykc + ", importance=" + this.f27659eablkybsjg + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow
    public long wkgbmnqykc() {
        return this.f27662wkgbmnqykc;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow
    public String zoijcleaow() {
        return this.f27661ppxfxbqfkf;
    }

    private kcexrzcfyt(long j13, String str, String str2, long j14, int i13) {
        this.f27660iobyxmoadg = j13;
        this.f27663zoijcleaow = str;
        this.f27661ppxfxbqfkf = str2;
        this.f27662wkgbmnqykc = j14;
        this.f27659eablkybsjg = i13;
    }
}
