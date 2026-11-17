package w12;

import dy.dxjokdxxww;
import fy.ppxfxbqfkf;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: w12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2947iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118561jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118562yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118563zdlpuopuiu;

        C2947iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118562yggfygwlhe = obj;
            this.f118561jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118564iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118565jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118566yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118567zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118565jyumaefscl = obj;
            this.f118564iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.zoijcleaow(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(dxjokdxxww dxjokdxxwwVar, gxszxtbevo gxszxtbevoVar) {
        C2947iobyxmoadg c2947iobyxmoadg;
        if (gxszxtbevoVar instanceof C2947iobyxmoadg) {
            c2947iobyxmoadg = (C2947iobyxmoadg) gxszxtbevoVar;
            int i13 = c2947iobyxmoadg.f118561jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2947iobyxmoadg.f118561jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2947iobyxmoadg = new C2947iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2947iobyxmoadg = new C2947iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2947iobyxmoadg.f118562yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2947iobyxmoadg.f118561jyumaefscl;
        if (i14 != 0) {
            if (i14 == 1) {
                dxjokdxxwwVar = (dxjokdxxww) c2947iobyxmoadg.f118563zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        c2947iobyxmoadg.f118563zdlpuopuiu = dxjokdxxwwVar;
        c2947iobyxmoadg.f118561jyumaefscl = 1;
        if (dxjokdxxwwVar.zoijcleaow(c2947iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        c2947iobyxmoadg.f118563zdlpuopuiu = null;
        c2947iobyxmoadg.f118561jyumaefscl = 2;
        if (dxjokdxxwwVar.eablkybsjg(c2947iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object zoijcleaow(dxjokdxxww dxjokdxxwwVar, ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        dxjokdxxww dxjokdxxwwVar2;
        ppxfxbqfkf ppxfxbqfkfVar2;
        List listWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118564iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118564iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f118565jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118564iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f118566yggfygwlhe;
                dxjokdxxwwVar = (dxjokdxxww) zoijcleaowVar.f118567zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                ppxfxbqfkfVar2 = (ppxfxbqfkf) zoijcleaowVar.f118566yggfygwlhe;
                dxjokdxxwwVar2 = (dxjokdxxww) zoijcleaowVar.f118567zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                listWkgbmnqykc = ppxfxbqfkfVar2.wkgbmnqykc();
                zoijcleaowVar.f118567zdlpuopuiu = null;
                zoijcleaowVar.f118566yggfygwlhe = null;
                zoijcleaowVar.f118564iwizpuwonk = 3;
                if (dxjokdxxwwVar2.gxszxtbevo(listWkgbmnqykc, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        zoijcleaowVar.f118567zdlpuopuiu = dxjokdxxwwVar;
        zoijcleaowVar.f118566yggfygwlhe = ppxfxbqfkfVar;
        zoijcleaowVar.f118564iwizpuwonk = 1;
        if (dxjokdxxwwVar.eablkybsjg(zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar.f118567zdlpuopuiu = dxjokdxxwwVar;
        zoijcleaowVar.f118566yggfygwlhe = ppxfxbqfkfVar;
        zoijcleaowVar.f118564iwizpuwonk = 2;
        if (dxjokdxxwwVar.lqeggnwhkg(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkfVar;
        dxjokdxxwwVar2 = dxjokdxxwwVar;
        ppxfxbqfkfVar2 = ppxfxbqfkfVar3;
        listWkgbmnqykc = ppxfxbqfkfVar2.wkgbmnqykc();
        zoijcleaowVar.f118567zdlpuopuiu = null;
        zoijcleaowVar.f118566yggfygwlhe = null;
        zoijcleaowVar.f118564iwizpuwonk = 3;
        if (dxjokdxxwwVar2.gxszxtbevo(listWkgbmnqykc, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
