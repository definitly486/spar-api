package r01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81341zoijcleaow;

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f81353jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f81355zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81355zdlpuopuiu = obj;
            this.f81353jyumaefscl |= Integer.MIN_VALUE;
            return btonecajqb.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81341zoijcleaow = catalogRemoteSource;
    }

    private final Object eablkybsjg(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f81341zoijcleaow.lqeggnwhkg(str, iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.gtknphoqwx(), iobyxmoadgVar.ppxfxbqfkf(), gxszxtbevoVar);
    }

    private final Object wkgbmnqykc(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f81341zoijcleaow.btonecajqb(iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.gtknphoqwx(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg(), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ProductListData productListData;
        List listIobyxmoadg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f81353jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f81353jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f81355zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f81353jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            if (iobyxmoadgVar.dxjokdxxww() != null) {
                String strDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                zoijcleaowVar.f81353jyumaefscl = 1;
                objWkgbmnqykc = eablkybsjg(strDxjokdxxww, iobyxmoadgVar, zoijcleaowVar);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                productListData = (ProductListData) objWkgbmnqykc;
            } else {
                zoijcleaowVar.f81353jyumaefscl = 2;
                objWkgbmnqykc = wkgbmnqykc(iobyxmoadgVar, zoijcleaowVar);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                productListData = (ProductListData) objWkgbmnqykc;
            }
        } else if (i14 == 1) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            productListData = (ProductListData) objWkgbmnqykc;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            productListData = (ProductListData) objWkgbmnqykc;
        }
        List productList = productListData.getProductList();
        if (productList == null || (listIobyxmoadg = q11.zoijcleaow.iobyxmoadg(productList)) == null) {
            return productListData;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIobyxmoadg) {
            if (hashSet.add(((Product) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ProductListData productListData2 = productListData;
        ProductListData productListDataZoijcleaow = productListData2.zoijcleaow((262139 & 1) != 0 ? productListData2.searchSuggestions : null, (262139 & 2) != 0 ? productListData2.searchCategories : null, (262139 & 4) != 0 ? productListData2.productList : arrayList, (262139 & 8) != 0 ? productListData2.paging : null, (262139 & 16) != 0 ? productListData2.filterSections : null, (262139 & 32) != 0 ? productListData2.titleImage : null, (262139 & 64) != 0 ? productListData2.selectionsData : null, (262139 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productListData2.textModal : null, (262139 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productListData2.headerModal : null, (262139 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productListData2.buttonModal : null, (262139 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productListData2.textBefore : null, (262139 & 2048) != 0 ? productListData2.isAgeCheckNeeded : false, (262139 & 4096) != 0 ? productListData2.section : null, (262139 & 8192) != 0 ? productListData2.colorsModel : null, (262139 & 16384) != 0 ? productListData2.promo : null, (262139 & 32768) != 0 ? productListData2.features : null, (262139 & 65536) != 0 ? productListData2.additionalBlocks : null, (262139 & 131072) != 0 ? productListData2.promoBanner : null);
        return productListDataZoijcleaow != null ? productListDataZoijcleaow : productListData;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final Boolean f81342btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final String f81343dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f81344eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final Boolean f81345gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Integer f81346gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81347iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final String f81348lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final List f81349nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f81350ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f81351wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f81352zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, String str, String str2, String str3, Integer num, String str4, List list, String str5, Boolean bool, Boolean bool2) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f81347iobyxmoadg = shopId;
            this.f81352zoijcleaow = deliveryCode;
            this.f81350ppxfxbqfkf = str;
            this.f81351wkgbmnqykc = str2;
            this.f81344eablkybsjg = str3;
            this.f81346gxszxtbevo = num;
            this.f81348lqeggnwhkg = str4;
            this.f81349nufgyqmvbu = list;
            this.f81343dxjokdxxww = str5;
            this.f81342btonecajqb = bool;
            this.f81345gtknphoqwx = bool2;
        }

        public final String btonecajqb() {
            return this.f81347iobyxmoadg;
        }

        public final String dxjokdxxww() {
            return this.f81343dxjokdxxww;
        }

        public final Boolean eablkybsjg() {
            return this.f81345gtknphoqwx;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f81347iobyxmoadg, iobyxmoadgVar.f81347iobyxmoadg) && this.f81352zoijcleaow == iobyxmoadgVar.f81352zoijcleaow && zdlpuopuiu.eablkybsjg(this.f81350ppxfxbqfkf, iobyxmoadgVar.f81350ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f81351wkgbmnqykc, iobyxmoadgVar.f81351wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f81344eablkybsjg, iobyxmoadgVar.f81344eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f81346gxszxtbevo, iobyxmoadgVar.f81346gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f81348lqeggnwhkg, iobyxmoadgVar.f81348lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f81349nufgyqmvbu, iobyxmoadgVar.f81349nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f81343dxjokdxxww, iobyxmoadgVar.f81343dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f81342btonecajqb, iobyxmoadgVar.f81342btonecajqb) && zdlpuopuiu.eablkybsjg(this.f81345gtknphoqwx, iobyxmoadgVar.f81345gtknphoqwx);
        }

        public final String gtknphoqwx() {
            return this.f81348lqeggnwhkg;
        }

        public final Integer gxszxtbevo() {
            return this.f81346gxszxtbevo;
        }

        public int hashCode() {
            int iHashCode = this.f81347iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f81352zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f81350ppxfxbqfkf;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f81351wkgbmnqykc;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81344eablkybsjg;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f81346gxszxtbevo;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.f81348lqeggnwhkg;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List list = this.f81349nufgyqmvbu;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.f81343dxjokdxxww;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.f81342btonecajqb;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f81345gtknphoqwx;
            return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f81351wkgbmnqykc;
        }

        public final String lqeggnwhkg() {
            return this.f81344eablkybsjg;
        }

        public final String nufgyqmvbu() {
            return this.f81350ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f81349nufgyqmvbu;
        }

        public String toString() {
            return "Params(shopId=" + this.f81347iobyxmoadg + ", deliveryType=" + this.f81352zoijcleaow + ", sectionId=" + this.f81350ppxfxbqfkf + ", brandId=" + this.f81351wkgbmnqykc + ", query=" + this.f81344eablkybsjg + ", page=" + this.f81346gxszxtbevo + ", sort=" + this.f81348lqeggnwhkg + ", filters=" + this.f81349nufgyqmvbu + ", selectionId=" + this.f81343dxjokdxxww + ", getFilter=" + this.f81342btonecajqb + ", getSuggest=" + this.f81345gtknphoqwx + ")";
        }

        public final Boolean wkgbmnqykc() {
            return this.f81342btonecajqb;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f81352zoijcleaow;
        }

        public /* synthetic */ iobyxmoadg(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, Integer num, String str5, List list, String str6, Boolean bool, Boolean bool2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : deliveryCode, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str5, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str6, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? bool2 : null);
        }
    }
}
