package wc;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119278iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo.zoijcleaow f119279ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f119280zoijcleaow;

    /* JADX INFO: renamed from: wc.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2978zoijcleaow extends gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f119281iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private gxszxtbevo.zoijcleaow f119282ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Long f119283zoijcleaow;

        C2978zoijcleaow() {
        }

        @Override // wc.gxszxtbevo.iobyxmoadg
        public gxszxtbevo iobyxmoadg() {
            String str = "";
            if (this.f119283zoijcleaow == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new zoijcleaow(this.f119281iobyxmoadg, this.f119283zoijcleaow.longValue(), this.f119282ppxfxbqfkf);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // wc.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg ppxfxbqfkf(String str) {
            this.f119281iobyxmoadg = str;
            return this;
        }

        @Override // wc.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg wkgbmnqykc(long j13) {
            this.f119283zoijcleaow = Long.valueOf(j13);
            return this;
        }

        @Override // wc.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg zoijcleaow(gxszxtbevo.zoijcleaow zoijcleaowVar) {
            this.f119282ppxfxbqfkf = zoijcleaowVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        String str = this.f119278iobyxmoadg;
        if (str != null ? str.equals(gxszxtbevoVar.ppxfxbqfkf()) : gxszxtbevoVar.ppxfxbqfkf() == null) {
            if (this.f119280zoijcleaow == gxszxtbevoVar.wkgbmnqykc()) {
                gxszxtbevo.zoijcleaow zoijcleaowVar = this.f119279ppxfxbqfkf;
                if (zoijcleaowVar == null) {
                    if (gxszxtbevoVar.zoijcleaow() == null) {
                        return true;
                    }
                } else if (zoijcleaowVar.equals(gxszxtbevoVar.zoijcleaow())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f119278iobyxmoadg;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j13 = this.f119280zoijcleaow;
        int i13 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        gxszxtbevo.zoijcleaow zoijcleaowVar = this.f119279ppxfxbqfkf;
        return i13 ^ (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    @Override // wc.gxszxtbevo
    public String ppxfxbqfkf() {
        return this.f119278iobyxmoadg;
    }

    public String toString() {
        return "TokenResult{token=" + this.f119278iobyxmoadg + ", tokenExpirationTimestamp=" + this.f119280zoijcleaow + ", responseCode=" + this.f119279ppxfxbqfkf + "}";
    }

    @Override // wc.gxszxtbevo
    public long wkgbmnqykc() {
        return this.f119280zoijcleaow;
    }

    @Override // wc.gxszxtbevo
    public gxszxtbevo.zoijcleaow zoijcleaow() {
        return this.f119279ppxfxbqfkf;
    }

    private zoijcleaow(String str, long j13, gxszxtbevo.zoijcleaow zoijcleaowVar) {
        this.f119278iobyxmoadg = str;
        this.f119280zoijcleaow = j13;
        this.f119279ppxfxbqfkf = zoijcleaowVar;
    }
}
