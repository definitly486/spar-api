package ru.myspar.legacy.presentation.screen.shops;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.shops.store.ShopsArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.shops.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2060eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89752iobyxmoadg;

        public C2060eablkybsjg(String str) {
            super(null);
            this.f89752iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2060eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f89752iobyxmoadg, ((C2060eablkybsjg) obj).f89752iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f89752iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89752iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f89752iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mb0.wkgbmnqykc f89753iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f89754ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f89755zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(mb0.wkgbmnqykc shopUiModel, List services, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopUiModel, "shopUiModel");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f89753iobyxmoadg = shopUiModel;
            this.f89755zoijcleaow = services;
            this.f89754ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f89753iobyxmoadg, gxszxtbevoVar.f89753iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89755zoijcleaow, gxszxtbevoVar.f89755zoijcleaow) && this.f89754ppxfxbqfkf == gxszxtbevoVar.f89754ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f89753iobyxmoadg.hashCode() * 31) + this.f89755zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f89754ppxfxbqfkf);
        }

        public final List iobyxmoadg() {
            return this.f89755zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f89754ppxfxbqfkf;
        }

        public String toString() {
            return "ShowShopDetails(shopUiModel=" + this.f89753iobyxmoadg + ", services=" + this.f89755zoijcleaow + ", isList=" + this.f89754ppxfxbqfkf + ")";
        }

        public final mb0.wkgbmnqykc zoijcleaow() {
            return this.f89753iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f89756iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f89756iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f89756iobyxmoadg == ((iobyxmoadg) obj).f89756iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f89756iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f89756iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapScale(isIncrease=" + this.f89756iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f89757iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Point point) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            this.f89757iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f89757iobyxmoadg, ((lqeggnwhkg) obj).f89757iobyxmoadg);
        }

        public int hashCode() {
            return this.f89757iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f89757iobyxmoadg;
        }

        public String toString() {
            return "ShowShopOnMap(point=" + this.f89757iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f89758iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(CameraPosition cameraPosition) {
            super(null);
            zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
            this.f89758iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89758iobyxmoadg, ((ppxfxbqfkf) obj).f89758iobyxmoadg);
        }

        public int hashCode() {
            return this.f89758iobyxmoadg.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f89758iobyxmoadg;
        }

        public String toString() {
            return "MoveMapByCameraPosition(cameraPosition=" + this.f89758iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89759iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89759iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f89759iobyxmoadg, ((wkgbmnqykc) obj).f89759iobyxmoadg);
        }

        public int hashCode() {
            return this.f89759iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89759iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89759iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f89760iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ShopsArgs.zoijcleaow f89761ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f89762zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Point point, double d13, ShopsArgs.zoijcleaow shopsFlow) {
            super(null);
            zdlpuopuiu.btonecajqb(point, "point");
            zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
            this.f89760iobyxmoadg = point;
            this.f89762zoijcleaow = d13;
            this.f89761ppxfxbqfkf = shopsFlow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f89760iobyxmoadg, zoijcleaowVar.f89760iobyxmoadg) && Double.compare(this.f89762zoijcleaow, zoijcleaowVar.f89762zoijcleaow) == 0 && this.f89761ppxfxbqfkf == zoijcleaowVar.f89761ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f89760iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f89762zoijcleaow)) * 31) + this.f89761ppxfxbqfkf.hashCode();
        }

        public final double iobyxmoadg() {
            return this.f89762zoijcleaow;
        }

        public final ShopsArgs.zoijcleaow ppxfxbqfkf() {
            return this.f89761ppxfxbqfkf;
        }

        public String toString() {
            return "MoveMapByCameraDistance(point=" + this.f89760iobyxmoadg + ", cameraDistance=" + this.f89762zoijcleaow + ", shopsFlow=" + this.f89761ppxfxbqfkf + ")";
        }

        public final Point zoijcleaow() {
            return this.f89760iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
