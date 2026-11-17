package z81;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboHint;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f129327eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ComboHint f129328gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f129329iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final double f129330lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f129331nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f129332ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ComboHint f129333wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f129334zoijcleaow;

    public gxszxtbevo(String title, String description, List productsFirst, ComboHint comboHint, List productsSecond, ComboHint comboHint2, double d13, double d14) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(productsFirst, "productsFirst");
        zdlpuopuiu.btonecajqb(productsSecond, "productsSecond");
        this.f129329iobyxmoadg = title;
        this.f129334zoijcleaow = description;
        this.f129332ppxfxbqfkf = productsFirst;
        this.f129333wkgbmnqykc = comboHint;
        this.f129327eablkybsjg = productsSecond;
        this.f129328gxszxtbevo = comboHint2;
        this.f129330lqeggnwhkg = d13;
        this.f129331nufgyqmvbu = d14;
    }

    public final List eablkybsjg() {
        return this.f129327eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f129329iobyxmoadg, gxszxtbevoVar.f129329iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129334zoijcleaow, gxszxtbevoVar.f129334zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129332ppxfxbqfkf, gxszxtbevoVar.f129332ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f129333wkgbmnqykc, gxszxtbevoVar.f129333wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f129327eablkybsjg, gxszxtbevoVar.f129327eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f129328gxszxtbevo, gxszxtbevoVar.f129328gxszxtbevo) && Double.compare(this.f129330lqeggnwhkg, gxszxtbevoVar.f129330lqeggnwhkg) == 0 && Double.compare(this.f129331nufgyqmvbu, gxszxtbevoVar.f129331nufgyqmvbu) == 0;
    }

    public final ComboHint gxszxtbevo() {
        return this.f129328gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((((this.f129329iobyxmoadg.hashCode() * 31) + this.f129334zoijcleaow.hashCode()) * 31) + this.f129332ppxfxbqfkf.hashCode()) * 31;
        ComboHint comboHint = this.f129333wkgbmnqykc;
        int iHashCode2 = (((iHashCode + (comboHint == null ? 0 : comboHint.hashCode())) * 31) + this.f129327eablkybsjg.hashCode()) * 31;
        ComboHint comboHint2 = this.f129328gxszxtbevo;
        return ((((iHashCode2 + (comboHint2 != null ? comboHint2.hashCode() : 0)) * 31) + Double.hashCode(this.f129330lqeggnwhkg)) * 31) + Double.hashCode(this.f129331nufgyqmvbu);
    }

    public final double iobyxmoadg() {
        return this.f129330lqeggnwhkg;
    }

    public final String lqeggnwhkg() {
        return this.f129329iobyxmoadg;
    }

    public final double nufgyqmvbu() {
        return this.f129331nufgyqmvbu;
    }

    public final List ppxfxbqfkf() {
        return this.f129332ppxfxbqfkf;
    }

    public String toString() {
        return "Model(title=" + this.f129329iobyxmoadg + ", description=" + this.f129334zoijcleaow + ", productsFirst=" + this.f129332ppxfxbqfkf + ", productsFirstHint=" + this.f129333wkgbmnqykc + ", productsSecond=" + this.f129327eablkybsjg + ", productsSecondHint=" + this.f129328gxszxtbevo + ", comboPrice=" + this.f129330lqeggnwhkg + ", totalPriceWithoutDiscount=" + this.f129331nufgyqmvbu + ")";
    }

    public final ComboHint wkgbmnqykc() {
        return this.f129333wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f129334zoijcleaow;
    }
}
