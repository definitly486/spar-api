package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f42964iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f42965ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f42966zoijcleaow;

    public g2(float f13, float f14, float f15) {
        this.f42964iobyxmoadg = f13;
        this.f42966zoijcleaow = f14;
        this.f42965ppxfxbqfkf = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f42964iobyxmoadg == g2Var.f42964iobyxmoadg && this.f42966zoijcleaow == g2Var.f42966zoijcleaow && this.f42965ppxfxbqfkf == g2Var.f42965ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f42964iobyxmoadg) * 31) + Float.hashCode(this.f42966zoijcleaow)) * 31) + Float.hashCode(this.f42965ppxfxbqfkf);
    }

    public final float iobyxmoadg(float f13) {
        float f14 = f13 < 0.0f ? this.f42966zoijcleaow : this.f42965ppxfxbqfkf;
        if (f14 == 0.0f) {
            return 0.0f;
        }
        float f15 = this.f42964iobyxmoadg;
        float f16 = f13 / f15;
        if (f16 < -1.0f) {
            f16 = -1.0f;
        }
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        return (f15 / f14) * ((float) Math.sin((f16 * 3.1415927f) / 2));
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f42964iobyxmoadg + ", factorAtMin=" + this.f42966zoijcleaow + ", factorAtMax=" + this.f42965ppxfxbqfkf + ')';
    }
}
