package iz1;

import dz1.AddProductToListRequest;
import dz1.CopyPurchaseListRequest;
import dz1.CreatePurchaseListRequest;
import dz1.DeletePurchaseListRequest;
import dz1.PurchaseListDetailsRequest;
import dz1.PurchasesListAddFromSetRequest;
import dz1.PurchasesListAddFromSetResponse;
import dz1.PurchasesListChangeStatusRequest;
import ez1.CopyPurchaseListDto;
import ez1.NewPurchaseListDto;
import ez1.ProductStatusDto;
import ez1.PurchaseDetailsDto;
import ez1.PurchaseListDetailsDto;
import ez1.PurchaseListsDto;
import ez1.SharedPurchaseListDetailsDto;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements fz1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cz1.iobyxmoadg f50060iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jz1.zoijcleaow f50061zoijcleaow;

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50062jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50064zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50064zdlpuopuiu = obj;
            this.f50062jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(null, null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50065jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50067zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50067zdlpuopuiu = obj;
            this.f50065jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50068jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50070zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50070zdlpuopuiu = obj;
            this.f50068jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    /* JADX INFO: renamed from: iz1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1069iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50071jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50073zdlpuopuiu;

        C1069iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50073zdlpuopuiu = obj;
            this.f50071jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(null, null, 0.0d, null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f50074iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f50076yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50077zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50076yggfygwlhe = obj;
            this.f50074iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.btonecajqb(null, null, null, null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f50078iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f50080yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50081zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50080yggfygwlhe = obj;
            this.f50078iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f50082iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f50084yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50085zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50084yggfygwlhe = obj;
            this.f50082iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.dxjokdxxww(null, null, null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50086jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50088zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50088zdlpuopuiu = obj;
            this.f50086jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f50089jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f50091zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50091zdlpuopuiu = obj;
            this.f50089jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gxszxtbevo(null, null, this);
        }
    }

    public iobyxmoadg(cz1.iobyxmoadg purchaseListsApiService, jz1.zoijcleaow purchaseListsResponseMapper) {
        zdlpuopuiu.btonecajqb(purchaseListsApiService, "purchaseListsApiService");
        zdlpuopuiu.btonecajqb(purchaseListsResponseMapper, "purchaseListsResponseMapper");
        this.f50060iobyxmoadg = purchaseListsApiService;
        this.f50061zoijcleaow = purchaseListsResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object btonecajqb(String str, String str2, DeliveryCode deliveryCode, List list, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        ArrayList arrayList;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f50074iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f50074iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = lqeggnwhkgVar.f50076yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f50074iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            if (list != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    az1.ppxfxbqfkf ppxfxbqfkfVar = (az1.ppxfxbqfkf) it.next();
                    arrayList.add(new PurchaseDetailsDto(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.zoijcleaow()));
                }
            } else {
                arrayList = null;
            }
            PurchaseListDetailsRequest purchaseListDetailsRequest = new PurchaseListDetailsRequest(str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, arrayList);
            cz1.iobyxmoadg iobyxmoadgVar2 = this.f50060iobyxmoadg;
            lqeggnwhkgVar.f50077zdlpuopuiu = this;
            lqeggnwhkgVar.f50074iwizpuwonk = 1;
            objLqeggnwhkg = iobyxmoadgVar2.lqeggnwhkg(purchaseListDetailsRequest, lqeggnwhkgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f50077zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return iobyxmoadgVar.f50061zoijcleaow.zoijcleaow((PurchaseListDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objLqeggnwhkg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object dxjokdxxww(String str, String str2, DeliveryCode deliveryCode, List list, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f50082iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f50082iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objGxszxtbevo = ppxfxbqfkfVar.f50084yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f50082iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                az1.wkgbmnqykc wkgbmnqykcVar = (az1.wkgbmnqykc) it.next();
                arrayList.add(new ProductStatusDto(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()));
            }
            PurchasesListChangeStatusRequest purchasesListChangeStatusRequest = new PurchasesListChangeStatusRequest(str, str2, serverCode, arrayList);
            cz1.iobyxmoadg iobyxmoadgVar2 = this.f50060iobyxmoadg;
            ppxfxbqfkfVar.f50085zdlpuopuiu = this;
            ppxfxbqfkfVar.f50082iwizpuwonk = 1;
            objGxszxtbevo = iobyxmoadgVar2.gxszxtbevo(purchasesListChangeStatusRequest, ppxfxbqfkfVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f50085zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return iobyxmoadgVar.f50061zoijcleaow.zoijcleaow((PurchaseListDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f50062jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f50062jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objEablkybsjg = dxjokdxxwwVar.f50064zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f50062jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            PurchaseListDetailsRequest purchaseListDetailsRequest = new PurchaseListDetailsRequest(str, str2, (String) null, (List) null, 12, (gtknphoqwx) null);
            dxjokdxxwwVar.f50062jyumaefscl = 1;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(purchaseListDetailsRequest, dxjokdxxwwVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return jz1.ppxfxbqfkf.iobyxmoadg((SharedPurchaseListDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object gxszxtbevo(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f50089jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f50089jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objDxjokdxxww = zoijcleaowVar.f50091zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f50089jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            PurchasesListAddFromSetRequest purchasesListAddFromSetRequest = new PurchasesListAddFromSetRequest(str, str2);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            zoijcleaowVar.f50089jyumaefscl = 1;
            objDxjokdxxww = iobyxmoadgVar.dxjokdxxww(purchasesListAddFromSetRequest, zoijcleaowVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return jz1.iobyxmoadg.iobyxmoadg((PurchasesListAddFromSetResponse) o40.eablkybsjg.agtfadlqog((BasicResponse) objDxjokdxxww, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f50078iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f50078iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objIobyxmoadg = nufgyqmvbuVar.f50080yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f50078iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            cz1.iobyxmoadg iobyxmoadgVar2 = this.f50060iobyxmoadg;
            nufgyqmvbuVar.f50081zdlpuopuiu = this;
            nufgyqmvbuVar.f50078iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(nufgyqmvbuVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) nufgyqmvbuVar.f50081zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f50061zoijcleaow.iobyxmoadg((PurchaseListsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // fz1.iobyxmoadg
    public Object lqeggnwhkg(String str, String str2, double d13, String str3, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        C1069iobyxmoadg c1069iobyxmoadg;
        if (gxszxtbevoVar instanceof C1069iobyxmoadg) {
            c1069iobyxmoadg = (C1069iobyxmoadg) gxszxtbevoVar;
            int i13 = c1069iobyxmoadg.f50071jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1069iobyxmoadg.f50071jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1069iobyxmoadg = new C1069iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1069iobyxmoadg = new C1069iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1069iobyxmoadg.f50073zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1069iobyxmoadg.f50071jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            AddProductToListRequest addProductToListRequest = new AddProductToListRequest(str, str2, d13, str3);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            c1069iobyxmoadg.f50071jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(addProductToListRequest, c1069iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f50065jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f50065jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f50067zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f50065jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            CreatePurchaseListRequest createPurchaseListRequest = new CreatePurchaseListRequest(str);
            eablkybsjgVar.f50065jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(createPurchaseListRequest, eablkybsjgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ((NewPurchaseListDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null)).getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f50068jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f50068jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = gxszxtbevoVar2.f50070zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f50068jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            DeletePurchaseListRequest deletePurchaseListRequest = new DeletePurchaseListRequest(str);
            gxszxtbevoVar2.f50068jyumaefscl = 1;
            objNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(deletePurchaseListRequest, gxszxtbevoVar2);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objNufgyqmvbu, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fz1.iobyxmoadg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f50086jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f50086jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = wkgbmnqykcVar.f50088zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f50086jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            cz1.iobyxmoadg iobyxmoadgVar = this.f50060iobyxmoadg;
            CopyPurchaseListRequest copyPurchaseListRequest = new CopyPurchaseListRequest(str);
            wkgbmnqykcVar.f50086jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(copyPurchaseListRequest, wkgbmnqykcVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ((CopyPurchaseListDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null)).getId();
    }
}
