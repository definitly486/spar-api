package ru.myspar.catalog.impl.search;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import j0.l;
import java.util.List;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f85451btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final String f85452draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final oxmwwwfdhm f85453dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Integer f85454eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f85455gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f85456gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f85457iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f85458lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final v00.ppxfxbqfkf f85459nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tzroggbefp f85460ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f85461wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f85462zoijcleaow;

    public rgvfuqvkyq(boolean z13, boolean z14, tzroggbefp searchQuery, String str, Integer num, List searchItems, boolean z15, v00.ppxfxbqfkf sortType, oxmwwwfdhm oxmwwwfdhmVar, boolean z16, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchItems, "searchItems");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sortType, "sortType");
        this.f85457iobyxmoadg = z13;
        this.f85462zoijcleaow = z14;
        this.f85460ppxfxbqfkf = searchQuery;
        this.f85461wkgbmnqykc = str;
        this.f85454eablkybsjg = num;
        this.f85456gxszxtbevo = searchItems;
        this.f85458lqeggnwhkg = z15;
        this.f85459nufgyqmvbu = sortType;
        this.f85453dxjokdxxww = oxmwwwfdhmVar;
        this.f85451btonecajqb = z16;
        this.f85455gtknphoqwx = z17;
        this.f85452draadjrbmk = searchQuery.draadjrbmk();
    }

    public final boolean agtfadlqog() {
        return this.f85455gtknphoqwx;
    }

    public final v00.ppxfxbqfkf btonecajqb() {
        return this.f85459nufgyqmvbu;
    }

    public final boolean draadjrbmk() {
        return this.f85451btonecajqb;
    }

    public final String dxjokdxxww() {
        return this.f85461wkgbmnqykc;
    }

    public final String eablkybsjg() {
        return this.f85452draadjrbmk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return this.f85457iobyxmoadg == rgvfuqvkyqVar.f85457iobyxmoadg && this.f85462zoijcleaow == rgvfuqvkyqVar.f85462zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85460ppxfxbqfkf, rgvfuqvkyqVar.f85460ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85461wkgbmnqykc, rgvfuqvkyqVar.f85461wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85454eablkybsjg, rgvfuqvkyqVar.f85454eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85456gxszxtbevo, rgvfuqvkyqVar.f85456gxszxtbevo) && this.f85458lqeggnwhkg == rgvfuqvkyqVar.f85458lqeggnwhkg && this.f85459nufgyqmvbu == rgvfuqvkyqVar.f85459nufgyqmvbu && this.f85453dxjokdxxww == rgvfuqvkyqVar.f85453dxjokdxxww && this.f85451btonecajqb == rgvfuqvkyqVar.f85451btonecajqb && this.f85455gtknphoqwx == rgvfuqvkyqVar.f85455gtknphoqwx;
    }

    public final oxmwwwfdhm gtknphoqwx() {
        return this.f85453dxjokdxxww;
    }

    public final boolean gxszxtbevo() {
        return this.f85462zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f85457iobyxmoadg) * 31) + Boolean.hashCode(this.f85462zoijcleaow)) * 31) + this.f85460ppxfxbqfkf.hashCode()) * 31;
        String str = this.f85461wkgbmnqykc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f85454eablkybsjg;
        int iHashCode3 = (((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.f85456gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f85458lqeggnwhkg)) * 31) + this.f85459nufgyqmvbu.hashCode()) * 31;
        oxmwwwfdhm oxmwwwfdhmVar = this.f85453dxjokdxxww;
        return ((((iHashCode3 + (oxmwwwfdhmVar != null ? oxmwwwfdhmVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f85451btonecajqb)) * 31) + Boolean.hashCode(this.f85455gtknphoqwx);
    }

    public final rgvfuqvkyq iobyxmoadg(boolean z13, boolean z14, tzroggbefp searchQuery, String str, Integer num, List searchItems, boolean z15, v00.ppxfxbqfkf sortType, oxmwwwfdhm oxmwwwfdhmVar, boolean z16, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchItems, "searchItems");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sortType, "sortType");
        return new rgvfuqvkyq(z13, z14, searchQuery, str, num, searchItems, z15, sortType, oxmwwwfdhmVar, z16, z17);
    }

    public final List lqeggnwhkg() {
        return this.f85456gxszxtbevo;
    }

    public final tzroggbefp nufgyqmvbu() {
        return this.f85460ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f85458lqeggnwhkg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f85457iobyxmoadg + ", returnOrderIsVisible=" + this.f85462zoijcleaow + ", searchQuery=" + this.f85460ppxfxbqfkf + ", sectionId=" + this.f85461wkgbmnqykc + ", page=" + this.f85454eablkybsjg + ", searchItems=" + this.f85456gxszxtbevo + ", filterSortPanelIsVisible=" + this.f85458lqeggnwhkg + ", sortType=" + this.f85459nufgyqmvbu + ", warningType=" + this.f85453dxjokdxxww + ", isGridModeEnabled=" + this.f85451btonecajqb + ", isSelectListTypeEnabled=" + this.f85455gtknphoqwx + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f85457iobyxmoadg;
    }

    public final Integer wkgbmnqykc() {
        return this.f85454eablkybsjg;
    }

    public /* synthetic */ rgvfuqvkyq(boolean z13, boolean z14, tzroggbefp tzroggbefpVar, String str, Integer num, List list, boolean z15, v00.ppxfxbqfkf ppxfxbqfkfVar, oxmwwwfdhm oxmwwwfdhmVar, boolean z16, boolean z17, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? new tzroggbefp("", 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null) : tzroggbefpVar, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 64) != 0 ? false : z15, ppxfxbqfkfVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : oxmwwwfdhmVar, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z17);
    }
}
