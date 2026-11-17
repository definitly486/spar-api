package x12;

import a22.ScanGoCartOperateRequest;
import a22.ScanGoStartRequest;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements e22.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y12.iobyxmoadg f120916iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final z12.iobyxmoadg f120917zoijcleaow;

    /* JADX INFO: renamed from: x12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3048iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f120918jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f120920zdlpuopuiu;

        C3048iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120920zdlpuopuiu = obj;
            this.f120918jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120921iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f120923yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120924zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120923yggfygwlhe = obj;
            this.f120921iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(0L, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120925iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f120927yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120928zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120927yggfygwlhe = obj;
            this.f120925iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    public iobyxmoadg(y12.iobyxmoadg scanGoApiService, z12.iobyxmoadg mapper) {
        zdlpuopuiu.btonecajqb(scanGoApiService, "scanGoApiService");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f120916iobyxmoadg = scanGoApiService;
        this.f120917zoijcleaow = mapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(ScanGoCartOperateRequest scanGoCartOperateRequest, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f120925iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f120925iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f120927yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f120925iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            y12.iobyxmoadg iobyxmoadgVar2 = this.f120916iobyxmoadg;
            zoijcleaowVar.f120928zdlpuopuiu = this;
            zoijcleaowVar.f120925iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(scanGoCartOperateRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f120928zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f120917zoijcleaow.zoijcleaow((BasicResponse) objZoijcleaow);
    }

    @Override // e22.zoijcleaow
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest(str, (String) null, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(0.0d), (List) null, 10, (gtknphoqwx) null), gxszxtbevoVar);
    }

    @Override // e22.zoijcleaow
    public Object gxszxtbevo(String str, List list, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest((String) null, str, (Double) null, list, 5, (gtknphoqwx) null), gxszxtbevoVar);
    }

    @Override // e22.zoijcleaow
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest((String) null, (String) null, (Double) null, (List) null, 15, (gtknphoqwx) null), gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e22.zoijcleaow
    public Object lqeggnwhkg(long j13, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f120921iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f120921iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f120923yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f120921iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            y12.iobyxmoadg iobyxmoadgVar2 = this.f120916iobyxmoadg;
            ScanGoStartRequest scanGoStartRequest = new ScanGoStartRequest(j13);
            ppxfxbqfkfVar.f120924zdlpuopuiu = this;
            ppxfxbqfkfVar.f120921iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(scanGoStartRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f120924zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return iobyxmoadgVar.f120917zoijcleaow.ppxfxbqfkf((BasicResponse) objPpxfxbqfkf);
    }

    @Override // e22.zoijcleaow
    public Object nufgyqmvbu(String str, double d13, List list, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new ScanGoCartOperateRequest(str, (String) null, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(d13), oy.iobyxmoadg.zoijcleaow(list), 2, (gtknphoqwx) null), gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e22.zoijcleaow
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C3048iobyxmoadg c3048iobyxmoadg;
        if (gxszxtbevoVar instanceof C3048iobyxmoadg) {
            c3048iobyxmoadg = (C3048iobyxmoadg) gxszxtbevoVar;
            int i13 = c3048iobyxmoadg.f120918jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3048iobyxmoadg.f120918jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c3048iobyxmoadg = new C3048iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3048iobyxmoadg = new C3048iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c3048iobyxmoadg.f120920zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3048iobyxmoadg.f120918jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            y12.iobyxmoadg iobyxmoadgVar = this.f120916iobyxmoadg;
            c3048iobyxmoadg.f120918jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(c3048iobyxmoadg);
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
        f22.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = f22.zoijcleaow.f32654yggfygwlhe;
        ErrorResponse error = basicResponse.getError();
        f22.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(error != null ? error.getCode() : null);
        ErrorResponse error2 = basicResponse.getError();
        return new g22.ppxfxbqfkf(zBooleanValue, zoijcleaowVarIobyxmoadg, error2 != null ? error2.getMessage() : null);
    }
}
