package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f97434eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Point f97435gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f97436iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f97437lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f97438nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f97439ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f97440wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f97441zoijcleaow;

    public enum iobyxmoadg {
        MAP,
        LIST;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f97442iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public wkgbmnqykc(boolean z13, List visibleShops, List shopsOnMap, iobyxmoadg page, boolean z14, Point point, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(visibleShops, "visibleShops");
        zdlpuopuiu.btonecajqb(shopsOnMap, "shopsOnMap");
        zdlpuopuiu.btonecajqb(page, "page");
        this.f97436iobyxmoadg = z13;
        this.f97441zoijcleaow = visibleShops;
        this.f97439ppxfxbqfkf = shopsOnMap;
        this.f97440wkgbmnqykc = page;
        this.f97434eablkybsjg = z14;
        this.f97435gxszxtbevo = point;
        this.f97437lqeggnwhkg = z15;
        this.f97438nufgyqmvbu = z16;
    }

    public final List eablkybsjg() {
        return this.f97441zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f97436iobyxmoadg == wkgbmnqykcVar.f97436iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f97441zoijcleaow, wkgbmnqykcVar.f97441zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97439ppxfxbqfkf, wkgbmnqykcVar.f97439ppxfxbqfkf) && this.f97440wkgbmnqykc == wkgbmnqykcVar.f97440wkgbmnqykc && this.f97434eablkybsjg == wkgbmnqykcVar.f97434eablkybsjg && zdlpuopuiu.eablkybsjg(this.f97435gxszxtbevo, wkgbmnqykcVar.f97435gxszxtbevo) && this.f97437lqeggnwhkg == wkgbmnqykcVar.f97437lqeggnwhkg && this.f97438nufgyqmvbu == wkgbmnqykcVar.f97438nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f97437lqeggnwhkg;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f97436iobyxmoadg) * 31) + this.f97441zoijcleaow.hashCode()) * 31) + this.f97439ppxfxbqfkf.hashCode()) * 31) + this.f97440wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f97434eablkybsjg)) * 31;
        Point point = this.f97435gxszxtbevo;
        return ((((iHashCode + (point == null ? 0 : point.hashCode())) * 31) + Boolean.hashCode(this.f97437lqeggnwhkg)) * 31) + Boolean.hashCode(this.f97438nufgyqmvbu);
    }

    public final boolean iobyxmoadg() {
        return this.f97434eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f97436iobyxmoadg;
    }

    public final boolean nufgyqmvbu() {
        return this.f97438nufgyqmvbu;
    }

    public final List ppxfxbqfkf() {
        return this.f97439ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f97436iobyxmoadg + ", visibleShops=" + this.f97441zoijcleaow + ", shopsOnMap=" + this.f97439ppxfxbqfkf + ", page=" + this.f97440wkgbmnqykc + ", hasFilters=" + this.f97434eablkybsjg + ", userLocation=" + this.f97435gxszxtbevo + ", isBlueMapMarkers=" + this.f97437lqeggnwhkg + ", isNeedScrollToTop=" + this.f97438nufgyqmvbu + ")";
    }

    public final Point wkgbmnqykc() {
        return this.f97435gxszxtbevo;
    }

    public final iobyxmoadg zoijcleaow() {
        return this.f97440wkgbmnqykc;
    }
}
