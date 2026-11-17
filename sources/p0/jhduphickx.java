package p0;

/* JADX INFO: loaded from: classes.dex */
public final class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f75234iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ylkuphrtab f75235zoijcleaow;

    public jhduphickx(j0.eablkybsjg eablkybsjgVar, ylkuphrtab ylkuphrtabVar) {
        this.f75234iobyxmoadg = eablkybsjgVar;
        this.f75235zoijcleaow = ylkuphrtabVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhduphickx)) {
            return false;
        }
        jhduphickx jhduphickxVar = (jhduphickx) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75234iobyxmoadg, jhduphickxVar.f75234iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75235zoijcleaow, jhduphickxVar.f75235zoijcleaow);
    }

    public int hashCode() {
        return (this.f75234iobyxmoadg.hashCode() * 31) + this.f75235zoijcleaow.hashCode();
    }

    public final ylkuphrtab iobyxmoadg() {
        return this.f75235zoijcleaow;
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f75234iobyxmoadg) + ", offsetMapping=" + this.f75235zoijcleaow + ')';
    }

    public final j0.eablkybsjg zoijcleaow() {
        return this.f75234iobyxmoadg;
    }
}
