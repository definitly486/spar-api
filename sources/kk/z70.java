package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.ConfirmOtpResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* JADX INFO: loaded from: classes3.dex */
public final class z70 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f59536iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ga0 f59537jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ c90 f59538yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59539zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(c90 c90Var, ga0 ga0Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f59538yggfygwlhe = c90Var;
        this.f59537jyumaefscl = ga0Var;
        this.f59536iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new z70(this.f59538yggfygwlhe, this.f59537jyumaefscl, this.f59536iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((z70) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz fi0Var;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59539zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f59538yggfygwlhe.f56115zoijcleaow).zoijcleaow(new hj(new vi()));
            ll llVar = this.f59538yggfygwlhe.f56114iobyxmoadg;
            ConfirmOtpRequestBody confirmOtpRequestBody = this.f59537jyumaefscl.f56685zoijcleaow;
            this.f59539zdlpuopuiu = 1;
            obj = ((o70) llVar).gxszxtbevo(confirmOtpRequestBody, this);
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
            ErrorEntity error = failure.getError();
            if (error instanceof ErrorEntity.ApiError) {
                fi0Var = new ah0(failure.getError());
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.NoInternet.INSTANCE)) {
                fi0Var = new g(new g60(new w60(this.f59538yggfygwlhe, this.f59537jyumaefscl, this.f59536iwizpuwonk, null)));
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.NotFound.INSTANCE) ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.ServiceUnavailable.INSTANCE)) {
                    fi0Var = new g(new pv("Некорректный формат запроса или ответа"));
                } else {
                    fi0Var = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.TimeOut.INSTANCE) ? new g(new wg()) : new g(new pv("Системная или внутренняя ошибка"));
                }
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = this.f59537jyumaefscl.f56683ppxfxbqfkf;
            ContentResponse.Success success = (ContentResponse.Success) contentResponse;
            Object data = success.getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
            fi0Var = new fi0(OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState(str, ((ConfirmOtpResponseBody) data).getErrorCode(), ((ConfirmOtpResponseBody) success.getData()).getMessage()), this.f59537jyumaefscl.f56684wkgbmnqykc);
        }
        ((ve) this.f59538yggfygwlhe.f56115zoijcleaow).zoijcleaow(fi0Var);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
