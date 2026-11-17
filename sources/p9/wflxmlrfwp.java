package p9;

/* JADX INFO: loaded from: classes2.dex */
final class wflxmlrfwp extends iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwizpuwonk.ppxfxbqfkf f76159iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk.zoijcleaow f76160zoijcleaow;

    static final class zoijcleaow extends iwizpuwonk.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private iwizpuwonk.ppxfxbqfkf f76161iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private iwizpuwonk.zoijcleaow f76162zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.iwizpuwonk.iobyxmoadg
        public iwizpuwonk iobyxmoadg() {
            return new wflxmlrfwp(this.f76161iobyxmoadg, this.f76162zoijcleaow);
        }

        @Override // p9.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg ppxfxbqfkf(iwizpuwonk.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f76161iobyxmoadg = ppxfxbqfkfVar;
            return this;
        }

        @Override // p9.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg zoijcleaow(iwizpuwonk.zoijcleaow zoijcleaowVar) {
            this.f76162zoijcleaow = zoijcleaowVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        iwizpuwonk.ppxfxbqfkf ppxfxbqfkfVar = this.f76159iobyxmoadg;
        if (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.equals(iwizpuwonkVar.ppxfxbqfkf()) : iwizpuwonkVar.ppxfxbqfkf() == null) {
            iwizpuwonk.zoijcleaow zoijcleaowVar = this.f76160zoijcleaow;
            if (zoijcleaowVar == null) {
                if (iwizpuwonkVar.zoijcleaow() == null) {
                    return true;
                }
            } else if (zoijcleaowVar.equals(iwizpuwonkVar.zoijcleaow())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        iwizpuwonk.ppxfxbqfkf ppxfxbqfkfVar = this.f76159iobyxmoadg;
        int iHashCode = ((ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode()) ^ 1000003) * 1000003;
        iwizpuwonk.zoijcleaow zoijcleaowVar = this.f76160zoijcleaow;
        return iHashCode ^ (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    @Override // p9.iwizpuwonk
    public iwizpuwonk.ppxfxbqfkf ppxfxbqfkf() {
        return this.f76159iobyxmoadg;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f76159iobyxmoadg + ", mobileSubtype=" + this.f76160zoijcleaow + "}";
    }

    @Override // p9.iwizpuwonk
    public iwizpuwonk.zoijcleaow zoijcleaow() {
        return this.f76160zoijcleaow;
    }

    private wflxmlrfwp(iwizpuwonk.ppxfxbqfkf ppxfxbqfkfVar, iwizpuwonk.zoijcleaow zoijcleaowVar) {
        this.f76159iobyxmoadg = ppxfxbqfkfVar;
        this.f76160zoijcleaow = zoijcleaowVar;
    }
}
