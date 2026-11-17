package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.VisibleRegion;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class agtfadlqog extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f97416iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }
    }

    public static final class btonecajqb extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f97417iobyxmoadg = new btonecajqb();

        private btonecajqb() {
            super(null);
        }
    }

    public static final class draadjrbmk extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f97418iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l91.wkgbmnqykc f97419iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f97420zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(l91.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f97419iobyxmoadg = shop;
            this.f97420zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f97419iobyxmoadg, dxjokdxxwwVar.f97419iobyxmoadg) && this.f97420zoijcleaow == dxjokdxxwwVar.f97420zoijcleaow;
        }

        public int hashCode() {
            return (this.f97419iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f97420zoijcleaow);
        }

        public final l91.wkgbmnqykc iobyxmoadg() {
            return this.f97419iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shop=" + this.f97419iobyxmoadg + ", isList=" + this.f97420zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f97420zoijcleaow;
        }

        public /* synthetic */ dxjokdxxww(l91.wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(wkgbmnqykcVar, (i13 & 2) != 0 ? false : z13);
        }
    }

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f97421iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f97422ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final l91.wkgbmnqykc f97423zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(VisibleRegion visibleRegion, l91.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f97421iobyxmoadg = visibleRegion;
            this.f97423zoijcleaow = shop;
            this.f97422ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f97421iobyxmoadg, eablkybsjgVar.f97421iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97423zoijcleaow, eablkybsjgVar.f97423zoijcleaow) && this.f97422ppxfxbqfkf == eablkybsjgVar.f97422ppxfxbqfkf;
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f97421iobyxmoadg;
            return ((((visibleRegion == null ? 0 : visibleRegion.hashCode()) * 31) + this.f97423zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f97422ppxfxbqfkf);
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f97421iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f97422ppxfxbqfkf;
        }

        public String toString() {
            return "OnInListClicked(focusRegion=" + this.f97421iobyxmoadg + ", shop=" + this.f97423zoijcleaow + ", isList=" + this.f97422ppxfxbqfkf + ")";
        }

        public final l91.wkgbmnqykc zoijcleaow() {
            return this.f97423zoijcleaow;
        }
    }

    public static final class gtknphoqwx extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f97424iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f97425iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f97426iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final VisibleRegion f97427zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CameraPosition lastCameraPosition, VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(lastCameraPosition, "lastCameraPosition");
            this.f97426iobyxmoadg = lastCameraPosition;
            this.f97427zoijcleaow = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f97426iobyxmoadg, iobyxmoadgVar.f97426iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97427zoijcleaow, iobyxmoadgVar.f97427zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f97426iobyxmoadg.hashCode() * 31;
            VisibleRegion visibleRegion = this.f97427zoijcleaow;
            return iHashCode + (visibleRegion == null ? 0 : visibleRegion.hashCode());
        }

        public final CameraPosition iobyxmoadg() {
            return this.f97426iobyxmoadg;
        }

        public String toString() {
            return "FiltersClicked(lastCameraPosition=" + this.f97426iobyxmoadg + ", lastFocusRegion=" + this.f97427zoijcleaow + ")";
        }

        public final VisibleRegion zoijcleaow() {
            return this.f97427zoijcleaow;
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f97428iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f97429iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Point point) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            this.f97429iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f97429iobyxmoadg, ((nufgyqmvbu) obj).f97429iobyxmoadg);
        }

        public int hashCode() {
            return this.f97429iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f97429iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(point=" + this.f97429iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2302ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2302ppxfxbqfkf f97430iobyxmoadg = new C2302ppxfxbqfkf();

        private C2302ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f97431iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(visibleRegion, "visibleRegion");
            this.f97431iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f97431iobyxmoadg, ((wflxmlrfwp) obj).f97431iobyxmoadg);
        }

        public int hashCode() {
            return this.f97431iobyxmoadg.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f97431iobyxmoadg;
        }

        public String toString() {
            return "ShowShopList(visibleRegion=" + this.f97431iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f97432iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97433iobyxmoadg = new zoijcleaow();

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
