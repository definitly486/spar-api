package mj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f67341eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f67342gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67343iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f67344lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f67345ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f67346wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f67347zoijcleaow;

    public dxjokdxxww(String listName, double d13, int i13, List products, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(listName, "listName");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f67343iobyxmoadg = listName;
        this.f67347zoijcleaow = d13;
        this.f67345ppxfxbqfkf = i13;
        this.f67346wkgbmnqykc = products;
        this.f67341eablkybsjg = z13;
        this.f67342gxszxtbevo = z14;
        this.f67344lqeggnwhkg = z15;
    }

    public final double eablkybsjg() {
        return this.f67347zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f67343iobyxmoadg, dxjokdxxwwVar.f67343iobyxmoadg) && Double.compare(this.f67347zoijcleaow, dxjokdxxwwVar.f67347zoijcleaow) == 0 && this.f67345ppxfxbqfkf == dxjokdxxwwVar.f67345ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f67346wkgbmnqykc, dxjokdxxwwVar.f67346wkgbmnqykc) && this.f67341eablkybsjg == dxjokdxxwwVar.f67341eablkybsjg && this.f67342gxszxtbevo == dxjokdxxwwVar.f67342gxszxtbevo && this.f67344lqeggnwhkg == dxjokdxxwwVar.f67344lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f67344lqeggnwhkg;
    }

    public int hashCode() {
        return (((((((((((this.f67343iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f67347zoijcleaow)) * 31) + Integer.hashCode(this.f67345ppxfxbqfkf)) * 31) + this.f67346wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f67341eablkybsjg)) * 31) + Boolean.hashCode(this.f67342gxszxtbevo)) * 31) + Boolean.hashCode(this.f67344lqeggnwhkg);
    }

    public final int iobyxmoadg() {
        return this.f67345ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f67342gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f67343iobyxmoadg;
    }

    public String toString() {
        return "Model(listName=" + this.f67343iobyxmoadg + ", sum=" + this.f67347zoijcleaow + ", count=" + this.f67345ppxfxbqfkf + ", products=" + this.f67346wkgbmnqykc + ", emptyViewVisible=" + this.f67341eablkybsjg + ", isShareListFeatureEnabled=" + this.f67342gxszxtbevo + ", isLoading=" + this.f67344lqeggnwhkg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f67346wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f67341eablkybsjg;
    }
}
