package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class s30 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f58501iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ b70 f58502jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ y50 f58503yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58504zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(y50 y50Var, b70 b70Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f58503yggfygwlhe = y50Var;
        this.f58502jyumaefscl = b70Var;
        this.f58501iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new s30(this.f58503yggfygwlhe, this.f58502jyumaefscl, this.f58501iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return ((s30) create((lg.gxszxtbevo) obj)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58504zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            y50 y50Var = this.f58503yggfygwlhe;
            b70 b70Var = this.f58502jyumaefscl;
            pj.pkzmftpjix pkzmftpjixVar = this.f58501iwizpuwonk;
            this.f58504zdlpuopuiu = 1;
            y50Var.getClass();
            if (sj.dxjokdxxww.wwaezpbzkn(new v40(y50Var, b70Var, pkzmftpjixVar, null)) == objGxszxtbevo) {
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
