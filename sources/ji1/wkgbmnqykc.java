package ji1;

import hg.jyumaefscl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f51568eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f51569gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f51570iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51571ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51572wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51573zoijcleaow;

    public wkgbmnqykc(boolean z13, String balance, boolean z14, boolean z15, boolean z16, List items) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(balance, "balance");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f51570iobyxmoadg = z13;
        this.f51573zoijcleaow = balance;
        this.f51571ppxfxbqfkf = z14;
        this.f51572wkgbmnqykc = z15;
        this.f51568eablkybsjg = z16;
        this.f51569gxszxtbevo = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f51570iobyxmoadg == wkgbmnqykcVar.f51570iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51573zoijcleaow, wkgbmnqykcVar.f51573zoijcleaow) && this.f51571ppxfxbqfkf == wkgbmnqykcVar.f51571ppxfxbqfkf && this.f51572wkgbmnqykc == wkgbmnqykcVar.f51572wkgbmnqykc && this.f51568eablkybsjg == wkgbmnqykcVar.f51568eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51569gxszxtbevo, wkgbmnqykcVar.f51569gxszxtbevo);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f51570iobyxmoadg) * 31) + this.f51573zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51571ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f51572wkgbmnqykc)) * 31) + Boolean.hashCode(this.f51568eablkybsjg)) * 31) + this.f51569gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51573zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f51570iobyxmoadg + ", balance=" + this.f51573zoijcleaow + ", isMyDiscountEnabled=" + this.f51571ppxfxbqfkf + ", isSavedCardsEnabled=" + this.f51572wkgbmnqykc + ", isPurchasesListEnabled=" + this.f51568eablkybsjg + ", items=" + this.f51569gxszxtbevo + ")";
    }

    public final List zoijcleaow() {
        return this.f51569gxszxtbevo;
    }

    public /* synthetic */ wkgbmnqykc(boolean z13, String str, boolean z14, boolean z15, boolean z16, List list, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, str, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? false : z16, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
