package p9;

/* JADX INFO: loaded from: classes2.dex */
final class nufgyqmvbu extends oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Integer f76124iobyxmoadg;

    static final class zoijcleaow extends oxmwwwfdhm.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f76125iobyxmoadg;

        zoijcleaow() {
        }

        @Override // p9.oxmwwwfdhm.iobyxmoadg
        public oxmwwwfdhm iobyxmoadg() {
            return new nufgyqmvbu(this.f76125iobyxmoadg);
        }

        @Override // p9.oxmwwwfdhm.iobyxmoadg
        public oxmwwwfdhm.iobyxmoadg zoijcleaow(Integer num) {
            this.f76125iobyxmoadg = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm)) {
            return false;
        }
        Integer num = this.f76124iobyxmoadg;
        Integer numZoijcleaow = ((oxmwwwfdhm) obj).zoijcleaow();
        if (num == null) {
            return numZoijcleaow == null;
        }
        return num.equals(numZoijcleaow);
    }

    public int hashCode() {
        Integer num = this.f76124iobyxmoadg;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f76124iobyxmoadg + "}";
    }

    @Override // p9.oxmwwwfdhm
    public Integer zoijcleaow() {
        return this.f76124iobyxmoadg;
    }

    private nufgyqmvbu(Integer num) {
        this.f76124iobyxmoadg = num;
    }
}
