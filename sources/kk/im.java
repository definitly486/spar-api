package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class im extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f57062yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57063zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(lrnfpwlwnk lrnfpwlwnkVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57062yggfygwlhe = lrnfpwlwnkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new im(this.f57062yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new im(this.f57062yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57063zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            s20 s20Var = this.f57062yggfygwlhe.f57505dxjokdxxww;
            this.f57063zdlpuopuiu = 1;
            pj.pkzmftpjix pkzmftpjixVarZoijcleaow = pj.ikoacuggdj.zoijcleaow();
            s20Var.getClass();
            obj = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVarZoijcleaow.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new l10(s20Var, null), this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ((ve) this.f57062yggfygwlhe.f57509gxszxtbevo).zoijcleaow(new l1(new z8(ErrorEntity.NotEnoughMoneyForPayment.INSTANCE)));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
