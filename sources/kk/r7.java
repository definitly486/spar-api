package kk;

import npi.spay.Gr;

/* JADX INFO: loaded from: classes3.dex */
public final class r7 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ t8 f58277yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58278zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(t8 t8Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58277yggfygwlhe = t8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new r7(this.f58277yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new r7(this.f58277yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.draadjrbmk, tg.draadjrbmk] */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58278zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Gr gr2 = this.f58277yggfygwlhe.f58628eablkybsjg;
            if (gr2 != null) {
                this.f58278zdlpuopuiu = 1;
                ?? r13 = gr2.f70547zdlpuopuiu;
                if (r13 != 0) {
                    obj = r13.invoke(this);
                    if (obj != mg.zoijcleaow.gxszxtbevo()) {
                        obj = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                } else {
                    obj = null;
                }
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
