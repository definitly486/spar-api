package m42;

import com.google.android.gms.tasks.Task;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements l42.iobyxmoadg {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f65188jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f65190zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f65190zdlpuopuiu = obj;
            this.f65188jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.zoijcleaow(this);
        }
    }

    @Override // l42.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Task taskWflxmlrfwp = ad.iobyxmoadg.iobyxmoadg(zc.iobyxmoadg.f129562iobyxmoadg).wflxmlrfwp();
        zdlpuopuiu.dxjokdxxww(taskWflxmlrfwp, "deleteToken(...)");
        Object objIobyxmoadg = zj.zoijcleaow.iobyxmoadg(taskWflxmlrfwp, gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l42.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f65188jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f65188jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f65190zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f65188jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            Task taskKcexrzcfyt = ad.iobyxmoadg.iobyxmoadg(zc.iobyxmoadg.f129562iobyxmoadg).kcexrzcfyt();
            zdlpuopuiu.dxjokdxxww(taskKcexrzcfyt, "getToken(...)");
            iobyxmoadgVar.f65188jyumaefscl = 1;
            objIobyxmoadg = zj.zoijcleaow.iobyxmoadg(taskKcexrzcfyt, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        zdlpuopuiu.dxjokdxxww(objIobyxmoadg, "await(...)");
        return objIobyxmoadg;
    }
}
