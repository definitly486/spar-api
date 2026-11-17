package lj1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f62718eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f62719gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62720iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final List f62721lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final DeliveryCode f62722nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f62723ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f62724wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f62725zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String listName, double d13, int i13, String url, boolean z13, List productsBuy, List productsBought, DeliveryCode deliveryCode) {
            super(null);
            zdlpuopuiu.btonecajqb(listName, "listName");
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(productsBuy, "productsBuy");
            zdlpuopuiu.btonecajqb(productsBought, "productsBought");
            this.f62720iobyxmoadg = listName;
            this.f62725zoijcleaow = d13;
            this.f62723ppxfxbqfkf = i13;
            this.f62724wkgbmnqykc = url;
            this.f62718eablkybsjg = z13;
            this.f62719gxszxtbevo = productsBuy;
            this.f62721lqeggnwhkg = productsBought;
            this.f62722nufgyqmvbu = deliveryCode;
        }

        public final List eablkybsjg() {
            return this.f62719gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f62720iobyxmoadg, eablkybsjgVar.f62720iobyxmoadg) && Double.compare(this.f62725zoijcleaow, eablkybsjgVar.f62725zoijcleaow) == 0 && this.f62723ppxfxbqfkf == eablkybsjgVar.f62723ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f62724wkgbmnqykc, eablkybsjgVar.f62724wkgbmnqykc) && this.f62718eablkybsjg == eablkybsjgVar.f62718eablkybsjg && zdlpuopuiu.eablkybsjg(this.f62719gxszxtbevo, eablkybsjgVar.f62719gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f62721lqeggnwhkg, eablkybsjgVar.f62721lqeggnwhkg) && this.f62722nufgyqmvbu == eablkybsjgVar.f62722nufgyqmvbu;
        }

        public final double gxszxtbevo() {
            return this.f62725zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.f62720iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f62725zoijcleaow)) * 31) + Integer.hashCode(this.f62723ppxfxbqfkf)) * 31) + this.f62724wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f62718eablkybsjg)) * 31) + this.f62719gxszxtbevo.hashCode()) * 31) + this.f62721lqeggnwhkg.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f62722nufgyqmvbu;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final int iobyxmoadg() {
            return this.f62723ppxfxbqfkf;
        }

        public final String lqeggnwhkg() {
            return this.f62724wkgbmnqykc;
        }

        public final boolean nufgyqmvbu() {
            return this.f62718eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f62720iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchasesListDetails(listName=" + this.f62720iobyxmoadg + ", sum=" + this.f62725zoijcleaow + ", count=" + this.f62723ppxfxbqfkf + ", url=" + this.f62724wkgbmnqykc + ", isEmptyViewVisible=" + this.f62718eablkybsjg + ", productsBuy=" + this.f62719gxszxtbevo + ", productsBought=" + this.f62721lqeggnwhkg + ", deliveryCode=" + this.f62722nufgyqmvbu + ")";
        }

        public final List wkgbmnqykc() {
            return this.f62721lqeggnwhkg;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f62722nufgyqmvbu;
        }
    }

    /* JADX INFO: renamed from: lj1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1273gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f62726iobyxmoadg;

        public C1273gxszxtbevo(boolean z13) {
            super(null);
            this.f62726iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1273gxszxtbevo) && this.f62726iobyxmoadg == ((C1273gxszxtbevo) obj).f62726iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f62726iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f62726iobyxmoadg;
        }

        public String toString() {
            return "PurchasesIsEmptyViewVisible(isEmptyViewVisible=" + this.f62726iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f62727iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List productData) {
            super(null);
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f62727iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f62727iobyxmoadg, ((iobyxmoadg) obj).f62727iobyxmoadg);
        }

        public int hashCode() {
            return this.f62727iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f62727iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductData(productData=" + this.f62727iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f62728iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f62728iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f62728iobyxmoadg == ((ppxfxbqfkf) obj).f62728iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f62728iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f62728iobyxmoadg;
        }

        public String toString() {
            return "ChangeShareListFeatureEnabled(isEnabled=" + this.f62728iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f62729iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f62729iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f62729iobyxmoadg == ((wkgbmnqykc) obj).f62729iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f62729iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f62729iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f62729iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62730iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f62731zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productId, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f62730iobyxmoadg = productId;
            this.f62731zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f62730iobyxmoadg, zoijcleaowVar.f62730iobyxmoadg) && this.f62731zoijcleaow == zoijcleaowVar.f62731zoijcleaow;
        }

        public int hashCode() {
            return (this.f62730iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f62731zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f62731zoijcleaow;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f62730iobyxmoadg + ", newFavoriteState=" + this.f62731zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f62730iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
