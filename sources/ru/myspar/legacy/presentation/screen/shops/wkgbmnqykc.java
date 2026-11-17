package ru.myspar.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f89804eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Point f89805gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f89806iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f89807lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f89808nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f89809ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f89810wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f89811zoijcleaow;

    public enum iobyxmoadg {
        MAP,
        LIST;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f89812iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public wkgbmnqykc(boolean z13, List visibleShops, List shopsOnMap, iobyxmoadg page, boolean z14, Point point, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(visibleShops, "visibleShops");
        zdlpuopuiu.btonecajqb(shopsOnMap, "shopsOnMap");
        zdlpuopuiu.btonecajqb(page, "page");
        this.f89806iobyxmoadg = z13;
        this.f89811zoijcleaow = visibleShops;
        this.f89809ppxfxbqfkf = shopsOnMap;
        this.f89810wkgbmnqykc = page;
        this.f89804eablkybsjg = z14;
        this.f89805gxszxtbevo = point;
        this.f89807lqeggnwhkg = z15;
        this.f89808nufgyqmvbu = z16;
    }

    public final List eablkybsjg() {
        return this.f89811zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f89806iobyxmoadg == wkgbmnqykcVar.f89806iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f89811zoijcleaow, wkgbmnqykcVar.f89811zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89809ppxfxbqfkf, wkgbmnqykcVar.f89809ppxfxbqfkf) && this.f89810wkgbmnqykc == wkgbmnqykcVar.f89810wkgbmnqykc && this.f89804eablkybsjg == wkgbmnqykcVar.f89804eablkybsjg && zdlpuopuiu.eablkybsjg(this.f89805gxszxtbevo, wkgbmnqykcVar.f89805gxszxtbevo) && this.f89807lqeggnwhkg == wkgbmnqykcVar.f89807lqeggnwhkg && this.f89808nufgyqmvbu == wkgbmnqykcVar.f89808nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f89807lqeggnwhkg;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f89806iobyxmoadg) * 31) + this.f89811zoijcleaow.hashCode()) * 31) + this.f89809ppxfxbqfkf.hashCode()) * 31) + this.f89810wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f89804eablkybsjg)) * 31;
        Point point = this.f89805gxszxtbevo;
        return ((((iHashCode + (point == null ? 0 : point.hashCode())) * 31) + Boolean.hashCode(this.f89807lqeggnwhkg)) * 31) + Boolean.hashCode(this.f89808nufgyqmvbu);
    }

    public final boolean iobyxmoadg() {
        return this.f89804eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f89806iobyxmoadg;
    }

    public final boolean nufgyqmvbu() {
        return this.f89808nufgyqmvbu;
    }

    public final List ppxfxbqfkf() {
        return this.f89809ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f89806iobyxmoadg + ", visibleShops=" + this.f89811zoijcleaow + ", shopsOnMap=" + this.f89809ppxfxbqfkf + ", page=" + this.f89810wkgbmnqykc + ", hasFilters=" + this.f89804eablkybsjg + ", userLocation=" + this.f89805gxszxtbevo + ", isBlueMapMarkers=" + this.f89807lqeggnwhkg + ", isNeedScrollToTop=" + this.f89808nufgyqmvbu + ")";
    }

    public final Point wkgbmnqykc() {
        return this.f89805gxszxtbevo;
    }

    public final iobyxmoadg zoijcleaow() {
        return this.f89810wkgbmnqykc;
    }
}
