package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f58564iobyxmoadg;

    public sn(ll sPayRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        this.f58564iobyxmoadg = sPayRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        qm qmVar;
        sn snVar;
        if (wkgbmnqykcVar instanceof qm) {
            qmVar = (qm) wkgbmnqykcVar;
            int i13 = qmVar.f58211iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qmVar.f58211iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                qmVar = new qm(this, wkgbmnqykcVar);
            }
        } else {
            qmVar = new qm(this, wkgbmnqykcVar);
        }
        Object objRgvfuqvkyq = qmVar.f58213yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = qmVar.f58211iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objRgvfuqvkyq);
            if (sdkAuthRequestBody == null) {
                return new pv("Некорректный формат запроса или ответа");
            }
            ll llVar = this.f58564iobyxmoadg;
            qmVar.f58214zdlpuopuiu = this;
            qmVar.f58211iwizpuwonk = 1;
            objRgvfuqvkyq = ((o70) llVar).rgvfuqvkyq(sdkAuthRequestBody, qmVar);
            if (objRgvfuqvkyq == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            snVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snVar = qmVar.f58214zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objRgvfuqvkyq);
        }
        ContentResponse contentResponse = (ContentResponse) objRgvfuqvkyq;
        snVar.getClass();
        if (!(contentResponse instanceof ContentResponse.Failure)) {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
            return new g1((SdkAuthResponseBody) data);
        }
        ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
        ErrorEntity error = failure.getError();
        if (error instanceof ErrorEntity.ApiError) {
            return new w7(failure.getError());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.TimeOut.INSTANCE)) {
            return new wg();
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(error, ErrorEntity.Unknown.INSTANCE) ? new pv("Системная или внутренняя ошибка") : new pv("Некорректный формат запроса или ответа");
    }
}
