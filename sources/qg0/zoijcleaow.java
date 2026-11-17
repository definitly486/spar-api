package qg0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import rg0.dxjokdxxww;
import rg0.gtknphoqwx;
import ru.myspar.core.network.model.BasicResponse;
import sg0.BannersDto;
import sg0.BrandsDto;
import sg0.GetBannersRequest;
import sg0.GetBrandsRequest;
import sg0.OrderStatusDto;
import sg0.OrderStatusResponse;
import uy.PromotionRequest;
import uz.PromotionDto;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements yg0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vg0.zoijcleaow f78791iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rg0.iobyxmoadg f78792zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f78793iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f78795yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f78796zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78795yggfygwlhe = obj;
            this.f78793iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.wkgbmnqykc(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f78797jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f78799zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78799zdlpuopuiu = obj;
            this.f78797jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f78800jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f78802zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78802zdlpuopuiu = obj;
            this.f78800jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(false, null, this);
        }
    }

    /* JADX INFO: renamed from: qg0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1764zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f78803jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f78805zdlpuopuiu;

        C1764zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78805zdlpuopuiu = obj;
            this.f78803jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, this);
        }
    }

    public zoijcleaow(vg0.zoijcleaow sectionsApiService, rg0.iobyxmoadg bannerMapper) {
        zdlpuopuiu.btonecajqb(sectionsApiService, "sectionsApiService");
        zdlpuopuiu.btonecajqb(bannerMapper, "bannerMapper");
        this.f78791iobyxmoadg = sectionsApiService;
        this.f78792zoijcleaow = bannerMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yg0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f78797jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f78797jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f78799zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f78797jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            vg0.zoijcleaow zoijcleaowVar = this.f78791iobyxmoadg;
            ppxfxbqfkfVar.f78797jyumaefscl = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List items = ((OrderStatusResponse) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(dxjokdxxww.zoijcleaow((OrderStatusDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yg0.iobyxmoadg
    public Object ppxfxbqfkf(boolean z13, String str, gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f78800jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f78800jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f78802zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f78800jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            vg0.zoijcleaow zoijcleaowVar = this.f78791iobyxmoadg;
            PromotionRequest promotionRequest = new PromotionRequest(z13, str);
            wkgbmnqykcVar.f78800jyumaefscl = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(promotionRequest, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return gtknphoqwx.iobyxmoadg((PromotionDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yg0.iobyxmoadg
    public Object wkgbmnqykc(String str, List list, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f78793iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f78793iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f78795yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f78793iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            vg0.zoijcleaow zoijcleaowVar2 = this.f78791iobyxmoadg;
            if (str == null) {
                str = "";
            }
            GetBannersRequest getBannersRequest = new GetBannersRequest(str, list);
            iobyxmoadgVar.f78796zdlpuopuiu = this;
            iobyxmoadgVar.f78793iwizpuwonk = 1;
            objWkgbmnqykc = zoijcleaowVar2.wkgbmnqykc(getBannersRequest, iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f78796zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return zoijcleaowVar.f78792zoijcleaow.wkgbmnqykc((BannersDto) eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yg0.iobyxmoadg
    public Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
        C1764zoijcleaow c1764zoijcleaow;
        if (gxszxtbevoVar instanceof C1764zoijcleaow) {
            c1764zoijcleaow = (C1764zoijcleaow) gxszxtbevoVar;
            int i13 = c1764zoijcleaow.f78803jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1764zoijcleaow.f78803jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1764zoijcleaow = new C1764zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1764zoijcleaow = new C1764zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1764zoijcleaow.f78805zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1764zoijcleaow.f78803jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            vg0.zoijcleaow zoijcleaowVar = this.f78791iobyxmoadg;
            GetBrandsRequest getBrandsRequest = new GetBrandsRequest(str);
            c1764zoijcleaow.f78803jyumaefscl = 1;
            objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(getBrandsRequest, c1764zoijcleaow);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return rg0.ppxfxbqfkf.zoijcleaow((BrandsDto) eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null)).iobyxmoadg();
    }
}
