package mj;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67248iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zg.btonecajqb f67249zoijcleaow;

    public btonecajqb(String value, zg.btonecajqb range) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(range, "range");
        this.f67248iobyxmoadg = value;
        this.f67249zoijcleaow = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f67248iobyxmoadg, btonecajqbVar.f67248iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f67249zoijcleaow, btonecajqbVar.f67249zoijcleaow);
    }

    public int hashCode() {
        return (this.f67248iobyxmoadg.hashCode() * 31) + this.f67249zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f67248iobyxmoadg;
    }

    public String toString() {
        return "MatchGroup(value=" + this.f67248iobyxmoadg + ", range=" + this.f67249zoijcleaow + ')';
    }
}
