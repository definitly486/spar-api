package tn1;

import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import wn1.ScanGoCartOperateRequest;
import wn1.ScanGoStartRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ao1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final un1.iobyxmoadg f111091iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vn1.iobyxmoadg f111092zoijcleaow;

    /* JADX INFO: renamed from: tn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2735iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111093jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111095zdlpuopuiu;

        C2735iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111095zdlpuopuiu = obj;
            this.f111093jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111096iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111098yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111099zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111098yggfygwlhe = obj;
            this.f111096iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(0L, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111100iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111102yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111103zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111102yggfygwlhe = obj;
            this.f111100iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    public iobyxmoadg(un1.iobyxmoadg scanGoApiService, vn1.iobyxmoadg mapper) {
        zdlpuopuiu.btonecajqb(scanGoApiService, "scanGoApiService");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f111091iobyxmoadg = scanGoApiService;
        this.f111092zoijcleaow = mapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(ScanGoCartOperateRequest scanGoCartOperateRequest, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f111100iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f111100iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f111102yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f111100iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            un1.iobyxmoadg iobyxmoadgVar2 = this.f111091iobyxmoadg;
            zoijcleaowVar.f111103zdlpuopuiu = this;
            zoijcleaowVar.f111100iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(scanGoCartOperateRequest, zoijcleaowVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f111103zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return iobyxmoadgVar.f111092zoijcleaow.zoijcleaow((BasicResponse) objPpxfxbqfkf);
    }

    @Override // ao1.zoijcleaow
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest(str, (String) null, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(0.0d), (List) null, 10, (gtknphoqwx) null), gxszxtbevoVar);
    }

    @Override // ao1.zoijcleaow
    public Object gxszxtbevo(String str, List list, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest((String) null, str, (Double) null, list, 5, (gtknphoqwx) null), gxszxtbevoVar);
    }

    @Override // ao1.zoijcleaow
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest((String) null, (String) null, (Double) null, (List) null, 15, (gtknphoqwx) null), gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao1.zoijcleaow
    public Object lqeggnwhkg(long j13, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f111096iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f111096iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f111098yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f111096iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            un1.iobyxmoadg iobyxmoadgVar2 = this.f111091iobyxmoadg;
            ScanGoStartRequest scanGoStartRequest = new ScanGoStartRequest(j13);
            ppxfxbqfkfVar.f111099zdlpuopuiu = this;
            ppxfxbqfkfVar.f111096iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(scanGoStartRequest, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f111099zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f111092zoijcleaow.ppxfxbqfkf((BasicResponse) objZoijcleaow);
    }

    @Override // ao1.zoijcleaow
    public Object nufgyqmvbu(String str, double d13, List list, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest(str, (String) null, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(d13), jx0.iobyxmoadg.zoijcleaow(list), 2, (gtknphoqwx) null), gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao1.zoijcleaow
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C2735iobyxmoadg c2735iobyxmoadg;
        if (gxszxtbevoVar instanceof C2735iobyxmoadg) {
            c2735iobyxmoadg = (C2735iobyxmoadg) gxszxtbevoVar;
            int i13 = c2735iobyxmoadg.f111093jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2735iobyxmoadg.f111093jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2735iobyxmoadg = new C2735iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2735iobyxmoadg = new C2735iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2735iobyxmoadg.f111095zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2735iobyxmoadg.f111093jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            un1.iobyxmoadg iobyxmoadgVar = this.f111091iobyxmoadg;
            c2735iobyxmoadg.f111093jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(c2735iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        BasicResponse basicResponse = (BasicResponse) objIobyxmoadg;
        Boolean result = basicResponse.getResult();
        boolean zBooleanValue = result != null ? result.booleanValue() : false;
        bo1.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = bo1.zoijcleaow.f16912yggfygwlhe;
        ErrorResponse error = basicResponse.getError();
        bo1.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(error != null ? error.getCode() : null);
        ErrorResponse error2 = basicResponse.getError();
        return new co1.ppxfxbqfkf(zBooleanValue, zoijcleaowVarIobyxmoadg, error2 != null ? error2.getMessage() : null);
    }
}
