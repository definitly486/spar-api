package ba2;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f15586iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f15587ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15588zoijcleaow;

    public dxjokdxxww(tzroggbefp field, boolean z13, eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(field, "field");
        this.f15586iobyxmoadg = field;
        this.f15588zoijcleaow = z13;
        this.f15587ppxfxbqfkf = eablkybsjgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f15586iobyxmoadg, dxjokdxxwwVar.f15586iobyxmoadg) && this.f15588zoijcleaow == dxjokdxxwwVar.f15588zoijcleaow && zdlpuopuiu.eablkybsjg(this.f15587ppxfxbqfkf, dxjokdxxwwVar.f15587ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f15586iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15588zoijcleaow)) * 31;
        eablkybsjg eablkybsjgVar = this.f15587ppxfxbqfkf;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    public final boolean iobyxmoadg() {
        return this.f15588zoijcleaow;
    }

    public final tzroggbefp ppxfxbqfkf() {
        return this.f15586iobyxmoadg;
    }

    public String toString() {
        return "TipsInputUiModel(field=" + this.f15586iobyxmoadg + ", clearButtonIsEnabled=" + this.f15588zoijcleaow + ", error=" + this.f15587ppxfxbqfkf + ")";
    }

    public final eablkybsjg zoijcleaow() {
        return this.f15587ppxfxbqfkf;
    }
}
