package tz;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import fk.wizcaqwiak;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import y30.PagingDto;

/* JADX INFO: renamed from: tz.agtfadlqog, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002')B}\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010 R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010 R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010 R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010+\u001a\u0004\b2\u00103R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b6\u0010+\u001a\u0004\b0\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010;\u0012\u0004\b=\u0010+\u001a\u0004\b5\u0010<R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u00101\u0012\u0004\b?\u0010+\u001a\u0004\b>\u00103¨\u0006A"}, d2 = {"Ltz/agtfadlqog;", "", "", "seen0", "", "currentSelectionId", "currentSelectionName", "titleImage", "", "Ltz/nufgyqmvbu;", "productList", "Ltz/wkgbmnqykc;", "filterSections", "Ltz/wflxmlrfwp;", "references", "Ly30/iobyxmoadg;", "paging", "Ltz/jyumaefscl;", "selections", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ltz/wflxmlrfwp;Ly30/iobyxmoadg;Ljava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "btonecajqb", "(Ltz/agtfadlqog;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "zoijcleaow", "getCurrentSelectionId$annotations", "()V", "ppxfxbqfkf", "getCurrentSelectionName$annotations", "dxjokdxxww", "getTitleImage$annotations", "wkgbmnqykc", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "getProductList$annotations", "eablkybsjg", "getFilterSections$annotations", "Ltz/wflxmlrfwp;", "lqeggnwhkg", "()Ltz/wflxmlrfwp;", "getReferences$annotations", "Ly30/iobyxmoadg;", "()Ly30/iobyxmoadg;", "getPaging$annotations", "nufgyqmvbu", "getSelections$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductsWithSelectionDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final bk.zoijcleaow[] f112179dxjokdxxww = {null, null, null, new fk.gxszxtbevo(ProductDto.iobyxmoadg.f112287iobyxmoadg), new fk.gxszxtbevo(FilterSectionDto.iobyxmoadg.f112313iobyxmoadg), null, null, new fk.gxszxtbevo(SelectionDto.iobyxmoadg.f112239iobyxmoadg)};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filterSections;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsReferencesDto references;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentSelectionId;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private final PagingDto paging;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List selections;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleImage;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productList;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentSelectionName;

    /* JADX INFO: renamed from: tz.agtfadlqog$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f112188iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f112188iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.core.data.response.products.ProductsWithSelectionDto", iobyxmoadgVar, 8);
            iyctptxqztVar.ojitshcjhn("id", false);
            iyctptxqztVar.ojitshcjhn(ExternalMetricsManagerImpl.NAME, false);
            iyctptxqztVar.ojitshcjhn("title_image", false);
            iyctptxqztVar.ojitshcjhn("items", true);
            iyctptxqztVar.ojitshcjhn("filter", true);
            iyctptxqztVar.ojitshcjhn("refs", true);
            iyctptxqztVar.ojitshcjhn("paging", true);
            iyctptxqztVar.ojitshcjhn("selections", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            bk.zoijcleaow[] zoijcleaowVarArr = ProductsWithSelectionDto.f112179dxjokdxxww;
            bk.zoijcleaow zoijcleaowVarYggfygwlhe = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[3]);
            bk.zoijcleaow zoijcleaowVarYggfygwlhe2 = ck.iobyxmoadg.yggfygwlhe(zoijcleaowVarArr[4]);
            bk.zoijcleaow zoijcleaowVarYggfygwlhe3 = ck.iobyxmoadg.yggfygwlhe(ProductsReferencesDto.iobyxmoadg.f112308iobyxmoadg);
            bk.zoijcleaow zoijcleaowVarYggfygwlhe4 = ck.iobyxmoadg.yggfygwlhe(PagingDto.C3125iobyxmoadg.f123679iobyxmoadg);
            bk.zoijcleaow zoijcleaowVar = zoijcleaowVarArr[7];
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            return new bk.zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar, wizcaqwiakVar, zoijcleaowVarYggfygwlhe, zoijcleaowVarYggfygwlhe2, zoijcleaowVarYggfygwlhe3, zoijcleaowVarYggfygwlhe4, zoijcleaowVar};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final ProductsWithSelectionDto zoijcleaow(ek.eablkybsjg decoder) {
            int i13;
            PagingDto pagingDto;
            List list;
            ProductsReferencesDto wflxmlrfwpVar;
            List list2;
            String str;
            String str2;
            String str3;
            List list3;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            bk.zoijcleaow[] zoijcleaowVarArr = ProductsWithSelectionDto.f112179dxjokdxxww;
            int i14 = 6;
            int i15 = 5;
            String strVdvldrhtss = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                String strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                String strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                String strVdvldrhtss4 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                List list4 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, zoijcleaowVarArr[3], null);
                List list5 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 4, zoijcleaowVarArr[4], null);
                ProductsReferencesDto wflxmlrfwpVar2 = (ProductsReferencesDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 5, ProductsReferencesDto.iobyxmoadg.f112308iobyxmoadg, null);
                PagingDto pagingDto2 = (PagingDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 6, PagingDto.C3125iobyxmoadg.f123679iobyxmoadg, null);
                list = (List) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 7, zoijcleaowVarArr[7], null);
                str = strVdvldrhtss2;
                pagingDto = pagingDto2;
                wflxmlrfwpVar = wflxmlrfwpVar2;
                str3 = strVdvldrhtss4;
                i13 = 255;
                list3 = list4;
                list2 = list5;
                str2 = strVdvldrhtss3;
            } else {
                boolean z13 = true;
                int i16 = 0;
                PagingDto pagingDto3 = null;
                List list6 = null;
                ProductsReferencesDto wflxmlrfwpVar3 = null;
                List list7 = null;
                String strVdvldrhtss5 = null;
                String strVdvldrhtss6 = null;
                List list8 = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    switch (iYadqdtsiqt) {
                        case -1:
                            z13 = false;
                            i14 = 6;
                            i15 = 5;
                            break;
                        case 0:
                            i16 |= 1;
                            strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                            i14 = 6;
                            i15 = 5;
                            break;
                        case 1:
                            i16 |= 2;
                            strVdvldrhtss5 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                            i14 = 6;
                            i15 = 5;
                            break;
                        case 2:
                            strVdvldrhtss6 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                            i16 |= 4;
                            i14 = 6;
                            i15 = 5;
                            break;
                        case 3:
                            list8 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, zoijcleaowVarArr[3], list8);
                            i16 |= 8;
                            i14 = 6;
                            i15 = 5;
                            break;
                        case 4:
                            list7 = (List) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 4, zoijcleaowVarArr[4], list7);
                            i16 |= 16;
                            i14 = 6;
                            break;
                        case 5:
                            wflxmlrfwpVar3 = (ProductsReferencesDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, i15, ProductsReferencesDto.iobyxmoadg.f112308iobyxmoadg, wflxmlrfwpVar3);
                            i16 |= 32;
                            break;
                        case 6:
                            pagingDto3 = (PagingDto) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, i14, PagingDto.C3125iobyxmoadg.f123679iobyxmoadg, pagingDto3);
                            i16 |= 64;
                            break;
                        case 7:
                            list6 = (List) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 7, zoijcleaowVarArr[7], list6);
                            i16 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            break;
                        default:
                            throw new UnknownFieldException(iYadqdtsiqt);
                    }
                }
                i13 = i16;
                pagingDto = pagingDto3;
                list = list6;
                wflxmlrfwpVar = wflxmlrfwpVar3;
                list2 = list7;
                str = strVdvldrhtss;
                str2 = strVdvldrhtss5;
                str3 = strVdvldrhtss6;
                list3 = list8;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new ProductsWithSelectionDto(i13, str, str2, str3, list3, list2, wflxmlrfwpVar, pagingDto, list, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, ProductsWithSelectionDto value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            ProductsWithSelectionDto.btonecajqb(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: tz.agtfadlqog$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f112188iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ ProductsWithSelectionDto(int i13, String str, String str2, String str3, List list, List list2, ProductsReferencesDto wflxmlrfwpVar, PagingDto pagingDto, List list3, dvvnrvtcbc dvvnrvtcbcVar) {
        if (135 != (i13 & 135)) {
            sflfametgt.zoijcleaow(i13, 135, iobyxmoadg.f112188iobyxmoadg.iobyxmoadg());
        }
        this.currentSelectionId = str;
        this.currentSelectionName = str2;
        this.titleImage = str3;
        if ((i13 & 8) == 0) {
            this.productList = null;
        } else {
            this.productList = list;
        }
        if ((i13 & 16) == 0) {
            this.filterSections = null;
        } else {
            this.filterSections = list2;
        }
        if ((i13 & 32) == 0) {
            this.references = null;
        } else {
            this.references = wflxmlrfwpVar;
        }
        if ((i13 & 64) == 0) {
            this.paging = null;
        } else {
            this.paging = pagingDto;
        }
        this.selections = list3;
    }

    public static final /* synthetic */ void btonecajqb(ProductsWithSelectionDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f112179dxjokdxxww;
        output.istkbnxepw(serialDesc, 0, self.currentSelectionId);
        output.istkbnxepw(serialDesc, 1, self.currentSelectionName);
        output.istkbnxepw(serialDesc, 2, self.titleImage);
        if (output.zdlpuopuiu(serialDesc, 3) || self.productList != null) {
            output.yggfygwlhe(serialDesc, 3, zoijcleaowVarArr[3], self.productList);
        }
        if (output.zdlpuopuiu(serialDesc, 4) || self.filterSections != null) {
            output.yggfygwlhe(serialDesc, 4, zoijcleaowVarArr[4], self.filterSections);
        }
        if (output.zdlpuopuiu(serialDesc, 5) || self.references != null) {
            output.yggfygwlhe(serialDesc, 5, ProductsReferencesDto.iobyxmoadg.f112308iobyxmoadg, self.references);
        }
        if (output.zdlpuopuiu(serialDesc, 6) || self.paging != null) {
            output.yggfygwlhe(serialDesc, 6, PagingDto.C3125iobyxmoadg.f123679iobyxmoadg, self.paging);
        }
        output.lqeggnwhkg(serialDesc, 7, zoijcleaowVarArr[7], self.selections);
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final PagingDto getPaging() {
        return this.paging;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsWithSelectionDto)) {
            return false;
        }
        ProductsWithSelectionDto productsWithSelectionDto = (ProductsWithSelectionDto) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.currentSelectionId, productsWithSelectionDto.currentSelectionId) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.currentSelectionName, productsWithSelectionDto.currentSelectionName) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.titleImage, productsWithSelectionDto.titleImage) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.productList, productsWithSelectionDto.productList) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.filterSections, productsWithSelectionDto.filterSections) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.references, productsWithSelectionDto.references) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.paging, productsWithSelectionDto.paging) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.selections, productsWithSelectionDto.selections);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    public int hashCode() {
        int iHashCode = ((((this.currentSelectionId.hashCode() * 31) + this.currentSelectionName.hashCode()) * 31) + this.titleImage.hashCode()) * 31;
        List list = this.productList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.filterSections;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductsReferencesDto wflxmlrfwpVar = this.references;
        int iHashCode4 = (iHashCode3 + (wflxmlrfwpVar == null ? 0 : wflxmlrfwpVar.hashCode())) * 31;
        PagingDto pagingDto = this.paging;
        return ((iHashCode4 + (pagingDto != null ? pagingDto.hashCode() : 0)) * 31) + this.selections.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ProductsReferencesDto getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getSelections() {
        return this.selections;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCurrentSelectionName() {
        return this.currentSelectionName;
    }

    public String toString() {
        return "ProductsWithSelectionDto(currentSelectionId=" + this.currentSelectionId + ", currentSelectionName=" + this.currentSelectionName + ", titleImage=" + this.titleImage + ", productList=" + this.productList + ", filterSections=" + this.filterSections + ", references=" + this.references + ", paging=" + this.paging + ", selections=" + this.selections + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final List getFilterSections() {
        return this.filterSections;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getCurrentSelectionId() {
        return this.currentSelectionId;
    }
}
