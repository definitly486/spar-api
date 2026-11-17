package ru0;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ou0.ChooseLoyaltyCategoriesRequest;
import ou0.LoyaltyCategoriesResponse;
import ou0.LoyaltyInfoItemDto;
import ou0.LoyaltyInfoResponse;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements pu0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nu0.iobyxmoadg f104906iobyxmoadg;

    /* JADX INFO: renamed from: ru0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2541iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f104907jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f104909zdlpuopuiu;

        C2541iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f104909zdlpuopuiu = obj;
            this.f104907jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f104910jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f104912zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f104912zdlpuopuiu = obj;
            this.f104910jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f104913jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f104915zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f104915zdlpuopuiu = obj;
            this.f104913jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(nu0.iobyxmoadg apiService) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        this.f104906iobyxmoadg = apiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pu0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f104913jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f104913jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f104915zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f104913jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            nu0.iobyxmoadg iobyxmoadgVar = this.f104906iobyxmoadg;
            zoijcleaowVar.f104913jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List items = ((LoyaltyInfoResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(su0.iobyxmoadg.iobyxmoadg((LoyaltyInfoItemDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pu0.iobyxmoadg
    public Object ppxfxbqfkf(List list, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2541iobyxmoadg c2541iobyxmoadg;
        if (gxszxtbevoVar instanceof C2541iobyxmoadg) {
            c2541iobyxmoadg = (C2541iobyxmoadg) gxszxtbevoVar;
            int i13 = c2541iobyxmoadg.f104907jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2541iobyxmoadg.f104907jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2541iobyxmoadg = new C2541iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2541iobyxmoadg = new C2541iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c2541iobyxmoadg.f104909zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2541iobyxmoadg.f104907jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ChooseLoyaltyCategoriesRequest chooseLoyaltyCategoriesRequest = new ChooseLoyaltyCategoriesRequest(list);
            nu0.iobyxmoadg iobyxmoadgVar = this.f104906iobyxmoadg;
            c2541iobyxmoadg.f104907jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(chooseLoyaltyCategoriesRequest, c2541iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pu0.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f104910jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f104910jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f104912zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f104910jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            nu0.iobyxmoadg iobyxmoadgVar = this.f104906iobyxmoadg;
            ppxfxbqfkfVar.f104910jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return su0.ppxfxbqfkf.iobyxmoadg((LoyaltyCategoriesResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
