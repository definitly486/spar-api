package dc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends iozdgvuglv.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f27726dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f27727eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f27728gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f27729iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f27730lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f27731nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f27732ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f27733wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27734zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.iobyxmoadg.zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private byte f27735btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private List f27736dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f27737eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f27738gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f27739iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f27740lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private String f27741nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f27742ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f27743wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27744zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow btonecajqb(String str) {
            this.f27741nufgyqmvbu = str;
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow dxjokdxxww(long j13) {
            this.f27740lqeggnwhkg = j13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 32);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow eablkybsjg(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f27744zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow gxszxtbevo(long j13) {
            this.f27737eablkybsjg = j13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 8);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg iobyxmoadg() {
            String str;
            if (this.f27735btonecajqb == 63 && (str = this.f27744zoijcleaow) != null) {
                return new ppxfxbqfkf(this.f27739iobyxmoadg, str, this.f27742ppxfxbqfkf, this.f27743wkgbmnqykc, this.f27737eablkybsjg, this.f27738gxszxtbevo, this.f27740lqeggnwhkg, this.f27741nufgyqmvbu, this.f27736dxjokdxxww);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27735btonecajqb & 1) == 0) {
                sb3.append(" pid");
            }
            if (this.f27744zoijcleaow == null) {
                sb3.append(" processName");
            }
            if ((this.f27735btonecajqb & 2) == 0) {
                sb3.append(" reasonCode");
            }
            if ((this.f27735btonecajqb & 4) == 0) {
                sb3.append(" importance");
            }
            if ((this.f27735btonecajqb & 8) == 0) {
                sb3.append(" pss");
            }
            if ((this.f27735btonecajqb & 16) == 0) {
                sb3.append(" rss");
            }
            if ((this.f27735btonecajqb & 32) == 0) {
                sb3.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow lqeggnwhkg(int i13) {
            this.f27742ppxfxbqfkf = i13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow nufgyqmvbu(long j13) {
            this.f27738gxszxtbevo = j13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 16);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow ppxfxbqfkf(int i13) {
            this.f27743wkgbmnqykc = i13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 4);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow wkgbmnqykc(int i13) {
            this.f27739iobyxmoadg = i13;
            this.f27735btonecajqb = (byte) (this.f27735btonecajqb | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.iobyxmoadg.zoijcleaow
        public iozdgvuglv.iobyxmoadg.zoijcleaow zoijcleaow(List list) {
            this.f27736dxjokdxxww = list;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public String btonecajqb() {
        return this.f27731nufgyqmvbu;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public long dxjokdxxww() {
        return this.f27730lqeggnwhkg;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public String eablkybsjg() {
        return this.f27734zoijcleaow;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.iobyxmoadg)) {
            return false;
        }
        iozdgvuglv.iobyxmoadg iobyxmoadgVar = (iozdgvuglv.iobyxmoadg) obj;
        if (this.f27729iobyxmoadg == iobyxmoadgVar.wkgbmnqykc() && this.f27734zoijcleaow.equals(iobyxmoadgVar.eablkybsjg()) && this.f27732ppxfxbqfkf == iobyxmoadgVar.lqeggnwhkg() && this.f27733wkgbmnqykc == iobyxmoadgVar.ppxfxbqfkf() && this.f27727eablkybsjg == iobyxmoadgVar.gxszxtbevo() && this.f27728gxszxtbevo == iobyxmoadgVar.nufgyqmvbu() && this.f27730lqeggnwhkg == iobyxmoadgVar.dxjokdxxww() && ((str = this.f27731nufgyqmvbu) != null ? str.equals(iobyxmoadgVar.btonecajqb()) : iobyxmoadgVar.btonecajqb() == null)) {
            List list = this.f27726dxjokdxxww;
            if (list == null) {
                if (iobyxmoadgVar.zoijcleaow() == null) {
                    return true;
                }
            } else if (list.equals(iobyxmoadgVar.zoijcleaow())) {
                return true;
            }
        }
        return false;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public long gxszxtbevo() {
        return this.f27727eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f27729iobyxmoadg ^ 1000003) * 1000003) ^ this.f27734zoijcleaow.hashCode()) * 1000003) ^ this.f27732ppxfxbqfkf) * 1000003) ^ this.f27733wkgbmnqykc) * 1000003;
        long j13 = this.f27727eablkybsjg;
        int i13 = (iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f27728gxszxtbevo;
        int i14 = (i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.f27730lqeggnwhkg;
        int i15 = (i14 ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003;
        String str = this.f27731nufgyqmvbu;
        int iHashCode2 = (i15 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f27726dxjokdxxww;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public int lqeggnwhkg() {
        return this.f27732ppxfxbqfkf;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public long nufgyqmvbu() {
        return this.f27728gxszxtbevo;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public int ppxfxbqfkf() {
        return this.f27733wkgbmnqykc;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f27729iobyxmoadg + ", processName=" + this.f27734zoijcleaow + ", reasonCode=" + this.f27732ppxfxbqfkf + ", importance=" + this.f27733wkgbmnqykc + ", pss=" + this.f27727eablkybsjg + ", rss=" + this.f27728gxszxtbevo + ", timestamp=" + this.f27730lqeggnwhkg + ", traceFile=" + this.f27731nufgyqmvbu + ", buildIdMappingForArch=" + this.f27726dxjokdxxww + "}";
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public int wkgbmnqykc() {
        return this.f27729iobyxmoadg;
    }

    @Override // dc.iozdgvuglv.iobyxmoadg
    public List zoijcleaow() {
        return this.f27726dxjokdxxww;
    }

    private ppxfxbqfkf(int i13, String str, int i14, int i15, long j13, long j14, long j15, String str2, List list) {
        this.f27729iobyxmoadg = i13;
        this.f27734zoijcleaow = str;
        this.f27732ppxfxbqfkf = i14;
        this.f27733wkgbmnqykc = i15;
        this.f27727eablkybsjg = j13;
        this.f27728gxszxtbevo = j14;
        this.f27730lqeggnwhkg = j15;
        this.f27731nufgyqmvbu = str2;
        this.f27726dxjokdxxww = list;
    }
}
