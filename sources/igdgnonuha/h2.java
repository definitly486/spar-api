package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f43015iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ageimvtcrz.ppxfxbqfkf f43016zoijcleaow;

    public /* synthetic */ h2(long j13, ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, ppxfxbqfkfVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return h.oipsdeybqn.ojitshcjhn(this.f43015iobyxmoadg, h2Var.f43015iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f43016zoijcleaow, h2Var.f43016zoijcleaow);
    }

    public int hashCode() {
        int iYggfygwlhe = h.oipsdeybqn.yggfygwlhe(this.f43015iobyxmoadg) * 31;
        ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar = this.f43016zoijcleaow;
        return iYggfygwlhe + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
    }

    public final long iobyxmoadg() {
        return this.f43015iobyxmoadg;
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) h.oipsdeybqn.jyumaefscl(this.f43015iobyxmoadg)) + ", rippleAlpha=" + this.f43016zoijcleaow + ')';
    }

    public final ageimvtcrz.ppxfxbqfkf zoijcleaow() {
        return this.f43016zoijcleaow;
    }

    private h2(long j13, ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f43015iobyxmoadg = j13;
        this.f43016zoijcleaow = ppxfxbqfkfVar;
    }

    public /* synthetic */ h2(long j13, ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? h.oipsdeybqn.f38945zoijcleaow.lqeggnwhkg() : j13, (i13 & 2) != 0 ? null : ppxfxbqfkfVar, null);
    }
}
