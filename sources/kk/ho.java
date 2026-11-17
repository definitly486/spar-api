package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ho extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f56939iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ xs f56940jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ tr f56941yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56942zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(tr trVar, xs xsVar, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f56941yggfygwlhe = trVar;
        this.f56940jyumaefscl = xsVar;
        this.f56939iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new ho(this.f56941yggfygwlhe, this.f56940jyumaefscl, this.f56939iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return ((ho) create((lg.gxszxtbevo) obj)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56942zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wc0 wc0Var = this.f56941yggfygwlhe.f58717wkgbmnqykc;
            uc0 tag = uc0.BNPL;
            wc0Var.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
            y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
            if (y60Var != null) {
                y60Var.zoijcleaow(new j9(false));
            }
            tr trVar = this.f56941yggfygwlhe;
            xs xsVar = this.f56940jyumaefscl;
            pj.pkzmftpjix pkzmftpjixVar = this.f56939iwizpuwonk;
            this.f56942zdlpuopuiu = 1;
            trVar.getClass();
            Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new pq(trVar, xsVar, pkzmftpjixVar, null), this);
            if (objLqeggnwhkg != mg.zoijcleaow.gxszxtbevo()) {
                objLqeggnwhkg = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (objLqeggnwhkg == objGxszxtbevo) {
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
