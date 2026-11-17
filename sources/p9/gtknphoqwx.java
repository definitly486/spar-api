package p9;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class gtknphoqwx extends yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f76056eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f76057gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f76058iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final cqumvgiudr f76059lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ojitshcjhn f76060ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f76061wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f76062zoijcleaow;

    static final class zoijcleaow extends yggfygwlhe.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f76063eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private List f76064gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Long f76065iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private cqumvgiudr f76066lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private ojitshcjhn f76067ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Integer f76068wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Long f76069zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        yggfygwlhe.iobyxmoadg eablkybsjg(String str) {
            this.f76063eablkybsjg = str;
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe.iobyxmoadg gxszxtbevo(cqumvgiudr cqumvgiudrVar) {
            this.f76066lqeggnwhkg = cqumvgiudrVar;
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe iobyxmoadg() {
            String str = "";
            if (this.f76065iobyxmoadg == null) {
                str = " requestTimeMs";
            }
            if (this.f76069zoijcleaow == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new gtknphoqwx(this.f76065iobyxmoadg.longValue(), this.f76069zoijcleaow.longValue(), this.f76067ppxfxbqfkf, this.f76068wkgbmnqykc, this.f76063eablkybsjg, this.f76064gxszxtbevo, this.f76066lqeggnwhkg);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe.iobyxmoadg lqeggnwhkg(long j13) {
            this.f76065iobyxmoadg = Long.valueOf(j13);
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe.iobyxmoadg nufgyqmvbu(long j13) {
            this.f76069zoijcleaow = Long.valueOf(j13);
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe.iobyxmoadg ppxfxbqfkf(List list) {
            this.f76064gxszxtbevo = list;
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        yggfygwlhe.iobyxmoadg wkgbmnqykc(Integer num) {
            this.f76068wkgbmnqykc = num;
            return this;
        }

        @Override // p9.yggfygwlhe.iobyxmoadg
        public yggfygwlhe.iobyxmoadg zoijcleaow(ojitshcjhn ojitshcjhnVar) {
            this.f76067ppxfxbqfkf = ojitshcjhnVar;
            return this;
        }
    }

    @Override // p9.yggfygwlhe
    public String eablkybsjg() {
        return this.f76056eablkybsjg;
    }

    public boolean equals(Object obj) {
        ojitshcjhn ojitshcjhnVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        if (this.f76058iobyxmoadg == yggfygwlheVar.lqeggnwhkg() && this.f76062zoijcleaow == yggfygwlheVar.nufgyqmvbu() && ((ojitshcjhnVar = this.f76060ppxfxbqfkf) != null ? ojitshcjhnVar.equals(yggfygwlheVar.zoijcleaow()) : yggfygwlheVar.zoijcleaow() == null) && ((num = this.f76061wkgbmnqykc) != null ? num.equals(yggfygwlheVar.wkgbmnqykc()) : yggfygwlheVar.wkgbmnqykc() == null) && ((str = this.f76056eablkybsjg) != null ? str.equals(yggfygwlheVar.eablkybsjg()) : yggfygwlheVar.eablkybsjg() == null) && ((list = this.f76057gxszxtbevo) != null ? list.equals(yggfygwlheVar.ppxfxbqfkf()) : yggfygwlheVar.ppxfxbqfkf() == null)) {
            cqumvgiudr cqumvgiudrVar = this.f76059lqeggnwhkg;
            if (cqumvgiudrVar == null) {
                if (yggfygwlheVar.gxszxtbevo() == null) {
                    return true;
                }
            } else if (cqumvgiudrVar.equals(yggfygwlheVar.gxszxtbevo())) {
                return true;
            }
        }
        return false;
    }

    @Override // p9.yggfygwlhe
    public cqumvgiudr gxszxtbevo() {
        return this.f76059lqeggnwhkg;
    }

    public int hashCode() {
        long j13 = this.f76058iobyxmoadg;
        long j14 = this.f76062zoijcleaow;
        int i13 = (((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003;
        ojitshcjhn ojitshcjhnVar = this.f76060ppxfxbqfkf;
        int iHashCode = (i13 ^ (ojitshcjhnVar == null ? 0 : ojitshcjhnVar.hashCode())) * 1000003;
        Integer num = this.f76061wkgbmnqykc;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f76056eablkybsjg;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f76057gxszxtbevo;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        cqumvgiudr cqumvgiudrVar = this.f76059lqeggnwhkg;
        return iHashCode4 ^ (cqumvgiudrVar != null ? cqumvgiudrVar.hashCode() : 0);
    }

    @Override // p9.yggfygwlhe
    public long lqeggnwhkg() {
        return this.f76058iobyxmoadg;
    }

    @Override // p9.yggfygwlhe
    public long nufgyqmvbu() {
        return this.f76062zoijcleaow;
    }

    @Override // p9.yggfygwlhe
    public List ppxfxbqfkf() {
        return this.f76057gxszxtbevo;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f76058iobyxmoadg + ", requestUptimeMs=" + this.f76062zoijcleaow + ", clientInfo=" + this.f76060ppxfxbqfkf + ", logSource=" + this.f76061wkgbmnqykc + ", logSourceName=" + this.f76056eablkybsjg + ", logEvents=" + this.f76057gxszxtbevo + ", qosTier=" + this.f76059lqeggnwhkg + "}";
    }

    @Override // p9.yggfygwlhe
    public Integer wkgbmnqykc() {
        return this.f76061wkgbmnqykc;
    }

    @Override // p9.yggfygwlhe
    public ojitshcjhn zoijcleaow() {
        return this.f76060ppxfxbqfkf;
    }

    private gtknphoqwx(long j13, long j14, ojitshcjhn ojitshcjhnVar, Integer num, String str, List list, cqumvgiudr cqumvgiudrVar) {
        this.f76058iobyxmoadg = j13;
        this.f76062zoijcleaow = j14;
        this.f76060ppxfxbqfkf = ojitshcjhnVar;
        this.f76061wkgbmnqykc = num;
        this.f76056eablkybsjg = str;
        this.f76057gxszxtbevo = list;
        this.f76059lqeggnwhkg = cqumvgiudrVar;
    }
}
