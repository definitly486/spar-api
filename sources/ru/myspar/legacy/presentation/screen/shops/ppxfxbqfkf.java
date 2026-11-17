package ru.myspar.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.VisibleRegion;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class agtfadlqog extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f89786iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }
    }

    public static final class btonecajqb extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f89787iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }
    }

    public static final class draadjrbmk extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f89788iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mb0.wkgbmnqykc f89789iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f89790zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(mb0.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f89789iobyxmoadg = shop;
            this.f89790zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f89789iobyxmoadg, dxjokdxxwwVar.f89789iobyxmoadg) && this.f89790zoijcleaow == dxjokdxxwwVar.f89790zoijcleaow;
        }

        public int hashCode() {
            return (this.f89789iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f89790zoijcleaow);
        }

        public final mb0.wkgbmnqykc iobyxmoadg() {
            return this.f89789iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shop=" + this.f89789iobyxmoadg + ", isList=" + this.f89790zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f89790zoijcleaow;
        }

        public /* synthetic */ dxjokdxxww(mb0.wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(wkgbmnqykcVar, (i13 & 2) != 0 ? false : z13);
        }
    }

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f89791iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f89792ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final mb0.wkgbmnqykc f89793zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(VisibleRegion visibleRegion, mb0.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f89791iobyxmoadg = visibleRegion;
            this.f89793zoijcleaow = shop;
            this.f89792ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f89791iobyxmoadg, eablkybsjgVar.f89791iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89793zoijcleaow, eablkybsjgVar.f89793zoijcleaow) && this.f89792ppxfxbqfkf == eablkybsjgVar.f89792ppxfxbqfkf;
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f89791iobyxmoadg;
            return ((((visibleRegion == null ? 0 : visibleRegion.hashCode()) * 31) + this.f89793zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f89792ppxfxbqfkf);
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f89791iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f89792ppxfxbqfkf;
        }

        public String toString() {
            return "OnInListClicked(focusRegion=" + this.f89791iobyxmoadg + ", shop=" + this.f89793zoijcleaow + ", isList=" + this.f89792ppxfxbqfkf + ")";
        }

        public final mb0.wkgbmnqykc zoijcleaow() {
            return this.f89793zoijcleaow;
        }
    }

    public static final class gtknphoqwx extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f89794iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f89795iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f89796iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final VisibleRegion f89797zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CameraPosition lastCameraPosition, VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(lastCameraPosition, "lastCameraPosition");
            this.f89796iobyxmoadg = lastCameraPosition;
            this.f89797zoijcleaow = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f89796iobyxmoadg, iobyxmoadgVar.f89796iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89797zoijcleaow, iobyxmoadgVar.f89797zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f89796iobyxmoadg.hashCode() * 31;
            VisibleRegion visibleRegion = this.f89797zoijcleaow;
            return iHashCode + (visibleRegion == null ? 0 : visibleRegion.hashCode());
        }

        public final CameraPosition iobyxmoadg() {
            return this.f89796iobyxmoadg;
        }

        public String toString() {
            return "FiltersClicked(lastCameraPosition=" + this.f89796iobyxmoadg + ", lastFocusRegion=" + this.f89797zoijcleaow + ")";
        }

        public final VisibleRegion zoijcleaow() {
            return this.f89797zoijcleaow;
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f89798iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f89799iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Point point) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            this.f89799iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f89799iobyxmoadg, ((nufgyqmvbu) obj).f89799iobyxmoadg);
        }

        public int hashCode() {
            return this.f89799iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f89799iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(point=" + this.f89799iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2062ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2062ppxfxbqfkf f89800iobyxmoadg = new C2062ppxfxbqfkf();

        private C2062ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f89801iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(visibleRegion, "visibleRegion");
            this.f89801iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f89801iobyxmoadg, ((wflxmlrfwp) obj).f89801iobyxmoadg);
        }

        public int hashCode() {
            return this.f89801iobyxmoadg.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f89801iobyxmoadg;
        }

        public String toString() {
            return "ShowShopList(visibleRegion=" + this.f89801iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f89802iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f89803iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
