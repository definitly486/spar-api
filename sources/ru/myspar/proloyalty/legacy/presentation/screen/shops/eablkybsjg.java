package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.shops.store.ShopsArgs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2300eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97382iobyxmoadg;

        public C2300eablkybsjg(String str) {
            super(null);
            this.f97382iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2300eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f97382iobyxmoadg, ((C2300eablkybsjg) obj).f97382iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f97382iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97382iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f97382iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l91.wkgbmnqykc f97383iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f97384ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f97385zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(l91.wkgbmnqykc shopUiModel, List services, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopUiModel, "shopUiModel");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f97383iobyxmoadg = shopUiModel;
            this.f97385zoijcleaow = services;
            this.f97384ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f97383iobyxmoadg, gxszxtbevoVar.f97383iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97385zoijcleaow, gxszxtbevoVar.f97385zoijcleaow) && this.f97384ppxfxbqfkf == gxszxtbevoVar.f97384ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f97383iobyxmoadg.hashCode() * 31) + this.f97385zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f97384ppxfxbqfkf);
        }

        public final List iobyxmoadg() {
            return this.f97385zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f97384ppxfxbqfkf;
        }

        public String toString() {
            return "ShowShopDetails(shopUiModel=" + this.f97383iobyxmoadg + ", services=" + this.f97385zoijcleaow + ", isList=" + this.f97384ppxfxbqfkf + ")";
        }

        public final l91.wkgbmnqykc zoijcleaow() {
            return this.f97383iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f97386iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f97386iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f97386iobyxmoadg == ((iobyxmoadg) obj).f97386iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f97386iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f97386iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapScale(isIncrease=" + this.f97386iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f97387iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Point point) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            this.f97387iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f97387iobyxmoadg, ((lqeggnwhkg) obj).f97387iobyxmoadg);
        }

        public int hashCode() {
            return this.f97387iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f97387iobyxmoadg;
        }

        public String toString() {
            return "ShowShopOnMap(point=" + this.f97387iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f97388iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(CameraPosition cameraPosition) {
            super(null);
            zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
            this.f97388iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97388iobyxmoadg, ((ppxfxbqfkf) obj).f97388iobyxmoadg);
        }

        public int hashCode() {
            return this.f97388iobyxmoadg.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f97388iobyxmoadg;
        }

        public String toString() {
            return "MoveMapByCameraPosition(cameraPosition=" + this.f97388iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97389iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97389iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f97389iobyxmoadg, ((wkgbmnqykc) obj).f97389iobyxmoadg);
        }

        public int hashCode() {
            return this.f97389iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97389iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97389iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f97390iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ShopsArgs.zoijcleaow f97391ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f97392zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Point point, double d13, ShopsArgs.zoijcleaow shopsFlow) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
            this.f97390iobyxmoadg = point;
            this.f97392zoijcleaow = d13;
            this.f97391ppxfxbqfkf = shopsFlow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f97390iobyxmoadg, zoijcleaowVar.f97390iobyxmoadg) && Double.compare(this.f97392zoijcleaow, zoijcleaowVar.f97392zoijcleaow) == 0 && this.f97391ppxfxbqfkf == zoijcleaowVar.f97391ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f97390iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f97392zoijcleaow)) * 31) + this.f97391ppxfxbqfkf.hashCode();
        }

        public final double iobyxmoadg() {
            return this.f97392zoijcleaow;
        }

        public final ShopsArgs.zoijcleaow ppxfxbqfkf() {
            return this.f97391ppxfxbqfkf;
        }

        public String toString() {
            return "MoveMapByCameraDistance(point=" + this.f97390iobyxmoadg + ", cameraDistance=" + this.f97392zoijcleaow + ", shopsFlow=" + this.f97391ppxfxbqfkf + ")";
        }

        public final Point zoijcleaow() {
            return this.f97390iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
