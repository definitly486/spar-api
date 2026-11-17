package ty0;

import dy0.CatalogSectionDto;
import dy0.CatalogSectionsDto;
import dy0.GetRecommendationFeedsResponse;
import dy0.ProductDetailsDto;
import dy0.RecommendationFeedsDto;
import gy0.GetComboSetResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ly0.ProductsDto;
import ly0.ProductsReferencesDto;
import ly0.ProductsWithSelectionDto;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ux0.GetCatalogRequest;
import ux0.GetComboSetRequest;
import ux0.GetProductDetailsRequest;
import ux0.GetProductsRequest;
import ux0.GetProductsWithSelectionRequest;
import ux0.GetRecommendationFeedsRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements l01.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.wkgbmnqykc f111972iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jx0.lqeggnwhkg f111973ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gx0.eablkybsjg f111974wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gx0.gxszxtbevo f111975zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111976iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111978yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111979zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111978yggfygwlhe = obj;
            this.f111976iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.zoijcleaow(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111980iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111982yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111983zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111982yggfygwlhe = obj;
            this.f111980iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.btonecajqb(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111984jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111986zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111986zdlpuopuiu = obj;
            this.f111984jyumaefscl |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX INFO: renamed from: ty0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    static final class C2755lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111987iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111989yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111990zdlpuopuiu;

        C2755lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111989yggfygwlhe = obj;
            this.f111987iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.lqeggnwhkg(null, null, null, null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111991iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111993yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111994zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111993yggfygwlhe = obj;
            this.f111991iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.dxjokdxxww(null, null, null, 0, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111995iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111997yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111998zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111997yggfygwlhe = obj;
            this.f111995iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.draadjrbmk(null, null, null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111999iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112001yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112002zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112001yggfygwlhe = obj;
            this.f111999iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.nufgyqmvbu(null, null, null, null, this);
        }
    }

    public lqeggnwhkg(ww0.wkgbmnqykc catalogApiService, gx0.gxszxtbevo productMapper, jx0.lqeggnwhkg measureTypeModelMapper, gx0.eablkybsjg productRecommendationsMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogApiService, "catalogApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productMapper, "productMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productRecommendationsMapper, "productRecommendationsMapper");
        this.f111972iobyxmoadg = catalogApiService;
        this.f111975zoijcleaow = productMapper;
        this.f111973ppxfxbqfkf = measureTypeModelMapper;
        this.f111974wkgbmnqykc = productRecommendationsMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object draadjrbmk(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, lg.gxszxtbevo gxszxtbevoVar) throws DomainException {
        wkgbmnqykc wkgbmnqykcVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f111995iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f111995iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = wkgbmnqykcVar.f111997yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f111995iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.wkgbmnqykc wkgbmnqykcVar2 = this.f111972iobyxmoadg;
            GetProductDetailsRequest getProductDetailsRequest = new GetProductDetailsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, str2, str3, str4);
            wkgbmnqykcVar.f111998zdlpuopuiu = this;
            wkgbmnqykcVar.f111995iwizpuwonk = 1;
            objPpxfxbqfkf = wkgbmnqykcVar2.ppxfxbqfkf(getProductDetailsRequest, wkgbmnqykcVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) wkgbmnqykcVar.f111998zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        Product productIobyxmoadg = lqeggnwhkgVar.f111975zoijcleaow.iobyxmoadg((ProductDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null)).iobyxmoadg();
        if (productIobyxmoadg != null) {
            return productIobyxmoadg;
        }
        throw new DomainException(null, null, 3, null);
    }

    static /* synthetic */ Object wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, String str, DeliveryCode deliveryCode, String str2, String str3, String str4, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        return lqeggnwhkgVar.draadjrbmk(str, deliveryCode, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l01.ppxfxbqfkf
    public Object btonecajqb(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, Integer num, String str5, List list, Boolean bool, Boolean bool2, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f111980iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f111980iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = gxszxtbevoVar2.f111982yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f111980iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            GetProductsRequest getProductsRequest = new GetProductsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, num, jx0.wkgbmnqykc.zoijcleaow(list), str2, str3, str4, str5, bool, bool2);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            gxszxtbevoVar2.f111983zdlpuopuiu = this;
            gxszxtbevoVar2.f111980iwizpuwonk = 1;
            objNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu(getProductsRequest, gxszxtbevoVar2);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar2.f111983zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        return lqeggnwhkgVar.f111975zoijcleaow.nufgyqmvbu((ProductsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objNufgyqmvbu, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l01.ppxfxbqfkf
    public Object dxjokdxxww(String str, DeliveryCode deliveryCode, String str2, int i13, String str3, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i14 = ppxfxbqfkfVar.f111991iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f111991iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objEablkybsjg = ppxfxbqfkfVar.f111993yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = ppxfxbqfkfVar.f111991iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            GetProductsRequest getProductsRequest = new GetProductsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), (Map) null, str2, (String) null, (String) null, str3, (Boolean) null, (Boolean) null, 872, (kotlin.jvm.internal.gtknphoqwx) null);
            ppxfxbqfkfVar.f111994zdlpuopuiu = this;
            ppxfxbqfkfVar.f111991iwizpuwonk = 1;
            objEablkybsjg = wkgbmnqykcVar.eablkybsjg(getProductsRequest, ppxfxbqfkfVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) ppxfxbqfkfVar.f111994zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return lqeggnwhkgVar.f111975zoijcleaow.dxjokdxxww((ProductsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objEablkybsjg, null, 1, null));
    }

    @Override // l01.ppxfxbqfkf
    public Object eablkybsjg(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, str2, null, null, gxszxtbevoVar, 24, null);
    }

    @Override // l01.ppxfxbqfkf
    public Object gxszxtbevo(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, null, null, str2, gxszxtbevoVar, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l01.ppxfxbqfkf
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f111984jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f111984jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f111986zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f111984jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            GetCatalogRequest getCatalogRequest = new GetCatalogRequest(str);
            iobyxmoadgVar.f111984jyumaefscl = 1;
            objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(getCatalogRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        ArrayList arrayList = null;
        CatalogSectionsDto catalogSectionsDto = (CatalogSectionsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null);
        List<CatalogSectionDto> catalogSections = catalogSectionsDto.getCatalogSections();
        if (catalogSections != null) {
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(catalogSections, 10));
            for (CatalogSectionDto catalogSectionDto : catalogSections) {
                ProductsReferencesDto references = catalogSectionsDto.getReferences();
                arrayList2.add(gx0.zoijcleaow.iobyxmoadg(catalogSectionDto, references != null ? references.getColors() : null));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // l01.ppxfxbqfkf
    public Object lqeggnwhkg(String str, String str2, DeliveryCode deliveryCode, Integer num, String str3, List list, lg.gxszxtbevo gxszxtbevoVar) {
        C2755lqeggnwhkg c2755lqeggnwhkg;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof C2755lqeggnwhkg) {
            c2755lqeggnwhkg = (C2755lqeggnwhkg) gxszxtbevoVar;
            int i13 = c2755lqeggnwhkg.f111987iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2755lqeggnwhkg.f111987iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2755lqeggnwhkg = new C2755lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            c2755lqeggnwhkg = new C2755lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2755lqeggnwhkg.f111989yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2755lqeggnwhkg.f111987iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            GetProductsWithSelectionRequest getProductsWithSelectionRequest = new GetProductsWithSelectionRequest(str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, str3, jx0.wkgbmnqykc.zoijcleaow(list), num);
            c2755lqeggnwhkg.f111990zdlpuopuiu = this;
            c2755lqeggnwhkg.f111987iwizpuwonk = 1;
            objZoijcleaow = wkgbmnqykcVar.zoijcleaow(getProductsWithSelectionRequest, c2755lqeggnwhkg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) c2755lqeggnwhkg.f111990zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return lqeggnwhkgVar.f111975zoijcleaow.wkgbmnqykc((ProductsWithSelectionDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l01.ppxfxbqfkf
    public Object nufgyqmvbu(nz0.zoijcleaow zoijcleaowVar, String str, String str2, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar2;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar2 = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar2.f111999iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar2.f111999iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
        }
        Object objGxszxtbevo = zoijcleaowVar2.f112001yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f111999iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            GetComboSetRequest getComboSetRequest = new GetComboSetRequest(zoijcleaowVar != null ? zoijcleaowVar.wkgbmnqykc() : null, str, str2, list);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            zoijcleaowVar2.f112002zdlpuopuiu = this;
            zoijcleaowVar2.f111999iwizpuwonk = 1;
            objGxszxtbevo = wkgbmnqykcVar.gxszxtbevo(getComboSetRequest, zoijcleaowVar2);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) zoijcleaowVar2.f112002zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return fx0.iobyxmoadg.zoijcleaow((GetComboSetResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null), lqeggnwhkgVar.f111973ppxfxbqfkf);
    }

    @Override // l01.ppxfxbqfkf
    public Object wkgbmnqykc(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, null, str2, null, gxszxtbevoVar, 20, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l01.ppxfxbqfkf
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f111976iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f111976iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = eablkybsjgVar.f111978yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f111976iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            GetRecommendationFeedsRequest getRecommendationFeedsRequest = new GetRecommendationFeedsRequest(str);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111972iobyxmoadg;
            eablkybsjgVar.f111979zdlpuopuiu = this;
            eablkybsjgVar.f111976iwizpuwonk = 1;
            objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg(getRecommendationFeedsRequest, eablkybsjgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) eablkybsjgVar.f111979zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        GetRecommendationFeedsResponse getRecommendationFeedsResponse = (GetRecommendationFeedsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objLqeggnwhkg, null, 1, null);
        List feeds = getRecommendationFeedsResponse.getFeeds();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(feeds, 10));
        Iterator it = feeds.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkgVar.f111974wkgbmnqykc.invoke((RecommendationFeedsDto) it.next(), getRecommendationFeedsResponse.getReferences()));
        }
        return arrayList;
    }
}
