package ru.myspar.domain.feature.shops.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;
import ru.myspar.core.domain.models.VisibleRegion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f88063iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mb0.wkgbmnqykc f88064iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f88065zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(mb0.wkgbmnqykc shop, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shop, "shop");
            this.f88064iobyxmoadg = shop;
            this.f88065zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f88064iobyxmoadg, btonecajqbVar.f88064iobyxmoadg) && this.f88065zoijcleaow == btonecajqbVar.f88065zoijcleaow;
        }

        public int hashCode() {
            return (this.f88064iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f88065zoijcleaow);
        }

        public final mb0.wkgbmnqykc iobyxmoadg() {
            return this.f88064iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shop=" + this.f88064iobyxmoadg + ", isList=" + this.f88065zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f88065zoijcleaow;
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f88066iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f88067iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f88067iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f88067iobyxmoadg, ((dxjokdxxww) obj).f88067iobyxmoadg);
        }

        public int hashCode() {
            return this.f88067iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f88067iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(location=" + this.f88067iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88068iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f88068iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f88068iobyxmoadg == ((eablkybsjg) obj).f88068iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88068iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88068iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f88068iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88069iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            super(null);
            this.f88069iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f88069iobyxmoadg == ((gtknphoqwx) obj).f88069iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88069iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88069iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f88069iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f88070iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f88071ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f88072zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(VisibleRegion visibleRegion, LocationData shopPoint, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopPoint, "shopPoint");
            this.f88070iobyxmoadg = visibleRegion;
            this.f88072zoijcleaow = shopPoint;
            this.f88071ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f88070iobyxmoadg, gxszxtbevoVar.f88070iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88072zoijcleaow, gxszxtbevoVar.f88072zoijcleaow) && this.f88071ppxfxbqfkf == gxszxtbevoVar.f88071ppxfxbqfkf;
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f88070iobyxmoadg;
            return ((((visibleRegion == null ? 0 : visibleRegion.hashCode()) * 31) + this.f88072zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f88071ppxfxbqfkf);
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f88070iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f88071ppxfxbqfkf;
        }

        public String toString() {
            return "OnInListClicked(focusRegion=" + this.f88070iobyxmoadg + ", shopPoint=" + this.f88072zoijcleaow + ", isList=" + this.f88071ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f88072zoijcleaow;
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f88073iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final VisibleRegion f88074zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CameraPosition lastCameraPosition, VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(lastCameraPosition, "lastCameraPosition");
            this.f88073iobyxmoadg = lastCameraPosition;
            this.f88074zoijcleaow = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f88073iobyxmoadg, iobyxmoadgVar.f88073iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88074zoijcleaow, iobyxmoadgVar.f88074zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f88073iobyxmoadg.hashCode() * 31;
            VisibleRegion visibleRegion = this.f88074zoijcleaow;
            return iHashCode + (visibleRegion == null ? 0 : visibleRegion.hashCode());
        }

        public final CameraPosition iobyxmoadg() {
            return this.f88073iobyxmoadg;
        }

        public String toString() {
            return "FiltersClicked(lastCameraPosition=" + this.f88073iobyxmoadg + ", lastFocusRegion=" + this.f88074zoijcleaow + ")";
        }

        public final VisibleRegion zoijcleaow() {
            return this.f88074zoijcleaow;
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f88075iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f88076iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f88077iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(VisibleRegion visibleRegion) {
            super(null);
            zdlpuopuiu.btonecajqb(visibleRegion, "visibleRegion");
            this.f88077iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f88077iobyxmoadg, ((ojitshcjhn) obj).f88077iobyxmoadg);
        }

        public int hashCode() {
            return this.f88077iobyxmoadg.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f88077iobyxmoadg;
        }

        public String toString() {
            return "ShowShopList(visibleRegion=" + this.f88077iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88078iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f88079iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f88080iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2015wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2015wkgbmnqykc f88081iobyxmoadg = new C2015wkgbmnqykc();

        private C2015wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88082iobyxmoadg = new zoijcleaow();

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
