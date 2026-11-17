package fy1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f35360eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f35361gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35362iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final List f35363lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final DeliveryCode f35364nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f35365ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f35366wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f35367zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String listName, double d13, int i13, String url, boolean z13, List productsBuy, List productsBought, DeliveryCode deliveryCode) {
            super(null);
            zdlpuopuiu.btonecajqb(listName, "listName");
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(productsBuy, "productsBuy");
            zdlpuopuiu.btonecajqb(productsBought, "productsBought");
            this.f35362iobyxmoadg = listName;
            this.f35367zoijcleaow = d13;
            this.f35365ppxfxbqfkf = i13;
            this.f35366wkgbmnqykc = url;
            this.f35360eablkybsjg = z13;
            this.f35361gxszxtbevo = productsBuy;
            this.f35363lqeggnwhkg = productsBought;
            this.f35364nufgyqmvbu = deliveryCode;
        }

        public final List eablkybsjg() {
            return this.f35361gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f35362iobyxmoadg, eablkybsjgVar.f35362iobyxmoadg) && Double.compare(this.f35367zoijcleaow, eablkybsjgVar.f35367zoijcleaow) == 0 && this.f35365ppxfxbqfkf == eablkybsjgVar.f35365ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f35366wkgbmnqykc, eablkybsjgVar.f35366wkgbmnqykc) && this.f35360eablkybsjg == eablkybsjgVar.f35360eablkybsjg && zdlpuopuiu.eablkybsjg(this.f35361gxszxtbevo, eablkybsjgVar.f35361gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f35363lqeggnwhkg, eablkybsjgVar.f35363lqeggnwhkg) && this.f35364nufgyqmvbu == eablkybsjgVar.f35364nufgyqmvbu;
        }

        public final double gxszxtbevo() {
            return this.f35367zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.f35362iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f35367zoijcleaow)) * 31) + Integer.hashCode(this.f35365ppxfxbqfkf)) * 31) + this.f35366wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f35360eablkybsjg)) * 31) + this.f35361gxszxtbevo.hashCode()) * 31) + this.f35363lqeggnwhkg.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f35364nufgyqmvbu;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final int iobyxmoadg() {
            return this.f35365ppxfxbqfkf;
        }

        public final String lqeggnwhkg() {
            return this.f35366wkgbmnqykc;
        }

        public final boolean nufgyqmvbu() {
            return this.f35360eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f35362iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchasesListDetails(listName=" + this.f35362iobyxmoadg + ", sum=" + this.f35367zoijcleaow + ", count=" + this.f35365ppxfxbqfkf + ", url=" + this.f35366wkgbmnqykc + ", isEmptyViewVisible=" + this.f35360eablkybsjg + ", productsBuy=" + this.f35361gxszxtbevo + ", productsBought=" + this.f35363lqeggnwhkg + ", deliveryCode=" + this.f35364nufgyqmvbu + ")";
        }

        public final List wkgbmnqykc() {
            return this.f35363lqeggnwhkg;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f35364nufgyqmvbu;
        }
    }

    /* JADX INFO: renamed from: fy1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0795gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f35368iobyxmoadg;

        public C0795gxszxtbevo(boolean z13) {
            super(null);
            this.f35368iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0795gxszxtbevo) && this.f35368iobyxmoadg == ((C0795gxszxtbevo) obj).f35368iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f35368iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f35368iobyxmoadg;
        }

        public String toString() {
            return "PurchasesIsEmptyViewVisible(isEmptyViewVisible=" + this.f35368iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f35369iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List productData) {
            super(null);
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f35369iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35369iobyxmoadg, ((iobyxmoadg) obj).f35369iobyxmoadg);
        }

        public int hashCode() {
            return this.f35369iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f35369iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductData(productData=" + this.f35369iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f35370iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f35370iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f35370iobyxmoadg == ((ppxfxbqfkf) obj).f35370iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f35370iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f35370iobyxmoadg;
        }

        public String toString() {
            return "ChangeShareListFeatureEnabled(isEnabled=" + this.f35370iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f35371iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f35371iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f35371iobyxmoadg == ((wkgbmnqykc) obj).f35371iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f35371iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f35371iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f35371iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35372iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f35373zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productId, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f35372iobyxmoadg = productId;
            this.f35373zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f35372iobyxmoadg, zoijcleaowVar.f35372iobyxmoadg) && this.f35373zoijcleaow == zoijcleaowVar.f35373zoijcleaow;
        }

        public int hashCode() {
            return (this.f35372iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f35373zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f35373zoijcleaow;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f35372iobyxmoadg + ", newFavoriteState=" + this.f35373zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f35372iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
