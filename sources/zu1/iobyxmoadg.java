package zu1;

import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import yu1.SupportInfoDto;
import yu1.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements bv1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final av1.iobyxmoadg f131424iobyxmoadg;

    /* JADX INFO: renamed from: zu1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3357iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f131425jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f131427zdlpuopuiu;

        C3357iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f131427zdlpuopuiu = obj;
            this.f131425jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(av1.iobyxmoadg supportApiService) {
        zdlpuopuiu.btonecajqb(supportApiService, "supportApiService");
        this.f131424iobyxmoadg = supportApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bv1.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C3357iobyxmoadg c3357iobyxmoadg;
        if (gxszxtbevoVar instanceof C3357iobyxmoadg) {
            c3357iobyxmoadg = (C3357iobyxmoadg) gxszxtbevoVar;
            int i13 = c3357iobyxmoadg.f131425jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3357iobyxmoadg.f131425jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c3357iobyxmoadg = new C3357iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3357iobyxmoadg = new C3357iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c3357iobyxmoadg.f131427zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c3357iobyxmoadg.f131425jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            av1.iobyxmoadg iobyxmoadgVar = this.f131424iobyxmoadg;
            c3357iobyxmoadg.f131425jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(c3357iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return eablkybsjg.iobyxmoadg((SupportInfoDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
