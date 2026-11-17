package yo1;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f126023iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f126024zoijcleaow;

    public draadjrbmk(boolean z13, boolean z14) {
        this.f126023iobyxmoadg = z13;
        this.f126024zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f126023iobyxmoadg == draadjrbmkVar.f126023iobyxmoadg && this.f126024zoijcleaow == draadjrbmkVar.f126024zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f126023iobyxmoadg) * 31) + Boolean.hashCode(this.f126024zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f126023iobyxmoadg;
    }

    public String toString() {
        return "Model(isRemove=" + this.f126023iobyxmoadg + ", isWeightProduct=" + this.f126024zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f126024zoijcleaow;
    }
}
