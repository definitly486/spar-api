package c00;

import java.util.List;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.core.network.model.WarningDto;
import sz.PurchaseHistoryDetailsDto;
import sz.PurchasesDto;
import uy.PurchasesHistoryDetailsRequest;
import uy.PurchasesHistoryRequest;
import uy.RepeatPurchaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class kcexrzcfyt implements w10.wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.gtknphoqwx f18052iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jy.zoijcleaow f18053ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sy.iobyxmoadg f18054wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qy.gxszxtbevo f18055zoijcleaow;

    /* synthetic */ class eablkybsjg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        eablkybsjg(Object obj) {
            super(1, obj, sy.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18056iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18058yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18059zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18058yggfygwlhe = obj;
            this.f18056iwizpuwonk |= Integer.MIN_VALUE;
            return kcexrzcfyt.this.ppxfxbqfkf(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18060iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18062yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18063zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18062yggfygwlhe = obj;
            this.f18060iwizpuwonk |= Integer.MIN_VALUE;
            return kcexrzcfyt.this.zoijcleaow(null, this);
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        wkgbmnqykc(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18064cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18066jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18067yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18068zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18066jyumaefscl = obj;
            this.f18064cqumvgiudr |= Integer.MIN_VALUE;
            return kcexrzcfyt.this.iobyxmoadg(null, this);
        }
    }

    public kcexrzcfyt(ay.gtknphoqwx purchasesHistoryApiService, qy.gxszxtbevo orderResponseMapper, jy.zoijcleaow responseErrorFactory, sy.iobyxmoadg cartWarningSelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesHistoryApiService, "purchasesHistoryApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartWarningSelector, "cartWarningSelector");
        this.f18052iobyxmoadg = purchasesHistoryApiService;
        this.f18055zoijcleaow = orderResponseMapper;
        this.f18053ppxfxbqfkf = responseErrorFactory;
        this.f18054wkgbmnqykc = cartWarningSelector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.wflxmlrfwp
    public Object iobyxmoadg(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        kcexrzcfyt kcexrzcfytVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18064cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18064cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f18066jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18064cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.gtknphoqwx gtknphoqwxVar = this.f18052iobyxmoadg;
            PurchasesHistoryRequest purchasesHistoryRequest = new PurchasesHistoryRequest(num);
            zoijcleaowVar.f18068zdlpuopuiu = this;
            zoijcleaowVar.f18067yggfygwlhe = num;
            zoijcleaowVar.f18064cqumvgiudr = 1;
            objZoijcleaow = gtknphoqwxVar.zoijcleaow(purchasesHistoryRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfytVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) zoijcleaowVar.f18067yggfygwlhe;
            kcexrzcfytVar = (kcexrzcfyt) zoijcleaowVar.f18068zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return kcexrzcfytVar.f18055zoijcleaow.gxszxtbevo((PurchasesDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null), num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.wflxmlrfwp
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kcexrzcfyt kcexrzcfytVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18056iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18056iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f18058yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18056iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.gtknphoqwx gtknphoqwxVar = this.f18052iobyxmoadg;
            PurchasesHistoryDetailsRequest purchasesHistoryDetailsRequest = new PurchasesHistoryDetailsRequest(str);
            iobyxmoadgVar.f18059zdlpuopuiu = this;
            iobyxmoadgVar.f18056iwizpuwonk = 1;
            objPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(purchasesHistoryDetailsRequest, iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfytVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kcexrzcfytVar = (kcexrzcfyt) iobyxmoadgVar.f18059zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return kcexrzcfytVar.f18055zoijcleaow.eablkybsjg((PurchaseHistoryDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.wflxmlrfwp
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        kcexrzcfyt kcexrzcfytVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18060iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18060iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f18062yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18060iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.gtknphoqwx gtknphoqwxVar = this.f18052iobyxmoadg;
            RepeatPurchaseRequest repeatPurchaseRequest = new RepeatPurchaseRequest(str);
            ppxfxbqfkfVar.f18063zdlpuopuiu = this;
            ppxfxbqfkfVar.f18060iwizpuwonk = 1;
            objIobyxmoadg = gtknphoqwxVar.iobyxmoadg(repeatPurchaseRequest, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfytVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kcexrzcfytVar = (kcexrzcfyt) ppxfxbqfkfVar.f18063zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return o40.eablkybsjg.gtknphoqwx((BasicResponse) objIobyxmoadg, new wkgbmnqykc(kcexrzcfytVar.f18053ppxfxbqfkf), new eablkybsjg(kcexrzcfytVar.f18054wkgbmnqykc));
    }
}
