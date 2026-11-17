package c00;

import o00.ConfirmProductReplacesRequest;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class vdvldrhtss implements w10.gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.lqeggnwhkg f18176iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18177jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18179zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18179zdlpuopuiu = obj;
            this.f18177jyumaefscl |= Integer.MIN_VALUE;
            return vdvldrhtss.this.iobyxmoadg(null, this);
        }
    }

    public vdvldrhtss(ay.lqeggnwhkg orderApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        this.f18176iobyxmoadg = orderApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.gtknphoqwx
    public Object iobyxmoadg(ConfirmProductReplacesRequest confirmProductReplacesRequest, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18177jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18177jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f18179zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18177jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18176iobyxmoadg;
            iobyxmoadgVar.f18177jyumaefscl = 1;
            objWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc(confirmProductReplacesRequest, iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return o40.eablkybsjg.draadjrbmk((BasicResponse) objWkgbmnqykc, null, null, 3, null);
    }
}
