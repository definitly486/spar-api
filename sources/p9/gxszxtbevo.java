package p9;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo extends rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f76070iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq.zoijcleaow f76071zoijcleaow;

    static final class zoijcleaow extends rgvfuqvkyq.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private kcexrzcfyt f76072iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private rgvfuqvkyq.zoijcleaow f76073zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq iobyxmoadg() {
            return new gxszxtbevo(this.f76072iobyxmoadg, this.f76073zoijcleaow);
        }

        @Override // p9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq.iobyxmoadg ppxfxbqfkf(rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
            this.f76073zoijcleaow = zoijcleaowVar;
            return this;
        }

        @Override // p9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq.iobyxmoadg zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
            this.f76072iobyxmoadg = kcexrzcfytVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        kcexrzcfyt kcexrzcfytVar = this.f76070iobyxmoadg;
        if (kcexrzcfytVar != null ? kcexrzcfytVar.equals(rgvfuqvkyqVar.zoijcleaow()) : rgvfuqvkyqVar.zoijcleaow() == null) {
            rgvfuqvkyq.zoijcleaow zoijcleaowVar = this.f76071zoijcleaow;
            if (zoijcleaowVar == null) {
                if (rgvfuqvkyqVar.ppxfxbqfkf() == null) {
                    return true;
                }
            } else if (zoijcleaowVar.equals(rgvfuqvkyqVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        kcexrzcfyt kcexrzcfytVar = this.f76070iobyxmoadg;
        int iHashCode = ((kcexrzcfytVar == null ? 0 : kcexrzcfytVar.hashCode()) ^ 1000003) * 1000003;
        rgvfuqvkyq.zoijcleaow zoijcleaowVar = this.f76071zoijcleaow;
        return iHashCode ^ (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    @Override // p9.rgvfuqvkyq
    public rgvfuqvkyq.zoijcleaow ppxfxbqfkf() {
        return this.f76071zoijcleaow;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f76070iobyxmoadg + ", productIdOrigin=" + this.f76071zoijcleaow + "}";
    }

    @Override // p9.rgvfuqvkyq
    public kcexrzcfyt zoijcleaow() {
        return this.f76070iobyxmoadg;
    }

    private gxszxtbevo(kcexrzcfyt kcexrzcfytVar, rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        this.f76070iobyxmoadg = kcexrzcfytVar;
        this.f76071zoijcleaow = zoijcleaowVar;
    }
}
