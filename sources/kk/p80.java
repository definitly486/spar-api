package kk;

import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class p80 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ SdkAuthRequestBody.AuthMethod f58054iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ dh0 f58055jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f58056yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58057zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(b9 b9Var, dh0 dh0Var, SdkAuthRequestBody.AuthMethod authMethod, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58056yggfygwlhe = b9Var;
        this.f58055jyumaefscl = dh0Var;
        this.f58054iwizpuwonk = authMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new p80(this.f58056yggfygwlhe, this.f58055jyumaefscl, this.f58054iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((p80) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58057zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((auzgnhcxok) this.f58056yggfygwlhe.f55956zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding)) {
                b9 b9Var = this.f58056yggfygwlhe;
                dh0 dh0Var = this.f58055jyumaefscl;
                SdkAuthRequestBody.AuthMethod authMethod = this.f58054iwizpuwonk;
                this.f58057zdlpuopuiu = 1;
                if (b9.gtknphoqwx(b9Var, dh0Var, authMethod, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
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
