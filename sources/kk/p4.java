package kk;

import npi.spay.Gr;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ r5 f58036yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58037zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(r5 r5Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58036yggfygwlhe = r5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new p4(this.f58036yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new p4(this.f58036yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.draadjrbmk, tg.draadjrbmk] */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58037zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Gr gr2 = this.f58036yggfygwlhe.f58269eablkybsjg;
            if (gr2 != null) {
                this.f58037zdlpuopuiu = 1;
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
