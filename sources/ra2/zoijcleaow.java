package ra2;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82472zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f82473iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82475yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82476zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82475yggfygwlhe = obj;
            this.f82473iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82472zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f82473iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f82473iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f82475yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f82473iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f82476zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
            return objLqeggnwhkg;
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f82472zoijcleaow;
        iobyxmoadgVar.f82476zdlpuopuiu = this;
        iobyxmoadgVar.f82473iwizpuwonk = 1;
        objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(iobyxmoadgVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        objLqeggnwhkg = (User) objLqeggnwhkg;
        if (objLqeggnwhkg == null) {
            ca2.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f82472zoijcleaow;
            iobyxmoadgVar.f82476zdlpuopuiu = null;
            iobyxmoadgVar.f82473iwizpuwonk = 2;
            objLqeggnwhkg = ppxfxbqfkfVar2.gxszxtbevo(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return objLqeggnwhkg;
    }
}
