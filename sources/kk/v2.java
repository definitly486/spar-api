package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.CreateBindingOtpResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f58933iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ c5 f58934jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ a4 f58935yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58936zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(a4 a4Var, c5 c5Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58935yggfygwlhe = a4Var;
        this.f58934jyumaefscl = c5Var;
        this.f58933iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new v2(this.f58935yggfygwlhe, this.f58934jyumaefscl, this.f58933iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz ribwqtqdhbVar;
        kz gVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58936zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f58935yggfygwlhe.f55772zoijcleaow).zoijcleaow(new hj(new pg()));
            ll llVar = this.f58935yggfygwlhe.f55771iobyxmoadg;
            c5 c5Var = this.f58934jyumaefscl;
            CreateBindingOtpRequestBody createBindingOtpRequestBody = c5Var.f56094iobyxmoadg;
            boolean z13 = c5Var.f56095zoijcleaow;
            this.f58936zdlpuopuiu = 1;
            obj = ((o70) llVar).lqeggnwhkg(createBindingOtpRequestBody, z13, this);
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
            if (failure.getError() instanceof ErrorEntity.NoInternet) {
                gVar = new g(new g60(new u1(this.f58935yggfygwlhe, this.f58934jyumaefscl, this.f58933iwizpuwonk, null)));
            } else {
                ribwqtqdhbVar = new qe0(failure.getError());
            }
            ((ve) this.f58935yggfygwlhe.f55772zoijcleaow).zoijcleaow(gVar);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(contentResponse instanceof ContentResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentResponse.Success success = (ContentResponse.Success) contentResponse;
        Object data = success.getData();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
        jd jdVarCreationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.creationOneTimePasswordState$default(((CreateBindingOtpResponseBody) data).getMobilePhone(), 0, null, ((CreateBindingOtpResponseBody) success.getData()).getCardNumber(), 4, null);
        this.f58934jyumaefscl.getClass();
        ribwqtqdhbVar = new ribwqtqdhb(jdVarCreationOneTimePasswordState$default);
        gVar = ribwqtqdhbVar;
        ((ve) this.f58935yggfygwlhe.f55772zoijcleaow).zoijcleaow(gVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
