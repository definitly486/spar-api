package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.PayBindingOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class nuxfzjnpeb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57849iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ PayBindingOtpRequestBody f57850jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ c f57851yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57852zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuxfzjnpeb(c cVar, PayBindingOtpRequestBody payBindingOtpRequestBody, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57851yggfygwlhe = cVar;
        this.f57850jyumaefscl = payBindingOtpRequestBody;
        this.f57849iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new nuxfzjnpeb(this.f57851yggfygwlhe, this.f57850jyumaefscl, this.f57849iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((nuxfzjnpeb) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz l1Var;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57852zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f57851yggfygwlhe.f56068zoijcleaow).zoijcleaow(new hj(new vi()));
            ll llVar = this.f57851yggfygwlhe.f56067iobyxmoadg;
            PayBindingOtpRequestBody payBindingOtpRequestBody = this.f57850jyumaefscl;
            this.f57852zdlpuopuiu = 1;
            obj = ((o70) llVar).btonecajqb(payBindingOtpRequestBody, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        if (contentResponse instanceof ContentResponse.Failure) {
            ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
            l1Var = failure.getError() instanceof ErrorEntity.NoInternet ? new g(new g60(new ulzqkzuiru(this.f57851yggfygwlhe, this.f57850jyumaefscl, this.f57849iwizpuwonk, null))) : new qe0(failure.getError());
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            l1Var = new l1(ib.f57019iobyxmoadg);
        }
        ((ve) this.f57851yggfygwlhe.f56068zoijcleaow).zoijcleaow(l1Var);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
