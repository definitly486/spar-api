package sn1;

import ax0.ppxfxbqfkf;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import yw0.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: sn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2648iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107750jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107751yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107752zdlpuopuiu;

        C2648iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107751yggfygwlhe = obj;
            this.f107750jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f107753iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f107754jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107755yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107756zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107754jyumaefscl = obj;
            this.f107753iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.zoijcleaow(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(dxjokdxxww dxjokdxxwwVar, gxszxtbevo gxszxtbevoVar) {
        C2648iobyxmoadg c2648iobyxmoadg;
        if (gxszxtbevoVar instanceof C2648iobyxmoadg) {
            c2648iobyxmoadg = (C2648iobyxmoadg) gxszxtbevoVar;
            int i13 = c2648iobyxmoadg.f107750jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2648iobyxmoadg.f107750jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2648iobyxmoadg = new C2648iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2648iobyxmoadg = new C2648iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2648iobyxmoadg.f107751yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2648iobyxmoadg.f107750jyumaefscl;
        if (i14 != 0) {
            if (i14 == 1) {
                dxjokdxxwwVar = (dxjokdxxww) c2648iobyxmoadg.f107752zdlpuopuiu;
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
        c2648iobyxmoadg.f107752zdlpuopuiu = dxjokdxxwwVar;
        c2648iobyxmoadg.f107750jyumaefscl = 1;
        if (dxjokdxxwwVar.zoijcleaow(c2648iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        c2648iobyxmoadg.f107752zdlpuopuiu = null;
        c2648iobyxmoadg.f107750jyumaefscl = 2;
        if (dxjokdxxwwVar.eablkybsjg(c2648iobyxmoadg) == objGxszxtbevo) {
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
            int i13 = zoijcleaowVar.f107753iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f107753iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f107754jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f107753iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f107755yggfygwlhe;
                dxjokdxxwwVar = (dxjokdxxww) zoijcleaowVar.f107756zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                ppxfxbqfkfVar2 = (ppxfxbqfkf) zoijcleaowVar.f107755yggfygwlhe;
                dxjokdxxwwVar2 = (dxjokdxxww) zoijcleaowVar.f107756zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                listWkgbmnqykc = ppxfxbqfkfVar2.wkgbmnqykc();
                zoijcleaowVar.f107756zdlpuopuiu = null;
                zoijcleaowVar.f107755yggfygwlhe = null;
                zoijcleaowVar.f107753iwizpuwonk = 3;
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
        zoijcleaowVar.f107756zdlpuopuiu = dxjokdxxwwVar;
        zoijcleaowVar.f107755yggfygwlhe = ppxfxbqfkfVar;
        zoijcleaowVar.f107753iwizpuwonk = 1;
        if (dxjokdxxwwVar.eablkybsjg(zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar.f107756zdlpuopuiu = dxjokdxxwwVar;
        zoijcleaowVar.f107755yggfygwlhe = ppxfxbqfkfVar;
        zoijcleaowVar.f107753iwizpuwonk = 2;
        if (dxjokdxxwwVar.lqeggnwhkg(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkfVar;
        dxjokdxxwwVar2 = dxjokdxxwwVar;
        ppxfxbqfkfVar2 = ppxfxbqfkfVar3;
        listWkgbmnqykc = ppxfxbqfkfVar2.wkgbmnqykc();
        zoijcleaowVar.f107756zdlpuopuiu = null;
        zoijcleaowVar.f107755yggfygwlhe = null;
        zoijcleaowVar.f107753iwizpuwonk = 3;
        if (dxjokdxxwwVar2.gxszxtbevo(listWkgbmnqykc, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
