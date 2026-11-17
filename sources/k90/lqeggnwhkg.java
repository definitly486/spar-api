package k90;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f54207iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f54208zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14) {
        this.f54207iobyxmoadg = z13;
        this.f54208zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f54207iobyxmoadg == lqeggnwhkgVar.f54207iobyxmoadg && this.f54208zoijcleaow == lqeggnwhkgVar.f54208zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f54207iobyxmoadg) * 31) + Boolean.hashCode(this.f54208zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f54207iobyxmoadg;
    }

    public String toString() {
        return "Model(switchEchecksIsEnabled=" + this.f54207iobyxmoadg + ", isLoading=" + this.f54208zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f54208zoijcleaow;
    }
}
