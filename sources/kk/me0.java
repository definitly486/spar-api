package kk;

import spay.sdk.R;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* JADX INFO: loaded from: classes3.dex */
public final class me0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ wg0 f57634yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57635zdlpuopuiu;

    public me0(sj.nufgyqmvbu nufgyqmvbuVar, wg0 wg0Var) {
        this.f57635zdlpuopuiu = nufgyqmvbuVar;
        this.f57634yggfygwlhe = wg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        jd0 jd0Var;
        String errorCode;
        Integer numVdvldrhtss;
        if (gxszxtbevoVar instanceof jd0) {
            jd0Var = (jd0) gxszxtbevoVar;
            int i13 = jd0Var.f57181yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jd0Var.f57181yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                jd0Var = new jd0(this, gxszxtbevoVar);
            }
        } else {
            jd0Var = new jd0(this, gxszxtbevoVar);
        }
        Object obj2 = jd0Var.f57182zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jd0Var.f57181yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57635zdlpuopuiu;
            ErrorEntity errorEntity = ((q5) obj).f58155iobyxmoadg;
            ErrorEntity.ApiError apiError = errorEntity instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) errorEntity : null;
            Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default("", (apiError == null || (errorCode = apiError.getErrorCode()) == null || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(errorCode)) == null) ? 2 : numVdvldrhtss.intValue(), null, 4, null) instanceof iyctptxqzt ? R.string.spay_pay_binding_attempts_error_title_text : this.f57634yggfygwlhe.f59163eablkybsjg);
            jd0Var.f57181yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(numWkgbmnqykc, jd0Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
