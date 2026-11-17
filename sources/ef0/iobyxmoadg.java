package ef0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.analytics.api.model.AnalyticsPage;
import sj.iozdgvuglv;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends wx.iobyxmoadg implements ye0.iobyxmoadg {

    /* JADX INFO: renamed from: ef0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0662iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31246iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31248yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31249zdlpuopuiu;

        C0662iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31248yggfygwlhe = obj;
            this.f31246iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(null, null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    @Override // ye0.iobyxmoadg
    public iozdgvuglv iobyxmoadg() {
        return btonecajqb();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ye0.iobyxmoadg
    public Object lqeggnwhkg(ze0.iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, gxszxtbevo gxszxtbevoVar) {
        C0662iobyxmoadg c0662iobyxmoadg;
        if (gxszxtbevoVar instanceof C0662iobyxmoadg) {
            c0662iobyxmoadg = (C0662iobyxmoadg) gxszxtbevoVar;
            int i13 = c0662iobyxmoadg.f31246iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0662iobyxmoadg.f31246iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0662iobyxmoadg = new C0662iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0662iobyxmoadg = new C0662iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0662iobyxmoadg.f31248yggfygwlhe;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0662iobyxmoadg.f31246iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object c3152iobyxmoadg = new ye0.iobyxmoadg.C3152iobyxmoadg(iobyxmoadgVar, analyticsPage);
            c0662iobyxmoadg.f31249zdlpuopuiu = c3152iobyxmoadg;
            c0662iobyxmoadg.f31246iwizpuwonk = 1;
            if (dxjokdxxww(c3152iobyxmoadg, c0662iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
