package ru.myspar.proloyalty.domain.feature.shops.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;
import ru.myspar.proloyalty.core.domain.models.VisibleRegion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f95840iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l91.wkgbmnqykc f95841iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f95842zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(l91.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f95841iobyxmoadg = shop;
            this.f95842zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f95841iobyxmoadg, btonecajqbVar.f95841iobyxmoadg) && this.f95842zoijcleaow == btonecajqbVar.f95842zoijcleaow;
        }

        public int hashCode() {
            return (this.f95841iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f95842zoijcleaow);
        }

        public final l91.wkgbmnqykc iobyxmoadg() {
            return this.f95841iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shop=" + this.f95841iobyxmoadg + ", isList=" + this.f95842zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f95842zoijcleaow;
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f95843iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95844iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f95844iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f95844iobyxmoadg, ((dxjokdxxww) obj).f95844iobyxmoadg);
        }

        public int hashCode() {
            return this.f95844iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95844iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(location=" + this.f95844iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95845iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f95845iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f95845iobyxmoadg == ((eablkybsjg) obj).f95845iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95845iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95845iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f95845iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95846iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            super(null);
            this.f95846iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f95846iobyxmoadg == ((gtknphoqwx) obj).f95846iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95846iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95846iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f95846iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f95847iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f95848ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f95849zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(VisibleRegion visibleRegion, LocationData shopPoint, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopPoint, "shopPoint");
            this.f95847iobyxmoadg = visibleRegion;
            this.f95849zoijcleaow = shopPoint;
            this.f95848ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f95847iobyxmoadg, gxszxtbevoVar.f95847iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95849zoijcleaow, gxszxtbevoVar.f95849zoijcleaow) && this.f95848ppxfxbqfkf == gxszxtbevoVar.f95848ppxfxbqfkf;
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f95847iobyxmoadg;
            return ((((visibleRegion == null ? 0 : visibleRegion.hashCode()) * 31) + this.f95849zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f95848ppxfxbqfkf);
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f95847iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f95848ppxfxbqfkf;
        }

        public String toString() {
            return "OnInListClicked(focusRegion=" + this.f95847iobyxmoadg + ", shopPoint=" + this.f95849zoijcleaow + ", isList=" + this.f95848ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f95849zoijcleaow;
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f95850iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final VisibleRegion f95851zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CameraPosition lastCameraPosition, VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(lastCameraPosition, "lastCameraPosition");
            this.f95850iobyxmoadg = lastCameraPosition;
            this.f95851zoijcleaow = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f95850iobyxmoadg, iobyxmoadgVar.f95850iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95851zoijcleaow, iobyxmoadgVar.f95851zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f95850iobyxmoadg.hashCode() * 31;
            VisibleRegion visibleRegion = this.f95851zoijcleaow;
            return iHashCode + (visibleRegion == null ? 0 : visibleRegion.hashCode());
        }

        public final CameraPosition iobyxmoadg() {
            return this.f95850iobyxmoadg;
        }

        public String toString() {
            return "FiltersClicked(lastCameraPosition=" + this.f95850iobyxmoadg + ", lastFocusRegion=" + this.f95851zoijcleaow + ")";
        }

        public final VisibleRegion zoijcleaow() {
            return this.f95851zoijcleaow;
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f95852iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f95853iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f95854iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(visibleRegion, "visibleRegion");
            this.f95854iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f95854iobyxmoadg, ((ojitshcjhn) obj).f95854iobyxmoadg);
        }

        public int hashCode() {
            return this.f95854iobyxmoadg.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f95854iobyxmoadg;
        }

        public String toString() {
            return "ShowShopList(visibleRegion=" + this.f95854iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f95855iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f95856iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f95857iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2252wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2252wkgbmnqykc f95858iobyxmoadg = new C2252wkgbmnqykc();

        private C2252wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f95859iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
