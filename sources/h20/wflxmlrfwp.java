package h20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39203zoijcleaow;

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f39215jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f39217zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39217zdlpuopuiu = obj;
            this.f39215jyumaefscl |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39203zoijcleaow = catalogRemoteSource;
    }

    private final Object eablkybsjg(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f39203zoijcleaow.ppxfxbqfkf(str, iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.gtknphoqwx(), iobyxmoadgVar.ppxfxbqfkf(), gxszxtbevoVar);
    }

    private final Object wkgbmnqykc(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f39203zoijcleaow.wkgbmnqykc(iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.gtknphoqwx(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg(), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ProductListData productListData;
        List listIobyxmoadg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f39215jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f39215jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f39217zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f39215jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            if (iobyxmoadgVar.dxjokdxxww() != null) {
                String strDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                zoijcleaowVar.f39215jyumaefscl = 1;
                objWkgbmnqykc = eablkybsjg(strDxjokdxxww, iobyxmoadgVar, zoijcleaowVar);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                productListData = (ProductListData) objWkgbmnqykc;
            } else {
                zoijcleaowVar.f39215jyumaefscl = 2;
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
        if (productList == null || (listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(productList)) == null) {
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
        ProductListData productListDataZoijcleaow = productListData2.zoijcleaow((131067 & 1) != 0 ? productListData2.searchSuggestions : null, (131067 & 2) != 0 ? productListData2.searchCategories : null, (131067 & 4) != 0 ? productListData2.productList : arrayList, (131067 & 8) != 0 ? productListData2.paging : null, (131067 & 16) != 0 ? productListData2.filterSections : null, (131067 & 32) != 0 ? productListData2.titleImage : null, (131067 & 64) != 0 ? productListData2.selectionsData : null, (131067 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productListData2.textModal : null, (131067 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productListData2.headerModal : null, (131067 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productListData2.buttonModal : null, (131067 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productListData2.textBefore : null, (131067 & 2048) != 0 ? productListData2.isAgeCheckNeeded : false, (131067 & 4096) != 0 ? productListData2.section : null, (131067 & 8192) != 0 ? productListData2.colorsModel : null, (131067 & 16384) != 0 ? productListData2.promo : null, (131067 & 32768) != 0 ? productListData2.features : null, (131067 & 65536) != 0 ? productListData2.additionalBlocksOption : null);
        return productListDataZoijcleaow != null ? productListDataZoijcleaow : productListData;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final Boolean f39204btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final String f39205dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f39206eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final Boolean f39207gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Integer f39208gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39209iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final String f39210lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final List f39211nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f39212ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f39213wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f39214zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, String str, String str2, String str3, Integer num, String str4, List list, String str5, Boolean bool, Boolean bool2) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f39209iobyxmoadg = shopId;
            this.f39214zoijcleaow = deliveryCode;
            this.f39212ppxfxbqfkf = str;
            this.f39213wkgbmnqykc = str2;
            this.f39206eablkybsjg = str3;
            this.f39208gxszxtbevo = num;
            this.f39210lqeggnwhkg = str4;
            this.f39211nufgyqmvbu = list;
            this.f39205dxjokdxxww = str5;
            this.f39204btonecajqb = bool;
            this.f39207gtknphoqwx = bool2;
        }

        public final String btonecajqb() {
            return this.f39209iobyxmoadg;
        }

        public final String dxjokdxxww() {
            return this.f39205dxjokdxxww;
        }

        public final Boolean eablkybsjg() {
            return this.f39207gtknphoqwx;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39209iobyxmoadg, iobyxmoadgVar.f39209iobyxmoadg) && this.f39214zoijcleaow == iobyxmoadgVar.f39214zoijcleaow && zdlpuopuiu.eablkybsjg(this.f39212ppxfxbqfkf, iobyxmoadgVar.f39212ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39213wkgbmnqykc, iobyxmoadgVar.f39213wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f39206eablkybsjg, iobyxmoadgVar.f39206eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f39208gxszxtbevo, iobyxmoadgVar.f39208gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f39210lqeggnwhkg, iobyxmoadgVar.f39210lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f39211nufgyqmvbu, iobyxmoadgVar.f39211nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f39205dxjokdxxww, iobyxmoadgVar.f39205dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f39204btonecajqb, iobyxmoadgVar.f39204btonecajqb) && zdlpuopuiu.eablkybsjg(this.f39207gtknphoqwx, iobyxmoadgVar.f39207gtknphoqwx);
        }

        public final String gtknphoqwx() {
            return this.f39210lqeggnwhkg;
        }

        public final Integer gxszxtbevo() {
            return this.f39208gxszxtbevo;
        }

        public int hashCode() {
            int iHashCode = this.f39209iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f39214zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f39212ppxfxbqfkf;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f39213wkgbmnqykc;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f39206eablkybsjg;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f39208gxszxtbevo;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.f39210lqeggnwhkg;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List list = this.f39211nufgyqmvbu;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.f39205dxjokdxxww;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.f39204btonecajqb;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f39207gtknphoqwx;
            return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f39213wkgbmnqykc;
        }

        public final String lqeggnwhkg() {
            return this.f39206eablkybsjg;
        }

        public final String nufgyqmvbu() {
            return this.f39212ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f39211nufgyqmvbu;
        }

        public String toString() {
            return "Params(shopId=" + this.f39209iobyxmoadg + ", deliveryType=" + this.f39214zoijcleaow + ", sectionId=" + this.f39212ppxfxbqfkf + ", brandId=" + this.f39213wkgbmnqykc + ", query=" + this.f39206eablkybsjg + ", page=" + this.f39208gxszxtbevo + ", sort=" + this.f39210lqeggnwhkg + ", filters=" + this.f39211nufgyqmvbu + ", selectionId=" + this.f39205dxjokdxxww + ", getFilter=" + this.f39204btonecajqb + ", getSuggest=" + this.f39207gtknphoqwx + ")";
        }

        public final Boolean wkgbmnqykc() {
            return this.f39204btonecajqb;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f39214zoijcleaow;
        }

        public /* synthetic */ iobyxmoadg(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, Integer num, String str5, List list, String str6, Boolean bool, Boolean bool2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : deliveryCode, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str5, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str6, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? bool2 : null);
        }
    }
}
