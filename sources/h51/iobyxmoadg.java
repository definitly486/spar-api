package h51;

import g51.GetIntervalsResponse;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final e51.iobyxmoadg f39487iobyxmoadg;

    /* JADX INFO: renamed from: h51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0907iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f39488jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f39490zdlpuopuiu;

        C0907iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39490zdlpuopuiu = obj;
            this.f39488jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public iobyxmoadg(e51.iobyxmoadg intervalApiService) {
        zdlpuopuiu.btonecajqb(intervalApiService, "intervalApiService");
        this.f39487iobyxmoadg = intervalApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C0907iobyxmoadg c0907iobyxmoadg;
        if (gxszxtbevoVar instanceof C0907iobyxmoadg) {
            c0907iobyxmoadg = (C0907iobyxmoadg) gxszxtbevoVar;
            int i13 = c0907iobyxmoadg.f39488jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0907iobyxmoadg.f39488jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0907iobyxmoadg = new C0907iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0907iobyxmoadg = new C0907iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0907iobyxmoadg.f39490zdlpuopuiu;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0907iobyxmoadg.f39488jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            e51.iobyxmoadg iobyxmoadgVar = this.f39487iobyxmoadg;
            c0907iobyxmoadg.f39488jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(str, c0907iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List days = ((GetIntervalsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getDays();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(days, 10));
        Iterator it = days.iterator();
        while (it.hasNext()) {
            arrayList.add(f51.iobyxmoadg.iobyxmoadg((GetIntervalsResponse.DayDto) it.next()));
        }
        return arrayList;
    }
}
