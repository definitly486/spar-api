package ru.myspar.proloyalty.myspar.impl.presentation;

import hg.tzroggbefp;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f98166iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f98167ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f98168wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f98169zoijcleaow;

    public oxmwwwfdhm(Map section, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
        this.f98166iobyxmoadg = section;
        this.f98169zoijcleaow = z13;
        this.f98167ppxfxbqfkf = z14;
        this.f98168wkgbmnqykc = z15;
    }

    public static /* synthetic */ oxmwwwfdhm zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar, Map map, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = oxmwwwfdhmVar.f98166iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = oxmwwwfdhmVar.f98169zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = oxmwwwfdhmVar.f98167ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z15 = oxmwwwfdhmVar.f98168wkgbmnqykc;
        }
        return oxmwwwfdhmVar.iobyxmoadg(map, z13, z14, z15);
    }

    public final boolean eablkybsjg() {
        return this.f98167ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm)) {
            return false;
        }
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98166iobyxmoadg, oxmwwwfdhmVar.f98166iobyxmoadg) && this.f98169zoijcleaow == oxmwwwfdhmVar.f98169zoijcleaow && this.f98167ppxfxbqfkf == oxmwwwfdhmVar.f98167ppxfxbqfkf && this.f98168wkgbmnqykc == oxmwwwfdhmVar.f98168wkgbmnqykc;
    }

    public final boolean gxszxtbevo() {
        Map map = this.f98166iobyxmoadg;
        if (map.isEmpty()) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            df1.iobyxmoadg iobyxmoadgVar = (df1.iobyxmoadg) ((Map.Entry) it.next()).getValue();
            if (iobyxmoadgVar != null ? iobyxmoadgVar.wkgbmnqykc() : false) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f98166iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f98169zoijcleaow)) * 31) + Boolean.hashCode(this.f98167ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f98168wkgbmnqykc);
    }

    public final oxmwwwfdhm iobyxmoadg(Map section, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
        return new oxmwwwfdhm(section, z13, z14, z15);
    }

    public final Map ppxfxbqfkf() {
        return this.f98166iobyxmoadg;
    }

    public String toString() {
        return "Model(section=" + this.f98166iobyxmoadg + ", adapterIsCleanWhenDestroy=" + this.f98169zoijcleaow + ", isSwipeToRefreshLoading=" + this.f98167ppxfxbqfkf + ", isFullScreenLoading=" + this.f98168wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f98168wkgbmnqykc;
    }

    public /* synthetic */ oxmwwwfdhm(Map map, boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
