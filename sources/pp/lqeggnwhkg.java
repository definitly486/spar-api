package pp;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f77070iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f77071zoijcleaow;

    public lqeggnwhkg(boolean z13, int i13) {
        this.f77070iobyxmoadg = z13;
        this.f77071zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f77070iobyxmoadg == lqeggnwhkgVar.f77070iobyxmoadg && this.f77071zoijcleaow == lqeggnwhkgVar.f77071zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f77070iobyxmoadg) * 31) + Integer.hashCode(this.f77071zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f77071zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f77070iobyxmoadg + ", messageRes=" + this.f77071zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f77070iobyxmoadg;
    }
}
