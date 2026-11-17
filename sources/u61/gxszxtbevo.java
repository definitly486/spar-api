package u61;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.paging.Paging;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantDetails f112793iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(RestaurantDetails restaurant) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurant, "restaurant");
            this.f112793iobyxmoadg = restaurant;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f112793iobyxmoadg, ((btonecajqb) obj).f112793iobyxmoadg);
        }

        public int hashCode() {
            return this.f112793iobyxmoadg.hashCode();
        }

        public final RestaurantDetails iobyxmoadg() {
            return this.f112793iobyxmoadg;
        }

        public String toString() {
            return "UpdateRestaurant(restaurant=" + this.f112793iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSection f112794iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112795zoijcleaow;

        public draadjrbmk(RestaurantSection restaurantSection, String str) {
            super(null);
            this.f112794iobyxmoadg = restaurantSection;
            this.f112795zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f112794iobyxmoadg, draadjrbmkVar.f112794iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112795zoijcleaow, draadjrbmkVar.f112795zoijcleaow);
        }

        public int hashCode() {
            RestaurantSection restaurantSection = this.f112794iobyxmoadg;
            int iHashCode = (restaurantSection == null ? 0 : restaurantSection.hashCode()) * 31;
            String str = this.f112795zoijcleaow;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f112795zoijcleaow;
        }

        public String toString() {
            return "UpdateSelectedSectionsAndCatalogSectionId(selectedSection=" + this.f112794iobyxmoadg + ", catalogSectionId=" + this.f112795zoijcleaow + ")";
        }

        public final RestaurantSection zoijcleaow() {
            return this.f112794iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f112796iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(List products) {
            super(null);
            zdlpuopuiu.btonecajqb(products, "products");
            this.f112796iobyxmoadg = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f112796iobyxmoadg, ((dxjokdxxww) obj).f112796iobyxmoadg);
        }

        public int hashCode() {
            return this.f112796iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112796iobyxmoadg;
        }

        public String toString() {
            return "UpdateProducts(products=" + this.f112796iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f112797iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112798zoijcleaow;

        public eablkybsjg(DeliveryCode deliveryCode, String str) {
            super(null);
            this.f112797iobyxmoadg = deliveryCode;
            this.f112798zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f112797iobyxmoadg == eablkybsjgVar.f112797iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112798zoijcleaow, eablkybsjgVar.f112798zoijcleaow);
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f112797iobyxmoadg;
            int iHashCode = (deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31;
            String str = this.f112798zoijcleaow;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f112797iobyxmoadg;
        }

        public String toString() {
            return "UpdateInfo(deliveryType=" + this.f112797iobyxmoadg + ", dateReceipt=" + this.f112798zoijcleaow + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112799iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f112800zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(boolean z13, List products) {
            super(null);
            zdlpuopuiu.btonecajqb(products, "products");
            this.f112799iobyxmoadg = z13;
            this.f112800zoijcleaow = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return this.f112799iobyxmoadg == gtknphoqwxVar.f112799iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112800zoijcleaow, gtknphoqwxVar.f112800zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f112799iobyxmoadg) * 31) + this.f112800zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112800zoijcleaow;
        }

        public String toString() {
            return "UpdateRestaurantWithProducts(isRestaurantVisible=" + this.f112799iobyxmoadg + ", products=" + this.f112800zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f112799iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: u61.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2790gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Paging f112801iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2790gxszxtbevo(Paging paging) {
            super(null);
            zdlpuopuiu.btonecajqb(paging, "paging");
            this.f112801iobyxmoadg = paging;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2790gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f112801iobyxmoadg, ((C2790gxszxtbevo) obj).f112801iobyxmoadg);
        }

        public int hashCode() {
            return this.f112801iobyxmoadg.hashCode();
        }

        public final Paging iobyxmoadg() {
            return this.f112801iobyxmoadg;
        }

        public String toString() {
            return "UpdatePaging(paging=" + this.f112801iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantDetails f112802iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f112803ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f112804zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(RestaurantDetails restaurantDetails, List products, List sections) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurantDetails, "restaurantDetails");
            zdlpuopuiu.btonecajqb(products, "products");
            zdlpuopuiu.btonecajqb(sections, "sections");
            this.f112802iobyxmoadg = restaurantDetails;
            this.f112804zoijcleaow = products;
            this.f112803ppxfxbqfkf = sections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f112802iobyxmoadg, iobyxmoadgVar.f112802iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112804zoijcleaow, iobyxmoadgVar.f112804zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f112803ppxfxbqfkf, iobyxmoadgVar.f112803ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f112802iobyxmoadg.hashCode() * 31) + this.f112804zoijcleaow.hashCode()) * 31) + this.f112803ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112804zoijcleaow;
        }

        public final List ppxfxbqfkf() {
            return this.f112803ppxfxbqfkf;
        }

        public String toString() {
            return "InfoUpdated(restaurantDetails=" + this.f112802iobyxmoadg + ", products=" + this.f112804zoijcleaow + ", sections=" + this.f112803ppxfxbqfkf + ")";
        }

        public final RestaurantDetails zoijcleaow() {
            return this.f112802iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112805iobyxmoadg;

        public lqeggnwhkg(String str) {
            super(null);
            this.f112805iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f112805iobyxmoadg, ((lqeggnwhkg) obj).f112805iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f112805iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112805iobyxmoadg;
        }

        public String toString() {
            return "UpdatePartnerCode(partnerCode=" + this.f112805iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f112806iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(List productList) {
            super(null);
            zdlpuopuiu.btonecajqb(productList, "productList");
            this.f112806iobyxmoadg = productList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f112806iobyxmoadg, ((nufgyqmvbu) obj).f112806iobyxmoadg);
        }

        public int hashCode() {
            return this.f112806iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112806iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductList(productList=" + this.f112806iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f112807iobyxmoadg;

        public ppxfxbqfkf(List list) {
            super(null);
            this.f112807iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112807iobyxmoadg, ((ppxfxbqfkf) obj).f112807iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f112807iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112807iobyxmoadg;
        }

        public String toString() {
            return "UpdateCurrentCartProducts(currentCartProducts=" + this.f112807iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f112808iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f112808iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f112808iobyxmoadg == ((wkgbmnqykc) obj).f112808iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f112808iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f112808iobyxmoadg;
        }

        public String toString() {
            return "UpdateCurrentPage(page=" + this.f112808iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112809iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f112809iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f112809iobyxmoadg == ((zoijcleaow) obj).f112809iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f112809iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f112809iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f112809iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
