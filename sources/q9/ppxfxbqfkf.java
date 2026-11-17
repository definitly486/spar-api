package q9;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends ojitshcjhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final o9.ppxfxbqfkf f78293eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f78294iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o9.wkgbmnqykc f78295ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final o9.nufgyqmvbu f78296wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f78297zoijcleaow;

    static final class zoijcleaow extends ojitshcjhn.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private o9.ppxfxbqfkf f78298eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private rgvfuqvkyq f78299iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private o9.wkgbmnqykc f78300ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private o9.nufgyqmvbu f78301wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f78302zoijcleaow;

        zoijcleaow() {
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn.iobyxmoadg eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar) {
            if (rgvfuqvkyqVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f78299iobyxmoadg = rgvfuqvkyqVar;
            return this;
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn.iobyxmoadg gxszxtbevo(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f78302zoijcleaow = str;
            return this;
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn iobyxmoadg() {
            String str = "";
            if (this.f78299iobyxmoadg == null) {
                str = " transportContext";
            }
            if (this.f78302zoijcleaow == null) {
                str = str + " transportName";
            }
            if (this.f78300ppxfxbqfkf == null) {
                str = str + " event";
            }
            if (this.f78301wkgbmnqykc == null) {
                str = str + " transformer";
            }
            if (this.f78298eablkybsjg == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new ppxfxbqfkf(this.f78299iobyxmoadg, this.f78302zoijcleaow, this.f78300ppxfxbqfkf, this.f78301wkgbmnqykc, this.f78298eablkybsjg);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        ojitshcjhn.iobyxmoadg ppxfxbqfkf(o9.wkgbmnqykc wkgbmnqykcVar) {
            if (wkgbmnqykcVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f78300ppxfxbqfkf = wkgbmnqykcVar;
            return this;
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        ojitshcjhn.iobyxmoadg wkgbmnqykc(o9.nufgyqmvbu nufgyqmvbuVar) {
            if (nufgyqmvbuVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f78301wkgbmnqykc = nufgyqmvbuVar;
            return this;
        }

        @Override // q9.ojitshcjhn.iobyxmoadg
        ojitshcjhn.iobyxmoadg zoijcleaow(o9.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f78298eablkybsjg = ppxfxbqfkfVar;
            return this;
        }
    }

    @Override // q9.ojitshcjhn
    o9.nufgyqmvbu eablkybsjg() {
        return this.f78296wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return this.f78294iobyxmoadg.equals(ojitshcjhnVar.gxszxtbevo()) && this.f78297zoijcleaow.equals(ojitshcjhnVar.lqeggnwhkg()) && this.f78295ppxfxbqfkf.equals(ojitshcjhnVar.ppxfxbqfkf()) && this.f78296wkgbmnqykc.equals(ojitshcjhnVar.eablkybsjg()) && this.f78293eablkybsjg.equals(ojitshcjhnVar.zoijcleaow());
    }

    @Override // q9.ojitshcjhn
    public rgvfuqvkyq gxszxtbevo() {
        return this.f78294iobyxmoadg;
    }

    public int hashCode() {
        return ((((((((this.f78294iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f78297zoijcleaow.hashCode()) * 1000003) ^ this.f78295ppxfxbqfkf.hashCode()) * 1000003) ^ this.f78296wkgbmnqykc.hashCode()) * 1000003) ^ this.f78293eablkybsjg.hashCode();
    }

    @Override // q9.ojitshcjhn
    public String lqeggnwhkg() {
        return this.f78297zoijcleaow;
    }

    @Override // q9.ojitshcjhn
    o9.wkgbmnqykc ppxfxbqfkf() {
        return this.f78295ppxfxbqfkf;
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f78294iobyxmoadg + ", transportName=" + this.f78297zoijcleaow + ", event=" + this.f78295ppxfxbqfkf + ", transformer=" + this.f78296wkgbmnqykc + ", encoding=" + this.f78293eablkybsjg + "}";
    }

    @Override // q9.ojitshcjhn
    public o9.ppxfxbqfkf zoijcleaow() {
        return this.f78293eablkybsjg;
    }

    private ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, String str, o9.wkgbmnqykc wkgbmnqykcVar, o9.nufgyqmvbu nufgyqmvbuVar, o9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f78294iobyxmoadg = rgvfuqvkyqVar;
        this.f78297zoijcleaow = str;
        this.f78295ppxfxbqfkf = wkgbmnqykcVar;
        this.f78296wkgbmnqykc = nufgyqmvbuVar;
        this.f78293eablkybsjg = ppxfxbqfkfVar;
    }
}
