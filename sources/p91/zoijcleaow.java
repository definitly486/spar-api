package p91;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f76245eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f76246iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f76247ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f76248wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f76249zoijcleaow;

    public zoijcleaow(int i13, int i14, boolean z13, int i15, boolean z14) {
        this.f76246iobyxmoadg = i13;
        this.f76249zoijcleaow = i14;
        this.f76247ppxfxbqfkf = z13;
        this.f76248wkgbmnqykc = i15;
        this.f76245eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f76245eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f76246iobyxmoadg == zoijcleaowVar.f76246iobyxmoadg && this.f76249zoijcleaow == zoijcleaowVar.f76249zoijcleaow && this.f76247ppxfxbqfkf == zoijcleaowVar.f76247ppxfxbqfkf && this.f76248wkgbmnqykc == zoijcleaowVar.f76248wkgbmnqykc && this.f76245eablkybsjg == zoijcleaowVar.f76245eablkybsjg;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f76246iobyxmoadg) * 31) + Integer.hashCode(this.f76249zoijcleaow)) * 31) + Boolean.hashCode(this.f76247ppxfxbqfkf)) * 31) + Integer.hashCode(this.f76248wkgbmnqykc)) * 31) + Boolean.hashCode(this.f76245eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f76248wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f76246iobyxmoadg;
    }

    public String toString() {
        return "ReviewAwaitingEvaluationStubUiModel(titleRes=" + this.f76246iobyxmoadg + ", descriptionRes=" + this.f76249zoijcleaow + ", isButtonVisible=" + this.f76247ppxfxbqfkf + ", buttonTextRes=" + this.f76248wkgbmnqykc + ", isVisible=" + this.f76245eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f76247ppxfxbqfkf;
    }

    public final int zoijcleaow() {
        return this.f76249zoijcleaow;
    }
}
