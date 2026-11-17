package dc;

/* JADX INFO: loaded from: classes2.dex */
final class draadjrbmk extends iozdgvuglv.eablkybsjg.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc f27440eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo f27441gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f27442iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg f27443ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf f27444wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27445zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc f27446eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo f27447gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f27448iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private byte f27449lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg f27450ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf f27451wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27452zoijcleaow;

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow eablkybsjg(iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo gxszxtbevoVar) {
            this.f27447gxszxtbevo = gxszxtbevoVar;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow gxszxtbevo(long j13) {
            this.f27448iobyxmoadg = j13;
            this.f27449lqeggnwhkg = (byte) (this.f27449lqeggnwhkg | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc iobyxmoadg() {
            String str;
            iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg iobyxmoadgVar;
            iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar;
            if (this.f27449lqeggnwhkg == 1 && (str = this.f27452zoijcleaow) != null && (iobyxmoadgVar = this.f27450ppxfxbqfkf) != null && (ppxfxbqfkfVar = this.f27451wkgbmnqykc) != null) {
                return new draadjrbmk(this.f27448iobyxmoadg, str, iobyxmoadgVar, ppxfxbqfkfVar, this.f27446eablkybsjg, this.f27447gxszxtbevo);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((1 & this.f27449lqeggnwhkg) == 0) {
                sb3.append(" timestamp");
            }
            if (this.f27452zoijcleaow == null) {
                sb3.append(" type");
            }
            if (this.f27450ppxfxbqfkf == null) {
                sb3.append(" app");
            }
            if (this.f27451wkgbmnqykc == null) {
                sb3.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow lqeggnwhkg(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f27452zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow ppxfxbqfkf(iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f27451wkgbmnqykc = ppxfxbqfkfVar;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow wkgbmnqykc(iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc abstractC0526wkgbmnqykc) {
            this.f27446eablkybsjg = abstractC0526wkgbmnqykc;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow zoijcleaow(iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f27450ppxfxbqfkf = iobyxmoadgVar;
            return this;
        }

        zoijcleaow() {
        }

        private zoijcleaow(iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
            this.f27448iobyxmoadg = wkgbmnqykcVar.gxszxtbevo();
            this.f27452zoijcleaow = wkgbmnqykcVar.lqeggnwhkg();
            this.f27450ppxfxbqfkf = wkgbmnqykcVar.zoijcleaow();
            this.f27451wkgbmnqykc = wkgbmnqykcVar.ppxfxbqfkf();
            this.f27446eablkybsjg = wkgbmnqykcVar.wkgbmnqykc();
            this.f27447gxszxtbevo = wkgbmnqykcVar.eablkybsjg();
            this.f27449lqeggnwhkg = (byte) 1;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo eablkybsjg() {
        return this.f27441gxszxtbevo;
    }

    public boolean equals(Object obj) {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc abstractC0526wkgbmnqykc;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (iozdgvuglv.eablkybsjg.wkgbmnqykc) obj;
        if (this.f27442iobyxmoadg == wkgbmnqykcVar.gxszxtbevo() && this.f27445zoijcleaow.equals(wkgbmnqykcVar.lqeggnwhkg()) && this.f27443ppxfxbqfkf.equals(wkgbmnqykcVar.zoijcleaow()) && this.f27444wkgbmnqykc.equals(wkgbmnqykcVar.ppxfxbqfkf()) && ((abstractC0526wkgbmnqykc = this.f27440eablkybsjg) != null ? abstractC0526wkgbmnqykc.equals(wkgbmnqykcVar.wkgbmnqykc()) : wkgbmnqykcVar.wkgbmnqykc() == null)) {
            iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = this.f27441gxszxtbevo;
            if (gxszxtbevoVar == null) {
                if (wkgbmnqykcVar.eablkybsjg() == null) {
                    return true;
                }
            } else if (gxszxtbevoVar.equals(wkgbmnqykcVar.eablkybsjg())) {
                return true;
            }
        }
        return false;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public long gxszxtbevo() {
        return this.f27442iobyxmoadg;
    }

    public int hashCode() {
        long j13 = this.f27442iobyxmoadg;
        int iHashCode = (((((((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ this.f27445zoijcleaow.hashCode()) * 1000003) ^ this.f27443ppxfxbqfkf.hashCode()) * 1000003) ^ this.f27444wkgbmnqykc.hashCode()) * 1000003;
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc abstractC0526wkgbmnqykc = this.f27440eablkybsjg;
        int iHashCode2 = (iHashCode ^ (abstractC0526wkgbmnqykc == null ? 0 : abstractC0526wkgbmnqykc.hashCode())) * 1000003;
        iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = this.f27441gxszxtbevo;
        return iHashCode2 ^ (gxszxtbevoVar != null ? gxszxtbevoVar.hashCode() : 0);
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public String lqeggnwhkg() {
        return this.f27445zoijcleaow;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow nufgyqmvbu() {
        return new zoijcleaow(this);
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkf() {
        return this.f27444wkgbmnqykc;
    }

    public String toString() {
        return "Event{timestamp=" + this.f27442iobyxmoadg + ", type=" + this.f27445zoijcleaow + ", app=" + this.f27443ppxfxbqfkf + ", device=" + this.f27444wkgbmnqykc + ", log=" + this.f27440eablkybsjg + ", rollouts=" + this.f27441gxszxtbevo + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc wkgbmnqykc() {
        return this.f27440eablkybsjg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg zoijcleaow() {
        return this.f27443ppxfxbqfkf;
    }

    private draadjrbmk(long j13, String str, iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc abstractC0526wkgbmnqykc, iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo gxszxtbevoVar) {
        this.f27442iobyxmoadg = j13;
        this.f27445zoijcleaow = str;
        this.f27443ppxfxbqfkf = iobyxmoadgVar;
        this.f27444wkgbmnqykc = ppxfxbqfkfVar;
        this.f27440eablkybsjg = abstractC0526wkgbmnqykc;
        this.f27441gxszxtbevo = gxszxtbevoVar;
    }
}
