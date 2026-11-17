package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class b4 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f42635iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f42636ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f42637zoijcleaow;

    public b4(Object obj, Object obj2, float f13) {
        this.f42635iobyxmoadg = obj;
        this.f42637zoijcleaow = obj2;
        this.f42636ppxfxbqfkf = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42635iobyxmoadg, b4Var.f42635iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42637zoijcleaow, b4Var.f42637zoijcleaow) && this.f42636ppxfxbqfkf == b4Var.f42636ppxfxbqfkf;
    }

    public int hashCode() {
        Object obj = this.f42635iobyxmoadg;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f42637zoijcleaow;
        return ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + Float.hashCode(this.f42636ppxfxbqfkf);
    }

    public final float iobyxmoadg() {
        return this.f42636ppxfxbqfkf;
    }

    public String toString() {
        return "SwipeProgress(from=" + this.f42635iobyxmoadg + ", to=" + this.f42637zoijcleaow + ", fraction=" + this.f42636ppxfxbqfkf + ')';
    }
}
