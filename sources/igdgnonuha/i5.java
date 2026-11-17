package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class i5 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f43067iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f43068zoijcleaow;

    public /* synthetic */ i5(float f13, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f43067iobyxmoadg, i5Var.f43067iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f43068zoijcleaow, i5Var.f43068zoijcleaow);
    }

    public int hashCode() {
        return (w0.nufgyqmvbu.btonecajqb(this.f43067iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f43068zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f43067iobyxmoadg;
    }

    public final float ppxfxbqfkf() {
        return this.f43068zoijcleaow;
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f43067iobyxmoadg)) + ", right=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(zoijcleaow())) + ", width=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f43068zoijcleaow)) + ')';
    }

    public final float zoijcleaow() {
        return w0.nufgyqmvbu.lqeggnwhkg(this.f43067iobyxmoadg + this.f43068zoijcleaow);
    }

    private i5(float f13, float f14) {
        this.f43067iobyxmoadg = f13;
        this.f43068zoijcleaow = f14;
    }
}
