package dc;

/* JADX INFO: loaded from: classes2.dex */
final class zdlpuopuiu extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27800iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f27801ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f27802wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f27803zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private byte f27804eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27805iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f27806ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f27807wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f27808zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg eablkybsjg(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f27805iobyxmoadg = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf iobyxmoadg() {
            String str;
            if (this.f27804eablkybsjg == 7 && (str = this.f27805iobyxmoadg) != null) {
                return new zdlpuopuiu(str, this.f27808zoijcleaow, this.f27806ppxfxbqfkf, this.f27807wkgbmnqykc);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27805iobyxmoadg == null) {
                sb3.append(" processName");
            }
            if ((this.f27804eablkybsjg & 1) == 0) {
                sb3.append(" pid");
            }
            if ((this.f27804eablkybsjg & 2) == 0) {
                sb3.append(" importance");
            }
            if ((this.f27804eablkybsjg & 4) == 0) {
                sb3.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg ppxfxbqfkf(int i13) {
            this.f27806ppxfxbqfkf = i13;
            this.f27804eablkybsjg = (byte) (this.f27804eablkybsjg | 2);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg wkgbmnqykc(int i13) {
            this.f27808zoijcleaow = i13;
            this.f27804eablkybsjg = (byte) (this.f27804eablkybsjg | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg zoijcleaow(boolean z13) {
            this.f27807wkgbmnqykc = z13;
            this.f27804eablkybsjg = (byte) (this.f27804eablkybsjg | 4);
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf
    public boolean eablkybsjg() {
        return this.f27802wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf) obj;
        return this.f27800iobyxmoadg.equals(ppxfxbqfkfVar.wkgbmnqykc()) && this.f27803zoijcleaow == ppxfxbqfkfVar.ppxfxbqfkf() && this.f27801ppxfxbqfkf == ppxfxbqfkfVar.zoijcleaow() && this.f27802wkgbmnqykc == ppxfxbqfkfVar.eablkybsjg();
    }

    public int hashCode() {
        return ((((((this.f27800iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27803zoijcleaow) * 1000003) ^ this.f27801ppxfxbqfkf) * 1000003) ^ (this.f27802wkgbmnqykc ? 1231 : 1237);
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf
    public int ppxfxbqfkf() {
        return this.f27803zoijcleaow;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f27800iobyxmoadg + ", pid=" + this.f27803zoijcleaow + ", importance=" + this.f27801ppxfxbqfkf + ", defaultProcess=" + this.f27802wkgbmnqykc + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf
    public String wkgbmnqykc() {
        return this.f27800iobyxmoadg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf
    public int zoijcleaow() {
        return this.f27801ppxfxbqfkf;
    }

    private zdlpuopuiu(String str, int i13, int i14, boolean z13) {
        this.f27800iobyxmoadg = str;
        this.f27803zoijcleaow = i13;
        this.f27801ppxfxbqfkf = i14;
        this.f27802wkgbmnqykc = z13;
    }
}
