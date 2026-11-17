package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class gv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f56779iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ rx f56780jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ kw f56781yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56782zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(kw kwVar, rx rxVar, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56781yggfygwlhe = kwVar;
        this.f56780jyumaefscl = rxVar;
        this.f56779iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new gv(this.f56781yggfygwlhe, this.f56780jyumaefscl, this.f56779iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((gv) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz t4Var;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56782zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ll llVar = this.f56781yggfygwlhe.f57357iobyxmoadg;
            SdkAuthRequestBody sdkAuthRequestBody = this.f56780jyumaefscl.f58481zoijcleaow;
            this.f56782zdlpuopuiu = 1;
            obj = ((o70) llVar).rgvfuqvkyq(sdkAuthRequestBody, this);
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
                kw kwVar = this.f56781yggfygwlhe;
                if (((jf0) kwVar.f57358ppxfxbqfkf).f57190ppxfxbqfkf) {
                    ((ve) kwVar.f57360zoijcleaow).zoijcleaow(vv.f59062iobyxmoadg);
                    kw kwVar2 = this.f56781yggfygwlhe;
                    u80 u80Var = kwVar2.f57359wkgbmnqykc;
                    u80Var.f58796wkgbmnqykc = null;
                    u80Var.f58793eablkybsjg = "";
                    ((jf0) kwVar2.f57358ppxfxbqfkf).f57190ppxfxbqfkf = false;
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                t4Var = new g(new w7(failure.getError()));
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.NoInternet.INSTANCE)) {
                t4Var = new g(new g60(new cu(this.f56781yggfygwlhe, this.f56780jyumaefscl, this.f56779iwizpuwonk, null)));
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.NotFound.INSTANCE) ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.ServiceUnavailable.INSTANCE)) {
                    t4Var = new g(new pv("Некорректный формат запроса или ответа"));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.TimeOut.INSTANCE)) {
                    t4Var = new g(new wg());
                } else {
                    t4Var = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.Unknown.INSTANCE) ? new g(new pv("Системная или внутренняя ошибка")) : new g(new pv("Некорректный формат запроса или ответа"));
                }
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
            t4Var = new t4((SdkAuthResponseBody) data);
        }
        ((ve) this.f56781yggfygwlhe.f57360zoijcleaow).zoijcleaow(t4Var);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
