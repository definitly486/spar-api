package sd;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f106002eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f106003gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f106004ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f106005wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f106006zoijcleaow;

    /* JADX INFO: renamed from: sd.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2598zoijcleaow extends wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f106007eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private byte f106008gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f106009iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f106010ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f106011wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f106012zoijcleaow;

        C2598zoijcleaow() {
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg eablkybsjg(long j13) {
            this.f106007eablkybsjg = j13;
            this.f106008gxszxtbevo = (byte) (this.f106008gxszxtbevo | 1);
            return this;
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg gxszxtbevo(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f106012zoijcleaow = str;
            return this;
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc iobyxmoadg() {
            if (this.f106008gxszxtbevo == 1 && this.f106009iobyxmoadg != null && this.f106012zoijcleaow != null && this.f106010ppxfxbqfkf != null && this.f106011wkgbmnqykc != null) {
                return new zoijcleaow(this.f106009iobyxmoadg, this.f106012zoijcleaow, this.f106010ppxfxbqfkf, this.f106011wkgbmnqykc, this.f106007eablkybsjg);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f106009iobyxmoadg == null) {
                sb3.append(" rolloutId");
            }
            if (this.f106012zoijcleaow == null) {
                sb3.append(" variantId");
            }
            if (this.f106010ppxfxbqfkf == null) {
                sb3.append(" parameterKey");
            }
            if (this.f106011wkgbmnqykc == null) {
                sb3.append(" parameterValue");
            }
            if ((1 & this.f106008gxszxtbevo) == 0) {
                sb3.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f106011wkgbmnqykc = str;
            return this;
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg wkgbmnqykc(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f106009iobyxmoadg = str;
            return this;
        }

        @Override // sd.wkgbmnqykc.iobyxmoadg
        public wkgbmnqykc.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f106010ppxfxbqfkf = str;
            return this;
        }
    }

    @Override // sd.wkgbmnqykc
    public long eablkybsjg() {
        return this.f106003gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f106006zoijcleaow.equals(wkgbmnqykcVar.wkgbmnqykc()) && this.f106004ppxfxbqfkf.equals(wkgbmnqykcVar.gxszxtbevo()) && this.f106005wkgbmnqykc.equals(wkgbmnqykcVar.zoijcleaow()) && this.f106002eablkybsjg.equals(wkgbmnqykcVar.ppxfxbqfkf()) && this.f106003gxszxtbevo == wkgbmnqykcVar.eablkybsjg();
    }

    @Override // sd.wkgbmnqykc
    public String gxszxtbevo() {
        return this.f106004ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f106006zoijcleaow.hashCode() ^ 1000003) * 1000003) ^ this.f106004ppxfxbqfkf.hashCode()) * 1000003) ^ this.f106005wkgbmnqykc.hashCode()) * 1000003) ^ this.f106002eablkybsjg.hashCode()) * 1000003;
        long j13 = this.f106003gxszxtbevo;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // sd.wkgbmnqykc
    public String ppxfxbqfkf() {
        return this.f106002eablkybsjg;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f106006zoijcleaow + ", variantId=" + this.f106004ppxfxbqfkf + ", parameterKey=" + this.f106005wkgbmnqykc + ", parameterValue=" + this.f106002eablkybsjg + ", templateVersion=" + this.f106003gxszxtbevo + "}";
    }

    @Override // sd.wkgbmnqykc
    public String wkgbmnqykc() {
        return this.f106006zoijcleaow;
    }

    @Override // sd.wkgbmnqykc
    public String zoijcleaow() {
        return this.f106005wkgbmnqykc;
    }

    private zoijcleaow(String str, String str2, String str3, String str4, long j13) {
        this.f106006zoijcleaow = str;
        this.f106004ppxfxbqfkf = str2;
        this.f106005wkgbmnqykc = str3;
        this.f106002eablkybsjg = str4;
        this.f106003gxszxtbevo = j13;
    }
}
