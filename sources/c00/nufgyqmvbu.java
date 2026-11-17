package c00;

import az.GetCatalogRequest;
import az.GetComboSetRequest;
import az.GetProductDetailsRequest;
import az.GetProductsRequest;
import az.GetProductsWithSelectionRequest;
import az.GetRecommendationFeedsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lz.CatalogSectionDto;
import lz.CatalogSectionsDto;
import lz.GetRecommendationFeedsResponse;
import lz.ProductDetailsDto;
import lz.RecommendationFeedsDto;
import oz.ComboSetDto;
import oz.GetComboSetResponse;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;
import tz.ProductsDto;
import tz.ProductsReferencesDto;
import tz.ProductsWithSelectionDto;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu implements x10.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.wkgbmnqykc f18077iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final oy.lqeggnwhkg f18078ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ly.eablkybsjg f18079wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ly.gxszxtbevo f18080zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18081iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18083yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18084zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18083yggfygwlhe = obj;
            this.f18081iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.zoijcleaow(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18085iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18087yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18088zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18087yggfygwlhe = obj;
            this.f18085iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.wkgbmnqykc(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18089jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18091zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18091zdlpuopuiu = obj;
            this.f18089jyumaefscl |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18092iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18094yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18095zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18094yggfygwlhe = obj;
            this.f18092iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.ppxfxbqfkf(null, null, null, null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18096iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18098yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18099zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18098yggfygwlhe = obj;
            this.f18096iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.eablkybsjg(null, null, null, 0, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18100iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18102yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18103zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18102yggfygwlhe = obj;
            this.f18100iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.draadjrbmk(null, null, null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18104iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18106yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18107zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18106yggfygwlhe = obj;
            this.f18104iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.lqeggnwhkg(null, null, null, null, null, null, this);
        }
    }

    public nufgyqmvbu(ay.wkgbmnqykc catalogApiService, ly.gxszxtbevo productMapper, oy.lqeggnwhkg measureTypeModelMapper, ly.eablkybsjg productRecommendationsMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogApiService, "catalogApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productMapper, "productMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productRecommendationsMapper, "productRecommendationsMapper");
        this.f18077iobyxmoadg = catalogApiService;
        this.f18080zoijcleaow = productMapper;
        this.f18078ppxfxbqfkf = measureTypeModelMapper;
        this.f18079wkgbmnqykc = productRecommendationsMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object draadjrbmk(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, lg.gxszxtbevo gxszxtbevoVar) throws DomainException {
        wkgbmnqykc wkgbmnqykcVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f18100iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f18100iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = wkgbmnqykcVar.f18102yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f18100iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ay.wkgbmnqykc wkgbmnqykcVar2 = this.f18077iobyxmoadg;
            GetProductDetailsRequest getProductDetailsRequest = new GetProductDetailsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, str2, str3, str4);
            wkgbmnqykcVar.f18103zdlpuopuiu = this;
            wkgbmnqykcVar.f18100iwizpuwonk = 1;
            objWkgbmnqykc = wkgbmnqykcVar2.wkgbmnqykc(getProductDetailsRequest, wkgbmnqykcVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) wkgbmnqykcVar.f18103zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        Product productIobyxmoadg = nufgyqmvbuVar.f18080zoijcleaow.iobyxmoadg((ProductDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null)).iobyxmoadg();
        if (productIobyxmoadg != null) {
            return productIobyxmoadg;
        }
        throw new DomainException(null, null, 3, null);
    }

    static /* synthetic */ Object wflxmlrfwp(nufgyqmvbu nufgyqmvbuVar, String str, DeliveryCode deliveryCode, String str2, String str3, String str4, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        return nufgyqmvbuVar.draadjrbmk(str, deliveryCode, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, gxszxtbevoVar);
    }

    @Override // x10.ppxfxbqfkf
    public Object btonecajqb(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, str2, null, null, gxszxtbevoVar, 24, null);
    }

    @Override // x10.ppxfxbqfkf
    public Object dxjokdxxww(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, null, null, str2, gxszxtbevoVar, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // x10.ppxfxbqfkf
    public Object eablkybsjg(String str, DeliveryCode deliveryCode, String str2, int i13, String str3, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i14 = ppxfxbqfkfVar.f18096iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18096iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objGxszxtbevo = ppxfxbqfkfVar.f18098yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i15 = ppxfxbqfkfVar.f18096iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            GetProductsRequest getProductsRequest = new GetProductsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), (Map) null, str2, (String) null, (String) null, str3, (Boolean) null, (Boolean) null, 872, (kotlin.jvm.internal.gtknphoqwx) null);
            ppxfxbqfkfVar.f18099zdlpuopuiu = this;
            ppxfxbqfkfVar.f18096iwizpuwonk = 1;
            objGxszxtbevo = wkgbmnqykcVar.gxszxtbevo(getProductsRequest, ppxfxbqfkfVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) ppxfxbqfkfVar.f18099zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return nufgyqmvbuVar.f18080zoijcleaow.dxjokdxxww((ProductsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    @Override // x10.ppxfxbqfkf
    public Object gxszxtbevo(String str, DeliveryCode deliveryCode, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, str, deliveryCode, null, str2, null, gxszxtbevoVar, 20, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x10.ppxfxbqfkf
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18089jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18089jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f18091zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18089jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            GetCatalogRequest getCatalogRequest = new GetCatalogRequest(str);
            iobyxmoadgVar.f18089jyumaefscl = 1;
            objZoijcleaow = wkgbmnqykcVar.zoijcleaow(getCatalogRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        ArrayList arrayList = null;
        CatalogSectionsDto catalogSectionsDto = (CatalogSectionsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        List<CatalogSectionDto> catalogSections = catalogSectionsDto.getCatalogSections();
        if (catalogSections != null) {
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(catalogSections, 10));
            for (CatalogSectionDto catalogSectionDto : catalogSections) {
                ProductsReferencesDto references = catalogSectionsDto.getReferences();
                arrayList2.add(ly.zoijcleaow.iobyxmoadg(catalogSectionDto, references != null ? references.getColors() : null));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // x10.ppxfxbqfkf
    public Object lqeggnwhkg(String str, w00.zoijcleaow zoijcleaowVar, DeliveryCode deliveryCode, String str2, String str3, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar2;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar2 = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar2.f18104iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar2.f18104iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar2.f18106yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f18104iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            GetComboSetRequest getComboSetRequest = new GetComboSetRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, zoijcleaowVar != null ? zoijcleaowVar.wkgbmnqykc() : null, str2, str3, list);
            zoijcleaowVar2.f18107zdlpuopuiu = this;
            zoijcleaowVar2.f18104iwizpuwonk = 1;
            objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(getComboSetRequest, zoijcleaowVar2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) zoijcleaowVar2.f18107zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List comboSetList = ((GetComboSetResponse) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getComboSetList();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(comboSetList, 10));
        Iterator it = comboSetList.iterator();
        while (it.hasNext()) {
            arrayList.add(ky.zoijcleaow.iobyxmoadg((ComboSetDto) it.next(), nufgyqmvbuVar.f18078ppxfxbqfkf));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // x10.ppxfxbqfkf
    public Object ppxfxbqfkf(String str, String str2, DeliveryCode deliveryCode, Integer num, String str3, List list, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f18092iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f18092iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = lqeggnwhkgVar.f18094yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f18092iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            GetProductsWithSelectionRequest getProductsWithSelectionRequest = new GetProductsWithSelectionRequest(str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, str3, oy.wkgbmnqykc.zoijcleaow(list), num);
            lqeggnwhkgVar.f18095zdlpuopuiu = this;
            lqeggnwhkgVar.f18092iwizpuwonk = 1;
            objNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu(getProductsWithSelectionRequest, lqeggnwhkgVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) lqeggnwhkgVar.f18095zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        return nufgyqmvbuVar.f18080zoijcleaow.wkgbmnqykc((ProductsWithSelectionDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objNufgyqmvbu, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // x10.ppxfxbqfkf
    public Object wkgbmnqykc(String str, DeliveryCode deliveryCode, String str2, String str3, String str4, Integer num, String str5, List list, Boolean bool, Boolean bool2, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f18085iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f18085iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = gxszxtbevoVar2.f18087yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f18085iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            GetProductsRequest getProductsRequest = new GetProductsRequest(str, deliveryCode != null ? deliveryCode.getServerCode() : null, num, oy.wkgbmnqykc.zoijcleaow(list), str2, str3, str4, str5, bool, bool2);
            gxszxtbevoVar2.f18088zdlpuopuiu = this;
            gxszxtbevoVar2.f18085iwizpuwonk = 1;
            objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg(getProductsRequest, gxszxtbevoVar2);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar2.f18088zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return nufgyqmvbuVar.f18080zoijcleaow.nufgyqmvbu((ProductsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objLqeggnwhkg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x10.ppxfxbqfkf
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f18081iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f18081iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = eablkybsjgVar.f18083yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f18081iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            GetRecommendationFeedsRequest getRecommendationFeedsRequest = new GetRecommendationFeedsRequest(str);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18077iobyxmoadg;
            eablkybsjgVar.f18084zdlpuopuiu = this;
            eablkybsjgVar.f18081iwizpuwonk = 1;
            objPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf(getRecommendationFeedsRequest, eablkybsjgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) eablkybsjgVar.f18084zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        GetRecommendationFeedsResponse getRecommendationFeedsResponse = (GetRecommendationFeedsResponse) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null);
        List feeds = getRecommendationFeedsResponse.getFeeds();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(feeds, 10));
        Iterator it = feeds.iterator();
        while (it.hasNext()) {
            arrayList.add(nufgyqmvbuVar.f18079wkgbmnqykc.invoke((RecommendationFeedsDto) it.next(), getRecommendationFeedsResponse.getReferences()));
        }
        return arrayList;
    }
}
