package ep1;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f31760iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f31761ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f31762zoijcleaow;

    public iobyxmoadg(int i13, int i14, int i15) {
        this.f31760iobyxmoadg = i13;
        this.f31762zoijcleaow = i14;
        this.f31761ppxfxbqfkf = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f31760iobyxmoadg == iobyxmoadgVar.f31760iobyxmoadg && this.f31762zoijcleaow == iobyxmoadgVar.f31762zoijcleaow && this.f31761ppxfxbqfkf == iobyxmoadgVar.f31761ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f31760iobyxmoadg) * 31) + Integer.hashCode(this.f31762zoijcleaow)) * 31) + Integer.hashCode(this.f31761ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f31762zoijcleaow;
    }

    public final int ppxfxbqfkf() {
        return this.f31760iobyxmoadg;
    }

    public String toString() {
        return "OnboardingItemUiModel(titleRes=" + this.f31760iobyxmoadg + ", descriptionRes=" + this.f31762zoijcleaow + ", imageRes=" + this.f31761ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f31761ppxfxbqfkf;
    }
}
