package ty0;

import java.util.List;
import ky0.PurchaseHistoryDetailsDto;
import ky0.PurchasesDto;
import px0.PurchasesHistoryDetailsRequest;
import px0.PurchasesHistoryRequest;
import px0.RepeatPurchaseRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss implements k01.wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.btonecajqb f112036iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ex0.zoijcleaow f112037ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nx0.iobyxmoadg f112038wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lx0.nufgyqmvbu f112039zoijcleaow;

    /* synthetic */ class eablkybsjg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        eablkybsjg(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112040iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112043zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112042yggfygwlhe = obj;
            this.f112040iwizpuwonk |= Integer.MIN_VALUE;
            return vdvldrhtss.this.ppxfxbqfkf(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112044iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112046yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112047zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112046yggfygwlhe = obj;
            this.f112044iwizpuwonk |= Integer.MIN_VALUE;
            return vdvldrhtss.this.zoijcleaow(null, this);
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        wkgbmnqykc(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112048cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112050jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112052zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112050jyumaefscl = obj;
            this.f112048cqumvgiudr |= Integer.MIN_VALUE;
            return vdvldrhtss.this.iobyxmoadg(null, this);
        }
    }

    public vdvldrhtss(ww0.btonecajqb purchasesHistoryApiService, lx0.nufgyqmvbu orderResponseMapper, ex0.zoijcleaow responseErrorFactory, nx0.iobyxmoadg cartWarningSelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesHistoryApiService, "purchasesHistoryApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartWarningSelector, "cartWarningSelector");
        this.f112036iobyxmoadg = purchasesHistoryApiService;
        this.f112039zoijcleaow = orderResponseMapper;
        this.f112037ppxfxbqfkf = responseErrorFactory;
        this.f112038wkgbmnqykc = cartWarningSelector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wflxmlrfwp
    public Object iobyxmoadg(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        vdvldrhtss vdvldrhtssVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112048cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112048cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f112050jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112048cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.btonecajqb btonecajqbVar = this.f112036iobyxmoadg;
            PurchasesHistoryRequest purchasesHistoryRequest = new PurchasesHistoryRequest(num);
            zoijcleaowVar.f112052zdlpuopuiu = this;
            zoijcleaowVar.f112051yggfygwlhe = num;
            zoijcleaowVar.f112048cqumvgiudr = 1;
            objZoijcleaow = btonecajqbVar.zoijcleaow(purchasesHistoryRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            vdvldrhtssVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) zoijcleaowVar.f112051yggfygwlhe;
            vdvldrhtssVar = (vdvldrhtss) zoijcleaowVar.f112052zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return vdvldrhtssVar.f112039zoijcleaow.ppxfxbqfkf((PurchasesDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null), num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wflxmlrfwp
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        vdvldrhtss vdvldrhtssVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112040iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112040iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f112042yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112040iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.btonecajqb btonecajqbVar = this.f112036iobyxmoadg;
            PurchasesHistoryDetailsRequest purchasesHistoryDetailsRequest = new PurchasesHistoryDetailsRequest(str);
            iobyxmoadgVar.f112043zdlpuopuiu = this;
            iobyxmoadgVar.f112040iwizpuwonk = 1;
            objIobyxmoadg = btonecajqbVar.iobyxmoadg(purchasesHistoryDetailsRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            vdvldrhtssVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vdvldrhtssVar = (vdvldrhtss) iobyxmoadgVar.f112043zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return vdvldrhtssVar.f112039zoijcleaow.zoijcleaow((PurchaseHistoryDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wflxmlrfwp
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        vdvldrhtss vdvldrhtssVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f112044iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f112044iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f112046yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f112044iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.btonecajqb btonecajqbVar = this.f112036iobyxmoadg;
            RepeatPurchaseRequest repeatPurchaseRequest = new RepeatPurchaseRequest(str);
            ppxfxbqfkfVar.f112047zdlpuopuiu = this;
            ppxfxbqfkfVar.f112044iwizpuwonk = 1;
            objPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf(repeatPurchaseRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            vdvldrhtssVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vdvldrhtssVar = (vdvldrhtss) ppxfxbqfkfVar.f112047zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return x21.wkgbmnqykc.ojitshcjhn((BasicResponse) objPpxfxbqfkf, new wkgbmnqykc(vdvldrhtssVar.f112037ppxfxbqfkf), new eablkybsjg(vdvldrhtssVar.f112038wkgbmnqykc));
    }
}
