package wc;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc.zoijcleaow f119260eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119261iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119262ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f119263wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119264zoijcleaow;

    static final class zoijcleaow extends wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private wkgbmnqykc.zoijcleaow f119265eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f119266iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f119267ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private gxszxtbevo f119268wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f119269zoijcleaow;

        zoijcleaow() {
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg eablkybsjg(wkgbmnqykc.zoijcleaow zoijcleaowVar) {
            this.f119265eablkybsjg = zoijcleaowVar;
            return this;
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg gxszxtbevo(String str) {
            this.f119266iobyxmoadg = str;
            return this;
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc iobyxmoadg() {
            return new iobyxmoadg(this.f119266iobyxmoadg, this.f119269zoijcleaow, this.f119267ppxfxbqfkf, this.f119268wkgbmnqykc, this.f119265eablkybsjg);
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg ppxfxbqfkf(String str) {
            this.f119269zoijcleaow = str;
            return this;
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg wkgbmnqykc(String str) {
            this.f119267ppxfxbqfkf = str;
            return this;
        }

        @Override // wc.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            this.f119268wkgbmnqykc = gxszxtbevoVar;
            return this;
        }
    }

    @Override // wc.wkgbmnqykc
    public wkgbmnqykc.zoijcleaow eablkybsjg() {
        return this.f119260eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        String str = this.f119261iobyxmoadg;
        if (str != null ? str.equals(wkgbmnqykcVar.gxszxtbevo()) : wkgbmnqykcVar.gxszxtbevo() == null) {
            String str2 = this.f119264zoijcleaow;
            if (str2 != null ? str2.equals(wkgbmnqykcVar.ppxfxbqfkf()) : wkgbmnqykcVar.ppxfxbqfkf() == null) {
                String str3 = this.f119262ppxfxbqfkf;
                if (str3 != null ? str3.equals(wkgbmnqykcVar.wkgbmnqykc()) : wkgbmnqykcVar.wkgbmnqykc() == null) {
                    gxszxtbevo gxszxtbevoVar = this.f119263wkgbmnqykc;
                    if (gxszxtbevoVar != null ? gxszxtbevoVar.equals(wkgbmnqykcVar.zoijcleaow()) : wkgbmnqykcVar.zoijcleaow() == null) {
                        wkgbmnqykc.zoijcleaow zoijcleaowVar = this.f119260eablkybsjg;
                        if (zoijcleaowVar == null) {
                            if (wkgbmnqykcVar.eablkybsjg() == null) {
                                return true;
                            }
                        } else if (zoijcleaowVar.equals(wkgbmnqykcVar.eablkybsjg())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // wc.wkgbmnqykc
    public String gxszxtbevo() {
        return this.f119261iobyxmoadg;
    }

    public int hashCode() {
        String str = this.f119261iobyxmoadg;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f119264zoijcleaow;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f119262ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gxszxtbevo gxszxtbevoVar = this.f119263wkgbmnqykc;
        int iHashCode4 = (iHashCode3 ^ (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode())) * 1000003;
        wkgbmnqykc.zoijcleaow zoijcleaowVar = this.f119260eablkybsjg;
        return iHashCode4 ^ (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    @Override // wc.wkgbmnqykc
    public String ppxfxbqfkf() {
        return this.f119264zoijcleaow;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f119261iobyxmoadg + ", fid=" + this.f119264zoijcleaow + ", refreshToken=" + this.f119262ppxfxbqfkf + ", authToken=" + this.f119263wkgbmnqykc + ", responseCode=" + this.f119260eablkybsjg + "}";
    }

    @Override // wc.wkgbmnqykc
    public String wkgbmnqykc() {
        return this.f119262ppxfxbqfkf;
    }

    @Override // wc.wkgbmnqykc
    public gxszxtbevo zoijcleaow() {
        return this.f119263wkgbmnqykc;
    }

    private iobyxmoadg(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar, wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        this.f119261iobyxmoadg = str;
        this.f119264zoijcleaow = str2;
        this.f119262ppxfxbqfkf = str3;
        this.f119263wkgbmnqykc = gxszxtbevoVar;
        this.f119260eablkybsjg = zoijcleaowVar;
    }
}
