package dc;

/* JADX INFO: loaded from: classes2.dex */
final class pmvmpeiblj extends iozdgvuglv.eablkybsjg.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27724iobyxmoadg;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27725iobyxmoadg;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg
        public iozdgvuglv.eablkybsjg.gxszxtbevo iobyxmoadg() {
            String str = this.f27725iobyxmoadg;
            if (str != null) {
                return new pmvmpeiblj(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // dc.iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg
        public iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f27725iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iozdgvuglv.eablkybsjg.gxszxtbevo) {
            return this.f27724iobyxmoadg.equals(((iozdgvuglv.eablkybsjg.gxszxtbevo) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f27724iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f27724iobyxmoadg + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.gxszxtbevo
    public String zoijcleaow() {
        return this.f27724iobyxmoadg;
    }

    private pmvmpeiblj(String str) {
        this.f27724iobyxmoadg = str;
    }
}
