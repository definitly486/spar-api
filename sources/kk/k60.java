package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class k60 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57265iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ q80 f57266jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ n70 f57267yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57268zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(n70 n70Var, q80 q80Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57267yggfygwlhe = n70Var;
        this.f57266jyumaefscl = q80Var;
        this.f57265iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new k60(this.f57267yggfygwlhe, this.f57266jyumaefscl, this.f57265iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((k60) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz p3Var;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57268zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((ve) this.f57267yggfygwlhe.f57743zoijcleaow).zoijcleaow(new hj(new he()));
            ll llVar = this.f57267yggfygwlhe.f57742iobyxmoadg;
            this.f57268zdlpuopuiu = 1;
            obj = ((o70) llVar).ppxfxbqfkf(this);
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
            p3Var = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ContentResponse.Failure) contentResponse).getError(), ErrorEntity.NoInternet.INSTANCE) ? new g(new g60(new i50(this.f57267yggfygwlhe, this.f57266jyumaefscl, this.f57265iwizpuwonk, null))) : new p3(new t10(this.f57266jyumaefscl.f58167zoijcleaow));
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            p3Var = new p3(new a30(this.f57266jyumaefscl.f58167zoijcleaow));
        }
        ((ve) this.f57267yggfygwlhe.f57743zoijcleaow).zoijcleaow(p3Var);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
