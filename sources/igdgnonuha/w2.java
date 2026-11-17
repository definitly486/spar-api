package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bfopjjpdmp.iobyxmoadg f44029iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bfopjjpdmp.iobyxmoadg f44030ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bfopjjpdmp.iobyxmoadg f44031zoijcleaow;

    public w2(bfopjjpdmp.iobyxmoadg iobyxmoadgVar, bfopjjpdmp.iobyxmoadg iobyxmoadgVar2, bfopjjpdmp.iobyxmoadg iobyxmoadgVar3) {
        this.f44029iobyxmoadg = iobyxmoadgVar;
        this.f44031zoijcleaow = iobyxmoadgVar2;
        this.f44030ppxfxbqfkf = iobyxmoadgVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44029iobyxmoadg, w2Var.f44029iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44031zoijcleaow, w2Var.f44031zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44030ppxfxbqfkf, w2Var.f44030ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f44029iobyxmoadg.hashCode() * 31) + this.f44031zoijcleaow.hashCode()) * 31) + this.f44030ppxfxbqfkf.hashCode();
    }

    public final bfopjjpdmp.iobyxmoadg iobyxmoadg() {
        return this.f44030ppxfxbqfkf;
    }

    public final bfopjjpdmp.iobyxmoadg ppxfxbqfkf() {
        return this.f44029iobyxmoadg;
    }

    public String toString() {
        return "Shapes(small=" + this.f44029iobyxmoadg + ", medium=" + this.f44031zoijcleaow + ", large=" + this.f44030ppxfxbqfkf + ')';
    }

    public final bfopjjpdmp.iobyxmoadg zoijcleaow() {
        return this.f44031zoijcleaow;
    }

    public /* synthetic */ w2(bfopjjpdmp.iobyxmoadg iobyxmoadgVar, bfopjjpdmp.iobyxmoadg iobyxmoadgVar2, bfopjjpdmp.iobyxmoadg iobyxmoadgVar3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(4)) : iobyxmoadgVar, (i13 & 2) != 0 ? bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(4)) : iobyxmoadgVar2, (i13 & 4) != 0 ? bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(0)) : iobyxmoadgVar3);
    }
}
