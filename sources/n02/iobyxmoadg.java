package n02;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import r02.GetRateProductRequest;
import r02.SendRateProductReviewData;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import tg.draadjrbmk;
import z02.RateProductItemDto;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements t02.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p02.iobyxmoadg f68390iobyxmoadg;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f68391jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f68393zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68393zdlpuopuiu = obj;
            this.f68391jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f68394zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(1, q02.iobyxmoadg.class, "rateProductErrorFactory", "rateProductErrorFactory(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return q02.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    /* JADX INFO: renamed from: n02.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1471iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f68395jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f68397zdlpuopuiu;

        C1471iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68397zdlpuopuiu = obj;
            this.f68395jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f68398jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f68400zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68400zdlpuopuiu = obj;
            this.f68398jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    /* synthetic */ class wkgbmnqykc extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f68401zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(1, q02.iobyxmoadg.class, "rateProductErrorFactory", "rateProductErrorFactory(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return q02.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f68402jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f68404zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68404zdlpuopuiu = obj;
            this.f68402jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(p02.iobyxmoadg apiService) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        this.f68390iobyxmoadg = apiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t02.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f68402jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f68402jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f68404zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f68402jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            p02.iobyxmoadg iobyxmoadgVar = this.f68390iobyxmoadg;
            zoijcleaowVar.f68402jyumaefscl = 1;
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
        return s02.iobyxmoadg.iobyxmoadg((RateProductItemDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t02.iobyxmoadg
    public Object ppxfxbqfkf(s02.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f68391jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f68391jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f68393zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f68391jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            p02.iobyxmoadg iobyxmoadgVar = this.f68390iobyxmoadg;
            SendRateProductReviewData sendRateProductReviewDataIobyxmoadg = r02.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar, true);
            eablkybsjgVar.f68391jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(sendRateProductReviewDataIobyxmoadg, eablkybsjgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return s02.iobyxmoadg.iobyxmoadg((RateProductItemDto) o40.eablkybsjg.wflxmlrfwp((BasicResponse) objZoijcleaow, gxszxtbevo.f68394zdlpuopuiu));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t02.iobyxmoadg
    public Object wkgbmnqykc(s02.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f68398jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f68398jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f68400zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f68398jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            p02.iobyxmoadg iobyxmoadgVar = this.f68390iobyxmoadg;
            SendRateProductReviewData sendRateProductReviewDataIobyxmoadg = r02.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar, false);
            ppxfxbqfkfVar.f68398jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(sendRateProductReviewDataIobyxmoadg, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        o40.eablkybsjg.wflxmlrfwp((BasicResponse) objZoijcleaow, wkgbmnqykc.f68401zdlpuopuiu);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t02.iobyxmoadg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C1471iobyxmoadg c1471iobyxmoadg;
        if (gxszxtbevoVar instanceof C1471iobyxmoadg) {
            c1471iobyxmoadg = (C1471iobyxmoadg) gxszxtbevoVar;
            int i13 = c1471iobyxmoadg.f68395jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1471iobyxmoadg.f68395jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1471iobyxmoadg = new C1471iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1471iobyxmoadg = new C1471iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1471iobyxmoadg.f68397zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1471iobyxmoadg.f68395jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            p02.iobyxmoadg iobyxmoadgVar = this.f68390iobyxmoadg;
            GetRateProductRequest getRateProductRequest = new GetRateProductRequest(str);
            c1471iobyxmoadg.f68395jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(getRateProductRequest, c1471iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return s02.iobyxmoadg.iobyxmoadg((RateProductItemDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }
}
