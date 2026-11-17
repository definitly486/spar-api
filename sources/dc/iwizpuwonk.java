package dc;

/* JADX INFO: loaded from: classes2.dex */
final class iwizpuwonk extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow f27648iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27649ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f27650wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27651zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private byte f27652eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow f27653iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f27654ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f27655wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27656zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg eablkybsjg(long j13) {
            this.f27655wkgbmnqykc = j13;
            this.f27652eablkybsjg = (byte) (this.f27652eablkybsjg | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg iobyxmoadg() {
            iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow zoijcleaowVar;
            String str;
            String str2;
            if (this.f27652eablkybsjg == 1 && (zoijcleaowVar = this.f27653iobyxmoadg) != null && (str = this.f27656zoijcleaow) != null && (str2 = this.f27654ppxfxbqfkf) != null) {
                return new iwizpuwonk(zoijcleaowVar, str, str2, this.f27655wkgbmnqykc);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27653iobyxmoadg == null) {
                sb3.append(" rolloutVariant");
            }
            if (this.f27656zoijcleaow == null) {
                sb3.append(" parameterKey");
            }
            if (this.f27654ppxfxbqfkf == null) {
                sb3.append(" parameterValue");
            }
            if ((1 & this.f27652eablkybsjg) == 0) {
                sb3.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f27654ppxfxbqfkf = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg wkgbmnqykc(iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f27653iobyxmoadg = zoijcleaowVar;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f27656zoijcleaow = str;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg
    public long eablkybsjg() {
        return this.f27650wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg abstractC0513eablkybsjg = (iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg) obj;
        return this.f27648iobyxmoadg.equals(abstractC0513eablkybsjg.wkgbmnqykc()) && this.f27651zoijcleaow.equals(abstractC0513eablkybsjg.zoijcleaow()) && this.f27649ppxfxbqfkf.equals(abstractC0513eablkybsjg.ppxfxbqfkf()) && this.f27650wkgbmnqykc == abstractC0513eablkybsjg.eablkybsjg();
    }

    public int hashCode() {
        int iHashCode = (((((this.f27648iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27651zoijcleaow.hashCode()) * 1000003) ^ this.f27649ppxfxbqfkf.hashCode()) * 1000003;
        long j13 = this.f27650wkgbmnqykc;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg
    public String ppxfxbqfkf() {
        return this.f27649ppxfxbqfkf;
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f27648iobyxmoadg + ", parameterKey=" + this.f27651zoijcleaow + ", parameterValue=" + this.f27649ppxfxbqfkf + ", templateVersion=" + this.f27650wkgbmnqykc + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow wkgbmnqykc() {
        return this.f27648iobyxmoadg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg
    public String zoijcleaow() {
        return this.f27651zoijcleaow;
    }

    private iwizpuwonk(iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow zoijcleaowVar, String str, String str2, long j13) {
        this.f27648iobyxmoadg = zoijcleaowVar;
        this.f27651zoijcleaow = str;
        this.f27649ppxfxbqfkf = str2;
        this.f27650wkgbmnqykc = j13;
    }
}
