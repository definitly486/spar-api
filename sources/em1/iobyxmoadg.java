package em1;

import gg.wwaezpbzkn;
import im1.GetRateProductRequest;
import im1.SendRateProductReviewData;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import qm1.RateProductItemDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements km1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gm1.iobyxmoadg f31555iobyxmoadg;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f31556jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f31558zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31558zdlpuopuiu = obj;
            this.f31556jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f31559zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(1, hm1.iobyxmoadg.class, "rateProductErrorFactory", "rateProductErrorFactory(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return hm1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    /* JADX INFO: renamed from: em1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0674iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f31560jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f31562zdlpuopuiu;

        C0674iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31562zdlpuopuiu = obj;
            this.f31560jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f31563jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f31565zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31565zdlpuopuiu = obj;
            this.f31563jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    /* synthetic */ class wkgbmnqykc extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f31566zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(1, hm1.iobyxmoadg.class, "rateProductErrorFactory", "rateProductErrorFactory(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return hm1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f31567jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f31569zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31569zdlpuopuiu = obj;
            this.f31567jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(gm1.iobyxmoadg apiService) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        this.f31555iobyxmoadg = apiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // km1.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f31567jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f31567jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f31569zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f31567jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            gm1.iobyxmoadg iobyxmoadgVar = this.f31555iobyxmoadg;
            zoijcleaowVar.f31567jyumaefscl = 1;
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
        return jm1.iobyxmoadg.iobyxmoadg((RateProductItemDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // km1.iobyxmoadg
    public Object ppxfxbqfkf(jm1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f31556jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f31556jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = eablkybsjgVar.f31558zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f31556jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            gm1.iobyxmoadg iobyxmoadgVar = this.f31555iobyxmoadg;
            SendRateProductReviewData sendRateProductReviewDataIobyxmoadg = im1.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar, true);
            eablkybsjgVar.f31556jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(sendRateProductReviewDataIobyxmoadg, eablkybsjgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return jm1.iobyxmoadg.iobyxmoadg((RateProductItemDto) x21.wkgbmnqykc.vdvldrhtss((BasicResponse) objPpxfxbqfkf, gxszxtbevo.f31559zdlpuopuiu));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // km1.iobyxmoadg
    public Object wkgbmnqykc(jm1.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f31563jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f31563jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f31565zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f31563jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            gm1.iobyxmoadg iobyxmoadgVar = this.f31555iobyxmoadg;
            SendRateProductReviewData sendRateProductReviewDataIobyxmoadg = im1.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar, false);
            ppxfxbqfkfVar.f31563jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(sendRateProductReviewDataIobyxmoadg, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        x21.wkgbmnqykc.vdvldrhtss((BasicResponse) objPpxfxbqfkf, wkgbmnqykc.f31566zdlpuopuiu);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // km1.iobyxmoadg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C0674iobyxmoadg c0674iobyxmoadg;
        if (gxszxtbevoVar instanceof C0674iobyxmoadg) {
            c0674iobyxmoadg = (C0674iobyxmoadg) gxszxtbevoVar;
            int i13 = c0674iobyxmoadg.f31560jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0674iobyxmoadg.f31560jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0674iobyxmoadg = new C0674iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0674iobyxmoadg = new C0674iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0674iobyxmoadg.f31562zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0674iobyxmoadg.f31560jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            gm1.iobyxmoadg iobyxmoadgVar = this.f31555iobyxmoadg;
            GetRateProductRequest getRateProductRequest = new GetRateProductRequest(str);
            c0674iobyxmoadg.f31560jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(getRateProductRequest, c0674iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return jm1.iobyxmoadg.iobyxmoadg((RateProductItemDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
