package ra2;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82426zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ha2.wkgbmnqykc f82427iobyxmoadg;

        public iobyxmoadg(ha2.wkgbmnqykc userInfoParams) {
            zdlpuopuiu.btonecajqb(userInfoParams, "userInfoParams");
            this.f82427iobyxmoadg = userInfoParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f82427iobyxmoadg, ((iobyxmoadg) obj).f82427iobyxmoadg);
        }

        public int hashCode() {
            return this.f82427iobyxmoadg.hashCode();
        }

        public final ha2.wkgbmnqykc iobyxmoadg() {
            return this.f82427iobyxmoadg;
        }

        public String toString() {
            return "Params(userInfoParams=" + this.f82427iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f82428iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82430yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82431zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82430yggfygwlhe = obj;
            this.f82428iwizpuwonk |= Integer.MIN_VALUE;
            return draadjrbmk.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82426zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f82428iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f82428iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f82430yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f82428iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                draadjrbmkVar = (draadjrbmk) zoijcleaowVar.f82431zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f82426zoijcleaow;
        ha2.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f82431zdlpuopuiu = this;
        zoijcleaowVar.f82428iwizpuwonk = 1;
        if (ppxfxbqfkfVar.ojitshcjhn(wkgbmnqykcVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        draadjrbmkVar = this;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        ca2.ppxfxbqfkf ppxfxbqfkfVar2 = draadjrbmkVar.f82426zoijcleaow;
        zoijcleaowVar.f82431zdlpuopuiu = wwaezpbzknVar;
        zoijcleaowVar.f82428iwizpuwonk = 2;
        if (ppxfxbqfkfVar2.gxszxtbevo(zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
