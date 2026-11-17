package f3;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final hcddaimhww f32664ppxfxbqfkf = new hcddaimhww(0, false);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f32665iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f32666zoijcleaow;

    public hcddaimhww(int i13, boolean z13) {
        this.f32665iobyxmoadg = i13;
        this.f32666zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hcddaimhww.class != obj.getClass()) {
            return false;
        }
        hcddaimhww hcddaimhwwVar = (hcddaimhww) obj;
        return this.f32665iobyxmoadg == hcddaimhwwVar.f32665iobyxmoadg && this.f32666zoijcleaow == hcddaimhwwVar.f32666zoijcleaow;
    }

    public int hashCode() {
        return (this.f32665iobyxmoadg << 1) + (this.f32666zoijcleaow ? 1 : 0);
    }
}
