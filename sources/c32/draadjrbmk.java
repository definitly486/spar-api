package c32;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f18704iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f18705zoijcleaow;

    public draadjrbmk(boolean z13, boolean z14) {
        this.f18704iobyxmoadg = z13;
        this.f18705zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f18704iobyxmoadg == draadjrbmkVar.f18704iobyxmoadg && this.f18705zoijcleaow == draadjrbmkVar.f18705zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f18704iobyxmoadg) * 31) + Boolean.hashCode(this.f18705zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f18704iobyxmoadg;
    }

    public String toString() {
        return "Model(isRemove=" + this.f18704iobyxmoadg + ", isWeightProduct=" + this.f18705zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f18705zoijcleaow;
    }
}
