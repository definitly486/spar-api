package kk;

import spay.sdk.domain.model.request.PayBindingOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ulzqkzuiru extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f58867iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ PayBindingOtpRequestBody f58868jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ c f58869yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58870zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulzqkzuiru(c cVar, PayBindingOtpRequestBody payBindingOtpRequestBody, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(1, gxszxtbevoVar);
        this.f58869yggfygwlhe = cVar;
        this.f58868jyumaefscl = payBindingOtpRequestBody;
        this.f58867iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
        return new ulzqkzuiru(this.f58869yggfygwlhe, this.f58868jyumaefscl, this.f58867iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        return ((ulzqkzuiru) create((lg.gxszxtbevo) obj)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58870zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c cVar = this.f58869yggfygwlhe;
            PayBindingOtpRequestBody payBindingOtpRequestBody = this.f58868jyumaefscl;
            pj.pkzmftpjix pkzmftpjixVar = this.f58867iwizpuwonk;
            this.f58870zdlpuopuiu = 1;
            if (cVar.zoijcleaow(payBindingOtpRequestBody, pkzmftpjixVar, this) == objGxszxtbevo) {
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
