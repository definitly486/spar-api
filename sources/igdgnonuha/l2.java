package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
final class l2 implements ikoacuggdj.tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f43272iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h.opjhrmiecq f43273ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f43274wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f43275zoijcleaow;

    static final class iobyxmoadg implements h.opjhrmiecq {
        iobyxmoadg() {
        }

        @Override // h.opjhrmiecq
        public final long iobyxmoadg() {
            return l2.this.f43274wkgbmnqykc;
        }
    }

    public /* synthetic */ l2(boolean z13, float f13, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(z13, f13, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (this.f43272iobyxmoadg == l2Var.f43272iobyxmoadg && w0.nufgyqmvbu.dxjokdxxww(this.f43275zoijcleaow, l2Var.f43275zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f43273ppxfxbqfkf, l2Var.f43273ppxfxbqfkf)) {
            return h.oipsdeybqn.ojitshcjhn(this.f43274wkgbmnqykc, l2Var.f43274wkgbmnqykc);
        }
        return false;
    }

    @Override // ikoacuggdj.tzroggbefp
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f43272iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f43275zoijcleaow)) * 31;
        h.opjhrmiecq opjhrmiecqVar = this.f43273ppxfxbqfkf;
        return ((iHashCode + (opjhrmiecqVar != null ? opjhrmiecqVar.hashCode() : 0)) * 31) + h.oipsdeybqn.yggfygwlhe(this.f43274wkgbmnqykc);
    }

    @Override // ikoacuggdj.tzroggbefp
    public z.btonecajqb zoijcleaow(metgxyhuhe.btonecajqb btonecajqbVar) {
        h.opjhrmiecq iobyxmoadgVar = this.f43273ppxfxbqfkf;
        if (iobyxmoadgVar == null) {
            iobyxmoadgVar = new iobyxmoadg();
        }
        return new ydmasvzmpa(btonecajqbVar, this.f43272iobyxmoadg, this.f43275zoijcleaow, iobyxmoadgVar, null);
    }

    private l2(boolean z13, float f13, h.opjhrmiecq opjhrmiecqVar, long j13) {
        this.f43272iobyxmoadg = z13;
        this.f43275zoijcleaow = f13;
        this.f43273ppxfxbqfkf = opjhrmiecqVar;
        this.f43274wkgbmnqykc = j13;
    }

    private l2(boolean z13, float f13, long j13) {
        this(z13, f13, (h.opjhrmiecq) null, j13);
    }
}
