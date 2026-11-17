package kk;

import android.content.Context;
import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class xb0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ u00 f59289cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ Context f59290esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.lqeggnwhkg f59291iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f59292jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Nf f59293yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59294zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(Nf nf2, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, u00 u00Var, Context context) {
        super(2, gxszxtbevoVar);
        this.f59293yggfygwlhe = nf2;
        this.f59292jyumaefscl = zoijcleaowVar;
        this.f59291iwizpuwonk = lqeggnwhkgVar;
        this.f59289cqumvgiudr = u00Var;
        this.f59290esjtqupxsv = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new xb0(this.f59293yggfygwlhe, this.f59292jyumaefscl, this.f59291iwizpuwonk, gxszxtbevoVar, this.f59289cqumvgiudr, this.f59290esjtqupxsv);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((xb0) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59294zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Nf nf2 = this.f59293yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f59292jyumaefscl;
            sa0 sa0Var = new sa0(this.f59291iwizpuwonk, null, this.f59289cqumvgiudr, this.f59290esjtqupxsv);
            this.f59294zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(nf2, zoijcleaowVar, sa0Var, this) == objGxszxtbevo) {
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
