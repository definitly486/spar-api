package ok1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk1.AddProductToListRequest;
import jk1.CopyPurchaseListRequest;
import jk1.CreatePurchaseListRequest;
import jk1.DeletePurchaseListRequest;
import jk1.PurchaseListDetailsRequest;
import jk1.PurchasesListAddFromSetRequest;
import jk1.PurchasesListAddFromSetResponse;
import jk1.PurchasesListChangeStatusRequest;
import kk1.CopyPurchaseListDto;
import kk1.NewPurchaseListDto;
import kk1.ProductStatusDto;
import kk1.PurchaseDetailsDto;
import kk1.PurchaseListDetailsDto;
import kk1.PurchaseListsDto;
import kk1.SharedPurchaseListDetailsDto;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements lk1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ik1.iobyxmoadg f73014iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pk1.zoijcleaow f73015zoijcleaow;

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73016jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73018zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73018zdlpuopuiu = obj;
            this.f73016jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(null, null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73019jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73021zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73021zdlpuopuiu = obj;
            this.f73019jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73022jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73024zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73024zdlpuopuiu = obj;
            this.f73022jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    /* JADX INFO: renamed from: ok1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1591iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73025jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73027zdlpuopuiu;

        C1591iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73027zdlpuopuiu = obj;
            this.f73025jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(null, null, 0.0d, null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f73028iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73030yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73031zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73030yggfygwlhe = obj;
            this.f73028iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.btonecajqb(null, null, null, null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f73032iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73034yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73035zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73034yggfygwlhe = obj;
            this.f73032iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f73036iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73038yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73039zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73038yggfygwlhe = obj;
            this.f73036iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.dxjokdxxww(null, null, null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73040jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73042zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73042zdlpuopuiu = obj;
            this.f73040jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73043jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f73045zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73045zdlpuopuiu = obj;
            this.f73043jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gxszxtbevo(null, null, this);
        }
    }

    public iobyxmoadg(ik1.iobyxmoadg purchaseListsApiService, pk1.zoijcleaow purchaseListsResponseMapper) {
        zdlpuopuiu.btonecajqb(purchaseListsApiService, "purchaseListsApiService");
        zdlpuopuiu.btonecajqb(purchaseListsResponseMapper, "purchaseListsResponseMapper");
        this.f73014iobyxmoadg = purchaseListsApiService;
        this.f73015zoijcleaow = purchaseListsResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object btonecajqb(String str, String str2, DeliveryCode deliveryCode, List list, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        ArrayList arrayList;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f73028iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f73028iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = lqeggnwhkgVar.f73030yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f73028iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            if (list != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    gk1.ppxfxbqfkf ppxfxbqfkfVar = (gk1.ppxfxbqfkf) it.next();
                    arrayList.add(new PurchaseDetailsDto(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.zoijcleaow()));
                }
            } else {
                arrayList = null;
            }
            PurchaseListDetailsRequest purchaseListDetailsRequest = new PurchaseListDetailsRequest(str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, arrayList);
            ik1.iobyxmoadg iobyxmoadgVar2 = this.f73014iobyxmoadg;
            lqeggnwhkgVar.f73031zdlpuopuiu = this;
            lqeggnwhkgVar.f73028iwizpuwonk = 1;
            objLqeggnwhkg = iobyxmoadgVar2.lqeggnwhkg(purchaseListDetailsRequest, lqeggnwhkgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f73031zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return iobyxmoadgVar.f73015zoijcleaow.zoijcleaow((PurchaseListDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objLqeggnwhkg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object dxjokdxxww(String str, String str2, DeliveryCode deliveryCode, List list, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f73036iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f73036iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f73038yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f73036iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gk1.wkgbmnqykc wkgbmnqykcVar = (gk1.wkgbmnqykc) it.next();
                arrayList.add(new ProductStatusDto(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()));
            }
            PurchasesListChangeStatusRequest purchasesListChangeStatusRequest = new PurchasesListChangeStatusRequest(str, str2, serverCode, arrayList);
            ik1.iobyxmoadg iobyxmoadgVar2 = this.f73014iobyxmoadg;
            ppxfxbqfkfVar.f73039zdlpuopuiu = this;
            ppxfxbqfkfVar.f73036iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(purchasesListChangeStatusRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f73039zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return iobyxmoadgVar.f73015zoijcleaow.zoijcleaow((PurchaseListDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f73016jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f73016jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objDxjokdxxww = dxjokdxxwwVar.f73018zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f73016jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            PurchaseListDetailsRequest purchaseListDetailsRequest = new PurchaseListDetailsRequest(str, str2, (String) null, (List) null, 12, (gtknphoqwx) null);
            dxjokdxxwwVar.f73016jyumaefscl = 1;
            objDxjokdxxww = iobyxmoadgVar.dxjokdxxww(purchaseListDetailsRequest, dxjokdxxwwVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return pk1.ppxfxbqfkf.iobyxmoadg((SharedPurchaseListDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objDxjokdxxww, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object gxszxtbevo(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f73043jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f73043jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f73045zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f73043jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            PurchasesListAddFromSetRequest purchasesListAddFromSetRequest = new PurchasesListAddFromSetRequest(str, str2);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            zoijcleaowVar.f73043jyumaefscl = 1;
            objNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(purchasesListAddFromSetRequest, zoijcleaowVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        return pk1.iobyxmoadg.iobyxmoadg((PurchasesListAddFromSetResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objNufgyqmvbu, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f73032iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f73032iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objIobyxmoadg = nufgyqmvbuVar.f73034yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f73032iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ik1.iobyxmoadg iobyxmoadgVar2 = this.f73014iobyxmoadg;
            nufgyqmvbuVar.f73035zdlpuopuiu = this;
            nufgyqmvbuVar.f73032iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(nufgyqmvbuVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) nufgyqmvbuVar.f73035zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f73015zoijcleaow.iobyxmoadg((PurchaseListsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // lk1.iobyxmoadg
    public Object lqeggnwhkg(String str, String str2, double d13, String str3, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        C1591iobyxmoadg c1591iobyxmoadg;
        if (gxszxtbevoVar instanceof C1591iobyxmoadg) {
            c1591iobyxmoadg = (C1591iobyxmoadg) gxszxtbevoVar;
            int i13 = c1591iobyxmoadg.f73025jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1591iobyxmoadg.f73025jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1591iobyxmoadg = new C1591iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1591iobyxmoadg = new C1591iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c1591iobyxmoadg.f73027zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1591iobyxmoadg.f73025jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            AddProductToListRequest addProductToListRequest = new AddProductToListRequest(str, str2, d13, str3);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            c1591iobyxmoadg.f73025jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(addProductToListRequest, c1591iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f73019jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f73019jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = eablkybsjgVar.f73021zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f73019jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            CreatePurchaseListRequest createPurchaseListRequest = new CreatePurchaseListRequest(str);
            eablkybsjgVar.f73019jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(createPurchaseListRequest, eablkybsjgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ((NewPurchaseListDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objWkgbmnqykc, null, 1, null)).getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f73022jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f73022jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objGxszxtbevo = gxszxtbevoVar2.f73024zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f73022jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            DeletePurchaseListRequest deletePurchaseListRequest = new DeletePurchaseListRequest(str);
            gxszxtbevoVar2.f73022jyumaefscl = 1;
            objGxszxtbevo = iobyxmoadgVar.gxszxtbevo(deletePurchaseListRequest, gxszxtbevoVar2);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lk1.iobyxmoadg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f73040jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f73040jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objEablkybsjg = wkgbmnqykcVar.f73042zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f73040jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ik1.iobyxmoadg iobyxmoadgVar = this.f73014iobyxmoadg;
            CopyPurchaseListRequest copyPurchaseListRequest = new CopyPurchaseListRequest(str);
            wkgbmnqykcVar.f73040jyumaefscl = 1;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(copyPurchaseListRequest, wkgbmnqykcVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return ((CopyPurchaseListDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objEablkybsjg, null, 1, null)).getId();
    }
}
