package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n30 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57721iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ u50 f57722jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ q40 f57723yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57724zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(q40 q40Var, u50 u50Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57723yggfygwlhe = q40Var;
        this.f57722jyumaefscl = u50Var;
        this.f57721iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new n30(this.f57723yggfygwlhe, this.f57722jyumaefscl, this.f57721iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((n30) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz fi0Var;
        String errorCode;
        Integer numVdvldrhtss;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57724zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f57723yggfygwlhe.f58154zoijcleaow).zoijcleaow(new hj(new pg()));
            ll llVar = this.f57723yggfygwlhe.f58153iobyxmoadg;
            ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody = this.f57722jyumaefscl.f58777iobyxmoadg;
            this.f57724zdlpuopuiu = 1;
            obj = ((o70) llVar).eablkybsjg(confirmBindingOtpRequestBody, this);
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
                fi0Var = new g(new g60(new g20(this.f57723yggfygwlhe, this.f57722jyumaefscl, this.f57721iwizpuwonk, null)));
            } else {
                String str = this.f57722jyumaefscl.f58779zoijcleaow;
                ErrorEntity error = failure.getError();
                ErrorEntity.ApiError apiError = error instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) error : null;
                jd jdVarConfirmationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default(str, (apiError == null || (errorCode = apiError.getErrorCode()) == null || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(errorCode)) == null) ? 2 : numVdvldrhtss.intValue(), null, 4, null);
                fi0Var = ((jdVarConfirmationOneTimePasswordState$default instanceof g3) || (jdVarConfirmationOneTimePasswordState$default instanceof eslsurpljm)) ? new fi0(jdVarConfirmationOneTimePasswordState$default, this.f57722jyumaefscl.f58778ppxfxbqfkf) : new qe0(failure.getError());
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            fi0Var = new fi0(OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default(this.f57722jyumaefscl.f58779zoijcleaow, 0, null, 4, null), this.f57722jyumaefscl.f58778ppxfxbqfkf);
        }
        ((ve) this.f57723yggfygwlhe.f58154zoijcleaow).zoijcleaow(fi0Var);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
