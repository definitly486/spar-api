package f92;

import e92.SupportInfoDto;
import e92.eablkybsjg;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements h92.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final g92.iobyxmoadg f33344iobyxmoadg;

    /* JADX INFO: renamed from: f92.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0732iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f33345jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f33347zdlpuopuiu;

        C0732iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33347zdlpuopuiu = obj;
            this.f33345jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public iobyxmoadg(g92.iobyxmoadg supportApiService) {
        zdlpuopuiu.btonecajqb(supportApiService, "supportApiService");
        this.f33344iobyxmoadg = supportApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h92.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C0732iobyxmoadg c0732iobyxmoadg;
        if (gxszxtbevoVar instanceof C0732iobyxmoadg) {
            c0732iobyxmoadg = (C0732iobyxmoadg) gxszxtbevoVar;
            int i13 = c0732iobyxmoadg.f33345jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0732iobyxmoadg.f33345jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0732iobyxmoadg = new C0732iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0732iobyxmoadg = new C0732iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0732iobyxmoadg.f33347zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0732iobyxmoadg.f33345jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            g92.iobyxmoadg iobyxmoadgVar = this.f33344iobyxmoadg;
            c0732iobyxmoadg.f33345jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(c0732iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return eablkybsjg.iobyxmoadg((SupportInfoDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
