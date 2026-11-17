package kh1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hh1.gtknphoqwx;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg implements ah1.iobyxmoadg {

    /* JADX INFO: renamed from: kh1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1181iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f55524iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f55526yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55527zdlpuopuiu;

        C1181iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55526yggfygwlhe = obj;
            this.f55524iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gxszxtbevo(null, null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ah1.iobyxmoadg
    public Object gxszxtbevo(gtknphoqwx gtknphoqwxVar, AnalyticsPage analyticsPage, gxszxtbevo gxszxtbevoVar) {
        C1181iobyxmoadg c1181iobyxmoadg;
        if (gxszxtbevoVar instanceof C1181iobyxmoadg) {
            c1181iobyxmoadg = (C1181iobyxmoadg) gxszxtbevoVar;
            int i13 = c1181iobyxmoadg.f55524iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1181iobyxmoadg.f55524iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1181iobyxmoadg = new C1181iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1181iobyxmoadg = new C1181iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1181iobyxmoadg.f55526yggfygwlhe;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c1181iobyxmoadg.f55524iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object c0041iobyxmoadg = new ah1.iobyxmoadg.C0041iobyxmoadg(gtknphoqwxVar, analyticsPage);
            c1181iobyxmoadg.f55527zdlpuopuiu = c0041iobyxmoadg;
            c1181iobyxmoadg.f55524iwizpuwonk = 1;
            if (lqeggnwhkg(c0041iobyxmoadg, c1181iobyxmoadg) == objGxszxtbevo) {
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

    @Override // ah1.iobyxmoadg
    public lqeggnwhkg iobyxmoadg() {
        return nufgyqmvbu();
    }
}
