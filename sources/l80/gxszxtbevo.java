package l80;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f61857iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f61857iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f61857iobyxmoadg == ((eablkybsjg) obj).f61857iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f61857iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f61857iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f61857iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: l80.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1254gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1254gxszxtbevo f61858iobyxmoadg = new C1254gxszxtbevo();

        private C1254gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f61859iobyxmoadg;

        public iobyxmoadg(double d13) {
            super(null);
            this.f61859iobyxmoadg = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Double.compare(this.f61859iobyxmoadg, ((iobyxmoadg) obj).f61859iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f61859iobyxmoadg);
        }

        public final double iobyxmoadg() {
            return this.f61859iobyxmoadg;
        }

        public String toString() {
            return "AmountChanged(amount=" + this.f61859iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantProductDetails f61860iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(RestaurantProductDetails product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f61860iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f61860iobyxmoadg, ((lqeggnwhkg) obj).f61860iobyxmoadg);
        }

        public int hashCode() {
            return this.f61860iobyxmoadg.hashCode();
        }

        public final RestaurantProductDetails iobyxmoadg() {
            return this.f61860iobyxmoadg;
        }

        public String toString() {
            return "ProductDetailsFetched(product=" + this.f61860iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MeasureType f61861iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(MeasureType measureType) {
            super(null);
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f61861iobyxmoadg = measureType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f61861iobyxmoadg, ((nufgyqmvbu) obj).f61861iobyxmoadg);
        }

        public int hashCode() {
            return this.f61861iobyxmoadg.hashCode();
        }

        public final MeasureType iobyxmoadg() {
            return this.f61861iobyxmoadg;
        }

        public String toString() {
            return "UpdateCounter(measureType=" + this.f61861iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f61862iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f61863ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f61864wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f61865zoijcleaow;

        public ppxfxbqfkf(DeliveryCode deliveryCode, List list, String str, String str2) {
            super(null);
            this.f61862iobyxmoadg = deliveryCode;
            this.f61865zoijcleaow = list;
            this.f61863ppxfxbqfkf = str;
            this.f61864wkgbmnqykc = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f61862iobyxmoadg == ppxfxbqfkfVar.f61862iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f61865zoijcleaow, ppxfxbqfkfVar.f61865zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61863ppxfxbqfkf, ppxfxbqfkfVar.f61863ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61864wkgbmnqykc, ppxfxbqfkfVar.f61864wkgbmnqykc);
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f61862iobyxmoadg;
            int iHashCode = (deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31;
            List list = this.f61865zoijcleaow;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f61863ppxfxbqfkf;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f61864wkgbmnqykc;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f61863ppxfxbqfkf;
        }

        public final DeliveryCode ppxfxbqfkf() {
            return this.f61862iobyxmoadg;
        }

        public String toString() {
            return "CartChanged(deliveryType=" + this.f61862iobyxmoadg + ", cartProducts=" + this.f61865zoijcleaow + ", cartPartnerCode=" + this.f61863ppxfxbqfkf + ", dateReceipt=" + this.f61864wkgbmnqykc + ")";
        }

        public final List zoijcleaow() {
            return this.f61865zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f61866iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o00.zoijcleaow f61867iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(o00.zoijcleaow buyState) {
            super(null);
            zdlpuopuiu.btonecajqb(buyState, "buyState");
            this.f61867iobyxmoadg = buyState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f61867iobyxmoadg == ((zoijcleaow) obj).f61867iobyxmoadg;
        }

        public int hashCode() {
            return this.f61867iobyxmoadg.hashCode();
        }

        public final o00.zoijcleaow iobyxmoadg() {
            return this.f61867iobyxmoadg;
        }

        public String toString() {
            return "BuyStateChanged(buyState=" + this.f61867iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
