package v61;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116201iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f116201iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f116201iobyxmoadg == ((eablkybsjg) obj).f116201iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116201iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116201iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f116201iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: v61.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2890gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2890gxszxtbevo f116202iobyxmoadg = new C2890gxszxtbevo();

        private C2890gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f116203iobyxmoadg;

        public iobyxmoadg(double d13) {
            super(null);
            this.f116203iobyxmoadg = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Double.compare(this.f116203iobyxmoadg, ((iobyxmoadg) obj).f116203iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f116203iobyxmoadg);
        }

        public final double iobyxmoadg() {
            return this.f116203iobyxmoadg;
        }

        public String toString() {
            return "AmountChanged(amount=" + this.f116203iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantProductDetails f116204iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(RestaurantProductDetails product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f116204iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f116204iobyxmoadg, ((lqeggnwhkg) obj).f116204iobyxmoadg);
        }

        public int hashCode() {
            return this.f116204iobyxmoadg.hashCode();
        }

        public final RestaurantProductDetails iobyxmoadg() {
            return this.f116204iobyxmoadg;
        }

        public String toString() {
            return "ProductDetailsFetched(product=" + this.f116204iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MeasureType f116205iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(MeasureType measureType) {
            super(null);
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f116205iobyxmoadg = measureType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f116205iobyxmoadg, ((nufgyqmvbu) obj).f116205iobyxmoadg);
        }

        public int hashCode() {
            return this.f116205iobyxmoadg.hashCode();
        }

        public final MeasureType iobyxmoadg() {
            return this.f116205iobyxmoadg;
        }

        public String toString() {
            return "UpdateCounter(measureType=" + this.f116205iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f116206iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f116207ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f116208wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f116209zoijcleaow;

        public ppxfxbqfkf(DeliveryCode deliveryCode, List list, String str, String str2) {
            super(null);
            this.f116206iobyxmoadg = deliveryCode;
            this.f116209zoijcleaow = list;
            this.f116207ppxfxbqfkf = str;
            this.f116208wkgbmnqykc = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f116206iobyxmoadg == ppxfxbqfkfVar.f116206iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f116209zoijcleaow, ppxfxbqfkfVar.f116209zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116207ppxfxbqfkf, ppxfxbqfkfVar.f116207ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f116208wkgbmnqykc, ppxfxbqfkfVar.f116208wkgbmnqykc);
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f116206iobyxmoadg;
            int iHashCode = (deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31;
            List list = this.f116209zoijcleaow;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f116207ppxfxbqfkf;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f116208wkgbmnqykc;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f116207ppxfxbqfkf;
        }

        public final DeliveryCode ppxfxbqfkf() {
            return this.f116206iobyxmoadg;
        }

        public String toString() {
            return "CartChanged(deliveryType=" + this.f116206iobyxmoadg + ", cartProducts=" + this.f116209zoijcleaow + ", cartPartnerCode=" + this.f116207ppxfxbqfkf + ", dateReceipt=" + this.f116208wkgbmnqykc + ")";
        }

        public final List zoijcleaow() {
            return this.f116209zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f116210iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gz0.zoijcleaow f116211iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(gz0.zoijcleaow buyState) {
            super(null);
            zdlpuopuiu.btonecajqb(buyState, "buyState");
            this.f116211iobyxmoadg = buyState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f116211iobyxmoadg == ((zoijcleaow) obj).f116211iobyxmoadg;
        }

        public int hashCode() {
            return this.f116211iobyxmoadg.hashCode();
        }

        public final gz0.zoijcleaow iobyxmoadg() {
            return this.f116211iobyxmoadg;
        }

        public String toString() {
            return "BuyStateChanged(buyState=" + this.f116211iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
