package g0;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35707iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gg.dxjokdxxww f35708zoijcleaow;

    public iobyxmoadg(String str, gg.dxjokdxxww dxjokdxxwwVar) {
        this.f35707iobyxmoadg = str;
        this.f35708zoijcleaow = dxjokdxxwwVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35707iobyxmoadg, iobyxmoadgVar.f35707iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35708zoijcleaow, iobyxmoadgVar.f35708zoijcleaow);
    }

    public int hashCode() {
        String str = this.f35707iobyxmoadg;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        gg.dxjokdxxww dxjokdxxwwVar = this.f35708zoijcleaow;
        return iHashCode + (dxjokdxxwwVar != null ? dxjokdxxwwVar.hashCode() : 0);
    }

    public final gg.dxjokdxxww iobyxmoadg() {
        return this.f35708zoijcleaow;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f35707iobyxmoadg + ", action=" + this.f35708zoijcleaow + ')';
    }

    public final String zoijcleaow() {
        return this.f35707iobyxmoadg;
    }
}
