package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.CreateOtpSdkResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57004iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ n9 f57005jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ k8 f57006yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57007zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(k8 k8Var, n9 n9Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57006yggfygwlhe = k8Var;
        this.f57005jyumaefscl = n9Var;
        this.f57004iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new i7(this.f57006yggfygwlhe, this.f57005jyumaefscl, this.f57004iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((i7) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz ribwqtqdhbVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57007zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f57006yggfygwlhe.f57274zoijcleaow).zoijcleaow(new hj(new pg()));
            ll llVar = this.f57006yggfygwlhe.f57273iobyxmoadg;
            CreateOtpSdkRequestBody createOtpSdkRequestBody = this.f57005jyumaefscl.f57747zoijcleaow;
            this.f57007zdlpuopuiu = 1;
            obj = ((o70) llVar).nufgyqmvbu(createOtpSdkRequestBody, this);
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
                ribwqtqdhbVar = new cqumvgiudr(failure.getError());
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.NoInternet.INSTANCE)) {
                ribwqtqdhbVar = new g(new g60(new f6(this.f57006yggfygwlhe, this.f57005jyumaefscl, this.f57004iwizpuwonk, null)));
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.TimeOut.INSTANCE)) {
                ribwqtqdhbVar = new g(new wg());
            } else {
                ribwqtqdhbVar = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.Unknown.INSTANCE) ? new g(new pv("Системная или внутренняя ошибка")) : new g(new pv("Некорректный формат запроса или ответа"));
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
            CreateOtpSdkResponseBody createOtpSdkResponseBody = (CreateOtpSdkResponseBody) data;
            jd jdVarCreationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.creationOneTimePasswordState$default(createOtpSdkResponseBody.getMobilePhone(), createOtpSdkResponseBody.getErrorCode(), createOtpSdkResponseBody.getErrorMessage(), null, 8, null);
            this.f57005jyumaefscl.getClass();
            ribwqtqdhbVar = new ribwqtqdhb(jdVarCreationOneTimePasswordState$default);
        }
        ((ve) this.f57006yggfygwlhe.f57274zoijcleaow).zoijcleaow(ribwqtqdhbVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
