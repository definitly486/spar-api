package md0;

/* JADX INFO: loaded from: classes4.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f66854iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f66855zoijcleaow;

    public kcexrzcfyt(boolean z13, boolean z14) {
        this.f66854iobyxmoadg = z13;
        this.f66855zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return this.f66854iobyxmoadg == kcexrzcfytVar.f66854iobyxmoadg && this.f66855zoijcleaow == kcexrzcfytVar.f66855zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f66854iobyxmoadg) * 31) + Boolean.hashCode(this.f66855zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f66855zoijcleaow;
    }

    public String toString() {
        return "Model(isFlashVisibility=" + this.f66854iobyxmoadg + ", isFlashEnabled=" + this.f66855zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f66854iobyxmoadg;
    }
}
