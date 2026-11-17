package yp0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f126125btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f126126dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Integer f126127eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f126128gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f126129iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f126130lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final mz0.ppxfxbqfkf f126131nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tzroggbefp f126132ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f126133wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f126134zoijcleaow;

    public rgvfuqvkyq(boolean z13, boolean z14, tzroggbefp searchQuery, int i13, Integer num, List searchItems, boolean z15, mz0.ppxfxbqfkf sortType, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        zdlpuopuiu.btonecajqb(searchItems, "searchItems");
        zdlpuopuiu.btonecajqb(sortType, "sortType");
        this.f126129iobyxmoadg = z13;
        this.f126134zoijcleaow = z14;
        this.f126132ppxfxbqfkf = searchQuery;
        this.f126133wkgbmnqykc = i13;
        this.f126127eablkybsjg = num;
        this.f126128gxszxtbevo = searchItems;
        this.f126130lqeggnwhkg = z15;
        this.f126131nufgyqmvbu = sortType;
        this.f126126dxjokdxxww = z16;
        this.f126125btonecajqb = z17;
    }

    public final boolean btonecajqb() {
        return this.f126125btonecajqb;
    }

    public final boolean dxjokdxxww() {
        return this.f126129iobyxmoadg;
    }

    public final List eablkybsjg() {
        return this.f126128gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return this.f126129iobyxmoadg == rgvfuqvkyqVar.f126129iobyxmoadg && this.f126134zoijcleaow == rgvfuqvkyqVar.f126134zoijcleaow && zdlpuopuiu.eablkybsjg(this.f126132ppxfxbqfkf, rgvfuqvkyqVar.f126132ppxfxbqfkf) && this.f126133wkgbmnqykc == rgvfuqvkyqVar.f126133wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f126127eablkybsjg, rgvfuqvkyqVar.f126127eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f126128gxszxtbevo, rgvfuqvkyqVar.f126128gxszxtbevo) && this.f126130lqeggnwhkg == rgvfuqvkyqVar.f126130lqeggnwhkg && this.f126131nufgyqmvbu == rgvfuqvkyqVar.f126131nufgyqmvbu && this.f126126dxjokdxxww == rgvfuqvkyqVar.f126126dxjokdxxww && this.f126125btonecajqb == rgvfuqvkyqVar.f126125btonecajqb;
    }

    public final tzroggbefp gxszxtbevo() {
        return this.f126132ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f126129iobyxmoadg) * 31) + Boolean.hashCode(this.f126134zoijcleaow)) * 31) + this.f126132ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f126133wkgbmnqykc)) * 31;
        Integer num = this.f126127eablkybsjg;
        return ((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f126128gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f126130lqeggnwhkg)) * 31) + this.f126131nufgyqmvbu.hashCode()) * 31) + Boolean.hashCode(this.f126126dxjokdxxww)) * 31) + Boolean.hashCode(this.f126125btonecajqb);
    }

    public final int iobyxmoadg() {
        return this.f126133wkgbmnqykc;
    }

    public final mz0.ppxfxbqfkf lqeggnwhkg() {
        return this.f126131nufgyqmvbu;
    }

    public final boolean nufgyqmvbu() {
        return this.f126126dxjokdxxww;
    }

    public final Integer ppxfxbqfkf() {
        return this.f126127eablkybsjg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f126129iobyxmoadg + ", returnOrderIsVisible=" + this.f126134zoijcleaow + ", searchQuery=" + this.f126132ppxfxbqfkf + ", actionBarTitleRes=" + this.f126133wkgbmnqykc + ", page=" + this.f126127eablkybsjg + ", searchItems=" + this.f126128gxszxtbevo + ", filterSortPanelIsVisible=" + this.f126130lqeggnwhkg + ", sortType=" + this.f126131nufgyqmvbu + ", isGridModeEnabled=" + this.f126126dxjokdxxww + ", isSelectListTypeEnabled=" + this.f126125btonecajqb + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f126134zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f126130lqeggnwhkg;
    }
}
