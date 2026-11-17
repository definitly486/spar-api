package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class mhtqkkgtqm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ v0 f57649yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57650zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhtqkkgtqm(v0 v0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57649yggfygwlhe = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new mhtqkkgtqm(this.f57649yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new mhtqkkgtqm(this.f57649yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57650zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            v0 v0Var = this.f57649yggfygwlhe;
            this.f57650zdlpuopuiu = 1;
            gf0 gf0Var = v0Var.f58924eablkybsjg.f55879iobyxmoadg;
            if (gf0Var instanceof f90) {
                objEmit = v0Var.f58925gxszxtbevo.emit(t.DENY_BLOCK_MODE, this);
                if (objEmit != mg.zoijcleaow.gxszxtbevo()) {
                    objEmit = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else if (gf0Var instanceof ja0) {
                objEmit = v0Var.f58925gxszxtbevo.emit(t.DENY_MODE, this);
                if (objEmit != mg.zoijcleaow.gxszxtbevo()) {
                    objEmit = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else if (gf0Var instanceof xc0) {
                objEmit = v0Var.f58925gxszxtbevo.emit(t.OTP_REVIEW_MODE, this);
                if (objEmit != mg.zoijcleaow.gxszxtbevo()) {
                    objEmit = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else if (gf0Var instanceof ae0) {
                objEmit = v0Var.f58925gxszxtbevo.emit(t.REVIEW_HINT_MODE, this);
                if (objEmit != mg.zoijcleaow.gxszxtbevo()) {
                    objEmit = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else {
                kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gf0Var, ob0.f57923zoijcleaow);
                objEmit = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (objEmit == objGxszxtbevo) {
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
