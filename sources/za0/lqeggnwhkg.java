package za0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f129445iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f129446zoijcleaow;

    public lqeggnwhkg(List productsFirst, List productsSecond) {
        zdlpuopuiu.btonecajqb(productsFirst, "productsFirst");
        zdlpuopuiu.btonecajqb(productsSecond, "productsSecond");
        this.f129445iobyxmoadg = productsFirst;
        this.f129446zoijcleaow = productsSecond;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f129445iobyxmoadg, lqeggnwhkgVar.f129445iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129446zoijcleaow, lqeggnwhkgVar.f129446zoijcleaow);
    }

    public int hashCode() {
        return (this.f129445iobyxmoadg.hashCode() * 31) + this.f129446zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f129445iobyxmoadg;
    }

    public String toString() {
        return "Model(productsFirst=" + this.f129445iobyxmoadg + ", productsSecond=" + this.f129446zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f129446zoijcleaow;
    }
}
