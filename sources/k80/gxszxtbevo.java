package k80;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantDetails f54130iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(RestaurantDetails restaurant) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurant, "restaurant");
            this.f54130iobyxmoadg = restaurant;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f54130iobyxmoadg, ((btonecajqb) obj).f54130iobyxmoadg);
        }

        public int hashCode() {
            return this.f54130iobyxmoadg.hashCode();
        }

        public final RestaurantDetails iobyxmoadg() {
            return this.f54130iobyxmoadg;
        }

        public String toString() {
            return "UpdateRestaurant(restaurant=" + this.f54130iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSection f54131iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f54132zoijcleaow;

        public draadjrbmk(RestaurantSection restaurantSection, String str) {
            super(null);
            this.f54131iobyxmoadg = restaurantSection;
            this.f54132zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f54131iobyxmoadg, draadjrbmkVar.f54131iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54132zoijcleaow, draadjrbmkVar.f54132zoijcleaow);
        }

        public int hashCode() {
            RestaurantSection restaurantSection = this.f54131iobyxmoadg;
            int iHashCode = (restaurantSection == null ? 0 : restaurantSection.hashCode()) * 31;
            String str = this.f54132zoijcleaow;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f54132zoijcleaow;
        }

        public String toString() {
            return "UpdateSelectedSectionsAndCatalogSectionId(selectedSection=" + this.f54131iobyxmoadg + ", catalogSectionId=" + this.f54132zoijcleaow + ")";
        }

        public final RestaurantSection zoijcleaow() {
            return this.f54131iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f54133iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(List products) {
            super(null);
            zdlpuopuiu.btonecajqb(products, "products");
            this.f54133iobyxmoadg = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f54133iobyxmoadg, ((dxjokdxxww) obj).f54133iobyxmoadg);
        }

        public int hashCode() {
            return this.f54133iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f54133iobyxmoadg;
        }

        public String toString() {
            return "UpdateProducts(products=" + this.f54133iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f54134iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f54135zoijcleaow;

        public eablkybsjg(DeliveryCode deliveryCode, String str) {
            super(null);
            this.f54134iobyxmoadg = deliveryCode;
            this.f54135zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f54134iobyxmoadg == eablkybsjgVar.f54134iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f54135zoijcleaow, eablkybsjgVar.f54135zoijcleaow);
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f54134iobyxmoadg;
            int iHashCode = (deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31;
            String str = this.f54135zoijcleaow;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f54134iobyxmoadg;
        }

        public String toString() {
            return "UpdateInfo(deliveryType=" + this.f54134iobyxmoadg + ", dateReceipt=" + this.f54135zoijcleaow + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f54136iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f54137zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(boolean z13, List products) {
            super(null);
            zdlpuopuiu.btonecajqb(products, "products");
            this.f54136iobyxmoadg = z13;
            this.f54137zoijcleaow = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return this.f54136iobyxmoadg == gtknphoqwxVar.f54136iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f54137zoijcleaow, gtknphoqwxVar.f54137zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f54136iobyxmoadg) * 31) + this.f54137zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f54137zoijcleaow;
        }

        public String toString() {
            return "UpdateRestaurantWithProducts(isRestaurantVisible=" + this.f54136iobyxmoadg + ", products=" + this.f54137zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f54136iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: k80.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1163gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Paging f54138iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1163gxszxtbevo(Paging paging) {
            super(null);
            zdlpuopuiu.btonecajqb(paging, "paging");
            this.f54138iobyxmoadg = paging;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1163gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f54138iobyxmoadg, ((C1163gxszxtbevo) obj).f54138iobyxmoadg);
        }

        public int hashCode() {
            return this.f54138iobyxmoadg.hashCode();
        }

        public final Paging iobyxmoadg() {
            return this.f54138iobyxmoadg;
        }

        public String toString() {
            return "UpdatePaging(paging=" + this.f54138iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantDetails f54139iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f54140ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f54141zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(RestaurantDetails restaurantDetails, List products, List sections) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurantDetails, "restaurantDetails");
            zdlpuopuiu.btonecajqb(products, "products");
            zdlpuopuiu.btonecajqb(sections, "sections");
            this.f54139iobyxmoadg = restaurantDetails;
            this.f54141zoijcleaow = products;
            this.f54140ppxfxbqfkf = sections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f54139iobyxmoadg, iobyxmoadgVar.f54139iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54141zoijcleaow, iobyxmoadgVar.f54141zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54140ppxfxbqfkf, iobyxmoadgVar.f54140ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f54139iobyxmoadg.hashCode() * 31) + this.f54141zoijcleaow.hashCode()) * 31) + this.f54140ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f54141zoijcleaow;
        }

        public final List ppxfxbqfkf() {
            return this.f54140ppxfxbqfkf;
        }

        public String toString() {
            return "InfoUpdated(restaurantDetails=" + this.f54139iobyxmoadg + ", products=" + this.f54141zoijcleaow + ", sections=" + this.f54140ppxfxbqfkf + ")";
        }

        public final RestaurantDetails zoijcleaow() {
            return this.f54139iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54142iobyxmoadg;

        public lqeggnwhkg(String str) {
            super(null);
            this.f54142iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f54142iobyxmoadg, ((lqeggnwhkg) obj).f54142iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f54142iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f54142iobyxmoadg;
        }

        public String toString() {
            return "UpdatePartnerCode(partnerCode=" + this.f54142iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f54143iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(List productList) {
            super(null);
            zdlpuopuiu.btonecajqb(productList, "productList");
            this.f54143iobyxmoadg = productList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f54143iobyxmoadg, ((nufgyqmvbu) obj).f54143iobyxmoadg);
        }

        public int hashCode() {
            return this.f54143iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f54143iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductList(productList=" + this.f54143iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f54144iobyxmoadg;

        public ppxfxbqfkf(List list) {
            super(null);
            this.f54144iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54144iobyxmoadg, ((ppxfxbqfkf) obj).f54144iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f54144iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f54144iobyxmoadg;
        }

        public String toString() {
            return "UpdateCurrentCartProducts(currentCartProducts=" + this.f54144iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f54145iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f54145iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f54145iobyxmoadg == ((wkgbmnqykc) obj).f54145iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f54145iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f54145iobyxmoadg;
        }

        public String toString() {
            return "UpdateCurrentPage(page=" + this.f54145iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f54146iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f54146iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f54146iobyxmoadg == ((zoijcleaow) obj).f54146iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f54146iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f54146iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f54146iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
