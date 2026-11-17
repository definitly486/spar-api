package dc;

/* JADX INFO: loaded from: classes2.dex */
final class jyumaefscl extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27657iobyxmoadg;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27658iobyxmoadg;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc iobyxmoadg() {
            String str = this.f27658iobyxmoadg;
            if (str != null) {
                return new jyumaefscl(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f27658iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc) {
            return this.f27657iobyxmoadg.equals(((iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f27657iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f27657iobyxmoadg + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc
    public String zoijcleaow() {
        return this.f27657iobyxmoadg;
    }

    private jyumaefscl(String str) {
        this.f27657iobyxmoadg = str;
    }
}
