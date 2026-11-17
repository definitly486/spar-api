package te0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f110336eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f110337gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f110338iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final we0.iobyxmoadg f110339lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f110340ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f110341wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f110342zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, String date, List categories, boolean z15, boolean z16, we0.iobyxmoadg info) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(categories, "categories");
        zdlpuopuiu.btonecajqb(info, "info");
        this.f110338iobyxmoadg = z13;
        this.f110342zoijcleaow = z14;
        this.f110340ppxfxbqfkf = date;
        this.f110341wkgbmnqykc = categories;
        this.f110336eablkybsjg = z15;
        this.f110337gxszxtbevo = z16;
        this.f110339lqeggnwhkg = info;
    }

    public final boolean eablkybsjg() {
        return this.f110338iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f110338iobyxmoadg == lqeggnwhkgVar.f110338iobyxmoadg && this.f110342zoijcleaow == lqeggnwhkgVar.f110342zoijcleaow && zdlpuopuiu.eablkybsjg(this.f110340ppxfxbqfkf, lqeggnwhkgVar.f110340ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f110341wkgbmnqykc, lqeggnwhkgVar.f110341wkgbmnqykc) && this.f110336eablkybsjg == lqeggnwhkgVar.f110336eablkybsjg && this.f110337gxszxtbevo == lqeggnwhkgVar.f110337gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f110339lqeggnwhkg, lqeggnwhkgVar.f110339lqeggnwhkg);
    }

    public final boolean gxszxtbevo() {
        return this.f110342zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f110338iobyxmoadg) * 31) + Boolean.hashCode(this.f110342zoijcleaow)) * 31) + this.f110340ppxfxbqfkf.hashCode()) * 31) + this.f110341wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f110336eablkybsjg)) * 31) + Boolean.hashCode(this.f110337gxszxtbevo)) * 31) + this.f110339lqeggnwhkg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f110341wkgbmnqykc;
    }

    public final boolean lqeggnwhkg() {
        return this.f110337gxszxtbevo;
    }

    public final we0.iobyxmoadg ppxfxbqfkf() {
        return this.f110339lqeggnwhkg;
    }

    public String toString() {
        return "Model(isInitialized=" + this.f110338iobyxmoadg + ", isLoading=" + this.f110342zoijcleaow + ", date=" + this.f110340ppxfxbqfkf + ", categories=" + this.f110341wkgbmnqykc + ", isBtnAcceptEnabled=" + this.f110336eablkybsjg + ", isSelectedAvailable=" + this.f110337gxszxtbevo + ", info=" + this.f110339lqeggnwhkg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f110336eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f110340ppxfxbqfkf;
    }
}
