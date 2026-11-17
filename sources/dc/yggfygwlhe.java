package dc;

/* JADX INFO: loaded from: classes2.dex */
final class yggfygwlhe extends iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f27787eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f27788gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Double f27789iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f27790ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f27791wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f27792zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f27793eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f27794gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Double f27795iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private byte f27796lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f27797ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f27798wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f27799zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg eablkybsjg(int i13) {
            this.f27798wkgbmnqykc = i13;
            this.f27796lqeggnwhkg = (byte) (this.f27796lqeggnwhkg | 4);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg gxszxtbevo(boolean z13) {
            this.f27797ppxfxbqfkf = z13;
            this.f27796lqeggnwhkg = (byte) (this.f27796lqeggnwhkg | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf iobyxmoadg() {
            if (this.f27796lqeggnwhkg == 31) {
                return new yggfygwlhe(this.f27795iobyxmoadg, this.f27799zoijcleaow, this.f27797ppxfxbqfkf, this.f27798wkgbmnqykc, this.f27793eablkybsjg, this.f27794gxszxtbevo);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27796lqeggnwhkg & 1) == 0) {
                sb3.append(" batteryVelocity");
            }
            if ((this.f27796lqeggnwhkg & 2) == 0) {
                sb3.append(" proximityOn");
            }
            if ((this.f27796lqeggnwhkg & 4) == 0) {
                sb3.append(" orientation");
            }
            if ((this.f27796lqeggnwhkg & 8) == 0) {
                sb3.append(" ramUsed");
            }
            if ((this.f27796lqeggnwhkg & 16) == 0) {
                sb3.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg lqeggnwhkg(long j13) {
            this.f27793eablkybsjg = j13;
            this.f27796lqeggnwhkg = (byte) (this.f27796lqeggnwhkg | 8);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg ppxfxbqfkf(int i13) {
            this.f27799zoijcleaow = i13;
            this.f27796lqeggnwhkg = (byte) (this.f27796lqeggnwhkg | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg wkgbmnqykc(long j13) {
            this.f27794gxszxtbevo = j13;
            this.f27796lqeggnwhkg = (byte) (this.f27796lqeggnwhkg | 16);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg zoijcleaow(Double d13) {
            this.f27795iobyxmoadg = d13;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public int eablkybsjg() {
        return this.f27791wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf) obj;
        Double d13 = this.f27789iobyxmoadg;
        if (d13 != null ? d13.equals(ppxfxbqfkfVar.zoijcleaow()) : ppxfxbqfkfVar.zoijcleaow() == null) {
            if (this.f27792zoijcleaow == ppxfxbqfkfVar.ppxfxbqfkf() && this.f27790ppxfxbqfkf == ppxfxbqfkfVar.lqeggnwhkg() && this.f27791wkgbmnqykc == ppxfxbqfkfVar.eablkybsjg() && this.f27787eablkybsjg == ppxfxbqfkfVar.gxszxtbevo() && this.f27788gxszxtbevo == ppxfxbqfkfVar.wkgbmnqykc()) {
                return true;
            }
        }
        return false;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public long gxszxtbevo() {
        return this.f27787eablkybsjg;
    }

    public int hashCode() {
        Double d13 = this.f27789iobyxmoadg;
        int iHashCode = ((((((((d13 == null ? 0 : d13.hashCode()) ^ 1000003) * 1000003) ^ this.f27792zoijcleaow) * 1000003) ^ (this.f27790ppxfxbqfkf ? 1231 : 1237)) * 1000003) ^ this.f27791wkgbmnqykc) * 1000003;
        long j13 = this.f27787eablkybsjg;
        long j14 = this.f27788gxszxtbevo;
        return ((iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)));
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public boolean lqeggnwhkg() {
        return this.f27790ppxfxbqfkf;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public int ppxfxbqfkf() {
        return this.f27792zoijcleaow;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f27789iobyxmoadg + ", batteryVelocity=" + this.f27792zoijcleaow + ", proximityOn=" + this.f27790ppxfxbqfkf + ", orientation=" + this.f27791wkgbmnqykc + ", ramUsed=" + this.f27787eablkybsjg + ", diskUsed=" + this.f27788gxszxtbevo + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public long wkgbmnqykc() {
        return this.f27788gxszxtbevo;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf
    public Double zoijcleaow() {
        return this.f27789iobyxmoadg;
    }

    private yggfygwlhe(Double d13, int i13, boolean z13, int i14, long j13, long j14) {
        this.f27789iobyxmoadg = d13;
        this.f27792zoijcleaow = i13;
        this.f27790ppxfxbqfkf = z13;
        this.f27791wkgbmnqykc = i14;
        this.f27787eablkybsjg = j13;
        this.f27788gxszxtbevo = j14;
    }
}
