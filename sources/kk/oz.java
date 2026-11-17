package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class oz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ rd0 f58014cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ Context f58015esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f58016iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f58017jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.tr f58018yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58019zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(npi.spay.tr trVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, rd0 rd0Var, Context context) {
        super(2, gxszxtbevoVar);
        this.f58018yggfygwlhe = trVar;
        this.f58017jyumaefscl = zoijcleaowVar;
        this.f58016iwizpuwonk = lqeggnwhkgVar;
        this.f58014cqumvgiudr = rd0Var;
        this.f58015esjtqupxsv = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new oz(this.f58018yggfygwlhe, this.f58017jyumaefscl, this.f58016iwizpuwonk, gxszxtbevoVar, this.f58014cqumvgiudr, this.f58015esjtqupxsv);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((oz) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58019zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.tr trVar = this.f58018yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f58017jyumaefscl;
            ky kyVar = new ky(this.f58016iwizpuwonk, null, this.f58014cqumvgiudr, this.f58015esjtqupxsv);
            this.f58019zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(trVar, zoijcleaowVar, kyVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
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
