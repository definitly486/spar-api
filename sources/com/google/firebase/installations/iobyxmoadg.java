package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f24269iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f24270ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f24271zoijcleaow;

    static final class zoijcleaow extends gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f24272iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Long f24273ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Long f24274zoijcleaow;

        zoijcleaow() {
        }

        @Override // com.google.firebase.installations.gxszxtbevo.iobyxmoadg
        public gxszxtbevo iobyxmoadg() {
            String str = "";
            if (this.f24272iobyxmoadg == null) {
                str = " token";
            }
            if (this.f24274zoijcleaow == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f24273ppxfxbqfkf == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new iobyxmoadg(this.f24272iobyxmoadg, this.f24274zoijcleaow.longValue(), this.f24273ppxfxbqfkf.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg ppxfxbqfkf(long j13) {
            this.f24273ppxfxbqfkf = Long.valueOf(j13);
            return this;
        }

        @Override // com.google.firebase.installations.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg wkgbmnqykc(long j13) {
            this.f24274zoijcleaow = Long.valueOf(j13);
            return this;
        }

        @Override // com.google.firebase.installations.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f24272iobyxmoadg = str;
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
        return this.f24269iobyxmoadg.equals(gxszxtbevoVar.zoijcleaow()) && this.f24271zoijcleaow == gxszxtbevoVar.wkgbmnqykc() && this.f24270ppxfxbqfkf == gxszxtbevoVar.ppxfxbqfkf();
    }

    public int hashCode() {
        int iHashCode = (this.f24269iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        long j13 = this.f24271zoijcleaow;
        long j14 = this.f24270ppxfxbqfkf;
        return ((iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)));
    }

    @Override // com.google.firebase.installations.gxszxtbevo
    public long ppxfxbqfkf() {
        return this.f24270ppxfxbqfkf;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f24269iobyxmoadg + ", tokenExpirationTimestamp=" + this.f24271zoijcleaow + ", tokenCreationTimestamp=" + this.f24270ppxfxbqfkf + "}";
    }

    @Override // com.google.firebase.installations.gxszxtbevo
    public long wkgbmnqykc() {
        return this.f24271zoijcleaow;
    }

    @Override // com.google.firebase.installations.gxszxtbevo
    public String zoijcleaow() {
        return this.f24269iobyxmoadg;
    }

    private iobyxmoadg(String str, long j13, long j14) {
        this.f24269iobyxmoadg = str;
        this.f24271zoijcleaow = j13;
        this.f24270ppxfxbqfkf = j14;
    }
}
