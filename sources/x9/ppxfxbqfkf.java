package x9;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends gxszxtbevo.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f121800iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f121801ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f121802zoijcleaow;

    static final class zoijcleaow extends gxszxtbevo.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Long f121803iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Set f121804ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Long f121805zoijcleaow;

        zoijcleaow() {
        }

        @Override // x9.gxszxtbevo.zoijcleaow.iobyxmoadg
        public gxszxtbevo.zoijcleaow iobyxmoadg() {
            String str = "";
            if (this.f121803iobyxmoadg == null) {
                str = " delta";
            }
            if (this.f121805zoijcleaow == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f121804ppxfxbqfkf == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new ppxfxbqfkf(this.f121803iobyxmoadg.longValue(), this.f121805zoijcleaow.longValue(), this.f121804ppxfxbqfkf);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x9.gxszxtbevo.zoijcleaow.iobyxmoadg
        public gxszxtbevo.zoijcleaow.iobyxmoadg ppxfxbqfkf(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f121804ppxfxbqfkf = set;
            return this;
        }

        @Override // x9.gxszxtbevo.zoijcleaow.iobyxmoadg
        public gxszxtbevo.zoijcleaow.iobyxmoadg wkgbmnqykc(long j13) {
            this.f121805zoijcleaow = Long.valueOf(j13);
            return this;
        }

        @Override // x9.gxszxtbevo.zoijcleaow.iobyxmoadg
        public gxszxtbevo.zoijcleaow.iobyxmoadg zoijcleaow(long j13) {
            this.f121803iobyxmoadg = Long.valueOf(j13);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo.zoijcleaow)) {
            return false;
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) obj;
        return this.f121800iobyxmoadg == zoijcleaowVar.zoijcleaow() && this.f121802zoijcleaow == zoijcleaowVar.wkgbmnqykc() && this.f121801ppxfxbqfkf.equals(zoijcleaowVar.ppxfxbqfkf());
    }

    public int hashCode() {
        long j13 = this.f121800iobyxmoadg;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003;
        long j14 = this.f121802zoijcleaow;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f121801ppxfxbqfkf.hashCode();
    }

    @Override // x9.gxszxtbevo.zoijcleaow
    Set ppxfxbqfkf() {
        return this.f121801ppxfxbqfkf;
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f121800iobyxmoadg + ", maxAllowedDelay=" + this.f121802zoijcleaow + ", flags=" + this.f121801ppxfxbqfkf + "}";
    }

    @Override // x9.gxszxtbevo.zoijcleaow
    long wkgbmnqykc() {
        return this.f121802zoijcleaow;
    }

    @Override // x9.gxszxtbevo.zoijcleaow
    long zoijcleaow() {
        return this.f121800iobyxmoadg;
    }

    private ppxfxbqfkf(long j13, long j14, Set set) {
        this.f121800iobyxmoadg = j13;
        this.f121802zoijcleaow = j14;
        this.f121801ppxfxbqfkf = set;
    }
}
