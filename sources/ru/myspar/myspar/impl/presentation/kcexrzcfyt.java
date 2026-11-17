package ru.myspar.myspar.impl.presentation;

import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f90769iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f90770ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f90771wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f90772zoijcleaow;

    public kcexrzcfyt(Map section, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
        this.f90769iobyxmoadg = section;
        this.f90772zoijcleaow = z13;
        this.f90770ppxfxbqfkf = z14;
        this.f90771wkgbmnqykc = z15;
    }

    public static /* synthetic */ kcexrzcfyt zoijcleaow(kcexrzcfyt kcexrzcfytVar, Map map, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = kcexrzcfytVar.f90769iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = kcexrzcfytVar.f90772zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = kcexrzcfytVar.f90770ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z15 = kcexrzcfytVar.f90771wkgbmnqykc;
        }
        return kcexrzcfytVar.iobyxmoadg(map, z13, z14, z15);
    }

    public final boolean eablkybsjg() {
        return this.f90770ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90769iobyxmoadg, kcexrzcfytVar.f90769iobyxmoadg) && this.f90772zoijcleaow == kcexrzcfytVar.f90772zoijcleaow && this.f90770ppxfxbqfkf == kcexrzcfytVar.f90770ppxfxbqfkf && this.f90771wkgbmnqykc == kcexrzcfytVar.f90771wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f90769iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f90772zoijcleaow)) * 31) + Boolean.hashCode(this.f90770ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f90771wkgbmnqykc);
    }

    public final kcexrzcfyt iobyxmoadg(Map section, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
        return new kcexrzcfyt(section, z13, z14, z15);
    }

    public final Map ppxfxbqfkf() {
        return this.f90769iobyxmoadg;
    }

    public String toString() {
        return "Model(section=" + this.f90769iobyxmoadg + ", adapterIsCleanWhenDestroy=" + this.f90772zoijcleaow + ", isSwipeToRefreshLoading=" + this.f90770ppxfxbqfkf + ", isFullScreenLoading=" + this.f90771wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f90771wkgbmnqykc;
    }

    public /* synthetic */ kcexrzcfyt(Map map, boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
