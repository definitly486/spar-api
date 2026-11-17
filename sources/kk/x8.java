package kk;

import spay.sdk.domain.model.OrderScreenOutcome;

/* JADX INFO: loaded from: classes3.dex */
public final class x8 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ Object f59270jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ sj.nufgyqmvbu f59271yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59272zdlpuopuiu;

    public x8(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x8 x8Var = new x8((lg.gxszxtbevo) obj3);
        x8Var.f59271yggfygwlhe = (sj.nufgyqmvbu) obj;
        x8Var.f59270jyumaefscl = obj2;
        return x8Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59272zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f59271yggfygwlhe;
            sj.lqeggnwhkg lqeggnwhkgVarPkzmftpjix = sj.dxjokdxxww.pkzmftpjix(new OrderScreenOutcome((hl) this.f59270jyumaefscl, null, null));
            this.f59272zdlpuopuiu = 1;
            if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarPkzmftpjix, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
