package hz1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import sj.iozdgvuglv;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends wx.iobyxmoadg implements zy1.iobyxmoadg {

    /* JADX INFO: renamed from: hz1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0968iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41462iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41464yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41465zdlpuopuiu;

        C0968iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41464yggfygwlhe = obj;
            this.f41462iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41466iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41468yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41469zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41468yggfygwlhe = obj;
            this.f41466iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41470iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41472yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41473zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41472yggfygwlhe = obj;
            this.f41470iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    @Override // zy1.iobyxmoadg
    public iozdgvuglv eablkybsjg() {
        return btonecajqb();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zy1.iobyxmoadg
    public Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f41466iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f41466iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f41468yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f41466iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object obj2 = zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.ppxfxbqfkf.f131594iobyxmoadg;
            ppxfxbqfkfVar.f41469zdlpuopuiu = obj2;
            ppxfxbqfkfVar.f41466iwizpuwonk = 1;
            if (dxjokdxxww(obj2, ppxfxbqfkfVar) == objGxszxtbevo) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zy1.iobyxmoadg
    public Object wkgbmnqykc(String str, gxszxtbevo gxszxtbevoVar) {
        C0968iobyxmoadg c0968iobyxmoadg;
        if (gxszxtbevoVar instanceof C0968iobyxmoadg) {
            c0968iobyxmoadg = (C0968iobyxmoadg) gxszxtbevoVar;
            int i13 = c0968iobyxmoadg.f41462iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0968iobyxmoadg.f41462iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0968iobyxmoadg = new C0968iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0968iobyxmoadg = new C0968iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0968iobyxmoadg.f41464yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0968iobyxmoadg.f41462iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object c3366iobyxmoadg = new zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.C3366iobyxmoadg(str);
            c0968iobyxmoadg.f41465zdlpuopuiu = c3366iobyxmoadg;
            c0968iobyxmoadg.f41462iwizpuwonk = 1;
            if (dxjokdxxww(c3366iobyxmoadg, c0968iobyxmoadg) == objGxszxtbevo) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zy1.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f41470iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f41470iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f41472yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f41470iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object obj2 = zy1.iobyxmoadg.InterfaceC3365iobyxmoadg.zoijcleaow.f131595iobyxmoadg;
            zoijcleaowVar.f41473zdlpuopuiu = obj2;
            zoijcleaowVar.f41470iwizpuwonk = 1;
            if (dxjokdxxww(obj2, zoijcleaowVar) == objGxszxtbevo) {
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
