package y9;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f124119eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f124120gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f124121ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f124122wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f124123zoijcleaow;

    static final class zoijcleaow extends eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Integer f124124eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Long f124125iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f124126ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Long f124127wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f124128zoijcleaow;

        zoijcleaow() {
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg.iobyxmoadg eablkybsjg(int i13) {
            this.f124124eablkybsjg = Integer.valueOf(i13);
            return this;
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg.iobyxmoadg gxszxtbevo(long j13) {
            this.f124125iobyxmoadg = Long.valueOf(j13);
            return this;
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg iobyxmoadg() {
            String str = "";
            if (this.f124125iobyxmoadg == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f124128zoijcleaow == null) {
                str = str + " loadBatchSize";
            }
            if (this.f124126ppxfxbqfkf == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f124127wkgbmnqykc == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f124124eablkybsjg == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new iobyxmoadg(this.f124125iobyxmoadg.longValue(), this.f124128zoijcleaow.intValue(), this.f124126ppxfxbqfkf.intValue(), this.f124127wkgbmnqykc.longValue(), this.f124124eablkybsjg.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg.iobyxmoadg ppxfxbqfkf(long j13) {
            this.f124127wkgbmnqykc = Long.valueOf(j13);
            return this;
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg.iobyxmoadg wkgbmnqykc(int i13) {
            this.f124128zoijcleaow = Integer.valueOf(i13);
            return this;
        }

        @Override // y9.eablkybsjg.iobyxmoadg
        eablkybsjg.iobyxmoadg zoijcleaow(int i13) {
            this.f124126ppxfxbqfkf = Integer.valueOf(i13);
            return this;
        }
    }

    @Override // y9.eablkybsjg
    int eablkybsjg() {
        return this.f124120gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f124123zoijcleaow == eablkybsjgVar.gxszxtbevo() && this.f124121ppxfxbqfkf == eablkybsjgVar.wkgbmnqykc() && this.f124122wkgbmnqykc == eablkybsjgVar.zoijcleaow() && this.f124119eablkybsjg == eablkybsjgVar.ppxfxbqfkf() && this.f124120gxszxtbevo == eablkybsjgVar.eablkybsjg();
    }

    @Override // y9.eablkybsjg
    long gxszxtbevo() {
        return this.f124123zoijcleaow;
    }

    public int hashCode() {
        long j13 = this.f124123zoijcleaow;
        int i13 = (((((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ this.f124121ppxfxbqfkf) * 1000003) ^ this.f124122wkgbmnqykc) * 1000003;
        long j14 = this.f124119eablkybsjg;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f124120gxszxtbevo;
    }

    @Override // y9.eablkybsjg
    long ppxfxbqfkf() {
        return this.f124119eablkybsjg;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f124123zoijcleaow + ", loadBatchSize=" + this.f124121ppxfxbqfkf + ", criticalSectionEnterTimeoutMs=" + this.f124122wkgbmnqykc + ", eventCleanUpAge=" + this.f124119eablkybsjg + ", maxBlobByteSizePerRow=" + this.f124120gxszxtbevo + "}";
    }

    @Override // y9.eablkybsjg
    int wkgbmnqykc() {
        return this.f124121ppxfxbqfkf;
    }

    @Override // y9.eablkybsjg
    int zoijcleaow() {
        return this.f124122wkgbmnqykc;
    }

    private iobyxmoadg(long j13, int i13, int i14, long j14, int i15) {
        this.f124123zoijcleaow = j13;
        this.f124121ppxfxbqfkf = i13;
        this.f124122wkgbmnqykc = i14;
        this.f124119eablkybsjg = j14;
        this.f124120gxszxtbevo = i15;
    }
}
