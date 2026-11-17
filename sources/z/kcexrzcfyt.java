package z;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f127039gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f127040eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f127041iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f127042ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f127043wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f127044zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ kcexrzcfyt(float f13, float f14, float f15, float f16, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f127041iobyxmoadg, kcexrzcfytVar.f127041iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f127044zoijcleaow, kcexrzcfytVar.f127044zoijcleaow) && w0.nufgyqmvbu.dxjokdxxww(this.f127042ppxfxbqfkf, kcexrzcfytVar.f127042ppxfxbqfkf) && w0.nufgyqmvbu.dxjokdxxww(this.f127043wkgbmnqykc, kcexrzcfytVar.f127043wkgbmnqykc) && this.f127040eablkybsjg == kcexrzcfytVar.f127040eablkybsjg;
    }

    public int hashCode() {
        return (((((((w0.nufgyqmvbu.btonecajqb(this.f127041iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f127044zoijcleaow)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f127042ppxfxbqfkf)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f127043wkgbmnqykc)) * 31) + Boolean.hashCode(this.f127040eablkybsjg);
    }

    public final long iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wizcaqwiak.wkgbmnqykc(wizcaqwiak.f127337iobyxmoadg.ppxfxbqfkf(wkgbmnqykcVar.hszhottldk(this.f127041iobyxmoadg), wkgbmnqykcVar.hszhottldk(this.f127044zoijcleaow), wkgbmnqykcVar.hszhottldk(this.f127042ppxfxbqfkf), wkgbmnqykcVar.hszhottldk(this.f127043wkgbmnqykc), this.f127040eablkybsjg));
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f127041iobyxmoadg)) + ", top=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f127044zoijcleaow)) + ", end=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f127042ppxfxbqfkf)) + ", bottom=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f127043wkgbmnqykc)) + ", isLayoutDirectionAware=" + this.f127040eablkybsjg + ')';
    }

    private kcexrzcfyt(float f13, float f14, float f15, float f16, boolean z13) {
        this.f127041iobyxmoadg = f13;
        this.f127044zoijcleaow = f14;
        this.f127042ppxfxbqfkf = f15;
        this.f127043wkgbmnqykc = f16;
        this.f127040eablkybsjg = z13;
        if (!(f13 >= 0.0f)) {
            w.iobyxmoadg.iobyxmoadg("Left must be non-negative");
        }
        if (!(f14 >= 0.0f)) {
            w.iobyxmoadg.iobyxmoadg("Top must be non-negative");
        }
        if (!(f15 >= 0.0f)) {
            w.iobyxmoadg.iobyxmoadg("Right must be non-negative");
        }
        if (f16 >= 0.0f) {
            return;
        }
        w.iobyxmoadg.iobyxmoadg("Bottom must be non-negative");
    }
}
