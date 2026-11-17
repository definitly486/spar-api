package kk;

import android.content.Context;
import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class oipsdeybqn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ ls f57956cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ Context f57957esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ wi f57958iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f57959jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Nb f57960yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57961zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oipsdeybqn(Nb nb3, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, wi wiVar, lg.gxszxtbevo gxszxtbevoVar, ls lsVar, Context context) {
        super(2, gxszxtbevoVar);
        this.f57960yggfygwlhe = nb3;
        this.f57959jyumaefscl = zoijcleaowVar;
        this.f57958iwizpuwonk = wiVar;
        this.f57956cqumvgiudr = lsVar;
        this.f57957esjtqupxsv = context;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new oipsdeybqn(this.f57960yggfygwlhe, this.f57959jyumaefscl, this.f57958iwizpuwonk, gxszxtbevoVar, this.f57956cqumvgiudr, this.f57957esjtqupxsv);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((oipsdeybqn) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57961zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Nb nb3 = this.f57960yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f57959jyumaefscl;
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(this.f57958iwizpuwonk, null, this.f57956cqumvgiudr, this.f57957esjtqupxsv);
            this.f57961zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(nb3, zoijcleaowVar, dsvhmnatusVar, this) == objGxszxtbevo) {
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
