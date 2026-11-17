package i32;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f41942iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f41943ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f41944zoijcleaow;

    public iobyxmoadg(int i13, int i14, int i15) {
        this.f41942iobyxmoadg = i13;
        this.f41944zoijcleaow = i14;
        this.f41943ppxfxbqfkf = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f41942iobyxmoadg == iobyxmoadgVar.f41942iobyxmoadg && this.f41944zoijcleaow == iobyxmoadgVar.f41944zoijcleaow && this.f41943ppxfxbqfkf == iobyxmoadgVar.f41943ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f41942iobyxmoadg) * 31) + Integer.hashCode(this.f41944zoijcleaow)) * 31) + Integer.hashCode(this.f41943ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f41944zoijcleaow;
    }

    public final int ppxfxbqfkf() {
        return this.f41942iobyxmoadg;
    }

    public String toString() {
        return "OnboardingItemUiModel(titleRes=" + this.f41942iobyxmoadg + ", descriptionRes=" + this.f41944zoijcleaow + ", imageRes=" + this.f41943ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f41943ppxfxbqfkf;
    }
}
