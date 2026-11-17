package qb0;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f78411eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f78412iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78413ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f78414wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f78415zoijcleaow;

    public zoijcleaow(int i13, int i14, boolean z13, int i15, boolean z14) {
        this.f78412iobyxmoadg = i13;
        this.f78415zoijcleaow = i14;
        this.f78413ppxfxbqfkf = z13;
        this.f78414wkgbmnqykc = i15;
        this.f78411eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f78411eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f78412iobyxmoadg == zoijcleaowVar.f78412iobyxmoadg && this.f78415zoijcleaow == zoijcleaowVar.f78415zoijcleaow && this.f78413ppxfxbqfkf == zoijcleaowVar.f78413ppxfxbqfkf && this.f78414wkgbmnqykc == zoijcleaowVar.f78414wkgbmnqykc && this.f78411eablkybsjg == zoijcleaowVar.f78411eablkybsjg;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f78412iobyxmoadg) * 31) + Integer.hashCode(this.f78415zoijcleaow)) * 31) + Boolean.hashCode(this.f78413ppxfxbqfkf)) * 31) + Integer.hashCode(this.f78414wkgbmnqykc)) * 31) + Boolean.hashCode(this.f78411eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f78414wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f78412iobyxmoadg;
    }

    public String toString() {
        return "ReviewAwaitingEvaluationStubUiModel(titleRes=" + this.f78412iobyxmoadg + ", descriptionRes=" + this.f78415zoijcleaow + ", isButtonVisible=" + this.f78413ppxfxbqfkf + ", buttonTextRes=" + this.f78414wkgbmnqykc + ", isVisible=" + this.f78411eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f78413ppxfxbqfkf;
    }

    public final int zoijcleaow() {
        return this.f78415zoijcleaow;
    }
}
