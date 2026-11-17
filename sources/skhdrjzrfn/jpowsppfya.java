package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f107470iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f107471ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f107472zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v0.dxjokdxxww f107473iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f107474ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f107475zoijcleaow;

        public iobyxmoadg(v0.dxjokdxxww dxjokdxxwwVar, int i13, long j13) {
            this.f107473iobyxmoadg = dxjokdxxwwVar;
            this.f107475zoijcleaow = i13;
            this.f107474ppxfxbqfkf = j13;
        }

        public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, v0.dxjokdxxww dxjokdxxwwVar, int i13, long j13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                dxjokdxxwwVar = iobyxmoadgVar.f107473iobyxmoadg;
            }
            if ((i14 & 2) != 0) {
                i13 = iobyxmoadgVar.f107475zoijcleaow;
            }
            if ((i14 & 4) != 0) {
                j13 = iobyxmoadgVar.f107474ppxfxbqfkf;
            }
            return iobyxmoadgVar.iobyxmoadg(dxjokdxxwwVar, i13, j13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f107473iobyxmoadg == iobyxmoadgVar.f107473iobyxmoadg && this.f107475zoijcleaow == iobyxmoadgVar.f107475zoijcleaow && this.f107474ppxfxbqfkf == iobyxmoadgVar.f107474ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f107473iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f107475zoijcleaow)) * 31) + Long.hashCode(this.f107474ppxfxbqfkf);
        }

        public final iobyxmoadg iobyxmoadg(v0.dxjokdxxww dxjokdxxwwVar, int i13, long j13) {
            return new iobyxmoadg(dxjokdxxwwVar, i13, j13);
        }

        public final int ppxfxbqfkf() {
            return this.f107475zoijcleaow;
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f107473iobyxmoadg + ", offset=" + this.f107475zoijcleaow + ", selectableId=" + this.f107474ppxfxbqfkf + ')';
        }

        public final long wkgbmnqykc() {
            return this.f107474ppxfxbqfkf;
        }
    }

    public jpowsppfya(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, boolean z13) {
        this.f107470iobyxmoadg = iobyxmoadgVar;
        this.f107472zoijcleaow = iobyxmoadgVar2;
        this.f107471ppxfxbqfkf = z13;
    }

    public static /* synthetic */ jpowsppfya zoijcleaow(jpowsppfya jpowsppfyaVar, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iobyxmoadgVar = jpowsppfyaVar.f107470iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar2 = jpowsppfyaVar.f107472zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = jpowsppfyaVar.f107471ppxfxbqfkf;
        }
        return jpowsppfyaVar.iobyxmoadg(iobyxmoadgVar, iobyxmoadgVar2, z13);
    }

    public final iobyxmoadg eablkybsjg() {
        return this.f107470iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpowsppfya)) {
            return false;
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f107470iobyxmoadg, jpowsppfyaVar.f107470iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f107472zoijcleaow, jpowsppfyaVar.f107472zoijcleaow) && this.f107471ppxfxbqfkf == jpowsppfyaVar.f107471ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f107470iobyxmoadg.hashCode() * 31) + this.f107472zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f107471ppxfxbqfkf);
    }

    public final jpowsppfya iobyxmoadg(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, boolean z13) {
        return new jpowsppfya(iobyxmoadgVar, iobyxmoadgVar2, z13);
    }

    public final iobyxmoadg ppxfxbqfkf() {
        return this.f107472zoijcleaow;
    }

    public String toString() {
        return "Selection(start=" + this.f107470iobyxmoadg + ", end=" + this.f107472zoijcleaow + ", handlesCrossed=" + this.f107471ppxfxbqfkf + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f107471ppxfxbqfkf;
    }
}
