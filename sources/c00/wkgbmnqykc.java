package c00;

import jz.CardListDto;
import ru.myspar.core.network.model.BasicResponse;
import yy.DeleteCardRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements w10.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.ppxfxbqfkf f18182iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18183jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18185zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18185zdlpuopuiu = obj;
            this.f18183jyumaefscl |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18186jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18188zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18188zdlpuopuiu = obj;
            this.f18186jyumaefscl |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(this);
        }
    }

    public wkgbmnqykc(ay.ppxfxbqfkf cardsApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardsApiService, "cardsApiService");
        this.f18182iobyxmoadg = cardsApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.zoijcleaow
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18186jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18186jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f18188zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18186jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.ppxfxbqfkf ppxfxbqfkfVar = this.f18182iobyxmoadg;
            zoijcleaowVar.f18186jyumaefscl = 1;
            objIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return py.iobyxmoadg.iobyxmoadg((CardListDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.zoijcleaow
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18183jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18183jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f18185zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18183jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.ppxfxbqfkf ppxfxbqfkfVar = this.f18182iobyxmoadg;
            DeleteCardRequest deleteCardRequest = new DeleteCardRequest(str);
            iobyxmoadgVar.f18183jyumaefscl = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(deleteCardRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return py.iobyxmoadg.iobyxmoadg((CardListDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
