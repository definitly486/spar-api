package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class f6 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f56496iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ n9 f56497jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ k8 f56498yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56499zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(k8 k8Var, n9 n9Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f56498yggfygwlhe = k8Var;
        this.f56497jyumaefscl = n9Var;
        this.f56496iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new f6(this.f56498yggfygwlhe, this.f56497jyumaefscl, this.f56496iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return ((f6) create((lg.gxszxtbevo) obj)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56499zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            k8 k8Var = this.f56498yggfygwlhe;
            n9 n9Var = this.f56497jyumaefscl;
            pj.pkzmftpjix pkzmftpjixVar = this.f56496iwizpuwonk;
            this.f56499zdlpuopuiu = 1;
            if (k8Var.zoijcleaow(n9Var, pkzmftpjixVar, this) == objGxszxtbevo) {
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
