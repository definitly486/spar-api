package uz0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114840iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f114841zoijcleaow;

    public lqeggnwhkg(String name, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f114840iobyxmoadg = name;
        this.f114841zoijcleaow = z13;
    }

    public static /* synthetic */ lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lqeggnwhkgVar.f114840iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = lqeggnwhkgVar.f114841zoijcleaow;
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
        return zdlpuopuiu.eablkybsjg(this.f114840iobyxmoadg, lqeggnwhkgVar.f114840iobyxmoadg) && this.f114841zoijcleaow == lqeggnwhkgVar.f114841zoijcleaow;
    }

    public int hashCode() {
        return (this.f114840iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f114841zoijcleaow);
    }

    public final lqeggnwhkg iobyxmoadg(String name, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        return new lqeggnwhkg(name, z13);
    }

    public final String ppxfxbqfkf() {
        return this.f114840iobyxmoadg;
    }

    public String toString() {
        return "OrderEditPromocode(name=" + this.f114840iobyxmoadg + ", status=" + this.f114841zoijcleaow + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f114841zoijcleaow;
    }

    public /* synthetic */ lqeggnwhkg(String str, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13);
    }
}
