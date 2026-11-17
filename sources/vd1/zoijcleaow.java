package vd1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import my0.PromotionDto;
import px0.PromotionRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wd1.btonecajqb;
import wd1.nufgyqmvbu;
import xd1.BrandsDto;
import xd1.GetBrandsRequest;
import xd1.OrderStatusDto;
import xd1.OrderStatusResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements de1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ae1.zoijcleaow f116547iobyxmoadg;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116548jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116550zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116550zdlpuopuiu = obj;
            this.f116548jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116551jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116553zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116553zdlpuopuiu = obj;
            this.f116551jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(false, null, this);
        }
    }

    /* JADX INFO: renamed from: vd1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2908zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116554jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116556zdlpuopuiu;

        C2908zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116556zdlpuopuiu = obj;
            this.f116554jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(this);
        }
    }

    public zoijcleaow(ae1.zoijcleaow sectionsApiService) {
        zdlpuopuiu.btonecajqb(sectionsApiService, "sectionsApiService");
        this.f116547iobyxmoadg = sectionsApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // de1.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C2908zoijcleaow c2908zoijcleaow;
        if (gxszxtbevoVar instanceof C2908zoijcleaow) {
            c2908zoijcleaow = (C2908zoijcleaow) gxszxtbevoVar;
            int i13 = c2908zoijcleaow.f116554jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2908zoijcleaow.f116554jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2908zoijcleaow = new C2908zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2908zoijcleaow = new C2908zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2908zoijcleaow.f116556zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2908zoijcleaow.f116554jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ae1.zoijcleaow zoijcleaowVar = this.f116547iobyxmoadg;
            c2908zoijcleaow.f116554jyumaefscl = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(c2908zoijcleaow);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List items = ((OrderStatusResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(nufgyqmvbu.zoijcleaow((OrderStatusDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // de1.iobyxmoadg
    public Object ppxfxbqfkf(boolean z13, String str, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f116551jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f116551jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f116553zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f116551jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ae1.zoijcleaow zoijcleaowVar = this.f116547iobyxmoadg;
            PromotionRequest promotionRequest = new PromotionRequest(z13, str);
            ppxfxbqfkfVar.f116551jyumaefscl = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(promotionRequest, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return btonecajqb.iobyxmoadg((PromotionDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // de1.iobyxmoadg
    public Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f116548jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f116548jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f116550zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f116548jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ae1.zoijcleaow zoijcleaowVar = this.f116547iobyxmoadg;
            GetBrandsRequest getBrandsRequest = new GetBrandsRequest(str);
            iobyxmoadgVar.f116548jyumaefscl = 1;
            objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(getBrandsRequest, iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return wd1.zoijcleaow.zoijcleaow((BrandsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null)).iobyxmoadg();
    }
}
