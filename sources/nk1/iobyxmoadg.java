package nk1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg implements fk1.iobyxmoadg {

    /* JADX INFO: renamed from: nk1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1519iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f70272iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f70274yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f70275zdlpuopuiu;

        C1519iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f70274yggfygwlhe = obj;
            this.f70272iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f70276iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f70278yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f70279zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f70278yggfygwlhe = obj;
            this.f70276iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f70280iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f70282yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f70283zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f70282yggfygwlhe = obj;
            this.f70280iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    @Override // fk1.iobyxmoadg
    public lqeggnwhkg eablkybsjg() {
        return nufgyqmvbu();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fk1.iobyxmoadg
    public Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f70276iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f70276iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f70278yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f70276iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object obj2 = fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.ppxfxbqfkf.f34297iobyxmoadg;
            ppxfxbqfkfVar.f70279zdlpuopuiu = obj2;
            ppxfxbqfkfVar.f70276iwizpuwonk = 1;
            if (lqeggnwhkg(obj2, ppxfxbqfkfVar) == objGxszxtbevo) {
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
    @Override // fk1.iobyxmoadg
    public Object wkgbmnqykc(String str, gxszxtbevo gxszxtbevoVar) {
        C1519iobyxmoadg c1519iobyxmoadg;
        if (gxszxtbevoVar instanceof C1519iobyxmoadg) {
            c1519iobyxmoadg = (C1519iobyxmoadg) gxszxtbevoVar;
            int i13 = c1519iobyxmoadg.f70272iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1519iobyxmoadg.f70272iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1519iobyxmoadg = new C1519iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1519iobyxmoadg = new C1519iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1519iobyxmoadg.f70274yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1519iobyxmoadg.f70272iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object c0753iobyxmoadg = new fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.C0753iobyxmoadg(str);
            c1519iobyxmoadg.f70275zdlpuopuiu = c0753iobyxmoadg;
            c1519iobyxmoadg.f70272iwizpuwonk = 1;
            if (lqeggnwhkg(c0753iobyxmoadg, c1519iobyxmoadg) == objGxszxtbevo) {
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
    @Override // fk1.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f70280iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f70280iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f70282yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f70280iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Object obj2 = fk1.iobyxmoadg.InterfaceC0752iobyxmoadg.zoijcleaow.f34298iobyxmoadg;
            zoijcleaowVar.f70283zdlpuopuiu = obj2;
            zoijcleaowVar.f70280iwizpuwonk = 1;
            if (lqeggnwhkg(obj2, zoijcleaowVar) == objGxszxtbevo) {
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
