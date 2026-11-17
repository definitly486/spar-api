package e10;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30190iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f30191zoijcleaow;

    public lqeggnwhkg(String name, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f30190iobyxmoadg = name;
        this.f30191zoijcleaow = z13;
    }

    public static /* synthetic */ lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lqeggnwhkgVar.f30190iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = lqeggnwhkgVar.f30191zoijcleaow;
        }
        return lqeggnwhkgVar.iobyxmoadg(str, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f30190iobyxmoadg, lqeggnwhkgVar.f30190iobyxmoadg) && this.f30191zoijcleaow == lqeggnwhkgVar.f30191zoijcleaow;
    }

    public int hashCode() {
        return (this.f30190iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f30191zoijcleaow);
    }

    public final lqeggnwhkg iobyxmoadg(String name, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        return new lqeggnwhkg(name, z13);
    }

    public final String ppxfxbqfkf() {
        return this.f30190iobyxmoadg;
    }

    public String toString() {
        return "OrderEditPromocode(name=" + this.f30190iobyxmoadg + ", status=" + this.f30191zoijcleaow + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f30191zoijcleaow;
    }

    public /* synthetic */ lqeggnwhkg(String str, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13);
    }
}
