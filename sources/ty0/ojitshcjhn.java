package ty0;

import gz0.ConfirmProductReplacesRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn implements k01.gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.gxszxtbevo f112009iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112010jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112012zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112012zdlpuopuiu = obj;
            this.f112010jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.iobyxmoadg(null, this);
        }
    }

    public ojitshcjhn(ww0.gxszxtbevo orderApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        this.f112009iobyxmoadg = orderApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.gtknphoqwx
    public Object iobyxmoadg(ConfirmProductReplacesRequest confirmProductReplacesRequest, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112010jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112010jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f112012zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112010jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112009iobyxmoadg;
            iobyxmoadgVar.f112010jyumaefscl = 1;
            objLqeggnwhkg = gxszxtbevoVar2.lqeggnwhkg(confirmProductReplacesRequest, iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return x21.wkgbmnqykc.rgvfuqvkyq((BasicResponse) objLqeggnwhkg, null, null, 3, null);
    }
}
