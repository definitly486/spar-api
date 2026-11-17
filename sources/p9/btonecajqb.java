package p9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class btonecajqb extends zdlpuopuiu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vdvldrhtss f76022dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final byte[] f76023eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f76024gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f76025iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f76026lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iwizpuwonk f76027nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq f76028ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f76029wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f76030zoijcleaow;

    static final class zoijcleaow extends zdlpuopuiu.iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private vdvldrhtss f76031dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private byte[] f76032eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private String f76033gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Long f76034iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private Long f76035lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private iwizpuwonk f76036nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private rgvfuqvkyq f76037ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Long f76038wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f76039zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg btonecajqb(long j13) {
            this.f76035lqeggnwhkg = Long.valueOf(j13);
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        zdlpuopuiu.iobyxmoadg dxjokdxxww(String str) {
            this.f76033gxszxtbevo = str;
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg eablkybsjg(long j13) {
            this.f76038wkgbmnqykc = Long.valueOf(j13);
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
            this.f76031dxjokdxxww = vdvldrhtssVar;
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu iobyxmoadg() {
            String str = "";
            if (this.f76034iobyxmoadg == null) {
                str = " eventTimeMs";
            }
            if (this.f76038wkgbmnqykc == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f76035lqeggnwhkg == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new btonecajqb(this.f76034iobyxmoadg.longValue(), this.f76039zoijcleaow, this.f76037ppxfxbqfkf, this.f76038wkgbmnqykc.longValue(), this.f76032eablkybsjg, this.f76033gxszxtbevo, this.f76035lqeggnwhkg.longValue(), this.f76036nufgyqmvbu, this.f76031dxjokdxxww);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg lqeggnwhkg(iwizpuwonk iwizpuwonkVar) {
            this.f76036nufgyqmvbu = iwizpuwonkVar;
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        zdlpuopuiu.iobyxmoadg nufgyqmvbu(byte[] bArr) {
            this.f76032eablkybsjg = bArr;
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg ppxfxbqfkf(Integer num) {
            this.f76039zoijcleaow = num;
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg wkgbmnqykc(long j13) {
            this.f76034iobyxmoadg = Long.valueOf(j13);
            return this;
        }

        @Override // p9.zdlpuopuiu.iobyxmoadg
        public zdlpuopuiu.iobyxmoadg zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f76037ppxfxbqfkf = rgvfuqvkyqVar;
            return this;
        }
    }

    @Override // p9.zdlpuopuiu
    public long btonecajqb() {
        return this.f76026lqeggnwhkg;
    }

    @Override // p9.zdlpuopuiu
    public String dxjokdxxww() {
        return this.f76024gxszxtbevo;
    }

    @Override // p9.zdlpuopuiu
    public long eablkybsjg() {
        return this.f76029wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        Integer num;
        rgvfuqvkyq rgvfuqvkyqVar;
        String str;
        iwizpuwonk iwizpuwonkVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdlpuopuiu)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
        if (this.f76025iobyxmoadg == zdlpuopuiuVar.wkgbmnqykc() && ((num = this.f76030zoijcleaow) != null ? num.equals(zdlpuopuiuVar.ppxfxbqfkf()) : zdlpuopuiuVar.ppxfxbqfkf() == null) && ((rgvfuqvkyqVar = this.f76028ppxfxbqfkf) != null ? rgvfuqvkyqVar.equals(zdlpuopuiuVar.zoijcleaow()) : zdlpuopuiuVar.zoijcleaow() == null) && this.f76029wkgbmnqykc == zdlpuopuiuVar.eablkybsjg()) {
            if (Arrays.equals(this.f76023eablkybsjg, zdlpuopuiuVar instanceof btonecajqb ? ((btonecajqb) zdlpuopuiuVar).f76023eablkybsjg : zdlpuopuiuVar.nufgyqmvbu()) && ((str = this.f76024gxszxtbevo) != null ? str.equals(zdlpuopuiuVar.dxjokdxxww()) : zdlpuopuiuVar.dxjokdxxww() == null) && this.f76026lqeggnwhkg == zdlpuopuiuVar.btonecajqb() && ((iwizpuwonkVar = this.f76027nufgyqmvbu) != null ? iwizpuwonkVar.equals(zdlpuopuiuVar.lqeggnwhkg()) : zdlpuopuiuVar.lqeggnwhkg() == null)) {
                vdvldrhtss vdvldrhtssVar = this.f76022dxjokdxxww;
                if (vdvldrhtssVar == null) {
                    if (zdlpuopuiuVar.gxszxtbevo() == null) {
                        return true;
                    }
                } else if (vdvldrhtssVar.equals(zdlpuopuiuVar.gxszxtbevo())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p9.zdlpuopuiu
    public vdvldrhtss gxszxtbevo() {
        return this.f76022dxjokdxxww;
    }

    public int hashCode() {
        long j13 = this.f76025iobyxmoadg;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f76030zoijcleaow;
        int iHashCode = (i13 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        rgvfuqvkyq rgvfuqvkyqVar = this.f76028ppxfxbqfkf;
        int iHashCode2 = rgvfuqvkyqVar == null ? 0 : rgvfuqvkyqVar.hashCode();
        long j14 = this.f76029wkgbmnqykc;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f76023eablkybsjg)) * 1000003;
        String str = this.f76024gxszxtbevo;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j15 = this.f76026lqeggnwhkg;
        int i14 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j15 >>> 32) ^ j15))) * 1000003;
        iwizpuwonk iwizpuwonkVar = this.f76027nufgyqmvbu;
        int iHashCode5 = (i14 ^ (iwizpuwonkVar == null ? 0 : iwizpuwonkVar.hashCode())) * 1000003;
        vdvldrhtss vdvldrhtssVar = this.f76022dxjokdxxww;
        return iHashCode5 ^ (vdvldrhtssVar != null ? vdvldrhtssVar.hashCode() : 0);
    }

    @Override // p9.zdlpuopuiu
    public iwizpuwonk lqeggnwhkg() {
        return this.f76027nufgyqmvbu;
    }

    @Override // p9.zdlpuopuiu
    public byte[] nufgyqmvbu() {
        return this.f76023eablkybsjg;
    }

    @Override // p9.zdlpuopuiu
    public Integer ppxfxbqfkf() {
        return this.f76030zoijcleaow;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f76025iobyxmoadg + ", eventCode=" + this.f76030zoijcleaow + ", complianceData=" + this.f76028ppxfxbqfkf + ", eventUptimeMs=" + this.f76029wkgbmnqykc + ", sourceExtension=" + Arrays.toString(this.f76023eablkybsjg) + ", sourceExtensionJsonProto3=" + this.f76024gxszxtbevo + ", timezoneOffsetSeconds=" + this.f76026lqeggnwhkg + ", networkConnectionInfo=" + this.f76027nufgyqmvbu + ", experimentIds=" + this.f76022dxjokdxxww + "}";
    }

    @Override // p9.zdlpuopuiu
    public long wkgbmnqykc() {
        return this.f76025iobyxmoadg;
    }

    @Override // p9.zdlpuopuiu
    public rgvfuqvkyq zoijcleaow() {
        return this.f76028ppxfxbqfkf;
    }

    private btonecajqb(long j13, Integer num, rgvfuqvkyq rgvfuqvkyqVar, long j14, byte[] bArr, String str, long j15, iwizpuwonk iwizpuwonkVar, vdvldrhtss vdvldrhtssVar) {
        this.f76025iobyxmoadg = j13;
        this.f76030zoijcleaow = num;
        this.f76028ppxfxbqfkf = rgvfuqvkyqVar;
        this.f76029wkgbmnqykc = j14;
        this.f76023eablkybsjg = bArr;
        this.f76024gxszxtbevo = str;
        this.f76026lqeggnwhkg = j15;
        this.f76027nufgyqmvbu = iwizpuwonkVar;
        this.f76022dxjokdxxww = vdvldrhtssVar;
    }
}
