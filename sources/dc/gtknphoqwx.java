package dc;

/* JADX INFO: loaded from: classes2.dex */
final class gtknphoqwx extends iozdgvuglv.eablkybsjg.ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f27471dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f27472eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f27473gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f27474iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f27475lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f27476nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f27477ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f27478wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27479zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private byte f27480btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private String f27481dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f27482eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f27483gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f27484iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f27485lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private String f27486nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f27487ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f27488wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27489zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg btonecajqb(int i13) {
            this.f27485lqeggnwhkg = i13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 32);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg dxjokdxxww(boolean z13) {
            this.f27483gxszxtbevo = z13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 16);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg eablkybsjg(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f27486nufgyqmvbu = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg gxszxtbevo(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f27489zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf iobyxmoadg() {
            String str;
            String str2;
            String str3;
            if (this.f27480btonecajqb == 63 && (str = this.f27489zoijcleaow) != null && (str2 = this.f27486nufgyqmvbu) != null && (str3 = this.f27481dxjokdxxww) != null) {
                return new gtknphoqwx(this.f27484iobyxmoadg, str, this.f27487ppxfxbqfkf, this.f27488wkgbmnqykc, this.f27482eablkybsjg, this.f27483gxszxtbevo, this.f27485lqeggnwhkg, str2, str3);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27480btonecajqb & 1) == 0) {
                sb3.append(" arch");
            }
            if (this.f27489zoijcleaow == null) {
                sb3.append(" model");
            }
            if ((this.f27480btonecajqb & 2) == 0) {
                sb3.append(" cores");
            }
            if ((this.f27480btonecajqb & 4) == 0) {
                sb3.append(" ram");
            }
            if ((this.f27480btonecajqb & 8) == 0) {
                sb3.append(" diskSpace");
            }
            if ((this.f27480btonecajqb & 16) == 0) {
                sb3.append(" simulator");
            }
            if ((this.f27480btonecajqb & 32) == 0) {
                sb3.append(" state");
            }
            if (this.f27486nufgyqmvbu == null) {
                sb3.append(" manufacturer");
            }
            if (this.f27481dxjokdxxww == null) {
                sb3.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg lqeggnwhkg(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f27481dxjokdxxww = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg nufgyqmvbu(long j13) {
            this.f27488wkgbmnqykc = j13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 4);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg ppxfxbqfkf(int i13) {
            this.f27487ppxfxbqfkf = i13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg wkgbmnqykc(long j13) {
            this.f27482eablkybsjg = j13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 8);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg zoijcleaow(int i13) {
            this.f27484iobyxmoadg = i13;
            this.f27480btonecajqb = (byte) (this.f27480btonecajqb | 1);
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public boolean btonecajqb() {
        return this.f27473gxszxtbevo;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public int dxjokdxxww() {
        return this.f27475lqeggnwhkg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public String eablkybsjg() {
        return this.f27476nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.ppxfxbqfkf)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (iozdgvuglv.eablkybsjg.ppxfxbqfkf) obj;
        return this.f27474iobyxmoadg == ppxfxbqfkfVar.zoijcleaow() && this.f27479zoijcleaow.equals(ppxfxbqfkfVar.gxszxtbevo()) && this.f27477ppxfxbqfkf == ppxfxbqfkfVar.ppxfxbqfkf() && this.f27478wkgbmnqykc == ppxfxbqfkfVar.nufgyqmvbu() && this.f27472eablkybsjg == ppxfxbqfkfVar.wkgbmnqykc() && this.f27473gxszxtbevo == ppxfxbqfkfVar.btonecajqb() && this.f27475lqeggnwhkg == ppxfxbqfkfVar.dxjokdxxww() && this.f27476nufgyqmvbu.equals(ppxfxbqfkfVar.eablkybsjg()) && this.f27471dxjokdxxww.equals(ppxfxbqfkfVar.lqeggnwhkg());
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public String gxszxtbevo() {
        return this.f27479zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = (((((this.f27474iobyxmoadg ^ 1000003) * 1000003) ^ this.f27479zoijcleaow.hashCode()) * 1000003) ^ this.f27477ppxfxbqfkf) * 1000003;
        long j13 = this.f27478wkgbmnqykc;
        int i13 = (iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f27472eablkybsjg;
        return ((((((((i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ (this.f27473gxszxtbevo ? 1231 : 1237)) * 1000003) ^ this.f27475lqeggnwhkg) * 1000003) ^ this.f27476nufgyqmvbu.hashCode()) * 1000003) ^ this.f27471dxjokdxxww.hashCode();
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public String lqeggnwhkg() {
        return this.f27471dxjokdxxww;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public long nufgyqmvbu() {
        return this.f27478wkgbmnqykc;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public int ppxfxbqfkf() {
        return this.f27477ppxfxbqfkf;
    }

    public String toString() {
        return "Device{arch=" + this.f27474iobyxmoadg + ", model=" + this.f27479zoijcleaow + ", cores=" + this.f27477ppxfxbqfkf + ", ram=" + this.f27478wkgbmnqykc + ", diskSpace=" + this.f27472eablkybsjg + ", simulator=" + this.f27473gxszxtbevo + ", state=" + this.f27475lqeggnwhkg + ", manufacturer=" + this.f27476nufgyqmvbu + ", modelClass=" + this.f27471dxjokdxxww + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public long wkgbmnqykc() {
        return this.f27472eablkybsjg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf
    public int zoijcleaow() {
        return this.f27474iobyxmoadg;
    }

    private gtknphoqwx(int i13, String str, int i14, long j13, long j14, boolean z13, int i15, String str2, String str3) {
        this.f27474iobyxmoadg = i13;
        this.f27479zoijcleaow = str;
        this.f27477ppxfxbqfkf = i14;
        this.f27478wkgbmnqykc = j13;
        this.f27472eablkybsjg = j14;
        this.f27473gxszxtbevo = z13;
        this.f27475lqeggnwhkg = i15;
        this.f27476nufgyqmvbu = str2;
        this.f27471dxjokdxxww = str3;
    }
}
