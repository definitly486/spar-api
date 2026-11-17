package s60;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import o40.eablkybsjg;
import r60.GetIntervalsResponse;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p60.iobyxmoadg f105601iobyxmoadg;

    /* JADX INFO: renamed from: s60.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2569iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f105602jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f105604zdlpuopuiu;

        C2569iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105604zdlpuopuiu = obj;
            this.f105602jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public iobyxmoadg(p60.iobyxmoadg intervalApiService) {
        zdlpuopuiu.btonecajqb(intervalApiService, "intervalApiService");
        this.f105601iobyxmoadg = intervalApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C2569iobyxmoadg c2569iobyxmoadg;
        if (gxszxtbevoVar instanceof C2569iobyxmoadg) {
            c2569iobyxmoadg = (C2569iobyxmoadg) gxszxtbevoVar;
            int i13 = c2569iobyxmoadg.f105602jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2569iobyxmoadg.f105602jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2569iobyxmoadg = new C2569iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2569iobyxmoadg = new C2569iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2569iobyxmoadg.f105604zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c2569iobyxmoadg.f105602jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            p60.iobyxmoadg iobyxmoadgVar = this.f105601iobyxmoadg;
            c2569iobyxmoadg.f105602jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(str, c2569iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List days = ((GetIntervalsResponse) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getDays();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(days, 10));
        Iterator it = days.iterator();
        while (it.hasNext()) {
            arrayList.add(q60.iobyxmoadg.iobyxmoadg((GetIntervalsResponse.DayDto) it.next()));
        }
        return arrayList;
    }
}
