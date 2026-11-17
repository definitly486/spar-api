package vc;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f116465eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f116466gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f116467lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f116468nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf.iobyxmoadg f116469ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f116470wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f116471zoijcleaow;

    static final class zoijcleaow extends wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Long f116472eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Long f116473gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f116474iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private String f116475lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f116476ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f116477wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ppxfxbqfkf.iobyxmoadg f116478zoijcleaow;

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg eablkybsjg(String str) {
            this.f116475lqeggnwhkg = str;
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg gxszxtbevo(String str) {
            this.f116477wkgbmnqykc = str;
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc iobyxmoadg() {
            String str = "";
            if (this.f116478zoijcleaow == null) {
                str = " registrationStatus";
            }
            if (this.f116472eablkybsjg == null) {
                str = str + " expiresInSecs";
            }
            if (this.f116473gxszxtbevo == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new iobyxmoadg(this.f116474iobyxmoadg, this.f116478zoijcleaow, this.f116476ppxfxbqfkf, this.f116477wkgbmnqykc, this.f116472eablkybsjg.longValue(), this.f116473gxszxtbevo.longValue(), this.f116475lqeggnwhkg);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg lqeggnwhkg(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f116478zoijcleaow = iobyxmoadgVar;
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg nufgyqmvbu(long j13) {
            this.f116473gxszxtbevo = Long.valueOf(j13);
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg ppxfxbqfkf(long j13) {
            this.f116472eablkybsjg = Long.valueOf(j13);
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg wkgbmnqykc(String str) {
            this.f116474iobyxmoadg = str;
            return this;
        }

        @Override // vc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg zoijcleaow(String str) {
            this.f116476ppxfxbqfkf = str;
            return this;
        }

        zoijcleaow() {
        }

        private zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
            this.f116474iobyxmoadg = wkgbmnqykcVar.wkgbmnqykc();
            this.f116478zoijcleaow = wkgbmnqykcVar.lqeggnwhkg();
            this.f116476ppxfxbqfkf = wkgbmnqykcVar.zoijcleaow();
            this.f116477wkgbmnqykc = wkgbmnqykcVar.gxszxtbevo();
            this.f116472eablkybsjg = Long.valueOf(wkgbmnqykcVar.ppxfxbqfkf());
            this.f116473gxszxtbevo = Long.valueOf(wkgbmnqykcVar.nufgyqmvbu());
            this.f116475lqeggnwhkg = wkgbmnqykcVar.eablkybsjg();
        }
    }

    @Override // vc.wkgbmnqykc
    public wkgbmnqykc.iobyxmoadg agtfadlqog() {
        return new zoijcleaow(this);
    }

    @Override // vc.wkgbmnqykc
    public String eablkybsjg() {
        return this.f116468nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        String str3 = this.f116471zoijcleaow;
        if (str3 != null ? str3.equals(wkgbmnqykcVar.wkgbmnqykc()) : wkgbmnqykcVar.wkgbmnqykc() == null) {
            if (this.f116469ppxfxbqfkf.equals(wkgbmnqykcVar.lqeggnwhkg()) && ((str = this.f116470wkgbmnqykc) != null ? str.equals(wkgbmnqykcVar.zoijcleaow()) : wkgbmnqykcVar.zoijcleaow() == null) && ((str2 = this.f116465eablkybsjg) != null ? str2.equals(wkgbmnqykcVar.gxszxtbevo()) : wkgbmnqykcVar.gxszxtbevo() == null) && this.f116466gxszxtbevo == wkgbmnqykcVar.ppxfxbqfkf() && this.f116467lqeggnwhkg == wkgbmnqykcVar.nufgyqmvbu()) {
                String str4 = this.f116468nufgyqmvbu;
                if (str4 == null) {
                    if (wkgbmnqykcVar.eablkybsjg() == null) {
                        return true;
                    }
                } else if (str4.equals(wkgbmnqykcVar.eablkybsjg())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // vc.wkgbmnqykc
    public String gxszxtbevo() {
        return this.f116465eablkybsjg;
    }

    public int hashCode() {
        String str = this.f116471zoijcleaow;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f116469ppxfxbqfkf.hashCode()) * 1000003;
        String str2 = this.f116470wkgbmnqykc;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f116465eablkybsjg;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j13 = this.f116466gxszxtbevo;
        int i13 = (iHashCode3 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f116467lqeggnwhkg;
        int i14 = (i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        String str4 = this.f116468nufgyqmvbu;
        return i14 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // vc.wkgbmnqykc
    public ppxfxbqfkf.iobyxmoadg lqeggnwhkg() {
        return this.f116469ppxfxbqfkf;
    }

    @Override // vc.wkgbmnqykc
    public long nufgyqmvbu() {
        return this.f116467lqeggnwhkg;
    }

    @Override // vc.wkgbmnqykc
    public long ppxfxbqfkf() {
        return this.f116466gxszxtbevo;
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f116471zoijcleaow + ", registrationStatus=" + this.f116469ppxfxbqfkf + ", authToken=" + this.f116470wkgbmnqykc + ", refreshToken=" + this.f116465eablkybsjg + ", expiresInSecs=" + this.f116466gxszxtbevo + ", tokenCreationEpochInSecs=" + this.f116467lqeggnwhkg + ", fisError=" + this.f116468nufgyqmvbu + "}";
    }

    @Override // vc.wkgbmnqykc
    public String wkgbmnqykc() {
        return this.f116471zoijcleaow;
    }

    @Override // vc.wkgbmnqykc
    public String zoijcleaow() {
        return this.f116470wkgbmnqykc;
    }

    private iobyxmoadg(String str, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, String str2, String str3, long j13, long j14, String str4) {
        this.f116471zoijcleaow = str;
        this.f116469ppxfxbqfkf = iobyxmoadgVar;
        this.f116470wkgbmnqykc = str2;
        this.f116465eablkybsjg = str3;
        this.f116466gxszxtbevo = j13;
        this.f116467lqeggnwhkg = j14;
        this.f116468nufgyqmvbu = str4;
    }
}
