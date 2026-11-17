package dc;

/* JADX INFO: loaded from: classes2.dex */
final class lereixgezr extends iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f27670iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27671ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f27672wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27673zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private byte f27674eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f27675iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f27676ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f27677wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27678zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg eablkybsjg(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f27678zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg iobyxmoadg() {
            String str;
            String str2;
            if (this.f27674eablkybsjg == 3 && (str = this.f27678zoijcleaow) != null && (str2 = this.f27676ppxfxbqfkf) != null) {
                return new lereixgezr(this.f27675iobyxmoadg, str, str2, this.f27677wkgbmnqykc);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.f27674eablkybsjg & 1) == 0) {
                sb3.append(" platform");
            }
            if (this.f27678zoijcleaow == null) {
                sb3.append(" version");
            }
            if (this.f27676ppxfxbqfkf == null) {
                sb3.append(" buildVersion");
            }
            if ((this.f27674eablkybsjg & 2) == 0) {
                sb3.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg ppxfxbqfkf(boolean z13) {
            this.f27677wkgbmnqykc = z13;
            this.f27674eablkybsjg = (byte) (this.f27674eablkybsjg | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg wkgbmnqykc(int i13) {
            this.f27675iobyxmoadg = i13;
            this.f27674eablkybsjg = (byte) (this.f27674eablkybsjg | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg
        public iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f27676ppxfxbqfkf = str;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg
    public boolean eablkybsjg() {
        return this.f27672wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg abstractC0511eablkybsjg = (iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg) obj;
        return this.f27670iobyxmoadg == abstractC0511eablkybsjg.ppxfxbqfkf() && this.f27673zoijcleaow.equals(abstractC0511eablkybsjg.wkgbmnqykc()) && this.f27671ppxfxbqfkf.equals(abstractC0511eablkybsjg.zoijcleaow()) && this.f27672wkgbmnqykc == abstractC0511eablkybsjg.eablkybsjg();
    }

    public int hashCode() {
        return ((((((this.f27670iobyxmoadg ^ 1000003) * 1000003) ^ this.f27673zoijcleaow.hashCode()) * 1000003) ^ this.f27671ppxfxbqfkf.hashCode()) * 1000003) ^ (this.f27672wkgbmnqykc ? 1231 : 1237);
    }

    @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg
    public int ppxfxbqfkf() {
        return this.f27670iobyxmoadg;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f27670iobyxmoadg + ", version=" + this.f27673zoijcleaow + ", buildVersion=" + this.f27671ppxfxbqfkf + ", jailbroken=" + this.f27672wkgbmnqykc + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg
    public String wkgbmnqykc() {
        return this.f27673zoijcleaow;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg
    public String zoijcleaow() {
        return this.f27671ppxfxbqfkf;
    }

    private lereixgezr(int i13, String str, String str2, boolean z13) {
        this.f27670iobyxmoadg = i13;
        this.f27673zoijcleaow = str;
        this.f27671ppxfxbqfkf = str2;
        this.f27672wkgbmnqykc = z13;
    }
}
