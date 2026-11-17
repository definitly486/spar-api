package ai;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f1979eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final nufgyqmvbu f1980gxszxtbevo = new nufgyqmvbu(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f1981iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f1982ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f1983wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f1984zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return nufgyqmvbu.f1980gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar, boolean z13, boolean z14) {
        this.f1981iobyxmoadg = gtknphoqwxVar;
        this.f1984zoijcleaow = dxjokdxxwwVar;
        this.f1982ppxfxbqfkf = z13;
        this.f1983wkgbmnqykc = z14;
    }

    public static /* synthetic */ nufgyqmvbu ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            gtknphoqwxVar = nufgyqmvbuVar.f1981iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            dxjokdxxwwVar = nufgyqmvbuVar.f1984zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = nufgyqmvbuVar.f1982ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z14 = nufgyqmvbuVar.f1983wkgbmnqykc;
        }
        return nufgyqmvbuVar.zoijcleaow(gtknphoqwxVar, dxjokdxxwwVar, z13, z14);
    }

    public final dxjokdxxww eablkybsjg() {
        return this.f1984zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f1981iobyxmoadg == nufgyqmvbuVar.f1981iobyxmoadg && this.f1984zoijcleaow == nufgyqmvbuVar.f1984zoijcleaow && this.f1982ppxfxbqfkf == nufgyqmvbuVar.f1982ppxfxbqfkf && this.f1983wkgbmnqykc == nufgyqmvbuVar.f1983wkgbmnqykc;
    }

    public final gtknphoqwx gxszxtbevo() {
        return this.f1981iobyxmoadg;
    }

    public int hashCode() {
        gtknphoqwx gtknphoqwxVar = this.f1981iobyxmoadg;
        int iHashCode = (gtknphoqwxVar == null ? 0 : gtknphoqwxVar.hashCode()) * 31;
        dxjokdxxww dxjokdxxwwVar = this.f1984zoijcleaow;
        return ((((iHashCode + (dxjokdxxwwVar != null ? dxjokdxxwwVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f1982ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f1983wkgbmnqykc);
    }

    public final boolean lqeggnwhkg() {
        return this.f1983wkgbmnqykc;
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f1981iobyxmoadg + ", mutability=" + this.f1984zoijcleaow + ", definitelyNotNull=" + this.f1982ppxfxbqfkf + ", isNullabilityQualifierForWarning=" + this.f1983wkgbmnqykc + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f1982ppxfxbqfkf;
    }

    public final nufgyqmvbu zoijcleaow(gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar, boolean z13, boolean z14) {
        return new nufgyqmvbu(gtknphoqwxVar, dxjokdxxwwVar, z13, z14);
    }

    public /* synthetic */ nufgyqmvbu(gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar, boolean z13, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, dxjokdxxwwVar, z13, (i13 & 8) != 0 ? false : z14);
    }
}
