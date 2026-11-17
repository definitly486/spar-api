package e90;

import f90.UpdateReceiveDigitalChecksRequest;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements b90.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d90.iobyxmoadg f30975iobyxmoadg;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f30976jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f30978zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30978zdlpuopuiu = obj;
            this.f30976jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(false, this);
        }
    }

    public zoijcleaow(d90.iobyxmoadg echecksApiService) {
        zdlpuopuiu.btonecajqb(echecksApiService, "echecksApiService");
        this.f30975iobyxmoadg = echecksApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // b90.zoijcleaow
    public Object iobyxmoadg(boolean z13, gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f30976jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f30976jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f30978zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f30976jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            UpdateReceiveDigitalChecksRequest updateReceiveDigitalChecksRequest = new UpdateReceiveDigitalChecksRequest(z13);
            d90.iobyxmoadg iobyxmoadgVar2 = this.f30975iobyxmoadg;
            iobyxmoadgVar.f30976jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(updateReceiveDigitalChecksRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
