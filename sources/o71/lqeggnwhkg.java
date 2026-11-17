package o71;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f72266iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f72267zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14) {
        this.f72266iobyxmoadg = z13;
        this.f72267zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f72266iobyxmoadg == lqeggnwhkgVar.f72266iobyxmoadg && this.f72267zoijcleaow == lqeggnwhkgVar.f72267zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f72266iobyxmoadg) * 31) + Boolean.hashCode(this.f72267zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f72266iobyxmoadg;
    }

    public String toString() {
        return "Model(switchEchecksIsEnabled=" + this.f72266iobyxmoadg + ", isLoading=" + this.f72267zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f72267zoijcleaow;
    }
}
