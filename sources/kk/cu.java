package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class cu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f56188iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ rx f56189jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ kw f56190yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56191zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(kw kwVar, rx rxVar, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f56190yggfygwlhe = kwVar;
        this.f56189jyumaefscl = rxVar;
        this.f56188iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new cu(this.f56190yggfygwlhe, this.f56189jyumaefscl, this.f56188iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return ((cu) create((lg.gxszxtbevo) obj)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56191zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            kw kwVar = this.f56190yggfygwlhe;
            rx rxVar = this.f56189jyumaefscl;
            pj.pkzmftpjix pkzmftpjixVar = this.f56188iwizpuwonk;
            this.f56191zdlpuopuiu = 1;
            if (kwVar.zoijcleaow(rxVar, pkzmftpjixVar, this) == objGxszxtbevo) {
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
